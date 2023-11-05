// Generated from SESGrammar.g4 by ANTLR 4.13.1
package ses.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SESGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FROM", "PERSPECTIVE", "CANBE", "MADEOF", "MORETHANONE", "HAS", "RANGEOF", 
			"POSSESSIVE", "OR", "AND", "STRINGSTR", "BOOLSTR", "INTSTR", "FLTSTR", 
			"WITHVALUES", "LIKE", "IN", "TOBE", "DEPENDSON", "OUTPUT", "COMMA", "ENDSENTENCE", 
			"ENDINTERV", "BEGININTERV", "INTEGER", "FLOAT", "IGNOREARTICLES", "IDENTIFIER", 
			"IGNOREEMPTY", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "ENIE", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
			"Y", "Z"
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


	public SESGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SESGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001d\u0189\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!"+
		"\u0007!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002"+
		"&\u0007&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002"+
		"+\u0007+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u0002"+
		"0\u00070\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u0002"+
		"5\u00075\u00026\u00076\u00027\u00077\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00b0\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00dd\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00fa\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0112\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0126\b\u0018\n"+
		"\u0018\f\u0018\u0129\t\u0018\u0003\u0018\u012b\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u0130\b\u0019\n\u0019\f\u0019\u0133\t\u0019"+
		"\u0003\u0019\u0135\b\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u0139\b"+
		"\u0019\u000b\u0019\f\u0019\u013a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0145"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u014b"+
		"\b\u001b\n\u001b\f\u001b\u014e\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001"+
		"-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u00011\u00012\u0001"+
		"2\u00013\u00013\u00014\u00014\u00015\u00015\u00016\u00016\u00017\u0001"+
		"7\u0000\u00008\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u0000=\u0000"+
		"?\u0000A\u0000C\u0000E\u0000G\u0000I\u0000K\u0000M\u0000O\u0000Q\u0000"+
		"S\u0000U\u0000W\u0000Y\u0000[\u0000]\u0000_\u0000a\u0000c\u0000e\u0000"+
		"g\u0000i\u0000k\u0000m\u0000o\u0000\u0001\u0000#\u0002\u0000!!..\u0002"+
		"\u0000))]]\u0002\u0000(([[\u0001\u000019\u0001\u000009\u0002\u0000AZa"+
		"z\u0005\u0000--09AZ__az\u0003\u0000\t\n\r\r  \u0004\u0000AAaa\u00c1\u00c1"+
		"\u00e1\u00e1\u0002\u0000BBbb\u0002\u0000CCcc\u0002\u0000DDdd\u0004\u0000"+
		"EEee\u00c9\u00c9\u00e9\u00e9\u0002\u0000FFff\u0002\u0000GGgg\u0002\u0000"+
		"HHhh\u0004\u0000IIii\u00cd\u00cd\u00ed\u00ed\u0002\u0000JJjj\u0002\u0000"+
		"KKkk\u0002\u0000LLll\u0002\u0000MMmm\u0002\u0000NNnn\u0002\u0000\u00d1"+
		"\u00d1\u00f1\u00f1\u0004\u0000OOoo\u00d3\u00d3\u00f3\u00f3\u0002\u0000"+
		"PPpp\u0002\u0000QQqq\u0002\u0000RRrr\u0002\u0000SSss\u0002\u0000TTtt\u0004"+
		"\u0000UUuu\u00da\u00da\u00fa\u00fa\u0002\u0000VVvv\u0002\u0000WWww\u0002"+
		"\u0000XXxx\u0002\u0000YYyy\u0002\u0000ZZzz\u0179\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0001q\u0001\u0000\u0000\u0000\u0003v\u0001\u0000\u0000\u0000\u0005"+
		"\u0082\u0001\u0000\u0000\u0000\u0007\u0089\u0001\u0000\u0000\u0000\t\u0091"+
		"\u0001\u0000\u0000\u0000\u000b\u009f\u0001\u0000\u0000\u0000\r\u00a3\u0001"+
		"\u0000\u0000\u0000\u000f\u00af\u0001\u0000\u0000\u0000\u0011\u00b1\u0001"+
		"\u0000\u0000\u0000\u0013\u00b4\u0001\u0000\u0000\u0000\u0015\u00b8\u0001"+
		"\u0000\u0000\u0000\u0017\u00bf\u0001\u0000\u0000\u0000\u0019\u00c7\u0001"+
		"\u0000\u0000\u0000\u001b\u00dc\u0001\u0000\u0000\u0000\u001d\u00de\u0001"+
		"\u0000\u0000\u0000\u001f\u00ea\u0001\u0000\u0000\u0000!\u00ef\u0001\u0000"+
		"\u0000\u0000#\u00f9\u0001\u0000\u0000\u0000%\u0111\u0001\u0000\u0000\u0000"+
		"\'\u0113\u0001\u0000\u0000\u0000)\u011a\u0001\u0000\u0000\u0000+\u011c"+
		"\u0001\u0000\u0000\u0000-\u011e\u0001\u0000\u0000\u0000/\u0120\u0001\u0000"+
		"\u0000\u00001\u012a\u0001\u0000\u0000\u00003\u0134\u0001\u0000\u0000\u0000"+
		"5\u0144\u0001\u0000\u0000\u00007\u0148\u0001\u0000\u0000\u00009\u014f"+
		"\u0001\u0000\u0000\u0000;\u0153\u0001\u0000\u0000\u0000=\u0155\u0001\u0000"+
		"\u0000\u0000?\u0157\u0001\u0000\u0000\u0000A\u0159\u0001\u0000\u0000\u0000"+
		"C\u015b\u0001\u0000\u0000\u0000E\u015d\u0001\u0000\u0000\u0000G\u015f"+
		"\u0001\u0000\u0000\u0000I\u0161\u0001\u0000\u0000\u0000K\u0163\u0001\u0000"+
		"\u0000\u0000M\u0165\u0001\u0000\u0000\u0000O\u0167\u0001\u0000\u0000\u0000"+
		"Q\u0169\u0001\u0000\u0000\u0000S\u016b\u0001\u0000\u0000\u0000U\u016d"+
		"\u0001\u0000\u0000\u0000W\u016f\u0001\u0000\u0000\u0000Y\u0171\u0001\u0000"+
		"\u0000\u0000[\u0173\u0001\u0000\u0000\u0000]\u0175\u0001\u0000\u0000\u0000"+
		"_\u0177\u0001\u0000\u0000\u0000a\u0179\u0001\u0000\u0000\u0000c\u017b"+
		"\u0001\u0000\u0000\u0000e\u017d\u0001\u0000\u0000\u0000g\u017f\u0001\u0000"+
		"\u0000\u0000i\u0181\u0001\u0000\u0000\u0000k\u0183\u0001\u0000\u0000\u0000"+
		"m\u0185\u0001\u0000\u0000\u0000o\u0187\u0001\u0000\u0000\u0000qr\u0003"+
		"E\"\u0000rs\u0003_/\u0000st\u0003Y,\u0000tu\u0003S)\u0000u\u0002\u0001"+
		"\u0000\u0000\u0000vw\u0003[-\u0000wx\u0003C!\u0000xy\u0003_/\u0000yz\u0003"+
		"a0\u0000z{\u0003[-\u0000{|\u0003C!\u0000|}\u0003?\u001f\u0000}~\u0003"+
		"c1\u0000~\u007f\u0003K%\u0000\u007f\u0080\u0003g3\u0000\u0080\u0081\u0003"+
		"C!\u0000\u0081\u0004\u0001\u0000\u0000\u0000\u0082\u0083\u0003?\u001f"+
		"\u0000\u0083\u0084\u0003;\u001d\u0000\u0084\u0085\u0003U*\u0000\u0085"+
		"\u0086\u0005 \u0000\u0000\u0086\u0087\u0003=\u001e\u0000\u0087\u0088\u0003"+
		"C!\u0000\u0088\u0006\u0001\u0000\u0000\u0000\u0089\u008a\u0003S)\u0000"+
		"\u008a\u008b\u0003;\u001d\u0000\u008b\u008c\u0003A \u0000\u008c\u008d"+
		"\u0003C!\u0000\u008d\u008e\u0005 \u0000\u0000\u008e\u008f\u0003Y,\u0000"+
		"\u008f\u0090\u0003E\"\u0000\u0090\b\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0003S)\u0000\u0092\u0093\u0003Y,\u0000\u0093\u0094\u0003_/\u0000\u0094"+
		"\u0095\u0003C!\u0000\u0095\u0096\u0005 \u0000\u0000\u0096\u0097\u0003"+
		"c1\u0000\u0097\u0098\u0003I$\u0000\u0098\u0099\u0003;\u001d\u0000\u0099"+
		"\u009a\u0003U*\u0000\u009a\u009b\u0005 \u0000\u0000\u009b\u009c\u0003"+
		"Y,\u0000\u009c\u009d\u0003U*\u0000\u009d\u009e\u0003C!\u0000\u009e\n\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0003I$\u0000\u00a0\u00a1\u0003;\u001d"+
		"\u0000\u00a1\u00a2\u0003a0\u0000\u00a2\f\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0003_/\u0000\u00a4\u00a5\u0003;\u001d\u0000\u00a5\u00a6\u0003"+
		"U*\u0000\u00a6\u00a7\u0003G#\u0000\u00a7\u00a8\u0003C!\u0000\u00a8\u00a9"+
		"\u0005 \u0000\u0000\u00a9\u00aa\u0003Y,\u0000\u00aa\u00ab\u0003E\"\u0000"+
		"\u00ab\u000e\u0001\u0000\u0000\u0000\u00ac\u00b0\u0005\'\u0000\u0000\u00ad"+
		"\u00ae\u0005\'\u0000\u0000\u00ae\u00b0\u0005s\u0000\u0000\u00af\u00ac"+
		"\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u0010"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003Y,\u0000\u00b2\u00b3\u0003_"+
		"/\u0000\u00b3\u0012\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003;\u001d\u0000"+
		"\u00b5\u00b6\u0003U*\u0000\u00b6\u00b7\u0003A \u0000\u00b7\u0014\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0003a0\u0000\u00b9\u00ba\u0003c1\u0000"+
		"\u00ba\u00bb\u0003_/\u0000\u00bb\u00bc\u0003K%\u0000\u00bc\u00bd\u0003"+
		"U*\u0000\u00bd\u00be\u0003G#\u0000\u00be\u0016\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0003=\u001e\u0000\u00c0\u00c1\u0003Y,\u0000\u00c1\u00c2"+
		"\u0003Y,\u0000\u00c2\u00c3\u0003Q(\u0000\u00c3\u00c4\u0003C!\u0000\u00c4"+
		"\u00c5\u0003;\u001d\u0000\u00c5\u00c6\u0003U*\u0000\u00c6\u0018\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0003K%\u0000\u00c8\u00c9\u0003U*\u0000"+
		"\u00c9\u00ca\u0003c1\u0000\u00ca\u00cb\u0003C!\u0000\u00cb\u00cc\u0003"+
		"G#\u0000\u00cc\u00cd\u0003C!\u0000\u00cd\u00ce\u0003_/\u0000\u00ce\u001a"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003E\"\u0000\u00d0\u00d1\u0003"+
		"Q(\u0000\u00d1\u00d2\u0003Y,\u0000\u00d2\u00d3\u0003;\u001d\u0000\u00d3"+
		"\u00d4\u0003c1\u0000\u00d4\u00dd\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003"+
		"A \u0000\u00d6\u00d7\u0003Y,\u0000\u00d7\u00d8\u0003e2\u0000\u00d8\u00d9"+
		"\u0003=\u001e\u0000\u00d9\u00da\u0003Q(\u0000\u00da\u00db\u0003C!\u0000"+
		"\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00cf\u0001\u0000\u0000\u0000"+
		"\u00dc\u00d5\u0001\u0000\u0000\u0000\u00dd\u001c\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0003i4\u0000\u00df\u00e0\u0003K%\u0000\u00e0\u00e1\u0003"+
		"c1\u0000\u00e1\u00e2\u0003I$\u0000\u00e2\u00e3\u0005 \u0000\u0000\u00e3"+
		"\u00e4\u0003g3\u0000\u00e4\u00e5\u0003;\u001d\u0000\u00e5\u00e6\u0003"+
		"Q(\u0000\u00e6\u00e7\u0003e2\u0000\u00e7\u00e8\u0003C!\u0000\u00e8\u00e9"+
		"\u0003a0\u0000\u00e9\u001e\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003Q"+
		"(\u0000\u00eb\u00ec\u0003K%\u0000\u00ec\u00ed\u0003O\'\u0000\u00ed\u00ee"+
		"\u0003C!\u0000\u00ee \u0001\u0000\u0000\u0000\u00ef\u00f0\u0003K%\u0000"+
		"\u00f0\u00f1\u0003U*\u0000\u00f1\"\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0003K%\u0000\u00f3\u00f4\u0003a0\u0000\u00f4\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0003;\u001d\u0000\u00f6\u00f7\u0003_/\u0000\u00f7"+
		"\u00f8\u0003C!\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f5\u0001\u0000\u0000\u0000\u00fa$\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0003?\u001f\u0000\u00fc\u00fd\u0003Y,\u0000"+
		"\u00fd\u00fe\u0003S)\u0000\u00fe\u00ff\u0003C!\u0000\u00ff\u0100\u0003"+
		"a0\u0000\u0100\u0101\u0005 \u0000\u0000\u0101\u0102\u0003E\"\u0000\u0102"+
		"\u0103\u0003_/\u0000\u0103\u0104\u0003Y,\u0000\u0104\u0105\u0003S)\u0000"+
		"\u0105\u0112\u0001\u0000\u0000\u0000\u0106\u0107\u0003A \u0000\u0107\u0108"+
		"\u0003C!\u0000\u0108\u0109\u0003[-\u0000\u0109\u010a\u0003C!\u0000\u010a"+
		"\u010b\u0003U*\u0000\u010b\u010c\u0003A \u0000\u010c\u010d\u0003a0\u0000"+
		"\u010d\u010e\u0005 \u0000\u0000\u010e\u010f\u0003Y,\u0000\u010f\u0110"+
		"\u0003U*\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u00fb\u0001\u0000"+
		"\u0000\u0000\u0111\u0106\u0001\u0000\u0000\u0000\u0112&\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0003Y,\u0000\u0114\u0115\u0003e2\u0000\u0115\u0116"+
		"\u0003c1\u0000\u0116\u0117\u0003[-\u0000\u0117\u0118\u0003e2\u0000\u0118"+
		"\u0119\u0003c1\u0000\u0119(\u0001\u0000\u0000\u0000\u011a\u011b\u0005"+
		",\u0000\u0000\u011b*\u0001\u0000\u0000\u0000\u011c\u011d\u0007\u0000\u0000"+
		"\u0000\u011d,\u0001\u0000\u0000\u0000\u011e\u011f\u0007\u0001\u0000\u0000"+
		"\u011f.\u0001\u0000\u0000\u0000\u0120\u0121\u0007\u0002\u0000\u0000\u0121"+
		"0\u0001\u0000\u0000\u0000\u0122\u012b\u00050\u0000\u0000\u0123\u0127\u0007"+
		"\u0003\u0000\u0000\u0124\u0126\u0007\u0004\u0000\u0000\u0125\u0124\u0001"+
		"\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012b\u0001"+
		"\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u0122\u0001"+
		"\u0000\u0000\u0000\u012a\u0123\u0001\u0000\u0000\u0000\u012b2\u0001\u0000"+
		"\u0000\u0000\u012c\u0135\u00050\u0000\u0000\u012d\u0131\u0007\u0003\u0000"+
		"\u0000\u012e\u0130\u0007\u0004\u0000\u0000\u012f\u012e\u0001\u0000\u0000"+
		"\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u012c\u0001\u0000\u0000"+
		"\u0000\u0134\u012d\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136\u0138\u0005.\u0000\u0000\u0137\u0139\u0007\u0004\u0000\u0000"+
		"\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000"+
		"\u013b4\u0001\u0000\u0000\u0000\u013c\u0145\u0003;\u001d\u0000\u013d\u013e"+
		"\u0003;\u001d\u0000\u013e\u013f\u0003U*\u0000\u013f\u0145\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0003c1\u0000\u0141\u0142\u0003I$\u0000\u0142"+
		"\u0143\u0003C!\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u013c\u0001"+
		"\u0000\u0000\u0000\u0144\u013d\u0001\u0000\u0000\u0000\u0144\u0140\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0006"+
		"\u001a\u0000\u0000\u01476\u0001\u0000\u0000\u0000\u0148\u014c\u0007\u0005"+
		"\u0000\u0000\u0149\u014b\u0007\u0006\u0000\u0000\u014a\u0149\u0001\u0000"+
		"\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d8\u0001\u0000\u0000"+
		"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0150\u0007\u0007\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0006\u001c\u0000"+
		"\u0000\u0152:\u0001\u0000\u0000\u0000\u0153\u0154\u0007\b\u0000\u0000"+
		"\u0154<\u0001\u0000\u0000\u0000\u0155\u0156\u0007\t\u0000\u0000\u0156"+
		">\u0001\u0000\u0000\u0000\u0157\u0158\u0007\n\u0000\u0000\u0158@\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0007\u000b\u0000\u0000\u015aB\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0007\f\u0000\u0000\u015cD\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0007\r\u0000\u0000\u015eF\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0007\u000e\u0000\u0000\u0160H\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0007\u000f\u0000\u0000\u0162J\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0007\u0010\u0000\u0000\u0164L\u0001\u0000\u0000\u0000\u0165\u0166\u0007"+
		"\u0011\u0000\u0000\u0166N\u0001\u0000\u0000\u0000\u0167\u0168\u0007\u0012"+
		"\u0000\u0000\u0168P\u0001\u0000\u0000\u0000\u0169\u016a\u0007\u0013\u0000"+
		"\u0000\u016aR\u0001\u0000\u0000\u0000\u016b\u016c\u0007\u0014\u0000\u0000"+
		"\u016cT\u0001\u0000\u0000\u0000\u016d\u016e\u0007\u0015\u0000\u0000\u016e"+
		"V\u0001\u0000\u0000\u0000\u016f\u0170\u0007\u0016\u0000\u0000\u0170X\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0007\u0017\u0000\u0000\u0172Z\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0007\u0018\u0000\u0000\u0174\\\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0007\u0019\u0000\u0000\u0176^\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0007\u001a\u0000\u0000\u0178`\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0007\u001b\u0000\u0000\u017ab\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0007\u001c\u0000\u0000\u017cd\u0001\u0000\u0000\u0000\u017d\u017e\u0007"+
		"\u001d\u0000\u0000\u017ef\u0001\u0000\u0000\u0000\u017f\u0180\u0007\u001e"+
		"\u0000\u0000\u0180h\u0001\u0000\u0000\u0000\u0181\u0182\u0007\u001f\u0000"+
		"\u0000\u0182j\u0001\u0000\u0000\u0000\u0183\u0184\u0007 \u0000\u0000\u0184"+
		"l\u0001\u0000\u0000\u0000\u0185\u0186\u0007!\u0000\u0000\u0186n\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0007\"\u0000\u0000\u0188p\u0001\u0000"+
		"\u0000\u0000\f\u0000\u00af\u00dc\u00f9\u0111\u0127\u012a\u0131\u0134\u013a"+
		"\u0144\u014c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}