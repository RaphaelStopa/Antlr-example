// Generated from C:/Users/Stopa/Desktop/antrl/src/main/java\tubaina.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tubainaParser}.
 */
public interface tubainaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tubainaParser#capitulo}.
	 * @param ctx the parse tree
	 */
	void enterCapitulo(tubainaParser.CapituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link tubainaParser#capitulo}.
	 * @param ctx the parse tree
	 */
	void exitCapitulo(tubainaParser.CapituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link tubainaParser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(tubainaParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link tubainaParser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(tubainaParser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link tubainaParser#secao}.
	 * @param ctx the parse tree
	 */
	void enterSecao(tubainaParser.SecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tubainaParser#secao}.
	 * @param ctx the parse tree
	 */
	void exitSecao(tubainaParser.SecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tubainaParser#paragrafos}.
	 * @param ctx the parse tree
	 */
	void enterParagrafos(tubainaParser.ParagrafosContext ctx);
	/**
	 * Exit a parse tree produced by {@link tubainaParser#paragrafos}.
	 * @param ctx the parse tree
	 */
	void exitParagrafos(tubainaParser.ParagrafosContext ctx);
	/**
	 * Enter a parse tree produced by {@link tubainaParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(tubainaParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tubainaParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(tubainaParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tubainaParser#paragrafo}.
	 * @param ctx the parse tree
	 */
	void enterParagrafo(tubainaParser.ParagrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tubainaParser#paragrafo}.
	 * @param ctx the parse tree
	 */
	void exitParagrafo(tubainaParser.ParagrafoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tubainaParser#negrito}.
	 * @param ctx the parse tree
	 */
	void enterNegrito(tubainaParser.NegritoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tubainaParser#negrito}.
	 * @param ctx the parse tree
	 */
	void exitNegrito(tubainaParser.NegritoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tubainaParser#italico}.
	 * @param ctx the parse tree
	 */
	void enterItalico(tubainaParser.ItalicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tubainaParser#italico}.
	 * @param ctx the parse tree
	 */
	void exitItalico(tubainaParser.ItalicoContext ctx);
}