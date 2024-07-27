// Generated from LCE.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LCEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LCEVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LCEParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(LCEParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createComponent}
	 * labeled alternative in {@link LCEParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateComponent(LCEParser.CreateComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code connectComponentToNode}
	 * labeled alternative in {@link LCEParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectComponentToNode(LCEParser.ConnectComponentToNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resistor}
	 * labeled alternative in {@link LCEParser#electronicComponentCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResistor(LCEParser.ResistorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code font}
	 * labeled alternative in {@link LCEParser#electronicComponentCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFont(LCEParser.FontContext ctx);
	/**
	 * Visit a parse tree produced by the {@code node}
	 * labeled alternative in {@link LCEParser#electronicComponentCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(LCEParser.NodeContext ctx);
}