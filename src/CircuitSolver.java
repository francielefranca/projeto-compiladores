import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;

/*
TO-DO:
Finish implementation of circuit solver, including detection of independent loops for calculation of components'
voltage using Kirchoff laws.
*/

public class CircuitSolver
{
    public abstract class ElectronicObject
    {
        String name;
        public ElectronicObject(String inputName)
        {
            this.name = inputName;
        }
    }
    public abstract class ElectronicComponent extends ElectronicObject{
        public String name;
        public float electronicCurrent;
        public float voltage;
        public ElectronicComponent(String inputName)
        {
            super(inputName);
            this.electronicCurrent = 0f;
            this.voltage = 0f;
        }
        public CircuitNode slotA;
        public CircuitNode slotB;
    }
    public class Resistor extends ElectronicComponent{
        public float resistance;
        public Resistor(String inputName, float inputResistance)
        {
            super(inputName);
            this.resistance = inputResistance;
        }
    }
    public class Font extends ElectronicComponent{
        public boolean isVoltage;
        public float forceValue;
        public Font(String inputName, float inputForceValue, boolean inputIsVoltage)
        {
            super(inputName);
            this.forceValue = inputForceValue;
            this.isVoltage = inputIsVoltage;
        }
    }
    public class CircuitNode extends ElectronicObject
    {
        public CircuitNode(String inputName)
        {
            super(inputName);
            this.connectedComponents = new HashMap<ElectronicComponent, ConnectionType>();
        }
        public enum ConnectionType
        {
            A,
            B,
            //AB connections are short circuited components and are always going to have no current going through them
            AB,
        }
        public HashMap<ElectronicComponent, ConnectionType> connectedComponents;
    }
    public HashMap<String, ElectronicObject> existingElectronicObjects = new HashMap<String, ElectronicObject>();
    public boolean AttemptToCreateElectronicObject(ElectronicObject newComponent)
    {
        if(existingElectronicObjects.containsKey(newComponent.name)
        || existingElectronicObjects.containsValue(newComponent))
        {
            return false;
        }
        existingElectronicObjects.put(newComponent.name, newComponent);
        return true;
    }
    /*
    //TO-DO
    public List<List<ElectronicObject>> getIndependentLoops()
    {
        List<List<ElectronicObject>> returnList = new List<List<ElectronicObject>>();
        List<ElectronicObject> currentPath = new List<ElectronicObject>();

        List<ElectronicObject> allElectronicObjects = new List<ElectronicObject>();
        for(HashMap.Entry<ElectronicComponent, ConnectionType> set : existingElectronicObjects.entrySet())
        {
        }
        
    }*/
    public LCEBaseVisitor<Boolean> visitor = new LCEBaseVisitor<Boolean>()
    {
        public Boolean visitCreateComponent(LCEParser.CreateComponentContext ctx)
        {
            if(ctx.creation instanceof LCEParser.ResistorContext )
            {
                float resistance = Float.parseFloat(((LCEParser.ResistorContext)(ctx.creation)).resistance.getText());
                String name = ctx.ECName.getText();
                return AttemptToCreateElectronicObject(new Resistor(name, resistance));
            }
            if(ctx.creation instanceof LCEParser.FontContext )
            {
                boolean isVoltageFont = ((LCEParser.FontContext)ctx.creation).fontType.getText() == "V";
                float forceValue = Float.parseFloat(((LCEParser.FontContext)(ctx.creation)).forceValue.getText());
                String name = ctx.ECName.getText();
                return AttemptToCreateElectronicObject(new Font(name, forceValue, isVoltageFont));
            }
            if(ctx.creation instanceof LCEParser.NodeContext )
            {
                String name = ctx.ECName.getText();
                return AttemptToCreateElectronicObject(new CircuitNode(name));
            }
            return false;
        }
        public Boolean visitConnectComponentToNodeContext(LCEParser.ConnectComponentToNodeContext ctx)
        {
            //checking if component already exists
            if(!existingElectronicObjects.containsKey(ctx.NodeName)) return false;
            if(!(existingElectronicObjects.get(ctx.NodeName) instanceof CircuitNode)) return false;
            if(!existingElectronicObjects.containsKey(ctx.ECName)) return false;
            if(!(existingElectronicObjects.get(ctx.ECName) instanceof ElectronicComponent)) return false;
            CircuitNode connectedNode = (CircuitNode) existingElectronicObjects.get(ctx.NodeName);
            ElectronicComponent connectedComponent = (ElectronicComponent) existingElectronicObjects.get(ctx.ECName);
            //slot connection type decision
            if(ctx.slot.getText() == "A")
            {
                if(connectedComponent.slotA != null) return false;
                connectedComponent.slotA = connectedNode;
                if(connectedComponent.slotB != connectedNode)
                {
                    connectedNode.connectedComponents.put(connectedComponent,CircuitNode.ConnectionType.A);
                }
                else
                {
                    connectedNode.connectedComponents.put(connectedComponent,CircuitNode.ConnectionType.AB);
                }
            }
            else
            {
                if (connectedComponent.slotB != null) return false;
                connectedComponent.slotB = connectedNode;
                if(connectedComponent.slotA != connectedNode)
                {
                    connectedNode.connectedComponents.put(connectedComponent,CircuitNode.ConnectionType.B);
                }
                else
                {
                    connectedNode.connectedComponents.put(connectedComponent,CircuitNode.ConnectionType.AB);
                }
            }
            return true;
        }
    };
}