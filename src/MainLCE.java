import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;

public class MainLCE {
    public static void main(String args[]) {
        CharStream input = CharStreams.fromString(args[0]);
        LCELexer lexer = new LCELexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LCEParser parser = new LCEParser(tokens);
        LCEParser.StartContext t = parser.start();
        CircuitSolver solver = new CircuitSolver();
        t.accept(solver.visitor);
        System.out.println(solver.existingElectronicObjects);
    }
}