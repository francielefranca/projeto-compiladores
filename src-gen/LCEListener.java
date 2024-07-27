// Generated from LCE.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LCEParser}.
 */
public interface LCEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LCEParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(LCEParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCEParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(LCEParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createComponent}
	 * labeled alternative in {@link LCEParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateComponent(LCEParser.CreateComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createComponent}
	 * labeled alternative in {@link LCEParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateComponent(LCEParser.CreateComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code connectComponentToNode}
	 * labeled alternative in {@link LCEParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConnectComponentToNode(LCEParser.ConnectComponentToNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code connectComponentToNode}
	 * labeled alternative in {@link LCEParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConnectComponentToNode(LCEParser.ConnectComponentToNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resistor}
	 * labeled alternative in {@link LCEParser#electronicComponentCreation}.
	 * @param ctx the parse tree
	 */
	void enterResistor(LCEParser.ResistorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resistor}
	 * labeled alternative in {@link LCEParser#electronicComponentCreation}.
	 * @param ctx the parse tree
	 */
	void exitResistor(LCEParser.ResistorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code font}
	 * labeled alternative in {@link LCEParser#electronicComponentCreation}.
	 * @param ctx the parse tree
	 */
	void enterFont(LCEParser.FontContext ctx);
	/**
	 * Exit a parse tree produced by the {@code font}
	 * labeled alternative in {@link LCEParser#electronicComponentCreation}.
	 * @param ctx the parse tree
	 */
	void exitFont(LCEParser.FontContext ctx);
	/**
	 * Enter a parse tree produced by the {@code node}
	 * labeled alternative in {@link LCEParser#electronicComponentCreation}.
	 * @param ctx the parse tree
	 */
	void enterNode(LCEParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code node}
	 * labeled alternative in {@link LCEParser#electronicComponentCreation}.
	 * @param ctx the parse tree
	 */
	void exitNode(LCEParser.NodeContext ctx);
}