// Generated from C:/Users/Stopa/Desktop/antrl/src/main/java\tubaina.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tubainaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tubainaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tubainaParser#capitulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapitulo(tubainaParser.CapituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link tubainaParser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(tubainaParser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link tubainaParser#secao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecao(tubainaParser.SecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tubainaParser#paragrafos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagrafos(tubainaParser.ParagrafosContext ctx);
	/**
	 * Visit a parse tree produced by {@link tubainaParser#texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(tubainaParser.TextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tubainaParser#paragrafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagrafo(tubainaParser.ParagrafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tubainaParser#negrito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegrito(tubainaParser.NegritoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tubainaParser#italico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalico(tubainaParser.ItalicoContext ctx);
}