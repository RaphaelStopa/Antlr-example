// Generated from C:/Users/Stopa/Desktop/antlr-example/src/main/java\calculator.g4 by ANTLR 4.9.2
package antrl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(calculatorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(calculatorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPar(calculatorParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPar(calculatorParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(calculatorParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(calculatorParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpBin}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpBin(calculatorParser.OpBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpBin}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpBin(calculatorParser.OpBinContext ctx);
}