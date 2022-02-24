// Generated from C:/Users/Stopa/Desktop/antrl/src/main/java\tubaina.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tubainaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ITALICO=6, NEGRITO=7, FRASE=8;
	public static final int
		RULE_capitulo = 0, RULE_titulo = 1, RULE_secao = 2, RULE_paragrafos = 3, 
		RULE_texto = 4, RULE_paragrafo = 5, RULE_negrito = 6, RULE_italico = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"capitulo", "titulo", "secao", "paragrafos", "texto", "paragrafo", "negrito", 
			"italico"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'[chapter '", "']\n\n'", "'[section '", "']'", "'\n\n'", "'::'", 
			"'**'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "ITALICO", "NEGRITO", "FRASE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "tubaina.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tubainaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CapituloContext extends ParserRuleContext {
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public List<SecaoContext> secao() {
			return getRuleContexts(SecaoContext.class);
		}
		public SecaoContext secao(int i) {
			return getRuleContext(SecaoContext.class,i);
		}
		public CapituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capitulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).enterCapitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).exitCapitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tubainaVisitor ) return ((tubainaVisitor<? extends T>)visitor).visitCapitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapituloContext capitulo() throws RecognitionException {
		CapituloContext _localctx = new CapituloContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_capitulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			titulo();
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				secao();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TituloContext extends ParserRuleContext {
		public TerminalNode FRASE() { return getToken(tubainaParser.FRASE, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).exitTitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tubainaVisitor ) return ((tubainaVisitor<? extends T>)visitor).visitTitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			match(FRASE);
			setState(24);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecaoContext extends ParserRuleContext {
		public TerminalNode FRASE() { return getToken(tubainaParser.FRASE, 0); }
		public List<ParagrafosContext> paragrafos() {
			return getRuleContexts(ParagrafosContext.class);
		}
		public ParagrafosContext paragrafos(int i) {
			return getRuleContext(ParagrafosContext.class,i);
		}
		public SecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).enterSecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).exitSecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tubainaVisitor ) return ((tubainaVisitor<? extends T>)visitor).visitSecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecaoContext secao() throws RecognitionException {
		SecaoContext _localctx = new SecaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_secao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__2);
			setState(27);
			match(FRASE);
			setState(28);
			match(T__3);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				paragrafos();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParagrafosContext extends ParserRuleContext {
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public ParagrafosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragrafos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).enterParagrafos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).exitParagrafos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tubainaVisitor ) return ((tubainaVisitor<? extends T>)visitor).visitParagrafos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagrafosContext paragrafos() throws RecognitionException {
		ParagrafosContext _localctx = new ParagrafosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paragrafos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__4);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				texto();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ITALICO) | (1L << NEGRITO) | (1L << FRASE))) != 0) );
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(40);
				match(T__4);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextoContext extends ParserRuleContext {
		public ParagrafoContext paragrafo() {
			return getRuleContext(ParagrafoContext.class,0);
		}
		public NegritoContext negrito() {
			return getRuleContext(NegritoContext.class,0);
		}
		public ItalicoContext italico() {
			return getRuleContext(ItalicoContext.class,0);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).exitTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tubainaVisitor ) return ((tubainaVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_texto);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FRASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				paragrafo();
				}
				break;
			case NEGRITO:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				negrito();
				}
				break;
			case ITALICO:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				italico();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParagrafoContext extends ParserRuleContext {
		public TerminalNode FRASE() { return getToken(tubainaParser.FRASE, 0); }
		public ParagrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragrafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).enterParagrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).exitParagrafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tubainaVisitor ) return ((tubainaVisitor<? extends T>)visitor).visitParagrafo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagrafoContext paragrafo() throws RecognitionException {
		ParagrafoContext _localctx = new ParagrafoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paragrafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(FRASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegritoContext extends ParserRuleContext {
		public List<TerminalNode> NEGRITO() { return getTokens(tubainaParser.NEGRITO); }
		public TerminalNode NEGRITO(int i) {
			return getToken(tubainaParser.NEGRITO, i);
		}
		public TerminalNode FRASE() { return getToken(tubainaParser.FRASE, 0); }
		public NegritoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negrito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).enterNegrito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).exitNegrito(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tubainaVisitor ) return ((tubainaVisitor<? extends T>)visitor).visitNegrito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegritoContext negrito() throws RecognitionException {
		NegritoContext _localctx = new NegritoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_negrito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(NEGRITO);
			setState(51);
			match(FRASE);
			setState(52);
			match(NEGRITO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItalicoContext extends ParserRuleContext {
		public List<TerminalNode> ITALICO() { return getTokens(tubainaParser.ITALICO); }
		public TerminalNode ITALICO(int i) {
			return getToken(tubainaParser.ITALICO, i);
		}
		public TerminalNode FRASE() { return getToken(tubainaParser.FRASE, 0); }
		public ItalicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).enterItalico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tubainaListener ) ((tubainaListener)listener).exitItalico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tubainaVisitor ) return ((tubainaVisitor<? extends T>)visitor).visitItalico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItalicoContext italico() throws RecognitionException {
		ItalicoContext _localctx = new ItalicoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_italico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(ITALICO);
			setState(55);
			match(FRASE);
			setState(56);
			match(ITALICO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\6\2\25\n\2"+
		"\r\2\16\2\26\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4!\n\4\r\4\16\4\"\3\5\3"+
		"\5\6\5\'\n\5\r\5\16\5(\3\5\5\5,\n\5\3\6\3\6\3\6\5\6\61\n\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2:\2\22\3"+
		"\2\2\2\4\30\3\2\2\2\6\34\3\2\2\2\b$\3\2\2\2\n\60\3\2\2\2\f\62\3\2\2\2"+
		"\16\64\3\2\2\2\208\3\2\2\2\22\24\5\4\3\2\23\25\5\6\4\2\24\23\3\2\2\2\25"+
		"\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\3\3\2\2\2\30\31\7\3\2\2\31"+
		"\32\7\n\2\2\32\33\7\4\2\2\33\5\3\2\2\2\34\35\7\5\2\2\35\36\7\n\2\2\36"+
		" \7\6\2\2\37!\5\b\5\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\7"+
		"\3\2\2\2$&\7\7\2\2%\'\5\n\6\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2"+
		")+\3\2\2\2*,\7\7\2\2+*\3\2\2\2+,\3\2\2\2,\t\3\2\2\2-\61\5\f\7\2.\61\5"+
		"\16\b\2/\61\5\20\t\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\13\3\2\2\2"+
		"\62\63\7\n\2\2\63\r\3\2\2\2\64\65\7\t\2\2\65\66\7\n\2\2\66\67\7\t\2\2"+
		"\67\17\3\2\2\289\7\b\2\29:\7\n\2\2:;\7\b\2\2;\21\3\2\2\2\7\26\"(+\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}