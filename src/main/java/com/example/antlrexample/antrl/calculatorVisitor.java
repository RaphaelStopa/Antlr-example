// Generated from C:/Users/Stopa/Desktop/antlr-example/src/main/java\calculator.g4 by ANTLR 4.9.2
package antrl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calculatorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(calculatorParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code par}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(calculatorParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(calculatorParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpBin}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBin(calculatorParser.OpBinContext ctx);
}