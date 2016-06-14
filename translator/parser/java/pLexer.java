// Generated from p.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GOTO=1, WITH=2, VALUES=3, AS=4, REF=5, PLUS=6, LT=7, KEYS=8, FUN=9, DEFER=10, 
		INCLUDE=11, LNOT=12, LPAREN=13, SEND=14, ENTRY=15, RBRACKET=16, NEW=17, 
		ASSIGN=18, MONITOR=19, START=20, COLON=21, LE=22, MODEL=23, GE=24, MACHINE=25, 
		TRUE=26, IF=27, DEFAULT=28, DIV=29, IN=30, MONITORS=31, MINUS=32, LAND=33, 
		CASE=34, LCBRACE=35, HOT=36, MAIN=37, REMOVE=38, NULL=39, NONDET=40, COMMA=41, 
		SEQ=42, SPEC=43, DOT=44, SIZEOF=45, RECEIVE=46, BOOL=47, INT_TYPE=48, 
		TYPE=49, ANY=50, NE=51, ASSERT=52, STATE=53, GT=54, WHILE=55, INSERT=56, 
		RETURN=57, DO=58, SEMICOLON=59, RCBRACE=60, GROUP=61, FAIRNONDET=62, THIS=63, 
		XFER=64, PRINT=65, HALT=66, VAR=67, ON=68, IGNORE=69, COLD=70, RPAREN=71, 
		ELSE=72, EXIT=73, EVENT=74, FALSE=75, LOR=76, PUSH=77, POP=78, ASSUME=79, 
		RAISE=80, EQ=81, LBRACKET=82, MUL=83, MAP=84, STR=85, WS=86, MULTILINE_COMMENT=87, 
		COMMENT=88, INT=89, ID=90;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"GOTO", "WITH", "VALUES", "AS", "REF", "PLUS", "LT", "KEYS", "FUN", "DEFER", 
		"INCLUDE", "LNOT", "LPAREN", "SEND", "ENTRY", "RBRACKET", "NEW", "ASSIGN", 
		"MONITOR", "START", "COLON", "LE", "MODEL", "GE", "MACHINE", "TRUE", "IF", 
		"DEFAULT", "DIV", "IN", "MONITORS", "MINUS", "LAND", "CASE", "LCBRACE", 
		"HOT", "MAIN", "REMOVE", "NULL", "NONDET", "COMMA", "SEQ", "SPEC", "DOT", 
		"SIZEOF", "RECEIVE", "BOOL", "INT_TYPE", "TYPE", "ANY", "NE", "ASSERT", 
		"STATE", "GT", "WHILE", "INSERT", "RETURN", "DO", "SEMICOLON", "RCBRACE", 
		"GROUP", "FAIRNONDET", "THIS", "XFER", "PRINT", "HALT", "VAR", "ON", "IGNORE", 
		"COLD", "RPAREN", "ELSE", "EXIT", "EVENT", "FALSE", "LOR", "PUSH", "POP", 
		"ASSUME", "RAISE", "EQ", "LBRACKET", "MUL", "MAP", "STR", "ESC_SEQ", "HEX_DIGIT", 
		"OCTAL_ESC", "UNICODE_ESC", "WS", "MULTILINE_COMMENT", "COMMENT", "LOWER", 
		"UPPER", "LETTER", "DIGIT", "INT", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'goto'", "'with'", "'values'", "'as'", "'ref'", "'+'", "'<'", "'keys'", 
		"'fun'", "'defer'", "'include'", "'!'", "'('", "'send'", "'entry'", "']'", 
		"'new'", "'='", "'monitor'", "'start'", "':'", "'<='", "'model'", "'>='", 
		"'machine'", "'true'", "'if'", "'default'", "'/'", "'in'", "'monitors'", 
		"'-'", "'&&'", "'case'", "'{'", "'hot'", "'main'", "'-='", "'null'", "'$'", 
		"','", "'seq'", "'spec'", "'.'", "'sizeof'", "'receive'", "'bool'", "'int'", 
		"'type'", "'any'", "'!='", "'assert'", "'state'", "'>'", "'while'", "'+='", 
		"'return'", "'do'", "';'", "'}'", "'group'", "'$$'", "'this'", "'xfer'", 
		"'print'", "'halt'", "'var'", "'on'", "'ignore'", "'cold'", "')'", "'else'", 
		"'exit'", "'event'", "'false'", "'||'", "'push'", "'pop'", "'assume'", 
		"'raise'", "'=='", "'['", "'*'", "'map'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GOTO", "WITH", "VALUES", "AS", "REF", "PLUS", "LT", "KEYS", "FUN", 
		"DEFER", "INCLUDE", "LNOT", "LPAREN", "SEND", "ENTRY", "RBRACKET", "NEW", 
		"ASSIGN", "MONITOR", "START", "COLON", "LE", "MODEL", "GE", "MACHINE", 
		"TRUE", "IF", "DEFAULT", "DIV", "IN", "MONITORS", "MINUS", "LAND", "CASE", 
		"LCBRACE", "HOT", "MAIN", "REMOVE", "NULL", "NONDET", "COMMA", "SEQ", 
		"SPEC", "DOT", "SIZEOF", "RECEIVE", "BOOL", "INT_TYPE", "TYPE", "ANY", 
		"NE", "ASSERT", "STATE", "GT", "WHILE", "INSERT", "RETURN", "DO", "SEMICOLON", 
		"RCBRACE", "GROUP", "FAIRNONDET", "THIS", "XFER", "PRINT", "HALT", "VAR", 
		"ON", "IGNORE", "COLD", "RPAREN", "ELSE", "EXIT", "EVENT", "FALSE", "LOR", 
		"PUSH", "POP", "ASSUME", "RAISE", "EQ", "LBRACKET", "MUL", "MAP", "STR", 
		"WS", "MULTILINE_COMMENT", "COMMENT", "INT", "ID"
	};
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


	public pLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "p.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\\\u0290\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+"+
		"\3+\3+\3,\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\38\38\38\38\38\38\39\39\3"+
		"9\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3"+
		"?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3"+
		"D\3D\3D\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3I\3I\3I\3"+
		"I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3N\3"+
		"N\3N\3N\3N\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3"+
		"R\3S\3S\3T\3T\3U\3U\3U\3U\3V\3V\3V\7V\u023a\nV\fV\16V\u023d\13V\3V\3V"+
		"\3W\3W\3W\3W\5W\u0245\nW\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0252\nY"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\6[\u025c\n[\r[\16[\u025d\3[\3[\3\\\3\\\3\\\3"+
		"\\\7\\\u0266\n\\\f\\\16\\\u0269\13\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\7"+
		"]\u0274\n]\f]\16]\u0277\13]\3]\3]\3^\3^\3_\3_\3`\3`\5`\u0281\n`\3a\3a"+
		"\3b\6b\u0286\nb\rb\16b\u0287\3c\3c\7c\u028c\nc\fc\16c\u028f\13c\3\u0267"+
		"\2d\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5"+
		"X\u00b7Y\u00b9Z\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3[\u00c5\\\3\2\t\4"+
		"\2$$^^\n\2$$))^^ddhhppttvv\5\2\62;CHch\5\2\13\f\16\17\"\"\4\2\f\f\17\17"+
		"\5\2C\\aac|\6\2\62;C\\aac|\u0293\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\3\u00c7"+
		"\3\2\2\2\5\u00cc\3\2\2\2\7\u00d1\3\2\2\2\t\u00d8\3\2\2\2\13\u00db\3\2"+
		"\2\2\r\u00df\3\2\2\2\17\u00e1\3\2\2\2\21\u00e3\3\2\2\2\23\u00e8\3\2\2"+
		"\2\25\u00ec\3\2\2\2\27\u00f2\3\2\2\2\31\u00fa\3\2\2\2\33\u00fc\3\2\2\2"+
		"\35\u00fe\3\2\2\2\37\u0103\3\2\2\2!\u0109\3\2\2\2#\u010b\3\2\2\2%\u010f"+
		"\3\2\2\2\'\u0111\3\2\2\2)\u0119\3\2\2\2+\u011f\3\2\2\2-\u0121\3\2\2\2"+
		"/\u0124\3\2\2\2\61\u012a\3\2\2\2\63\u012d\3\2\2\2\65\u0135\3\2\2\2\67"+
		"\u013a\3\2\2\29\u013d\3\2\2\2;\u0145\3\2\2\2=\u0147\3\2\2\2?\u014a\3\2"+
		"\2\2A\u0153\3\2\2\2C\u0155\3\2\2\2E\u0158\3\2\2\2G\u015d\3\2\2\2I\u015f"+
		"\3\2\2\2K\u0163\3\2\2\2M\u0168\3\2\2\2O\u016b\3\2\2\2Q\u0170\3\2\2\2S"+
		"\u0172\3\2\2\2U\u0174\3\2\2\2W\u0178\3\2\2\2Y\u017d\3\2\2\2[\u017f\3\2"+
		"\2\2]\u0186\3\2\2\2_\u018e\3\2\2\2a\u0193\3\2\2\2c\u0197\3\2\2\2e\u019c"+
		"\3\2\2\2g\u01a0\3\2\2\2i\u01a3\3\2\2\2k\u01aa\3\2\2\2m\u01b0\3\2\2\2o"+
		"\u01b2\3\2\2\2q\u01b8\3\2\2\2s\u01bb\3\2\2\2u\u01c2\3\2\2\2w\u01c5\3\2"+
		"\2\2y\u01c7\3\2\2\2{\u01c9\3\2\2\2}\u01cf\3\2\2\2\177\u01d2\3\2\2\2\u0081"+
		"\u01d7\3\2\2\2\u0083\u01dc\3\2\2\2\u0085\u01e2\3\2\2\2\u0087\u01e7\3\2"+
		"\2\2\u0089\u01eb\3\2\2\2\u008b\u01ee\3\2\2\2\u008d\u01f5\3\2\2\2\u008f"+
		"\u01fa\3\2\2\2\u0091\u01fc\3\2\2\2\u0093\u0201\3\2\2\2\u0095\u0206\3\2"+
		"\2\2\u0097\u020c\3\2\2\2\u0099\u0212\3\2\2\2\u009b\u0215\3\2\2\2\u009d"+
		"\u021a\3\2\2\2\u009f\u021e\3\2\2\2\u00a1\u0225\3\2\2\2\u00a3\u022b\3\2"+
		"\2\2\u00a5\u022e\3\2\2\2\u00a7\u0230\3\2\2\2\u00a9\u0232\3\2\2\2\u00ab"+
		"\u0236\3\2\2\2\u00ad\u0244\3\2\2\2\u00af\u0246\3\2\2\2\u00b1\u0251\3\2"+
		"\2\2\u00b3\u0253\3\2\2\2\u00b5\u025b\3\2\2\2\u00b7\u0261\3\2\2\2\u00b9"+
		"\u026f\3\2\2\2\u00bb\u027a\3\2\2\2\u00bd\u027c\3\2\2\2\u00bf\u0280\3\2"+
		"\2\2\u00c1\u0282\3\2\2\2\u00c3\u0285\3\2\2\2\u00c5\u0289\3\2\2\2\u00c7"+
		"\u00c8\7i\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7q\2\2"+
		"\u00cb\4\3\2\2\2\u00cc\u00cd\7y\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7v"+
		"\2\2\u00cf\u00d0\7j\2\2\u00d0\6\3\2\2\2\u00d1\u00d2\7x\2\2\u00d2\u00d3"+
		"\7c\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7u\2\2\u00d7\b\3\2\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7u\2\2\u00da"+
		"\n\3\2\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7h\2\2\u00de"+
		"\f\3\2\2\2\u00df\u00e0\7-\2\2\u00e0\16\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2"+
		"\20\3\2\2\2\u00e3\u00e4\7m\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7{\2\2\u00e6"+
		"\u00e7\7u\2\2\u00e7\22\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7w\2\2\u00ea"+
		"\u00eb\7p\2\2\u00eb\24\3\2\2\2\u00ec\u00ed\7f\2\2\u00ed\u00ee\7g\2\2\u00ee"+
		"\u00ef\7h\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7t\2\2\u00f1\26\3\2\2\2\u00f2"+
		"\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7n\2\2"+
		"\u00f6\u00f7\7w\2\2\u00f7\u00f8\7f\2\2\u00f8\u00f9\7g\2\2\u00f9\30\3\2"+
		"\2\2\u00fa\u00fb\7#\2\2\u00fb\32\3\2\2\2\u00fc\u00fd\7*\2\2\u00fd\34\3"+
		"\2\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7p\2\2\u0101"+
		"\u0102\7f\2\2\u0102\36\3\2\2\2\u0103\u0104\7g\2\2\u0104\u0105\7p\2\2\u0105"+
		"\u0106\7v\2\2\u0106\u0107\7t\2\2\u0107\u0108\7{\2\2\u0108 \3\2\2\2\u0109"+
		"\u010a\7_\2\2\u010a\"\3\2\2\2\u010b\u010c\7p\2\2\u010c\u010d\7g\2\2\u010d"+
		"\u010e\7y\2\2\u010e$\3\2\2\2\u010f\u0110\7?\2\2\u0110&\3\2\2\2\u0111\u0112"+
		"\7o\2\2\u0112\u0113\7q\2\2\u0113\u0114\7p\2\2\u0114\u0115\7k\2\2\u0115"+
		"\u0116\7v\2\2\u0116\u0117\7q\2\2\u0117\u0118\7t\2\2\u0118(\3\2\2\2\u0119"+
		"\u011a\7u\2\2\u011a\u011b\7v\2\2\u011b\u011c\7c\2\2\u011c\u011d\7t\2\2"+
		"\u011d\u011e\7v\2\2\u011e*\3\2\2\2\u011f\u0120\7<\2\2\u0120,\3\2\2\2\u0121"+
		"\u0122\7>\2\2\u0122\u0123\7?\2\2\u0123.\3\2\2\2\u0124\u0125\7o\2\2\u0125"+
		"\u0126\7q\2\2\u0126\u0127\7f\2\2\u0127\u0128\7g\2\2\u0128\u0129\7n\2\2"+
		"\u0129\60\3\2\2\2\u012a\u012b\7@\2\2\u012b\u012c\7?\2\2\u012c\62\3\2\2"+
		"\2\u012d\u012e\7o\2\2\u012e\u012f\7c\2\2\u012f\u0130\7e\2\2\u0130\u0131"+
		"\7j\2\2\u0131\u0132\7k\2\2\u0132\u0133\7p\2\2\u0133\u0134\7g\2\2\u0134"+
		"\64\3\2\2\2\u0135\u0136\7v\2\2\u0136\u0137\7t\2\2\u0137\u0138\7w\2\2\u0138"+
		"\u0139\7g\2\2\u0139\66\3\2\2\2\u013a\u013b\7k\2\2\u013b\u013c\7h\2\2\u013c"+
		"8\3\2\2\2\u013d\u013e\7f\2\2\u013e\u013f\7g\2\2\u013f\u0140\7h\2\2\u0140"+
		"\u0141\7c\2\2\u0141\u0142\7w\2\2\u0142\u0143\7n\2\2\u0143\u0144\7v\2\2"+
		"\u0144:\3\2\2\2\u0145\u0146\7\61\2\2\u0146<\3\2\2\2\u0147\u0148\7k\2\2"+
		"\u0148\u0149\7p\2\2\u0149>\3\2\2\2\u014a\u014b\7o\2\2\u014b\u014c\7q\2"+
		"\2\u014c\u014d\7p\2\2\u014d\u014e\7k\2\2\u014e\u014f\7v\2\2\u014f\u0150"+
		"\7q\2\2\u0150\u0151\7t\2\2\u0151\u0152\7u\2\2\u0152@\3\2\2\2\u0153\u0154"+
		"\7/\2\2\u0154B\3\2\2\2\u0155\u0156\7(\2\2\u0156\u0157\7(\2\2\u0157D\3"+
		"\2\2\2\u0158\u0159\7e\2\2\u0159\u015a\7c\2\2\u015a\u015b\7u\2\2\u015b"+
		"\u015c\7g\2\2\u015cF\3\2\2\2\u015d\u015e\7}\2\2\u015eH\3\2\2\2\u015f\u0160"+
		"\7j\2\2\u0160\u0161\7q\2\2\u0161\u0162\7v\2\2\u0162J\3\2\2\2\u0163\u0164"+
		"\7o\2\2\u0164\u0165\7c\2\2\u0165\u0166\7k\2\2\u0166\u0167\7p\2\2\u0167"+
		"L\3\2\2\2\u0168\u0169\7/\2\2\u0169\u016a\7?\2\2\u016aN\3\2\2\2\u016b\u016c"+
		"\7p\2\2\u016c\u016d\7w\2\2\u016d\u016e\7n\2\2\u016e\u016f\7n\2\2\u016f"+
		"P\3\2\2\2\u0170\u0171\7&\2\2\u0171R\3\2\2\2\u0172\u0173\7.\2\2\u0173T"+
		"\3\2\2\2\u0174\u0175\7u\2\2\u0175\u0176\7g\2\2\u0176\u0177\7s\2\2\u0177"+
		"V\3\2\2\2\u0178\u0179\7u\2\2\u0179\u017a\7r\2\2\u017a\u017b\7g\2\2\u017b"+
		"\u017c\7e\2\2\u017cX\3\2\2\2\u017d\u017e\7\60\2\2\u017eZ\3\2\2\2\u017f"+
		"\u0180\7u\2\2\u0180\u0181\7k\2\2\u0181\u0182\7|\2\2\u0182\u0183\7g\2\2"+
		"\u0183\u0184\7q\2\2\u0184\u0185\7h\2\2\u0185\\\3\2\2\2\u0186\u0187\7t"+
		"\2\2\u0187\u0188\7g\2\2\u0188\u0189\7e\2\2\u0189\u018a\7g\2\2\u018a\u018b"+
		"\7k\2\2\u018b\u018c\7x\2\2\u018c\u018d\7g\2\2\u018d^\3\2\2\2\u018e\u018f"+
		"\7d\2\2\u018f\u0190\7q\2\2\u0190\u0191\7q\2\2\u0191\u0192\7n\2\2\u0192"+
		"`\3\2\2\2\u0193\u0194\7k\2\2\u0194\u0195\7p\2\2\u0195\u0196\7v\2\2\u0196"+
		"b\3\2\2\2\u0197\u0198\7v\2\2\u0198\u0199\7{\2\2\u0199\u019a\7r\2\2\u019a"+
		"\u019b\7g\2\2\u019bd\3\2\2\2\u019c\u019d\7c\2\2\u019d\u019e\7p\2\2\u019e"+
		"\u019f\7{\2\2\u019ff\3\2\2\2\u01a0\u01a1\7#\2\2\u01a1\u01a2\7?\2\2\u01a2"+
		"h\3\2\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7u\2\2\u01a5\u01a6\7u\2\2\u01a6"+
		"\u01a7\7g\2\2\u01a7\u01a8\7t\2\2\u01a8\u01a9\7v\2\2\u01a9j\3\2\2\2\u01aa"+
		"\u01ab\7u\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7v\2\2"+
		"\u01ae\u01af\7g\2\2\u01afl\3\2\2\2\u01b0\u01b1\7@\2\2\u01b1n\3\2\2\2\u01b2"+
		"\u01b3\7y\2\2\u01b3\u01b4\7j\2\2\u01b4\u01b5\7k\2\2\u01b5\u01b6\7n\2\2"+
		"\u01b6\u01b7\7g\2\2\u01b7p\3\2\2\2\u01b8\u01b9\7-\2\2\u01b9\u01ba\7?\2"+
		"\2\u01bar\3\2\2\2\u01bb\u01bc\7t\2\2\u01bc\u01bd\7g\2\2\u01bd\u01be\7"+
		"v\2\2\u01be\u01bf\7w\2\2\u01bf\u01c0\7t\2\2\u01c0\u01c1\7p\2\2\u01c1t"+
		"\3\2\2\2\u01c2\u01c3\7f\2\2\u01c3\u01c4\7q\2\2\u01c4v\3\2\2\2\u01c5\u01c6"+
		"\7=\2\2\u01c6x\3\2\2\2\u01c7\u01c8\7\177\2\2\u01c8z\3\2\2\2\u01c9\u01ca"+
		"\7i\2\2\u01ca\u01cb\7t\2\2\u01cb\u01cc\7q\2\2\u01cc\u01cd\7w\2\2\u01cd"+
		"\u01ce\7r\2\2\u01ce|\3\2\2\2\u01cf\u01d0\7&\2\2\u01d0\u01d1\7&\2\2\u01d1"+
		"~\3\2\2\2\u01d2\u01d3\7v\2\2\u01d3\u01d4\7j\2\2\u01d4\u01d5\7k\2\2\u01d5"+
		"\u01d6\7u\2\2\u01d6\u0080\3\2\2\2\u01d7\u01d8\7z\2\2\u01d8\u01d9\7h\2"+
		"\2\u01d9\u01da\7g\2\2\u01da\u01db\7t\2\2\u01db\u0082\3\2\2\2\u01dc\u01dd"+
		"\7r\2\2\u01dd\u01de\7t\2\2\u01de\u01df\7k\2\2\u01df\u01e0\7p\2\2\u01e0"+
		"\u01e1\7v\2\2\u01e1\u0084\3\2\2\2\u01e2\u01e3\7j\2\2\u01e3\u01e4\7c\2"+
		"\2\u01e4\u01e5\7n\2\2\u01e5\u01e6\7v\2\2\u01e6\u0086\3\2\2\2\u01e7\u01e8"+
		"\7x\2\2\u01e8\u01e9\7c\2\2\u01e9\u01ea\7t\2\2\u01ea\u0088\3\2\2\2\u01eb"+
		"\u01ec\7q\2\2\u01ec\u01ed\7p\2\2\u01ed\u008a\3\2\2\2\u01ee\u01ef\7k\2"+
		"\2\u01ef\u01f0\7i\2\2\u01f0\u01f1\7p\2\2\u01f1\u01f2\7q\2\2\u01f2\u01f3"+
		"\7t\2\2\u01f3\u01f4\7g\2\2\u01f4\u008c\3\2\2\2\u01f5\u01f6\7e\2\2\u01f6"+
		"\u01f7\7q\2\2\u01f7\u01f8\7n\2\2\u01f8\u01f9\7f\2\2\u01f9\u008e\3\2\2"+
		"\2\u01fa\u01fb\7+\2\2\u01fb\u0090\3\2\2\2\u01fc\u01fd\7g\2\2\u01fd\u01fe"+
		"\7n\2\2\u01fe\u01ff\7u\2\2\u01ff\u0200\7g\2\2\u0200\u0092\3\2\2\2\u0201"+
		"\u0202\7g\2\2\u0202\u0203\7z\2\2\u0203\u0204\7k\2\2\u0204\u0205\7v\2\2"+
		"\u0205\u0094\3\2\2\2\u0206\u0207\7g\2\2\u0207\u0208\7x\2\2\u0208\u0209"+
		"\7g\2\2\u0209\u020a\7p\2\2\u020a\u020b\7v\2\2\u020b\u0096\3\2\2\2\u020c"+
		"\u020d\7h\2\2\u020d\u020e\7c\2\2\u020e\u020f\7n\2\2\u020f\u0210\7u\2\2"+
		"\u0210\u0211\7g\2\2\u0211\u0098\3\2\2\2\u0212\u0213\7~\2\2\u0213\u0214"+
		"\7~\2\2\u0214\u009a\3\2\2\2\u0215\u0216\7r\2\2\u0216\u0217\7w\2\2\u0217"+
		"\u0218\7u\2\2\u0218\u0219\7j\2\2\u0219\u009c\3\2\2\2\u021a\u021b\7r\2"+
		"\2\u021b\u021c\7q\2\2\u021c\u021d\7r\2\2\u021d\u009e\3\2\2\2\u021e\u021f"+
		"\7c\2\2\u021f\u0220\7u\2\2\u0220\u0221\7u\2\2\u0221\u0222\7w\2\2\u0222"+
		"\u0223\7o\2\2\u0223\u0224\7g\2\2\u0224\u00a0\3\2\2\2\u0225\u0226\7t\2"+
		"\2\u0226\u0227\7c\2\2\u0227\u0228\7k\2\2\u0228\u0229\7u\2\2\u0229\u022a"+
		"\7g\2\2\u022a\u00a2\3\2\2\2\u022b\u022c\7?\2\2\u022c\u022d\7?\2\2\u022d"+
		"\u00a4\3\2\2\2\u022e\u022f\7]\2\2\u022f\u00a6\3\2\2\2\u0230\u0231\7,\2"+
		"\2\u0231\u00a8\3\2\2\2\u0232\u0233\7o\2\2\u0233\u0234\7c\2\2\u0234\u0235"+
		"\7r\2\2\u0235\u00aa\3\2\2\2\u0236\u023b\7$\2\2\u0237\u023a\5\u00adW\2"+
		"\u0238\u023a\n\2\2\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023a\u023d"+
		"\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023e\u023f\7$\2\2\u023f\u00ac\3\2\2\2\u0240\u0241\7^\2"+
		"\2\u0241\u0245\t\3\2\2\u0242\u0245\5\u00b3Z\2\u0243\u0245\5\u00b1Y\2\u0244"+
		"\u0240\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0243\3\2\2\2\u0245\u00ae\3\2"+
		"\2\2\u0246\u0247\t\4\2\2\u0247\u00b0\3\2\2\2\u0248\u0249\7^\2\2\u0249"+
		"\u024a\4\62\65\2\u024a\u024b\4\629\2\u024b\u0252\4\629\2\u024c\u024d\7"+
		"^\2\2\u024d\u024e\4\629\2\u024e\u0252\4\629\2\u024f\u0250\7^\2\2\u0250"+
		"\u0252\4\629\2\u0251\u0248\3\2\2\2\u0251\u024c\3\2\2\2\u0251\u024f\3\2"+
		"\2\2\u0252\u00b2\3\2\2\2\u0253\u0254\7^\2\2\u0254\u0255\7w\2\2\u0255\u0256"+
		"\5\u00afX\2\u0256\u0257\5\u00afX\2\u0257\u0258\5\u00afX\2\u0258\u0259"+
		"\5\u00afX\2\u0259\u00b4\3\2\2\2\u025a\u025c\t\5\2\2\u025b\u025a\3\2\2"+
		"\2\u025c\u025d\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f"+
		"\3\2\2\2\u025f\u0260\b[\2\2\u0260\u00b6\3\2\2\2\u0261\u0262\7\61\2\2\u0262"+
		"\u0263\7,\2\2\u0263\u0267\3\2\2\2\u0264\u0266\13\2\2\2\u0265\u0264\3\2"+
		"\2\2\u0266\u0269\3\2\2\2\u0267\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268"+
		"\u026a\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026b\7,\2\2\u026b\u026c\7\61"+
		"\2\2\u026c\u026d\3\2\2\2\u026d\u026e\b\\\2\2\u026e\u00b8\3\2\2\2\u026f"+
		"\u0270\7\61\2\2\u0270\u0271\7\61\2\2\u0271\u0275\3\2\2\2\u0272\u0274\n"+
		"\6\2\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u0279\b]"+
		"\2\2\u0279\u00ba\3\2\2\2\u027a\u027b\4c|\2\u027b\u00bc\3\2\2\2\u027c\u027d"+
		"\4C\\\2\u027d\u00be\3\2\2\2\u027e\u0281\5\u00bb^\2\u027f\u0281\5\u00bd"+
		"_\2\u0280\u027e\3\2\2\2\u0280\u027f\3\2\2\2\u0281\u00c0\3\2\2\2\u0282"+
		"\u0283\4\62;\2\u0283\u00c2\3\2\2\2\u0284\u0286\5\u00c1a\2\u0285\u0284"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"\u00c4\3\2\2\2\u0289\u028d\t\7\2\2\u028a\u028c\t\b\2\2\u028b\u028a\3\2"+
		"\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u00c6\3\2\2\2\u028f\u028d\3\2\2\2\r\2\u0239\u023b\u0244\u0251\u025d\u0267"+
		"\u0275\u0280\u0287\u028d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}