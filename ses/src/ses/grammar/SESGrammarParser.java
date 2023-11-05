// Generated from SESGrammar.g4 by ANTLR 4.13.1
package ses.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SESGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FROM=1, PERSPECTIVE=2, CANBE=3, MADEOF=4, MORETHANONE=5, HAS=6, RANGEOF=7, 
		POSSESSIVE=8, OR=9, AND=10, STRINGSTR=11, BOOLSTR=12, INTSTR=13, FLTSTR=14, 
		WITHVALUES=15, LIKE=16, IN=17, TOBE=18, DEPENDSON=19, OUTPUT=20, COMMA=21, 
		ENDSENTENCE=22, ENDINTERV=23, BEGININTERV=24, INTEGER=25, FLOAT=26, IGNOREARTICLES=27, 
		IDENTIFIER=28, IGNOREEMPTY=29;
	public static final int
		RULE_ses = 0, RULE_sentence = 1, RULE_aspect = 2, RULE_specialization = 3, 
		RULE_multiaspect = 4, RULE_variable = 5, RULE_range = 6, RULE_aspectReutil = 7, 
		RULE_specReutil = 8, RULE_variableDependance = 9, RULE_identifierListAnd = 10, 
		RULE_identifierListOr = 11, RULE_identifierList = 12, RULE_rangeType = 13, 
		RULE_rangeOfString = 14, RULE_rangeOfFloat = 15, RULE_floatInterval = 16, 
		RULE_floatingPoint = 17, RULE_rangeOfInteger = 18, RULE_intInterval = 19, 
		RULE_existingVarListAnd = 20, RULE_existingVarList = 21, RULE_existingVar = 22, 
		RULE_identifier = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"ses", "sentence", "aspect", "specialization", "multiaspect", "variable", 
			"range", "aspectReutil", "specReutil", "variableDependance", "identifierListAnd", 
			"identifierListOr", "identifierList", "rangeType", "rangeOfString", "rangeOfFloat", 
			"floatInterval", "floatingPoint", "rangeOfInteger", "intInterval", "existingVarListAnd", 
			"existingVarList", "existingVar", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FROM", "PERSPECTIVE", "CANBE", "MADEOF", "MORETHANONE", "HAS", 
			"RANGEOF", "POSSESSIVE", "OR", "AND", "STRINGSTR", "BOOLSTR", "INTSTR", 
			"FLTSTR", "WITHVALUES", "LIKE", "IN", "TOBE", "DEPENDSON", "OUTPUT", 
			"COMMA", "ENDSENTENCE", "ENDINTERV", "BEGININTERV", "INTEGER", "FLOAT", 
			"IGNOREARTICLES", "IDENTIFIER", "IGNOREEMPTY"
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
	public String getGrammarFileName() { return "SESGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SESGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SesContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SESGrammarParser.EOF, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public SesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterSes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitSes(this);
		}
	}

	public final SesContext ses() throws RecognitionException {
		SesContext _localctx = new SesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				sentence();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 268435586L) != 0) );
			setState(53);
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
	public static class SentenceContext extends ParserRuleContext {
		public TerminalNode ENDSENTENCE() { return getToken(SESGrammarParser.ENDSENTENCE, 0); }
		public AspectContext aspect() {
			return getRuleContext(AspectContext.class,0);
		}
		public SpecializationContext specialization() {
			return getRuleContext(SpecializationContext.class,0);
		}
		public MultiaspectContext multiaspect() {
			return getRuleContext(MultiaspectContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public AspectReutilContext aspectReutil() {
			return getRuleContext(AspectReutilContext.class,0);
		}
		public SpecReutilContext specReutil() {
			return getRuleContext(SpecReutilContext.class,0);
		}
		public VariableDependanceContext variableDependance() {
			return getRuleContext(VariableDependanceContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(55);
				aspect();
				}
				break;
			case 2:
				{
				setState(56);
				specialization();
				}
				break;
			case 3:
				{
				setState(57);
				multiaspect();
				}
				break;
			case 4:
				{
				setState(58);
				variable();
				}
				break;
			case 5:
				{
				setState(59);
				range();
				}
				break;
			case 6:
				{
				setState(60);
				aspectReutil();
				}
				break;
			case 7:
				{
				setState(61);
				specReutil();
				}
				break;
			case 8:
				{
				setState(62);
				variableDependance();
				}
				break;
			}
			setState(65);
			match(ENDSENTENCE);
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
	public static class AspectContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SESGrammarParser.FROM, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode PERSPECTIVE() { return getToken(SESGrammarParser.PERSPECTIVE, 0); }
		public TerminalNode TOBE() { return getToken(SESGrammarParser.TOBE, 0); }
		public TerminalNode MADEOF() { return getToken(SESGrammarParser.MADEOF, 0); }
		public IdentifierListAndContext identifierListAnd() {
			return getRuleContext(IdentifierListAndContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SESGrammarParser.COMMA, 0); }
		public AspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterAspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitAspect(this);
		}
	}

	public final AspectContext aspect() throws RecognitionException {
		AspectContext _localctx = new AspectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aspect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(FROM);
			setState(68);
			identifier();
			setState(69);
			match(PERSPECTIVE);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(70);
				match(COMMA);
				}
			}

			setState(73);
			identifier();
			setState(74);
			match(TOBE);
			setState(75);
			match(MADEOF);
			setState(76);
			identifierListAnd();
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
	public static class SpecializationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode CANBE() { return getToken(SESGrammarParser.CANBE, 0); }
		public IdentifierListOrContext identifierListOr() {
			return getRuleContext(IdentifierListOrContext.class,0);
		}
		public TerminalNode IN() { return getToken(SESGrammarParser.IN, 0); }
		public SpecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterSpecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitSpecialization(this);
		}
	}

	public final SpecializationContext specialization() throws RecognitionException {
		SpecializationContext _localctx = new SpecializationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_specialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			identifier();
			setState(79);
			match(CANBE);
			setState(80);
			identifierListOr();
			setState(81);
			match(IN);
			setState(82);
			identifier();
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
	public static class MultiaspectContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SESGrammarParser.FROM, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode PERSPECTIVE() { return getToken(SESGrammarParser.PERSPECTIVE, 0); }
		public TerminalNode TOBE() { return getToken(SESGrammarParser.TOBE, 0); }
		public TerminalNode MADEOF() { return getToken(SESGrammarParser.MADEOF, 0); }
		public TerminalNode MORETHANONE() { return getToken(SESGrammarParser.MORETHANONE, 0); }
		public TerminalNode COMMA() { return getToken(SESGrammarParser.COMMA, 0); }
		public MultiaspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiaspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterMultiaspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitMultiaspect(this);
		}
	}

	public final MultiaspectContext multiaspect() throws RecognitionException {
		MultiaspectContext _localctx = new MultiaspectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multiaspect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(FROM);
			setState(85);
			identifier();
			setState(86);
			match(PERSPECTIVE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(87);
				match(COMMA);
				}
			}

			setState(90);
			identifier();
			setState(91);
			match(TOBE);
			setState(92);
			match(MADEOF);
			setState(93);
			match(MORETHANONE);
			setState(94);
			identifier();
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
	public static class VariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode HAS() { return getToken(SESGrammarParser.HAS, 0); }
		public IdentifierListAndContext identifierListAnd() {
			return getRuleContext(IdentifierListAndContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			identifier();
			setState(97);
			match(HAS);
			setState(98);
			identifierListAnd();
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
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode RANGEOF() { return getToken(SESGrammarParser.RANGEOF, 0); }
		public ExistingVarContext existingVar() {
			return getRuleContext(ExistingVarContext.class,0);
		}
		public TerminalNode TOBE() { return getToken(SESGrammarParser.TOBE, 0); }
		public RangeTypeContext rangeType() {
			return getRuleContext(RangeTypeContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(RANGEOF);
			setState(101);
			existingVar();
			setState(102);
			match(TOBE);
			setState(103);
			rangeType();
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
	public static class AspectReutilContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SESGrammarParser.FROM, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode PERSPECTIVE() { return getToken(SESGrammarParser.PERSPECTIVE, 0); }
		public TerminalNode COMMA() { return getToken(SESGrammarParser.COMMA, 0); }
		public TerminalNode TOBE() { return getToken(SESGrammarParser.TOBE, 0); }
		public TerminalNode LIKE() { return getToken(SESGrammarParser.LIKE, 0); }
		public AspectReutilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aspectReutil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterAspectReutil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitAspectReutil(this);
		}
	}

	public final AspectReutilContext aspectReutil() throws RecognitionException {
		AspectReutilContext _localctx = new AspectReutilContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aspectReutil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(FROM);
			setState(106);
			identifier();
			setState(107);
			match(PERSPECTIVE);
			setState(108);
			match(COMMA);
			setState(109);
			identifier();
			setState(110);
			match(TOBE);
			setState(111);
			match(LIKE);
			setState(112);
			identifier();
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
	public static class SpecReutilContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TOBE() { return getToken(SESGrammarParser.TOBE, 0); }
		public TerminalNode LIKE() { return getToken(SESGrammarParser.LIKE, 0); }
		public TerminalNode IN() { return getToken(SESGrammarParser.IN, 0); }
		public SpecReutilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specReutil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterSpecReutil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitSpecReutil(this);
		}
	}

	public final SpecReutilContext specReutil() throws RecognitionException {
		SpecReutilContext _localctx = new SpecReutilContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_specReutil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			identifier();
			setState(115);
			match(TOBE);
			setState(116);
			match(LIKE);
			setState(117);
			identifier();
			setState(118);
			match(IN);
			setState(119);
			identifier();
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
	public static class VariableDependanceContext extends ParserRuleContext {
		public ExistingVarContext existingVar() {
			return getRuleContext(ExistingVarContext.class,0);
		}
		public TerminalNode DEPENDSON() { return getToken(SESGrammarParser.DEPENDSON, 0); }
		public ExistingVarListAndContext existingVarListAnd() {
			return getRuleContext(ExistingVarListAndContext.class,0);
		}
		public VariableDependanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDependance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterVariableDependance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitVariableDependance(this);
		}
	}

	public final VariableDependanceContext variableDependance() throws RecognitionException {
		VariableDependanceContext _localctx = new VariableDependanceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDependance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			existingVar();
			setState(122);
			match(DEPENDSON);
			setState(123);
			existingVarListAnd();
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
	public static class IdentifierListAndContext extends ParserRuleContext {
		public IdentifierListAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierListAnd; }
	 
		public IdentifierListAndContext() { }
		public void copyFrom(IdentifierListAndContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAndContext extends IdentifierListAndContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdAndContext(IdentifierListAndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterIdAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitIdAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAndListContext extends IdentifierListAndContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AND() { return getToken(SESGrammarParser.AND, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SESGrammarParser.COMMA, 0); }
		public IdAndListContext(IdentifierListAndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterIdAndList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitIdAndList(this);
		}
	}

	public final IdentifierListAndContext identifierListAnd() throws RecognitionException {
		IdentifierListAndContext _localctx = new IdentifierListAndContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_identifierListAnd);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IdAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				identifier();
				}
				break;
			case 2:
				_localctx = new IdAndListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				identifierList(0);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(127);
					match(COMMA);
					}
				}

				setState(130);
				match(AND);
				setState(131);
				identifier();
				}
				break;
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
	public static class IdentifierListOrContext extends ParserRuleContext {
		public IdentifierListOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierListOr; }
	 
		public IdentifierListOrContext() { }
		public void copyFrom(IdentifierListOrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdOrListContext extends IdentifierListOrContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode OR() { return getToken(SESGrammarParser.OR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SESGrammarParser.COMMA, 0); }
		public IdOrListContext(IdentifierListOrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterIdOrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitIdOrList(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdOrContext extends IdentifierListOrContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdOrContext(IdentifierListOrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterIdOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitIdOr(this);
		}
	}

	public final IdentifierListOrContext identifierListOr() throws RecognitionException {
		IdentifierListOrContext _localctx = new IdentifierListOrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifierListOr);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IdOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				identifier();
				}
				break;
			case 2:
				_localctx = new IdOrListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				identifierList(0);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(137);
					match(COMMA);
					}
				}

				setState(140);
				match(OR);
				setState(141);
				identifier();
				}
				break;
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
	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	 
		public IdentifierListContext() { }
		public void copyFrom(IdentifierListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdListBaseCaseContext extends IdentifierListContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdListBaseCaseContext(IdentifierListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterIdListBaseCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitIdListBaseCase(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdListRecursionContext extends IdentifierListContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SESGrammarParser.COMMA, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdListRecursionContext(IdentifierListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterIdListRecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitIdListRecursion(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IdListBaseCaseContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(146);
			identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdListRecursionContext(new IdentifierListContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(148);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(149);
					match(COMMA);
					setState(150);
					identifier();
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeTypeContext extends ParserRuleContext {
		public RangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeType; }
	 
		public RangeTypeContext() { }
		public void copyFrom(RangeTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeTypeFloatContext extends RangeTypeContext {
		public RangeOfFloatContext rangeOfFloat() {
			return getRuleContext(RangeOfFloatContext.class,0);
		}
		public RangeTypeFloatContext(RangeTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterRangeTypeFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitRangeTypeFloat(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeTypeStringContext extends RangeTypeContext {
		public RangeOfStringContext rangeOfString() {
			return getRuleContext(RangeOfStringContext.class,0);
		}
		public RangeTypeStringContext(RangeTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterRangeTypeString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitRangeTypeString(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeTypeIntegerContext extends RangeTypeContext {
		public RangeOfIntegerContext rangeOfInteger() {
			return getRuleContext(RangeOfIntegerContext.class,0);
		}
		public RangeTypeIntegerContext(RangeTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterRangeTypeInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitRangeTypeInteger(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeTypeBooleanContext extends RangeTypeContext {
		public TerminalNode BOOLSTR() { return getToken(SESGrammarParser.BOOLSTR, 0); }
		public RangeTypeBooleanContext(RangeTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterRangeTypeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitRangeTypeBoolean(this);
		}
	}

	public final RangeTypeContext rangeType() throws RecognitionException {
		RangeTypeContext _localctx = new RangeTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rangeType);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGSTR:
				_localctx = new RangeTypeStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				rangeOfString();
				}
				break;
			case FLTSTR:
				_localctx = new RangeTypeFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				rangeOfFloat();
				}
				break;
			case INTSTR:
				_localctx = new RangeTypeIntegerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				rangeOfInteger();
				}
				break;
			case BOOLSTR:
				_localctx = new RangeTypeBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(BOOLSTR);
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
	public static class RangeOfStringContext extends ParserRuleContext {
		public RangeOfStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeOfString; }
	 
		public RangeOfStringContext() { }
		public void copyFrom(RangeOfStringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeOfStringSpecifiedContext extends RangeOfStringContext {
		public TerminalNode STRINGSTR() { return getToken(SESGrammarParser.STRINGSTR, 0); }
		public TerminalNode WITHVALUES() { return getToken(SESGrammarParser.WITHVALUES, 0); }
		public IdentifierListAndContext identifierListAnd() {
			return getRuleContext(IdentifierListAndContext.class,0);
		}
		public RangeOfStringSpecifiedContext(RangeOfStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterRangeOfStringSpecified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitRangeOfStringSpecified(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeOfStringUnspecifiedContext extends RangeOfStringContext {
		public TerminalNode STRINGSTR() { return getToken(SESGrammarParser.STRINGSTR, 0); }
		public RangeOfStringUnspecifiedContext(RangeOfStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterRangeOfStringUnspecified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitRangeOfStringUnspecified(this);
		}
	}

	public final RangeOfStringContext rangeOfString() throws RecognitionException {
		RangeOfStringContext _localctx = new RangeOfStringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rangeOfString);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new RangeOfStringUnspecifiedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(STRINGSTR);
				}
				break;
			case 2:
				_localctx = new RangeOfStringSpecifiedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(STRINGSTR);
				setState(164);
				match(WITHVALUES);
				setState(165);
				identifierListAnd();
				}
				break;
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
	public static class RangeOfFloatContext extends ParserRuleContext {
		public RangeOfFloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeOfFloat; }
	 
		public RangeOfFloatContext() { }
		public void copyFrom(RangeOfFloatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeOfFloatSpecifiedContext extends RangeOfFloatContext {
		public TerminalNode FLTSTR() { return getToken(SESGrammarParser.FLTSTR, 0); }
		public TerminalNode WITHVALUES() { return getToken(SESGrammarParser.WITHVALUES, 0); }
		public FloatIntervalContext floatInterval() {
			return getRuleContext(FloatIntervalContext.class,0);
		}
		public RangeOfFloatSpecifiedContext(RangeOfFloatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterRangeOfFloatSpecified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitRangeOfFloatSpecified(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeOfFloatUnspecifiedContext extends RangeOfFloatContext {
		public TerminalNode FLTSTR() { return getToken(SESGrammarParser.FLTSTR, 0); }
		public RangeOfFloatUnspecifiedContext(RangeOfFloatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterRangeOfFloatUnspecified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitRangeOfFloatUnspecified(this);
		}
	}

	public final RangeOfFloatContext rangeOfFloat() throws RecognitionException {
		RangeOfFloatContext _localctx = new RangeOfFloatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rangeOfFloat);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new RangeOfFloatUnspecifiedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(FLTSTR);
				}
				break;
			case 2:
				_localctx = new RangeOfFloatSpecifiedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(FLTSTR);
				setState(170);
				match(WITHVALUES);
				setState(171);
				floatInterval();
				}
				break;
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
	public static class FloatIntervalContext extends ParserRuleContext {
		public TerminalNode BEGININTERV() { return getToken(SESGrammarParser.BEGININTERV, 0); }
		public List<FloatingPointContext> floatingPoint() {
			return getRuleContexts(FloatingPointContext.class);
		}
		public FloatingPointContext floatingPoint(int i) {
			return getRuleContext(FloatingPointContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SESGrammarParser.COMMA, 0); }
		public TerminalNode ENDINTERV() { return getToken(SESGrammarParser.ENDINTERV, 0); }
		public FloatIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterFloatInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitFloatInterval(this);
		}
	}

	public final FloatIntervalContext floatInterval() throws RecognitionException {
		FloatIntervalContext _localctx = new FloatIntervalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_floatInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(BEGININTERV);
			setState(175);
			floatingPoint();
			setState(176);
			match(COMMA);
			setState(177);
			floatingPoint();
			setState(178);
			match(ENDINTERV);
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
	public static class FloatingPointContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SESGrammarParser.FLOAT, 0); }
		public TerminalNode INTEGER() { return getToken(SESGrammarParser.INTEGER, 0); }
		public FloatingPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterFloatingPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitFloatingPoint(this);
		}
	}

	public final FloatingPointContext floatingPoint() throws RecognitionException {
		FloatingPointContext _localctx = new FloatingPointContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_floatingPoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangeOfIntegerContext extends ParserRuleContext {
		public RangeOfIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeOfInteger; }
	 
		public RangeOfIntegerContext() { }
		public void copyFrom(RangeOfIntegerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeOfIntegerUnspecifiedContext extends RangeOfIntegerContext {
		public TerminalNode INTSTR() { return getToken(SESGrammarParser.INTSTR, 0); }
		public RangeOfIntegerUnspecifiedContext(RangeOfIntegerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterRangeOfIntegerUnspecified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitRangeOfIntegerUnspecified(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeOfIntegerSpecifiedContext extends RangeOfIntegerContext {
		public TerminalNode INTSTR() { return getToken(SESGrammarParser.INTSTR, 0); }
		public TerminalNode WITHVALUES() { return getToken(SESGrammarParser.WITHVALUES, 0); }
		public IntIntervalContext intInterval() {
			return getRuleContext(IntIntervalContext.class,0);
		}
		public RangeOfIntegerSpecifiedContext(RangeOfIntegerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterRangeOfIntegerSpecified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitRangeOfIntegerSpecified(this);
		}
	}

	public final RangeOfIntegerContext rangeOfInteger() throws RecognitionException {
		RangeOfIntegerContext _localctx = new RangeOfIntegerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rangeOfInteger);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new RangeOfIntegerUnspecifiedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(INTSTR);
				}
				break;
			case 2:
				_localctx = new RangeOfIntegerSpecifiedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(INTSTR);
				setState(184);
				match(WITHVALUES);
				setState(185);
				intInterval();
				}
				break;
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
	public static class IntIntervalContext extends ParserRuleContext {
		public TerminalNode BEGININTERV() { return getToken(SESGrammarParser.BEGININTERV, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(SESGrammarParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SESGrammarParser.INTEGER, i);
		}
		public TerminalNode COMMA() { return getToken(SESGrammarParser.COMMA, 0); }
		public TerminalNode ENDINTERV() { return getToken(SESGrammarParser.ENDINTERV, 0); }
		public IntIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterIntInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitIntInterval(this);
		}
	}

	public final IntIntervalContext intInterval() throws RecognitionException {
		IntIntervalContext _localctx = new IntIntervalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_intInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(BEGININTERV);
			setState(189);
			match(INTEGER);
			setState(190);
			match(COMMA);
			setState(191);
			match(INTEGER);
			setState(192);
			match(ENDINTERV);
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
	public static class ExistingVarListAndContext extends ParserRuleContext {
		public ExistingVarListAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existingVarListAnd; }
	 
		public ExistingVarListAndContext() { }
		public void copyFrom(ExistingVarListAndContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OneExistingVarContext extends ExistingVarListAndContext {
		public ExistingVarContext existingVar() {
			return getRuleContext(ExistingVarContext.class,0);
		}
		public OneExistingVarContext(ExistingVarListAndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterOneExistingVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitOneExistingVar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManyExistingVarContext extends ExistingVarListAndContext {
		public ExistingVarListContext existingVarList() {
			return getRuleContext(ExistingVarListContext.class,0);
		}
		public TerminalNode AND() { return getToken(SESGrammarParser.AND, 0); }
		public ExistingVarContext existingVar() {
			return getRuleContext(ExistingVarContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SESGrammarParser.COMMA, 0); }
		public ManyExistingVarContext(ExistingVarListAndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterManyExistingVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitManyExistingVar(this);
		}
	}

	public final ExistingVarListAndContext existingVarListAnd() throws RecognitionException {
		ExistingVarListAndContext _localctx = new ExistingVarListAndContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_existingVarListAnd);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new OneExistingVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				existingVar();
				}
				break;
			case 2:
				_localctx = new ManyExistingVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				existingVarList(0);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(196);
					match(COMMA);
					}
				}

				setState(199);
				match(AND);
				setState(200);
				existingVar();
				}
				break;
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
	public static class ExistingVarListContext extends ParserRuleContext {
		public ExistingVarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existingVarList; }
	 
		public ExistingVarListContext() { }
		public void copyFrom(ExistingVarListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistingVarListRecursionContext extends ExistingVarListContext {
		public ExistingVarListContext existingVarList() {
			return getRuleContext(ExistingVarListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SESGrammarParser.COMMA, 0); }
		public ExistingVarContext existingVar() {
			return getRuleContext(ExistingVarContext.class,0);
		}
		public ExistingVarListRecursionContext(ExistingVarListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterExistingVarListRecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitExistingVarListRecursion(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistingVarListBaseCaseContext extends ExistingVarListContext {
		public ExistingVarContext existingVar() {
			return getRuleContext(ExistingVarContext.class,0);
		}
		public ExistingVarListBaseCaseContext(ExistingVarListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterExistingVarListBaseCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitExistingVarListBaseCase(this);
		}
	}

	public final ExistingVarListContext existingVarList() throws RecognitionException {
		return existingVarList(0);
	}

	private ExistingVarListContext existingVarList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExistingVarListContext _localctx = new ExistingVarListContext(_ctx, _parentState);
		ExistingVarListContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_existingVarList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExistingVarListBaseCaseContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(205);
			existingVar();
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExistingVarListRecursionContext(new ExistingVarListContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_existingVarList);
					setState(207);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(208);
					match(COMMA);
					setState(209);
					existingVar();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExistingVarContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode POSSESSIVE() { return getToken(SESGrammarParser.POSSESSIVE, 0); }
		public ExistingVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existingVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterExistingVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitExistingVar(this);
		}
	}

	public final ExistingVarContext existingVar() throws RecognitionException {
		ExistingVarContext _localctx = new ExistingVarContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_existingVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			identifier();
			setState(216);
			match(POSSESSIVE);
			setState(217);
			identifier();
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
	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SESGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SESGrammarParser.IDENTIFIER, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SESGrammarListener ) ((SESGrammarListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(219);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(222); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 21:
			return existingVarList_sempred((ExistingVarListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean existingVarList_sempred(ExistingVarListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0004"+
		"\u00002\b\u0000\u000b\u0000\f\u00003\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001@\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004Y\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0081\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u0086"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008b\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0090\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0098\b\f\n\f\f\f\u009b\t\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a1\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00a7\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00ad\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00bb\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00c6\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00cb\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00d3\b\u0015"+
		"\n\u0015\f\u0015\u00d6\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0004\u0017\u00dd\b\u0017\u000b\u0017\f\u0017\u00de"+
		"\u0001\u0017\u0000\u0002\u0018*\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0001"+
		"\u0001\u0000\u0019\u001a\u00e1\u00001\u0001\u0000\u0000\u0000\u0002?\u0001"+
		"\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000"+
		"\u0000\bT\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000\u0000\fd\u0001"+
		"\u0000\u0000\u0000\u000ei\u0001\u0000\u0000\u0000\u0010r\u0001\u0000\u0000"+
		"\u0000\u0012y\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000"+
		"\u0016\u008f\u0001\u0000\u0000\u0000\u0018\u0091\u0001\u0000\u0000\u0000"+
		"\u001a\u00a0\u0001\u0000\u0000\u0000\u001c\u00a6\u0001\u0000\u0000\u0000"+
		"\u001e\u00ac\u0001\u0000\u0000\u0000 \u00ae\u0001\u0000\u0000\u0000\""+
		"\u00b4\u0001\u0000\u0000\u0000$\u00ba\u0001\u0000\u0000\u0000&\u00bc\u0001"+
		"\u0000\u0000\u0000(\u00ca\u0001\u0000\u0000\u0000*\u00cc\u0001\u0000\u0000"+
		"\u0000,\u00d7\u0001\u0000\u0000\u0000.\u00dc\u0001\u0000\u0000\u00000"+
		"2\u0003\u0002\u0001\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000056\u0005\u0000\u0000\u00016\u0001\u0001\u0000\u0000\u0000"+
		"7@\u0003\u0004\u0002\u00008@\u0003\u0006\u0003\u00009@\u0003\b\u0004\u0000"+
		":@\u0003\n\u0005\u0000;@\u0003\f\u0006\u0000<@\u0003\u000e\u0007\u0000"+
		"=@\u0003\u0010\b\u0000>@\u0003\u0012\t\u0000?7\u0001\u0000\u0000\u0000"+
		"?8\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000?:\u0001\u0000\u0000"+
		"\u0000?;\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005"+
		"\u0016\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0005\u0001\u0000"+
		"\u0000DE\u0003.\u0017\u0000EG\u0005\u0002\u0000\u0000FH\u0005\u0015\u0000"+
		"\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IJ\u0003.\u0017\u0000JK\u0005\u0012\u0000\u0000KL\u0005\u0004"+
		"\u0000\u0000LM\u0003\u0014\n\u0000M\u0005\u0001\u0000\u0000\u0000NO\u0003"+
		".\u0017\u0000OP\u0005\u0003\u0000\u0000PQ\u0003\u0016\u000b\u0000QR\u0005"+
		"\u0011\u0000\u0000RS\u0003.\u0017\u0000S\u0007\u0001\u0000\u0000\u0000"+
		"TU\u0005\u0001\u0000\u0000UV\u0003.\u0017\u0000VX\u0005\u0002\u0000\u0000"+
		"WY\u0005\u0015\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z[\u0003.\u0017\u0000[\\\u0005\u0012\u0000"+
		"\u0000\\]\u0005\u0004\u0000\u0000]^\u0005\u0005\u0000\u0000^_\u0003.\u0017"+
		"\u0000_\t\u0001\u0000\u0000\u0000`a\u0003.\u0017\u0000ab\u0005\u0006\u0000"+
		"\u0000bc\u0003\u0014\n\u0000c\u000b\u0001\u0000\u0000\u0000de\u0005\u0007"+
		"\u0000\u0000ef\u0003,\u0016\u0000fg\u0005\u0012\u0000\u0000gh\u0003\u001a"+
		"\r\u0000h\r\u0001\u0000\u0000\u0000ij\u0005\u0001\u0000\u0000jk\u0003"+
		".\u0017\u0000kl\u0005\u0002\u0000\u0000lm\u0005\u0015\u0000\u0000mn\u0003"+
		".\u0017\u0000no\u0005\u0012\u0000\u0000op\u0005\u0010\u0000\u0000pq\u0003"+
		".\u0017\u0000q\u000f\u0001\u0000\u0000\u0000rs\u0003.\u0017\u0000st\u0005"+
		"\u0012\u0000\u0000tu\u0005\u0010\u0000\u0000uv\u0003.\u0017\u0000vw\u0005"+
		"\u0011\u0000\u0000wx\u0003.\u0017\u0000x\u0011\u0001\u0000\u0000\u0000"+
		"yz\u0003,\u0016\u0000z{\u0005\u0013\u0000\u0000{|\u0003(\u0014\u0000|"+
		"\u0013\u0001\u0000\u0000\u0000}\u0086\u0003.\u0017\u0000~\u0080\u0003"+
		"\u0018\f\u0000\u007f\u0081\u0005\u0015\u0000\u0000\u0080\u007f\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\n\u0000\u0000\u0083\u0084\u0003.\u0017"+
		"\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085}\u0001\u0000\u0000\u0000"+
		"\u0085~\u0001\u0000\u0000\u0000\u0086\u0015\u0001\u0000\u0000\u0000\u0087"+
		"\u0090\u0003.\u0017\u0000\u0088\u008a\u0003\u0018\f\u0000\u0089\u008b"+
		"\u0005\u0015\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\t\u0000\u0000\u008d\u008e\u0003.\u0017\u0000\u008e\u0090\u0001"+
		"\u0000\u0000\u0000\u008f\u0087\u0001\u0000\u0000\u0000\u008f\u0088\u0001"+
		"\u0000\u0000\u0000\u0090\u0017\u0001\u0000\u0000\u0000\u0091\u0092\u0006"+
		"\f\uffff\uffff\u0000\u0092\u0093\u0003.\u0017\u0000\u0093\u0099\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\n\u0001\u0000\u0000\u0095\u0096\u0005\u0015"+
		"\u0000\u0000\u0096\u0098\u0003.\u0017\u0000\u0097\u0094\u0001\u0000\u0000"+
		"\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0019\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u00a1\u0003\u001c\u000e"+
		"\u0000\u009d\u00a1\u0003\u001e\u000f\u0000\u009e\u00a1\u0003$\u0012\u0000"+
		"\u009f\u00a1\u0005\f\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0"+
		"\u009d\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u001b\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a7\u0005\u000b\u0000\u0000\u00a3\u00a4\u0005\u000b\u0000\u0000\u00a4"+
		"\u00a5\u0005\u000f\u0000\u0000\u00a5\u00a7\u0003\u0014\n\u0000\u00a6\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a7\u001d"+
		"\u0001\u0000\u0000\u0000\u00a8\u00ad\u0005\u000e\u0000\u0000\u00a9\u00aa"+
		"\u0005\u000e\u0000\u0000\u00aa\u00ab\u0005\u000f\u0000\u0000\u00ab\u00ad"+
		"\u0003 \u0010\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ac\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ad\u001f\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		"\u0018\u0000\u0000\u00af\u00b0\u0003\"\u0011\u0000\u00b0\u00b1\u0005\u0015"+
		"\u0000\u0000\u00b1\u00b2\u0003\"\u0011\u0000\u00b2\u00b3\u0005\u0017\u0000"+
		"\u0000\u00b3!\u0001\u0000\u0000\u0000\u00b4\u00b5\u0007\u0000\u0000\u0000"+
		"\u00b5#\u0001\u0000\u0000\u0000\u00b6\u00bb\u0005\r\u0000\u0000\u00b7"+
		"\u00b8\u0005\r\u0000\u0000\u00b8\u00b9\u0005\u000f\u0000\u0000\u00b9\u00bb"+
		"\u0003&\u0013\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001"+
		"\u0000\u0000\u0000\u00bb%\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0018"+
		"\u0000\u0000\u00bd\u00be\u0005\u0019\u0000\u0000\u00be\u00bf\u0005\u0015"+
		"\u0000\u0000\u00bf\u00c0\u0005\u0019\u0000\u0000\u00c0\u00c1\u0005\u0017"+
		"\u0000\u0000\u00c1\'\u0001\u0000\u0000\u0000\u00c2\u00cb\u0003,\u0016"+
		"\u0000\u00c3\u00c5\u0003*\u0015\u0000\u00c4\u00c6\u0005\u0015\u0000\u0000"+
		"\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\n\u0000\u0000\u00c8"+
		"\u00c9\u0003,\u0016\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c2"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c3\u0001\u0000\u0000\u0000\u00cb)\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0006\u0015\uffff\uffff\u0000\u00cd\u00ce"+
		"\u0003,\u0016\u0000\u00ce\u00d4\u0001\u0000\u0000\u0000\u00cf\u00d0\n"+
		"\u0001\u0000\u0000\u00d0\u00d1\u0005\u0015\u0000\u0000\u00d1\u00d3\u0003"+
		",\u0016\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5+\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0003.\u0017\u0000\u00d8\u00d9\u0005\b\u0000\u0000"+
		"\u00d9\u00da\u0003.\u0017\u0000\u00da-\u0001\u0000\u0000\u0000\u00db\u00dd"+
		"\u0005\u001c\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00df/\u0001\u0000\u0000\u0000\u00113?GX\u0080"+
		"\u0085\u008a\u008f\u0099\u00a0\u00a6\u00ac\u00ba\u00c5\u00ca\u00d4\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}