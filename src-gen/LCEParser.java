// Generated from LCE.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LCEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, FONTTYPE=12, SLOTTYPE=13, NUM=14, VAR=15, ESPACOS=16;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_electronicComponentCreation = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "electronicComponentCreation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CRIAR '", "' '", "';'", "'CONECTAR '", "' EM '", "'RESISTOR'", 
			"'('", "')'", "'FONTE'", "','", "'NO'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"FONTTYPE", "SLOTTYPE", "NUM", "VAR", "ESPACOS"
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
	public String getGrammarFileName() { return "LCE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LCEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LCEParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCEListener ) ((LCEListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCEListener ) ((LCEListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCEVisitor ) return ((LCEVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				statement();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__3 );
			setState(11);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateComponentContext extends StatementContext {
		public ElectronicComponentCreationContext creation;
		public Token ECName;
		public ElectronicComponentCreationContext electronicComponentCreation() {
			return getRuleContext(ElectronicComponentCreationContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LCEParser.VAR, 0); }
		public CreateComponentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCEListener ) ((LCEListener)listener).enterCreateComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCEListener ) ((LCEListener)listener).exitCreateComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCEVisitor ) return ((LCEVisitor<? extends T>)visitor).visitCreateComponent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConnectComponentToNodeContext extends StatementContext {
		public Token ECName;
		public Token slot;
		public Token NodeName;
		public List<TerminalNode> VAR() { return getTokens(LCEParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LCEParser.VAR, i);
		}
		public TerminalNode SLOTTYPE() { return getToken(LCEParser.SLOTTYPE, 0); }
		public ConnectComponentToNodeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCEListener ) ((LCEListener)listener).enterConnectComponentToNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCEListener ) ((LCEListener)listener).exitConnectComponentToNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCEVisitor ) return ((LCEVisitor<? extends T>)visitor).visitConnectComponentToNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new CreateComponentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(T__0);
				setState(14);
				((CreateComponentContext)_localctx).creation = electronicComponentCreation();
				setState(15);
				match(T__1);
				setState(16);
				((CreateComponentContext)_localctx).ECName = match(VAR);
				setState(17);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new ConnectComponentToNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(T__3);
				setState(20);
				((ConnectComponentToNodeContext)_localctx).ECName = match(VAR);
				setState(21);
				match(T__1);
				setState(22);
				((ConnectComponentToNodeContext)_localctx).slot = match(SLOTTYPE);
				setState(23);
				match(T__4);
				setState(24);
				((ConnectComponentToNodeContext)_localctx).NodeName = match(VAR);
				setState(25);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElectronicComponentCreationContext extends ParserRuleContext {
		public ElectronicComponentCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_electronicComponentCreation; }
	 
		public ElectronicComponentCreationContext() { }
		public void copyFrom(ElectronicComponentCreationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodeContext extends ElectronicComponentCreationContext {
		public NodeContext(ElectronicComponentCreationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCEListener ) ((LCEListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCEListener ) ((LCEListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCEVisitor ) return ((LCEVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResistorContext extends ElectronicComponentCreationContext {
		public Token resistance;
		public TerminalNode NUM() { return getToken(LCEParser.NUM, 0); }
		public ResistorContext(ElectronicComponentCreationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCEListener ) ((LCEListener)listener).enterResistor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCEListener ) ((LCEListener)listener).exitResistor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCEVisitor ) return ((LCEVisitor<? extends T>)visitor).visitResistor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontContext extends ElectronicComponentCreationContext {
		public Token fontType;
		public Token forceValue;
		public TerminalNode FONTTYPE() { return getToken(LCEParser.FONTTYPE, 0); }
		public TerminalNode NUM() { return getToken(LCEParser.NUM, 0); }
		public FontContext(ElectronicComponentCreationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LCEListener ) ((LCEListener)listener).enterFont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LCEListener ) ((LCEListener)listener).exitFont(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LCEVisitor ) return ((LCEVisitor<? extends T>)visitor).visitFont(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElectronicComponentCreationContext electronicComponentCreation() throws RecognitionException {
		ElectronicComponentCreationContext _localctx = new ElectronicComponentCreationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_electronicComponentCreation);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new ResistorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__5);
				setState(29);
				match(T__6);
				setState(30);
				((ResistorContext)_localctx).resistance = match(NUM);
				setState(31);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new FontContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(T__8);
				setState(33);
				match(T__6);
				setState(34);
				((FontContext)_localctx).fontType = match(FONTTYPE);
				setState(35);
				match(T__9);
				setState(36);
				((FontContext)_localctx).forceValue = match(NUM);
				setState(37);
				match(T__7);
				}
				break;
			case T__10:
				_localctx = new NodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(T__10);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0010*\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000\f\u0000"+
		"\t\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002(\b\u0002"+
		"\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u0000*\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004\'\u0001"+
		"\u0000\u0000\u0000\u0006\b\u0003\u0002\u0001\u0000\u0007\u0006\u0001\u0000"+
		"\u0000\u0000\b\t\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000"+
		"\t\n\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\f\u0005"+
		"\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u000e\u0005\u0001"+
		"\u0000\u0000\u000e\u000f\u0003\u0004\u0002\u0000\u000f\u0010\u0005\u0002"+
		"\u0000\u0000\u0010\u0011\u0005\u000f\u0000\u0000\u0011\u0012\u0005\u0003"+
		"\u0000\u0000\u0012\u001b\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0004"+
		"\u0000\u0000\u0014\u0015\u0005\u000f\u0000\u0000\u0015\u0016\u0005\u0002"+
		"\u0000\u0000\u0016\u0017\u0005\r\u0000\u0000\u0017\u0018\u0005\u0005\u0000"+
		"\u0000\u0018\u0019\u0005\u000f\u0000\u0000\u0019\u001b\u0005\u0003\u0000"+
		"\u0000\u001a\r\u0001\u0000\u0000\u0000\u001a\u0013\u0001\u0000\u0000\u0000"+
		"\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0006\u0000\u0000"+
		"\u001d\u001e\u0005\u0007\u0000\u0000\u001e\u001f\u0005\u000e\u0000\u0000"+
		"\u001f(\u0005\b\u0000\u0000 !\u0005\t\u0000\u0000!\"\u0005\u0007\u0000"+
		"\u0000\"#\u0005\f\u0000\u0000#$\u0005\n\u0000\u0000$%\u0005\u000e\u0000"+
		"\u0000%(\u0005\b\u0000\u0000&(\u0005\u000b\u0000\u0000\'\u001c\u0001\u0000"+
		"\u0000\u0000\' \u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0005"+
		"\u0001\u0000\u0000\u0000\u0003\t\u001a\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}