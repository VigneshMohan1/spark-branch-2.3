// Generated from org/apache/spark/sql/catalyst/parser/SqlBase.g4 by ANTLR 4.5.3
package org.apache.spark.sql.catalyst.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SELECT=10, FROM=11, ADD=12, AS=13, ALL=14, DISTINCT=15, WHERE=16, GROUP=17, 
		BY=18, GROUPING=19, SETS=20, CUBE=21, ROLLUP=22, ORDER=23, HAVING=24, 
		LIMIT=25, AT=26, OR=27, AND=28, IN=29, NOT=30, NO=31, EXISTS=32, BETWEEN=33, 
		LIKE=34, RLIKE=35, IS=36, NULL=37, TRUE=38, FALSE=39, NULLS=40, ASC=41, 
		DESC=42, FOR=43, INTERVAL=44, CASE=45, WHEN=46, THEN=47, ELSE=48, END=49, 
		JOIN=50, CROSS=51, OUTER=52, INNER=53, LEFT=54, SEMI=55, RIGHT=56, FULL=57, 
		NATURAL=58, ON=59, LATERAL=60, WINDOW=61, OVER=62, PARTITION=63, RANGE=64, 
		ROWS=65, UNBOUNDED=66, PRECEDING=67, FOLLOWING=68, CURRENT=69, FIRST=70, 
		AFTER=71, LAST=72, ROW=73, WITH=74, VALUES=75, CREATE=76, TABLE=77, VIEW=78, 
		REPLACE=79, INSERT=80, DELETE=81, INTO=82, DESCRIBE=83, EXPLAIN=84, FORMAT=85, 
		LOGICAL=86, CODEGEN=87, COST=88, CAST=89, SHOW=90, TABLES=91, COLUMNS=92, 
		COLUMN=93, USE=94, PARTITIONS=95, FUNCTIONS=96, DROP=97, UNION=98, EXCEPT=99, 
		SETMINUS=100, INTERSECT=101, TO=102, TABLESAMPLE=103, STRATIFY=104, ALTER=105, 
		RENAME=106, ARRAY=107, MAP=108, STRUCT=109, COMMENT=110, SET=111, RESET=112, 
		DATA=113, START=114, TRANSACTION=115, COMMIT=116, ROLLBACK=117, MACRO=118, 
		IGNORE=119, IF=120, POSITION=121, EQ=122, NSEQ=123, NEQ=124, NEQJ=125, 
		LT=126, LTE=127, GT=128, GTE=129, PLUS=130, MINUS=131, ASTERISK=132, SLASH=133, 
		PERCENT=134, DIV=135, TILDE=136, AMPERSAND=137, PIPE=138, CONCAT_PIPE=139, 
		HAT=140, PERCENTLIT=141, BUCKET=142, OUT=143, OF=144, SORT=145, CLUSTER=146, 
		DISTRIBUTE=147, OVERWRITE=148, TRANSFORM=149, REDUCE=150, USING=151, SERDE=152, 
		SERDEPROPERTIES=153, RECORDREADER=154, RECORDWRITER=155, DELIMITED=156, 
		FIELDS=157, TERMINATED=158, COLLECTION=159, ITEMS=160, KEYS=161, ESCAPED=162, 
		LINES=163, SEPARATED=164, FUNCTION=165, EXTENDED=166, REFRESH=167, CLEAR=168, 
		CACHE=169, UNCACHE=170, LAZY=171, FORMATTED=172, GLOBAL=173, TEMPORARY=174, 
		OPTIONS=175, UNSET=176, TBLPROPERTIES=177, DBPROPERTIES=178, BUCKETS=179, 
		SKEWED=180, STORED=181, DIRECTORIES=182, LOCATION=183, EXCHANGE=184, ARCHIVE=185, 
		UNARCHIVE=186, FILEFORMAT=187, TOUCH=188, COMPACT=189, CONCATENATE=190, 
		CHANGE=191, CASCADE=192, RESTRICT=193, CLUSTERED=194, SORTED=195, PURGE=196, 
		INPUTFORMAT=197, OUTPUTFORMAT=198, DATABASE=199, DATABASES=200, DFS=201, 
		TRUNCATE=202, ANALYZE=203, COMPUTE=204, LIST=205, STATISTICS=206, PARTITIONED=207, 
		EXTERNAL=208, DEFINED=209, REVOKE=210, GRANT=211, LOCK=212, UNLOCK=213, 
		MSCK=214, REPAIR=215, RECOVER=216, EXPORT=217, IMPORT=218, LOAD=219, ROLE=220, 
		ROLES=221, COMPACTIONS=222, PRINCIPALS=223, TRANSACTIONS=224, INDEX=225, 
		INDEXES=226, LOCKS=227, OPTION=228, ANTI=229, LOCAL=230, INPATH=231, CURRENT_DATE=232, 
		CURRENT_TIMESTAMP=233, STRING=234, BIGINT_LITERAL=235, SMALLINT_LITERAL=236, 
		TINYINT_LITERAL=237, BYTELENGTH_LITERAL=238, INTEGER_VALUE=239, DECIMAL_VALUE=240, 
		DOUBLE_LITERAL=241, BIGDECIMAL_LITERAL=242, IDENTIFIER=243, BACKQUOTED_IDENTIFIER=244, 
		SIMPLE_COMMENT=245, BRACKETED_EMPTY_COMMENT=246, BRACKETED_COMMENT=247, 
		WS=248, UNRECOGNIZED=249;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"SELECT", "FROM", "ADD", "AS", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", 
		"GROUPING", "SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", 
		"OR", "AND", "IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", 
		"IS", "NULL", "TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", 
		"CASE", "WHEN", "THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", 
		"LEFT", "SEMI", "RIGHT", "FULL", "NATURAL", "ON", "LATERAL", "WINDOW", 
		"OVER", "PARTITION", "RANGE", "ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING", 
		"CURRENT", "FIRST", "AFTER", "LAST", "ROW", "WITH", "VALUES", "CREATE", 
		"TABLE", "VIEW", "REPLACE", "INSERT", "DELETE", "INTO", "DESCRIBE", "EXPLAIN", 
		"FORMAT", "LOGICAL", "CODEGEN", "COST", "CAST", "SHOW", "TABLES", "COLUMNS", 
		"COLUMN", "USE", "PARTITIONS", "FUNCTIONS", "DROP", "UNION", "EXCEPT", 
		"SETMINUS", "INTERSECT", "TO", "TABLESAMPLE", "STRATIFY", "ALTER", "RENAME", 
		"ARRAY", "MAP", "STRUCT", "COMMENT", "SET", "RESET", "DATA", "START", 
		"TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", "IGNORE", "IF", "POSITION", 
		"EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
		"ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", 
		"HAT", "PERCENTLIT", "BUCKET", "OUT", "OF", "SORT", "CLUSTER", "DISTRIBUTE", 
		"OVERWRITE", "TRANSFORM", "REDUCE", "USING", "SERDE", "SERDEPROPERTIES", 
		"RECORDREADER", "RECORDWRITER", "DELIMITED", "FIELDS", "TERMINATED", "COLLECTION", 
		"ITEMS", "KEYS", "ESCAPED", "LINES", "SEPARATED", "FUNCTION", "EXTENDED", 
		"REFRESH", "CLEAR", "CACHE", "UNCACHE", "LAZY", "FORMATTED", "GLOBAL", 
		"TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", "DBPROPERTIES", "BUCKETS", 
		"SKEWED", "STORED", "DIRECTORIES", "LOCATION", "EXCHANGE", "ARCHIVE", 
		"UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", "CONCATENATE", "CHANGE", 
		"CASCADE", "RESTRICT", "CLUSTERED", "SORTED", "PURGE", "INPUTFORMAT", 
		"OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", "TRUNCATE", "ANALYZE", 
		"COMPUTE", "LIST", "STATISTICS", "PARTITIONED", "EXTERNAL", "DEFINED", 
		"REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", "RECOVER", "EXPORT", 
		"IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", "PRINCIPALS", "TRANSACTIONS", 
		"INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", "LOCAL", "INPATH", "CURRENT_DATE", 
		"CURRENT_TIMESTAMP", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
		"BYTELENGTH_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", 
		"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "DECIMAL_DIGITS", 
		"EXPONENT", "DIGIT", "LETTER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
		"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'['", "']'", "':'", 
		"'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'DISTINCT'", "'WHERE'", 
		"'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", 
		"'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, "'NO'", 
		"'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", "'FALSE'", 
		"'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", "'WHEN'", 
		"'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", "'INNER'", 
		"'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", "'LATERAL'", 
		"'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", "'ROWS'", "'UNBOUNDED'", 
		"'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'FIRST'", "'AFTER'", "'LAST'", 
		"'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", "'VIEW'", "'REPLACE'", 
		"'INSERT'", "'DELETE'", "'INTO'", "'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", 
		"'LOGICAL'", "'CODEGEN'", "'COST'", "'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", 
		"'COLUMN'", "'USE'", "'PARTITIONS'", "'FUNCTIONS'", "'DROP'", "'UNION'", 
		"'EXCEPT'", "'MINUS'", "'INTERSECT'", "'TO'", "'TABLESAMPLE'", "'STRATIFY'", 
		"'ALTER'", "'RENAME'", "'ARRAY'", "'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", 
		"'RESET'", "'DATA'", "'START'", "'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", 
		"'MACRO'", "'IGNORE'", "'IF'", "'POSITION'", null, "'<=>'", "'<>'", "'!='", 
		"'<'", null, "'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'DIV'", 
		"'~'", "'&'", "'|'", "'||'", "'^'", "'PERCENT'", "'BUCKET'", "'OUT'", 
		"'OF'", "'SORT'", "'CLUSTER'", "'DISTRIBUTE'", "'OVERWRITE'", "'TRANSFORM'", 
		"'REDUCE'", "'USING'", "'SERDE'", "'SERDEPROPERTIES'", "'RECORDREADER'", 
		"'RECORDWRITER'", "'DELIMITED'", "'FIELDS'", "'TERMINATED'", "'COLLECTION'", 
		"'ITEMS'", "'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", "'FUNCTION'", 
		"'EXTENDED'", "'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", "'LAZY'", 
		"'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", 
		"'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'", 
		"'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'", 
		"'TOUCH'", "'COMPACT'", "'CONCATENATE'", "'CHANGE'", "'CASCADE'", "'RESTRICT'", 
		"'CLUSTERED'", "'SORTED'", "'PURGE'", "'INPUTFORMAT'", "'OUTPUTFORMAT'", 
		null, null, "'DFS'", "'TRUNCATE'", "'ANALYZE'", "'COMPUTE'", "'LIST'", 
		"'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", "'DEFINED'", "'REVOKE'", 
		"'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", "'RECOVER'", "'EXPORT'", 
		"'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", 
		"'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", 
		"'LOCAL'", "'INPATH'", "'CURRENT_DATE'", "'CURRENT_TIMESTAMP'", null, 
		null, null, null, null, null, null, null, null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "SELECT", 
		"FROM", "ADD", "AS", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", 
		"SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", "OR", "AND", 
		"IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", "IS", "NULL", 
		"TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", "CASE", "WHEN", 
		"THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "SEMI", 
		"RIGHT", "FULL", "NATURAL", "ON", "LATERAL", "WINDOW", "OVER", "PARTITION", 
		"RANGE", "ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING", "CURRENT", "FIRST", 
		"AFTER", "LAST", "ROW", "WITH", "VALUES", "CREATE", "TABLE", "VIEW", "REPLACE", 
		"INSERT", "DELETE", "INTO", "DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", 
		"CODEGEN", "COST", "CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", 
		"PARTITIONS", "FUNCTIONS", "DROP", "UNION", "EXCEPT", "SETMINUS", "INTERSECT", 
		"TO", "TABLESAMPLE", "STRATIFY", "ALTER", "RENAME", "ARRAY", "MAP", "STRUCT", 
		"COMMENT", "SET", "RESET", "DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", 
		"MACRO", "IGNORE", "IF", "POSITION", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", 
		"LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", 
		"TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "PERCENTLIT", "BUCKET", 
		"OUT", "OF", "SORT", "CLUSTER", "DISTRIBUTE", "OVERWRITE", "TRANSFORM", 
		"REDUCE", "USING", "SERDE", "SERDEPROPERTIES", "RECORDREADER", "RECORDWRITER", 
		"DELIMITED", "FIELDS", "TERMINATED", "COLLECTION", "ITEMS", "KEYS", "ESCAPED", 
		"LINES", "SEPARATED", "FUNCTION", "EXTENDED", "REFRESH", "CLEAR", "CACHE", 
		"UNCACHE", "LAZY", "FORMATTED", "GLOBAL", "TEMPORARY", "OPTIONS", "UNSET", 
		"TBLPROPERTIES", "DBPROPERTIES", "BUCKETS", "SKEWED", "STORED", "DIRECTORIES", 
		"LOCATION", "EXCHANGE", "ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", 
		"COMPACT", "CONCATENATE", "CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", 
		"SORTED", "PURGE", "INPUTFORMAT", "OUTPUTFORMAT", "DATABASE", "DATABASES", 
		"DFS", "TRUNCATE", "ANALYZE", "COMPUTE", "LIST", "STATISTICS", "PARTITIONED", 
		"EXTERNAL", "DEFINED", "REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", 
		"RECOVER", "EXPORT", "IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", 
		"PRINCIPALS", "TRANSACTIONS", "INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", 
		"LOCAL", "INPATH", "CURRENT_DATE", "CURRENT_TIMESTAMP", "STRING", "BIGINT_LITERAL", 
		"SMALLINT_LITERAL", "TINYINT_LITERAL", "BYTELENGTH_LITERAL", "INTEGER_VALUE", 
		"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
		"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
		"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
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


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is folllowed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }


	public SqlBaseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 239:
			return DECIMAL_VALUE_sempred((RuleContext)_localctx, predIndex);
		case 240:
			return DOUBLE_LITERAL_sempred((RuleContext)_localctx, predIndex);
		case 241:
			return BIGDECIMAL_LITERAL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean DECIMAL_VALUE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return isValidDecimal();
		}
		return true;
	}
	private boolean DOUBLE_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return isValidDecimal();
		}
		return true;
	}
	private boolean BIGDECIMAL_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return isValidDecimal();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\u00fb\u08f9\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
		"\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f"+
		"\4\u00a0\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4"+
		"\t\u00a4\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8"+
		"\4\u00a9\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad"+
		"\t\u00ad\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1"+
		"\4\u00b2\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6"+
		"\t\u00b6\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba"+
		"\4\u00bb\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf"+
		"\t\u00bf\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3"+
		"\4\u00c4\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8"+
		"\t\u00c8\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc"+
		"\4\u00cd\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1"+
		"\t\u00d1\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5"+
		"\4\u00d6\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da"+
		"\t\u00da\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de"+
		"\4\u00df\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3"+
		"\t\u00e3\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7"+
		"\4\u00e8\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec"+
		"\t\u00ec\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0"+
		"\4\u00f1\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5"+
		"\t\u00f5\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9"+
		"\4\u00fa\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe"+
		"\t\u00fe\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\5\37\u0280\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u02a4\n$\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)"+
		"\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3"+
		"J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3"+
		"N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3_\3"+
		"_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3"+
		"e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3g\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3i\3i\3i\3i\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\3"+
		"k\3k\3k\3l\3l\3l\3l\3l\3l\3m\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n\3o\3o\3o\3"+
		"o\3o\3o\3o\3o\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3r\3r\3r\3r\3r\3s\3s\3s\3"+
		"s\3s\3s\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3u\3u\3u\3u\3u\3u\3u\3v\3"+
		"v\3v\3v\3v\3v\3v\3v\3v\3w\3w\3w\3w\3w\3w\3x\3x\3x\3x\3x\3x\3x\3y\3y\3"+
		"y\3z\3z\3z\3z\3z\3z\3z\3z\3z\3{\3{\3{\5{\u04d4\n{\3|\3|\3|\3|\3}\3}\3"+
		"}\3~\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u04e6\n"+
		"\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u04ee\n"+
		"\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\5\u00af\u0623\n\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u070f\n\u00c8\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0721\n\u00c9"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\7\u00eb\u082c\n\u00eb\f\u00eb\16\u00eb"+
		"\u082f\13\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\7\u00eb\u0836"+
		"\n\u00eb\f\u00eb\16\u00eb\u0839\13\u00eb\3\u00eb\5\u00eb\u083c\n\u00eb"+
		"\3\u00ec\6\u00ec\u083f\n\u00ec\r\u00ec\16\u00ec\u0840\3\u00ec\3\u00ec"+
		"\3\u00ed\6\u00ed\u0846\n\u00ed\r\u00ed\16\u00ed\u0847\3\u00ed\3\u00ed"+
		"\3\u00ee\6\u00ee\u084d\n\u00ee\r\u00ee\16\u00ee\u084e\3\u00ee\3\u00ee"+
		"\3\u00ef\6\u00ef\u0854\n\u00ef\r\u00ef\16\u00ef\u0855\3\u00ef\3\u00ef"+
		"\3\u00f0\6\u00f0\u085b\n\u00f0\r\u00f0\16\u00f0\u085c\3\u00f1\6\u00f1"+
		"\u0860\n\u00f1\r\u00f1\16\u00f1\u0861\3\u00f1\3\u00f1\3\u00f1\3\u00f1"+
		"\5\u00f1\u0868\n\u00f1\3\u00f1\3\u00f1\5\u00f1\u086c\n\u00f1\3\u00f2\6"+
		"\u00f2\u086f\n\u00f2\r\u00f2\16\u00f2\u0870\3\u00f2\5\u00f2\u0874\n\u00f2"+
		"\3\u00f2\3\u00f2\3\u00f2\3\u00f2\5\u00f2\u087a\n\u00f2\3\u00f2\3\u00f2"+
		"\3\u00f2\5\u00f2\u087f\n\u00f2\3\u00f3\6\u00f3\u0882\n\u00f3\r\u00f3\16"+
		"\u00f3\u0883\3\u00f3\5\u00f3\u0887\n\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f3\5\u00f3\u088e\n\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3"+
		"\5\u00f3\u0895\n\u00f3\3\u00f4\3\u00f4\3\u00f4\6\u00f4\u089a\n\u00f4\r"+
		"\u00f4\16\u00f4\u089b\3\u00f5\3\u00f5\3\u00f5\3\u00f5\7\u00f5\u08a2\n"+
		"\u00f5\f\u00f5\16\u00f5\u08a5\13\u00f5\3\u00f5\3\u00f5\3\u00f6\6\u00f6"+
		"\u08aa\n\u00f6\r\u00f6\16\u00f6\u08ab\3\u00f6\3\u00f6\7\u00f6\u08b0\n"+
		"\u00f6\f\u00f6\16\u00f6\u08b3\13\u00f6\3\u00f6\3\u00f6\6\u00f6\u08b7\n"+
		"\u00f6\r\u00f6\16\u00f6\u08b8\5\u00f6\u08bb\n\u00f6\3\u00f7\3\u00f7\5"+
		"\u00f7\u08bf\n\u00f7\3\u00f7\6\u00f7\u08c2\n\u00f7\r\u00f7\16\u00f7\u08c3"+
		"\3\u00f8\3\u00f8\3\u00f9\3\u00f9\3\u00fa\3\u00fa\3\u00fa\3\u00fa\7\u00fa"+
		"\u08ce\n\u00fa\f\u00fa\16\u00fa\u08d1\13\u00fa\3\u00fa\5\u00fa\u08d4\n"+
		"\u00fa\3\u00fa\5\u00fa\u08d7\n\u00fa\3\u00fa\3\u00fa\3\u00fb\3\u00fb\3"+
		"\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fc\3\u00fc"+
		"\3\u00fc\7\u00fc\u08e7\n\u00fc\f\u00fc\16\u00fc\u08ea\13\u00fc\3\u00fc"+
		"\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fd\6\u00fd\u08f2\n\u00fd\r\u00fd"+
		"\16\u00fd\u08f3\3\u00fd\3\u00fd\3\u00fe\3\u00fe\3\u08e8\2\u00ff\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3"+
		"S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7"+
		"]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cb"+
		"g\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\u00d7m\u00d9n\u00dbo\u00ddp\u00df"+
		"q\u00e1r\u00e3s\u00e5t\u00e7u\u00e9v\u00ebw\u00edx\u00efy\u00f1z\u00f3"+
		"{\u00f5|\u00f7}\u00f9~\u00fb\177\u00fd\u0080\u00ff\u0081\u0101\u0082\u0103"+
		"\u0083\u0105\u0084\u0107\u0085\u0109\u0086\u010b\u0087\u010d\u0088\u010f"+
		"\u0089\u0111\u008a\u0113\u008b\u0115\u008c\u0117\u008d\u0119\u008e\u011b"+
		"\u008f\u011d\u0090\u011f\u0091\u0121\u0092\u0123\u0093\u0125\u0094\u0127"+
		"\u0095\u0129\u0096\u012b\u0097\u012d\u0098\u012f\u0099\u0131\u009a\u0133"+
		"\u009b\u0135\u009c\u0137\u009d\u0139\u009e\u013b\u009f\u013d\u00a0\u013f"+
		"\u00a1\u0141\u00a2\u0143\u00a3\u0145\u00a4\u0147\u00a5\u0149\u00a6\u014b"+
		"\u00a7\u014d\u00a8\u014f\u00a9\u0151\u00aa\u0153\u00ab\u0155\u00ac\u0157"+
		"\u00ad\u0159\u00ae\u015b\u00af\u015d\u00b0\u015f\u00b1\u0161\u00b2\u0163"+
		"\u00b3\u0165\u00b4\u0167\u00b5\u0169\u00b6\u016b\u00b7\u016d\u00b8\u016f"+
		"\u00b9\u0171\u00ba\u0173\u00bb\u0175\u00bc\u0177\u00bd\u0179\u00be\u017b"+
		"\u00bf\u017d\u00c0\u017f\u00c1\u0181\u00c2\u0183\u00c3\u0185\u00c4\u0187"+
		"\u00c5\u0189\u00c6\u018b\u00c7\u018d\u00c8\u018f\u00c9\u0191\u00ca\u0193"+
		"\u00cb\u0195\u00cc\u0197\u00cd\u0199\u00ce\u019b\u00cf\u019d\u00d0\u019f"+
		"\u00d1\u01a1\u00d2\u01a3\u00d3\u01a5\u00d4\u01a7\u00d5\u01a9\u00d6\u01ab"+
		"\u00d7\u01ad\u00d8\u01af\u00d9\u01b1\u00da\u01b3\u00db\u01b5\u00dc\u01b7"+
		"\u00dd\u01b9\u00de\u01bb\u00df\u01bd\u00e0\u01bf\u00e1\u01c1\u00e2\u01c3"+
		"\u00e3\u01c5\u00e4\u01c7\u00e5\u01c9\u00e6\u01cb\u00e7\u01cd\u00e8\u01cf"+
		"\u00e9\u01d1\u00ea\u01d3\u00eb\u01d5\u00ec\u01d7\u00ed\u01d9\u00ee\u01db"+
		"\u00ef\u01dd\u00f0\u01df\u00f1\u01e1\u00f2\u01e3\u00f3\u01e5\u00f4\u01e7"+
		"\u00f5\u01e9\u00f6\u01eb\2\u01ed\2\u01ef\2\u01f1\2\u01f3\u00f7\u01f5\u00f8"+
		"\u01f7\u00f9\u01f9\u00fa\u01fb\u00fb\3\2\f\4\2))^^\4\2$$^^\6\2DDIIMMO"+
		"O\3\2bb\4\2--//\3\2\62;\3\2C\\\4\2\f\f\17\17\3\2--\5\2\13\f\17\17\"\""+
		"\u0921\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2"+
		"\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb"+
		"\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2"+
		"\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd"+
		"\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2"+
		"\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef"+
		"\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2"+
		"\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101"+
		"\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2"+
		"\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113"+
		"\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b\3\2\2"+
		"\2\2\u011d\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2\2\2\u0125"+
		"\3\2\2\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012b\3\2\2\2\2\u012d\3\2\2"+
		"\2\2\u012f\3\2\2\2\2\u0131\3\2\2\2\2\u0133\3\2\2\2\2\u0135\3\2\2\2\2\u0137"+
		"\3\2\2\2\2\u0139\3\2\2\2\2\u013b\3\2\2\2\2\u013d\3\2\2\2\2\u013f\3\2\2"+
		"\2\2\u0141\3\2\2\2\2\u0143\3\2\2\2\2\u0145\3\2\2\2\2\u0147\3\2\2\2\2\u0149"+
		"\3\2\2\2\2\u014b\3\2\2\2\2\u014d\3\2\2\2\2\u014f\3\2\2\2\2\u0151\3\2\2"+
		"\2\2\u0153\3\2\2\2\2\u0155\3\2\2\2\2\u0157\3\2\2\2\2\u0159\3\2\2\2\2\u015b"+
		"\3\2\2\2\2\u015d\3\2\2\2\2\u015f\3\2\2\2\2\u0161\3\2\2\2\2\u0163\3\2\2"+
		"\2\2\u0165\3\2\2\2\2\u0167\3\2\2\2\2\u0169\3\2\2\2\2\u016b\3\2\2\2\2\u016d"+
		"\3\2\2\2\2\u016f\3\2\2\2\2\u0171\3\2\2\2\2\u0173\3\2\2\2\2\u0175\3\2\2"+
		"\2\2\u0177\3\2\2\2\2\u0179\3\2\2\2\2\u017b\3\2\2\2\2\u017d\3\2\2\2\2\u017f"+
		"\3\2\2\2\2\u0181\3\2\2\2\2\u0183\3\2\2\2\2\u0185\3\2\2\2\2\u0187\3\2\2"+
		"\2\2\u0189\3\2\2\2\2\u018b\3\2\2\2\2\u018d\3\2\2\2\2\u018f\3\2\2\2\2\u0191"+
		"\3\2\2\2\2\u0193\3\2\2\2\2\u0195\3\2\2\2\2\u0197\3\2\2\2\2\u0199\3\2\2"+
		"\2\2\u019b\3\2\2\2\2\u019d\3\2\2\2\2\u019f\3\2\2\2\2\u01a1\3\2\2\2\2\u01a3"+
		"\3\2\2\2\2\u01a5\3\2\2\2\2\u01a7\3\2\2\2\2\u01a9\3\2\2\2\2\u01ab\3\2\2"+
		"\2\2\u01ad\3\2\2\2\2\u01af\3\2\2\2\2\u01b1\3\2\2\2\2\u01b3\3\2\2\2\2\u01b5"+
		"\3\2\2\2\2\u01b7\3\2\2\2\2\u01b9\3\2\2\2\2\u01bb\3\2\2\2\2\u01bd\3\2\2"+
		"\2\2\u01bf\3\2\2\2\2\u01c1\3\2\2\2\2\u01c3\3\2\2\2\2\u01c5\3\2\2\2\2\u01c7"+
		"\3\2\2\2\2\u01c9\3\2\2\2\2\u01cb\3\2\2\2\2\u01cd\3\2\2\2\2\u01cf\3\2\2"+
		"\2\2\u01d1\3\2\2\2\2\u01d3\3\2\2\2\2\u01d5\3\2\2\2\2\u01d7\3\2\2\2\2\u01d9"+
		"\3\2\2\2\2\u01db\3\2\2\2\2\u01dd\3\2\2\2\2\u01df\3\2\2\2\2\u01e1\3\2\2"+
		"\2\2\u01e3\3\2\2\2\2\u01e5\3\2\2\2\2\u01e7\3\2\2\2\2\u01e9\3\2\2\2\2\u01f3"+
		"\3\2\2\2\2\u01f5\3\2\2\2\2\u01f7\3\2\2\2\2\u01f9\3\2\2\2\2\u01fb\3\2\2"+
		"\2\3\u01fd\3\2\2\2\5\u01ff\3\2\2\2\7\u0201\3\2\2\2\t\u0203\3\2\2\2\13"+
		"\u0205\3\2\2\2\r\u0209\3\2\2\2\17\u020c\3\2\2\2\21\u020e\3\2\2\2\23\u0210"+
		"\3\2\2\2\25\u0212\3\2\2\2\27\u0219\3\2\2\2\31\u021e\3\2\2\2\33\u0222\3"+
		"\2\2\2\35\u0225\3\2\2\2\37\u0229\3\2\2\2!\u0232\3\2\2\2#\u0238\3\2\2\2"+
		"%\u023e\3\2\2\2\'\u0241\3\2\2\2)\u024a\3\2\2\2+\u024f\3\2\2\2-\u0254\3"+
		"\2\2\2/\u025b\3\2\2\2\61\u0261\3\2\2\2\63\u0268\3\2\2\2\65\u026e\3\2\2"+
		"\2\67\u0271\3\2\2\29\u0274\3\2\2\2;\u0278\3\2\2\2=\u027f\3\2\2\2?\u0281"+
		"\3\2\2\2A\u0284\3\2\2\2C\u028b\3\2\2\2E\u0293\3\2\2\2G\u02a3\3\2\2\2I"+
		"\u02a5\3\2\2\2K\u02a8\3\2\2\2M\u02ad\3\2\2\2O\u02b2\3\2\2\2Q\u02b8\3\2"+
		"\2\2S\u02be\3\2\2\2U\u02c2\3\2\2\2W\u02c7\3\2\2\2Y\u02cb\3\2\2\2[\u02d4"+
		"\3\2\2\2]\u02d9\3\2\2\2_\u02de\3\2\2\2a\u02e3\3\2\2\2c\u02e8\3\2\2\2e"+
		"\u02ec\3\2\2\2g\u02f1\3\2\2\2i\u02f7\3\2\2\2k\u02fd\3\2\2\2m\u0303\3\2"+
		"\2\2o\u0308\3\2\2\2q\u030d\3\2\2\2s\u0313\3\2\2\2u\u0318\3\2\2\2w\u0320"+
		"\3\2\2\2y\u0323\3\2\2\2{\u032b\3\2\2\2}\u0332\3\2\2\2\177\u0337\3\2\2"+
		"\2\u0081\u0341\3\2\2\2\u0083\u0347\3\2\2\2\u0085\u034c\3\2\2\2\u0087\u0356"+
		"\3\2\2\2\u0089\u0360\3\2\2\2\u008b\u036a\3\2\2\2\u008d\u0372\3\2\2\2\u008f"+
		"\u0378\3\2\2\2\u0091\u037e\3\2\2\2\u0093\u0383\3\2\2\2\u0095\u0387\3\2"+
		"\2\2\u0097\u038c\3\2\2\2\u0099\u0393\3\2\2\2\u009b\u039a\3\2\2\2\u009d"+
		"\u03a0\3\2\2\2\u009f\u03a5\3\2\2\2\u00a1\u03ad\3\2\2\2\u00a3\u03b4\3\2"+
		"\2\2\u00a5\u03bb\3\2\2\2\u00a7\u03c0\3\2\2\2\u00a9\u03c9\3\2\2\2\u00ab"+
		"\u03d1\3\2\2\2\u00ad\u03d8\3\2\2\2\u00af\u03e0\3\2\2\2\u00b1\u03e8\3\2"+
		"\2\2\u00b3\u03ed\3\2\2\2\u00b5\u03f2\3\2\2\2\u00b7\u03f7\3\2\2\2\u00b9"+
		"\u03fe\3\2\2\2\u00bb\u0406\3\2\2\2\u00bd\u040d\3\2\2\2\u00bf\u0411\3\2"+
		"\2\2\u00c1\u041c\3\2\2\2\u00c3\u0426\3\2\2\2\u00c5\u042b\3\2\2\2\u00c7"+
		"\u0431\3\2\2\2\u00c9\u0438\3\2\2\2\u00cb\u043e\3\2\2\2\u00cd\u0448\3\2"+
		"\2\2\u00cf\u044b\3\2\2\2\u00d1\u0457\3\2\2\2\u00d3\u0460\3\2\2\2\u00d5"+
		"\u0466\3\2\2\2\u00d7\u046d\3\2\2\2\u00d9\u0473\3\2\2\2\u00db\u0477\3\2"+
		"\2\2\u00dd\u047e\3\2\2\2\u00df\u0486\3\2\2\2\u00e1\u048a\3\2\2\2\u00e3"+
		"\u0490\3\2\2\2\u00e5\u0495\3\2\2\2\u00e7\u049b\3\2\2\2\u00e9\u04a7\3\2"+
		"\2\2\u00eb\u04ae\3\2\2\2\u00ed\u04b7\3\2\2\2\u00ef\u04bd\3\2\2\2\u00f1"+
		"\u04c4\3\2\2\2\u00f3\u04c7\3\2\2\2\u00f5\u04d3\3\2\2\2\u00f7\u04d5\3\2"+
		"\2\2\u00f9\u04d9\3\2\2\2\u00fb\u04dc\3\2\2\2\u00fd\u04df\3\2\2\2\u00ff"+
		"\u04e5\3\2\2\2\u0101\u04e7\3\2\2\2\u0103\u04ed\3\2\2\2\u0105\u04ef\3\2"+
		"\2\2\u0107\u04f1\3\2\2\2\u0109\u04f3\3\2\2\2\u010b\u04f5\3\2\2\2\u010d"+
		"\u04f7\3\2\2\2\u010f\u04f9\3\2\2\2\u0111\u04fd\3\2\2\2\u0113\u04ff\3\2"+
		"\2\2\u0115\u0501\3\2\2\2\u0117\u0503\3\2\2\2\u0119\u0506\3\2\2\2\u011b"+
		"\u0508\3\2\2\2\u011d\u0510\3\2\2\2\u011f\u0517\3\2\2\2\u0121\u051b\3\2"+
		"\2\2\u0123\u051e\3\2\2\2\u0125\u0523\3\2\2\2\u0127\u052b\3\2\2\2\u0129"+
		"\u0536\3\2\2\2\u012b\u0540\3\2\2\2\u012d\u054a\3\2\2\2\u012f\u0551\3\2"+
		"\2\2\u0131\u0557\3\2\2\2\u0133\u055d\3\2\2\2\u0135\u056d\3\2\2\2\u0137"+
		"\u057a\3\2\2\2\u0139\u0587\3\2\2\2\u013b\u0591\3\2\2\2\u013d\u0598\3\2"+
		"\2\2\u013f\u05a3\3\2\2\2\u0141\u05ae\3\2\2\2\u0143\u05b4\3\2\2\2\u0145"+
		"\u05b9\3\2\2\2\u0147\u05c1\3\2\2\2\u0149\u05c7\3\2\2\2\u014b\u05d1\3\2"+
		"\2\2\u014d\u05da\3\2\2\2\u014f\u05e3\3\2\2\2\u0151\u05eb\3\2\2\2\u0153"+
		"\u05f1\3\2\2\2\u0155\u05f7\3\2\2\2\u0157\u05ff\3\2\2\2\u0159\u0604\3\2"+
		"\2\2\u015b\u060e\3\2\2\2\u015d\u0622\3\2\2\2\u015f\u0624\3\2\2\2\u0161"+
		"\u062c\3\2\2\2\u0163\u0632\3\2\2\2\u0165\u0640\3\2\2\2\u0167\u064d\3\2"+
		"\2\2\u0169\u0655\3\2\2\2\u016b\u065c\3\2\2\2\u016d\u0663\3\2\2\2\u016f"+
		"\u066f\3\2\2\2\u0171\u0678\3\2\2\2\u0173\u0681\3\2\2\2\u0175\u0689\3\2"+
		"\2\2\u0177\u0693\3\2\2\2\u0179\u069e\3\2\2\2\u017b\u06a4\3\2\2\2\u017d"+
		"\u06ac\3\2\2\2\u017f\u06b8\3\2\2\2\u0181\u06bf\3\2\2\2\u0183\u06c7\3\2"+
		"\2\2\u0185\u06d0\3\2\2\2\u0187\u06da\3\2\2\2\u0189\u06e1\3\2\2\2\u018b"+
		"\u06e7\3\2\2\2\u018d\u06f3\3\2\2\2\u018f\u070e\3\2\2\2\u0191\u0720\3\2"+
		"\2\2\u0193\u0722\3\2\2\2\u0195\u0726\3\2\2\2\u0197\u072f\3\2\2\2\u0199"+
		"\u0737\3\2\2\2\u019b\u073f\3\2\2\2\u019d\u0744\3\2\2\2\u019f\u074f\3\2"+
		"\2\2\u01a1\u075b\3\2\2\2\u01a3\u0764\3\2\2\2\u01a5\u076c\3\2\2\2\u01a7"+
		"\u0773\3\2\2\2\u01a9\u0779\3\2\2\2\u01ab\u077e\3\2\2\2\u01ad\u0785\3\2"+
		"\2\2\u01af\u078a\3\2\2\2\u01b1\u0791\3\2\2\2\u01b3\u0799\3\2\2\2\u01b5"+
		"\u07a0\3\2\2\2\u01b7\u07a7\3\2\2\2\u01b9\u07ac\3\2\2\2\u01bb\u07b1\3\2"+
		"\2\2\u01bd\u07b7\3\2\2\2\u01bf\u07c3\3\2\2\2\u01c1\u07ce\3\2\2\2\u01c3"+
		"\u07db\3\2\2\2\u01c5\u07e1\3\2\2\2\u01c7\u07e9\3\2\2\2\u01c9\u07ef\3\2"+
		"\2\2\u01cb\u07f6\3\2\2\2\u01cd\u07fb\3\2\2\2\u01cf\u0801\3\2\2\2\u01d1"+
		"\u0808\3\2\2\2\u01d3\u0815\3\2\2\2\u01d5\u083b\3\2\2\2\u01d7\u083e\3\2"+
		"\2\2\u01d9\u0845\3\2\2\2\u01db\u084c\3\2\2\2\u01dd\u0853\3\2\2\2\u01df"+
		"\u085a\3\2\2\2\u01e1\u086b\3\2\2\2\u01e3\u087e\3\2\2\2\u01e5\u0894\3\2"+
		"\2\2\u01e7\u0899\3\2\2\2\u01e9\u089d\3\2\2\2\u01eb\u08ba\3\2\2\2\u01ed"+
		"\u08bc\3\2\2\2\u01ef\u08c5\3\2\2\2\u01f1\u08c7\3\2\2\2\u01f3\u08c9\3\2"+
		"\2\2\u01f5\u08da\3\2\2\2\u01f7\u08e1\3\2\2\2\u01f9\u08f1\3\2\2\2\u01fb"+
		"\u08f7\3\2\2\2\u01fd\u01fe\7*\2\2\u01fe\4\3\2\2\2\u01ff\u0200\7+\2\2\u0200"+
		"\6\3\2\2\2\u0201\u0202\7.\2\2\u0202\b\3\2\2\2\u0203\u0204\7\60\2\2\u0204"+
		"\n\3\2\2\2\u0205\u0206\7\61\2\2\u0206\u0207\7,\2\2\u0207\u0208\7-\2\2"+
		"\u0208\f\3\2\2\2\u0209\u020a\7,\2\2\u020a\u020b\7\61\2\2\u020b\16\3\2"+
		"\2\2\u020c\u020d\7]\2\2\u020d\20\3\2\2\2\u020e\u020f\7_\2\2\u020f\22\3"+
		"\2\2\2\u0210\u0211\7<\2\2\u0211\24\3\2\2\2\u0212\u0213\7U\2\2\u0213\u0214"+
		"\7G\2\2\u0214\u0215\7N\2\2\u0215\u0216\7G\2\2\u0216\u0217\7E\2\2\u0217"+
		"\u0218\7V\2\2\u0218\26\3\2\2\2\u0219\u021a\7H\2\2\u021a\u021b\7T\2\2\u021b"+
		"\u021c\7Q\2\2\u021c\u021d\7O\2\2\u021d\30\3\2\2\2\u021e\u021f\7C\2\2\u021f"+
		"\u0220\7F\2\2\u0220\u0221\7F\2\2\u0221\32\3\2\2\2\u0222\u0223\7C\2\2\u0223"+
		"\u0224\7U\2\2\u0224\34\3\2\2\2\u0225\u0226\7C\2\2\u0226\u0227\7N\2\2\u0227"+
		"\u0228\7N\2\2\u0228\36\3\2\2\2\u0229\u022a\7F\2\2\u022a\u022b\7K\2\2\u022b"+
		"\u022c\7U\2\2\u022c\u022d\7V\2\2\u022d\u022e\7K\2\2\u022e\u022f\7P\2\2"+
		"\u022f\u0230\7E\2\2\u0230\u0231\7V\2\2\u0231 \3\2\2\2\u0232\u0233\7Y\2"+
		"\2\u0233\u0234\7J\2\2\u0234\u0235\7G\2\2\u0235\u0236\7T\2\2\u0236\u0237"+
		"\7G\2\2\u0237\"\3\2\2\2\u0238\u0239\7I\2\2\u0239\u023a\7T\2\2\u023a\u023b"+
		"\7Q\2\2\u023b\u023c\7W\2\2\u023c\u023d\7R\2\2\u023d$\3\2\2\2\u023e\u023f"+
		"\7D\2\2\u023f\u0240\7[\2\2\u0240&\3\2\2\2\u0241\u0242\7I\2\2\u0242\u0243"+
		"\7T\2\2\u0243\u0244\7Q\2\2\u0244\u0245\7W\2\2\u0245\u0246\7R\2\2\u0246"+
		"\u0247\7K\2\2\u0247\u0248\7P\2\2\u0248\u0249\7I\2\2\u0249(\3\2\2\2\u024a"+
		"\u024b\7U\2\2\u024b\u024c\7G\2\2\u024c\u024d\7V\2\2\u024d\u024e\7U\2\2"+
		"\u024e*\3\2\2\2\u024f\u0250\7E\2\2\u0250\u0251\7W\2\2\u0251\u0252\7D\2"+
		"\2\u0252\u0253\7G\2\2\u0253,\3\2\2\2\u0254\u0255\7T\2\2\u0255\u0256\7"+
		"Q\2\2\u0256\u0257\7N\2\2\u0257\u0258\7N\2\2\u0258\u0259\7W\2\2\u0259\u025a"+
		"\7R\2\2\u025a.\3\2\2\2\u025b\u025c\7Q\2\2\u025c\u025d\7T\2\2\u025d\u025e"+
		"\7F\2\2\u025e\u025f\7G\2\2\u025f\u0260\7T\2\2\u0260\60\3\2\2\2\u0261\u0262"+
		"\7J\2\2\u0262\u0263\7C\2\2\u0263\u0264\7X\2\2\u0264\u0265\7K\2\2\u0265"+
		"\u0266\7P\2\2\u0266\u0267\7I\2\2\u0267\62\3\2\2\2\u0268\u0269\7N\2\2\u0269"+
		"\u026a\7K\2\2\u026a\u026b\7O\2\2\u026b\u026c\7K\2\2\u026c\u026d\7V\2\2"+
		"\u026d\64\3\2\2\2\u026e\u026f\7C\2\2\u026f\u0270\7V\2\2\u0270\66\3\2\2"+
		"\2\u0271\u0272\7Q\2\2\u0272\u0273\7T\2\2\u02738\3\2\2\2\u0274\u0275\7"+
		"C\2\2\u0275\u0276\7P\2\2\u0276\u0277\7F\2\2\u0277:\3\2\2\2\u0278\u0279"+
		"\7K\2\2\u0279\u027a\7P\2\2\u027a<\3\2\2\2\u027b\u027c\7P\2\2\u027c\u027d"+
		"\7Q\2\2\u027d\u0280\7V\2\2\u027e\u0280\7#\2\2\u027f\u027b\3\2\2\2\u027f"+
		"\u027e\3\2\2\2\u0280>\3\2\2\2\u0281\u0282\7P\2\2\u0282\u0283\7Q\2\2\u0283"+
		"@\3\2\2\2\u0284\u0285\7G\2\2\u0285\u0286\7Z\2\2\u0286\u0287\7K\2\2\u0287"+
		"\u0288\7U\2\2\u0288\u0289\7V\2\2\u0289\u028a\7U\2\2\u028aB\3\2\2\2\u028b"+
		"\u028c\7D\2\2\u028c\u028d\7G\2\2\u028d\u028e\7V\2\2\u028e\u028f\7Y\2\2"+
		"\u028f\u0290\7G\2\2\u0290\u0291\7G\2\2\u0291\u0292\7P\2\2\u0292D\3\2\2"+
		"\2\u0293\u0294\7N\2\2\u0294\u0295\7K\2\2\u0295\u0296\7M\2\2\u0296\u0297"+
		"\7G\2\2\u0297F\3\2\2\2\u0298\u0299\7T\2\2\u0299\u029a\7N\2\2\u029a\u029b"+
		"\7K\2\2\u029b\u029c\7M\2\2\u029c\u02a4\7G\2\2\u029d\u029e\7T\2\2\u029e"+
		"\u029f\7G\2\2\u029f\u02a0\7I\2\2\u02a0\u02a1\7G\2\2\u02a1\u02a2\7Z\2\2"+
		"\u02a2\u02a4\7R\2\2\u02a3\u0298\3\2\2\2\u02a3\u029d\3\2\2\2\u02a4H\3\2"+
		"\2\2\u02a5\u02a6\7K\2\2\u02a6\u02a7\7U\2\2\u02a7J\3\2\2\2\u02a8\u02a9"+
		"\7P\2\2\u02a9\u02aa\7W\2\2\u02aa\u02ab\7N\2\2\u02ab\u02ac\7N\2\2\u02ac"+
		"L\3\2\2\2\u02ad\u02ae\7V\2\2\u02ae\u02af\7T\2\2\u02af\u02b0\7W\2\2\u02b0"+
		"\u02b1\7G\2\2\u02b1N\3\2\2\2\u02b2\u02b3\7H\2\2\u02b3\u02b4\7C\2\2\u02b4"+
		"\u02b5\7N\2\2\u02b5\u02b6\7U\2\2\u02b6\u02b7\7G\2\2\u02b7P\3\2\2\2\u02b8"+
		"\u02b9\7P\2\2\u02b9\u02ba\7W\2\2\u02ba\u02bb\7N\2\2\u02bb\u02bc\7N\2\2"+
		"\u02bc\u02bd\7U\2\2\u02bdR\3\2\2\2\u02be\u02bf\7C\2\2\u02bf\u02c0\7U\2"+
		"\2\u02c0\u02c1\7E\2\2\u02c1T\3\2\2\2\u02c2\u02c3\7F\2\2\u02c3\u02c4\7"+
		"G\2\2\u02c4\u02c5\7U\2\2\u02c5\u02c6\7E\2\2\u02c6V\3\2\2\2\u02c7\u02c8"+
		"\7H\2\2\u02c8\u02c9\7Q\2\2\u02c9\u02ca\7T\2\2\u02caX\3\2\2\2\u02cb\u02cc"+
		"\7K\2\2\u02cc\u02cd\7P\2\2\u02cd\u02ce\7V\2\2\u02ce\u02cf\7G\2\2\u02cf"+
		"\u02d0\7T\2\2\u02d0\u02d1\7X\2\2\u02d1\u02d2\7C\2\2\u02d2\u02d3\7N\2\2"+
		"\u02d3Z\3\2\2\2\u02d4\u02d5\7E\2\2\u02d5\u02d6\7C\2\2\u02d6\u02d7\7U\2"+
		"\2\u02d7\u02d8\7G\2\2\u02d8\\\3\2\2\2\u02d9\u02da\7Y\2\2\u02da\u02db\7"+
		"J\2\2\u02db\u02dc\7G\2\2\u02dc\u02dd\7P\2\2\u02dd^\3\2\2\2\u02de\u02df"+
		"\7V\2\2\u02df\u02e0\7J\2\2\u02e0\u02e1\7G\2\2\u02e1\u02e2\7P\2\2\u02e2"+
		"`\3\2\2\2\u02e3\u02e4\7G\2\2\u02e4\u02e5\7N\2\2\u02e5\u02e6\7U\2\2\u02e6"+
		"\u02e7\7G\2\2\u02e7b\3\2\2\2\u02e8\u02e9\7G\2\2\u02e9\u02ea\7P\2\2\u02ea"+
		"\u02eb\7F\2\2\u02ebd\3\2\2\2\u02ec\u02ed\7L\2\2\u02ed\u02ee\7Q\2\2\u02ee"+
		"\u02ef\7K\2\2\u02ef\u02f0\7P\2\2\u02f0f\3\2\2\2\u02f1\u02f2\7E\2\2\u02f2"+
		"\u02f3\7T\2\2\u02f3\u02f4\7Q\2\2\u02f4\u02f5\7U\2\2\u02f5\u02f6\7U\2\2"+
		"\u02f6h\3\2\2\2\u02f7\u02f8\7Q\2\2\u02f8\u02f9\7W\2\2\u02f9\u02fa\7V\2"+
		"\2\u02fa\u02fb\7G\2\2\u02fb\u02fc\7T\2\2\u02fcj\3\2\2\2\u02fd\u02fe\7"+
		"K\2\2\u02fe\u02ff\7P\2\2\u02ff\u0300\7P\2\2\u0300\u0301\7G\2\2\u0301\u0302"+
		"\7T\2\2\u0302l\3\2\2\2\u0303\u0304\7N\2\2\u0304\u0305\7G\2\2\u0305\u0306"+
		"\7H\2\2\u0306\u0307\7V\2\2\u0307n\3\2\2\2\u0308\u0309\7U\2\2\u0309\u030a"+
		"\7G\2\2\u030a\u030b\7O\2\2\u030b\u030c\7K\2\2\u030cp\3\2\2\2\u030d\u030e"+
		"\7T\2\2\u030e\u030f\7K\2\2\u030f\u0310\7I\2\2\u0310\u0311\7J\2\2\u0311"+
		"\u0312\7V\2\2\u0312r\3\2\2\2\u0313\u0314\7H\2\2\u0314\u0315\7W\2\2\u0315"+
		"\u0316\7N\2\2\u0316\u0317\7N\2\2\u0317t\3\2\2\2\u0318\u0319\7P\2\2\u0319"+
		"\u031a\7C\2\2\u031a\u031b\7V\2\2\u031b\u031c\7W\2\2\u031c\u031d\7T\2\2"+
		"\u031d\u031e\7C\2\2\u031e\u031f\7N\2\2\u031fv\3\2\2\2\u0320\u0321\7Q\2"+
		"\2\u0321\u0322\7P\2\2\u0322x\3\2\2\2\u0323\u0324\7N\2\2\u0324\u0325\7"+
		"C\2\2\u0325\u0326\7V\2\2\u0326\u0327\7G\2\2\u0327\u0328\7T\2\2\u0328\u0329"+
		"\7C\2\2\u0329\u032a\7N\2\2\u032az\3\2\2\2\u032b\u032c\7Y\2\2\u032c\u032d"+
		"\7K\2\2\u032d\u032e\7P\2\2\u032e\u032f\7F\2\2\u032f\u0330\7Q\2\2\u0330"+
		"\u0331\7Y\2\2\u0331|\3\2\2\2\u0332\u0333\7Q\2\2\u0333\u0334\7X\2\2\u0334"+
		"\u0335\7G\2\2\u0335\u0336\7T\2\2\u0336~\3\2\2\2\u0337\u0338\7R\2\2\u0338"+
		"\u0339\7C\2\2\u0339\u033a\7T\2\2\u033a\u033b\7V\2\2\u033b\u033c\7K\2\2"+
		"\u033c\u033d\7V\2\2\u033d\u033e\7K\2\2\u033e\u033f\7Q\2\2\u033f\u0340"+
		"\7P\2\2\u0340\u0080\3\2\2\2\u0341\u0342\7T\2\2\u0342\u0343\7C\2\2\u0343"+
		"\u0344\7P\2\2\u0344\u0345\7I\2\2\u0345\u0346\7G\2\2\u0346\u0082\3\2\2"+
		"\2\u0347\u0348\7T\2\2\u0348\u0349\7Q\2\2\u0349\u034a\7Y\2\2\u034a\u034b"+
		"\7U\2\2\u034b\u0084\3\2\2\2\u034c\u034d\7W\2\2\u034d\u034e\7P\2\2\u034e"+
		"\u034f\7D\2\2\u034f\u0350\7Q\2\2\u0350\u0351\7W\2\2\u0351\u0352\7P\2\2"+
		"\u0352\u0353\7F\2\2\u0353\u0354\7G\2\2\u0354\u0355\7F\2\2\u0355\u0086"+
		"\3\2\2\2\u0356\u0357\7R\2\2\u0357\u0358\7T\2\2\u0358\u0359\7G\2\2\u0359"+
		"\u035a\7E\2\2\u035a\u035b\7G\2\2\u035b\u035c\7F\2\2\u035c\u035d\7K\2\2"+
		"\u035d\u035e\7P\2\2\u035e\u035f\7I\2\2\u035f\u0088\3\2\2\2\u0360\u0361"+
		"\7H\2\2\u0361\u0362\7Q\2\2\u0362\u0363\7N\2\2\u0363\u0364\7N\2\2\u0364"+
		"\u0365\7Q\2\2\u0365\u0366\7Y\2\2\u0366\u0367\7K\2\2\u0367\u0368\7P\2\2"+
		"\u0368\u0369\7I\2\2\u0369\u008a\3\2\2\2\u036a\u036b\7E\2\2\u036b\u036c"+
		"\7W\2\2\u036c\u036d\7T\2\2\u036d\u036e\7T\2\2\u036e\u036f\7G\2\2\u036f"+
		"\u0370\7P\2\2\u0370\u0371\7V\2\2\u0371\u008c\3\2\2\2\u0372\u0373\7H\2"+
		"\2\u0373\u0374\7K\2\2\u0374\u0375\7T\2\2\u0375\u0376\7U\2\2\u0376\u0377"+
		"\7V\2\2\u0377\u008e\3\2\2\2\u0378\u0379\7C\2\2\u0379\u037a\7H\2\2\u037a"+
		"\u037b\7V\2\2\u037b\u037c\7G\2\2\u037c\u037d\7T\2\2\u037d\u0090\3\2\2"+
		"\2\u037e\u037f\7N\2\2\u037f\u0380\7C\2\2\u0380\u0381\7U\2\2\u0381\u0382"+
		"\7V\2\2\u0382\u0092\3\2\2\2\u0383\u0384\7T\2\2\u0384\u0385\7Q\2\2\u0385"+
		"\u0386\7Y\2\2\u0386\u0094\3\2\2\2\u0387\u0388\7Y\2\2\u0388\u0389\7K\2"+
		"\2\u0389\u038a\7V\2\2\u038a\u038b\7J\2\2\u038b\u0096\3\2\2\2\u038c\u038d"+
		"\7X\2\2\u038d\u038e\7C\2\2\u038e\u038f\7N\2\2\u038f\u0390\7W\2\2\u0390"+
		"\u0391\7G\2\2\u0391\u0392\7U\2\2\u0392\u0098\3\2\2\2\u0393\u0394\7E\2"+
		"\2\u0394\u0395\7T\2\2\u0395\u0396\7G\2\2\u0396\u0397\7C\2\2\u0397\u0398"+
		"\7V\2\2\u0398\u0399\7G\2\2\u0399\u009a\3\2\2\2\u039a\u039b\7V\2\2\u039b"+
		"\u039c\7C\2\2\u039c\u039d\7D\2\2\u039d\u039e\7N\2\2\u039e\u039f\7G\2\2"+
		"\u039f\u009c\3\2\2\2\u03a0\u03a1\7X\2\2\u03a1\u03a2\7K\2\2\u03a2\u03a3"+
		"\7G\2\2\u03a3\u03a4\7Y\2\2\u03a4\u009e\3\2\2\2\u03a5\u03a6\7T\2\2\u03a6"+
		"\u03a7\7G\2\2\u03a7\u03a8\7R\2\2\u03a8\u03a9\7N\2\2\u03a9\u03aa\7C\2\2"+
		"\u03aa\u03ab\7E\2\2\u03ab\u03ac\7G\2\2\u03ac\u00a0\3\2\2\2\u03ad\u03ae"+
		"\7K\2\2\u03ae\u03af\7P\2\2\u03af\u03b0\7U\2\2\u03b0\u03b1\7G\2\2\u03b1"+
		"\u03b2\7T\2\2\u03b2\u03b3\7V\2\2\u03b3\u00a2\3\2\2\2\u03b4\u03b5\7F\2"+
		"\2\u03b5\u03b6\7G\2\2\u03b6\u03b7\7N\2\2\u03b7\u03b8\7G\2\2\u03b8\u03b9"+
		"\7V\2\2\u03b9\u03ba\7G\2\2\u03ba\u00a4\3\2\2\2\u03bb\u03bc\7K\2\2\u03bc"+
		"\u03bd\7P\2\2\u03bd\u03be\7V\2\2\u03be\u03bf\7Q\2\2\u03bf\u00a6\3\2\2"+
		"\2\u03c0\u03c1\7F\2\2\u03c1\u03c2\7G\2\2\u03c2\u03c3\7U\2\2\u03c3\u03c4"+
		"\7E\2\2\u03c4\u03c5\7T\2\2\u03c5\u03c6\7K\2\2\u03c6\u03c7\7D\2\2\u03c7"+
		"\u03c8\7G\2\2\u03c8\u00a8\3\2\2\2\u03c9\u03ca\7G\2\2\u03ca\u03cb\7Z\2"+
		"\2\u03cb\u03cc\7R\2\2\u03cc\u03cd\7N\2\2\u03cd\u03ce\7C\2\2\u03ce\u03cf"+
		"\7K\2\2\u03cf\u03d0\7P\2\2\u03d0\u00aa\3\2\2\2\u03d1\u03d2\7H\2\2\u03d2"+
		"\u03d3\7Q\2\2\u03d3\u03d4\7T\2\2\u03d4\u03d5\7O\2\2\u03d5\u03d6\7C\2\2"+
		"\u03d6\u03d7\7V\2\2\u03d7\u00ac\3\2\2\2\u03d8\u03d9\7N\2\2\u03d9\u03da"+
		"\7Q\2\2\u03da\u03db\7I\2\2\u03db\u03dc\7K\2\2\u03dc\u03dd\7E\2\2\u03dd"+
		"\u03de\7C\2\2\u03de\u03df\7N\2\2\u03df\u00ae\3\2\2\2\u03e0\u03e1\7E\2"+
		"\2\u03e1\u03e2\7Q\2\2\u03e2\u03e3\7F\2\2\u03e3\u03e4\7G\2\2\u03e4\u03e5"+
		"\7I\2\2\u03e5\u03e6\7G\2\2\u03e6\u03e7\7P\2\2\u03e7\u00b0\3\2\2\2\u03e8"+
		"\u03e9\7E\2\2\u03e9\u03ea\7Q\2\2\u03ea\u03eb\7U\2\2\u03eb\u03ec\7V\2\2"+
		"\u03ec\u00b2\3\2\2\2\u03ed\u03ee\7E\2\2\u03ee\u03ef\7C\2\2\u03ef\u03f0"+
		"\7U\2\2\u03f0\u03f1\7V\2\2\u03f1\u00b4\3\2\2\2\u03f2\u03f3\7U\2\2\u03f3"+
		"\u03f4\7J\2\2\u03f4\u03f5\7Q\2\2\u03f5\u03f6\7Y\2\2\u03f6\u00b6\3\2\2"+
		"\2\u03f7\u03f8\7V\2\2\u03f8\u03f9\7C\2\2\u03f9\u03fa\7D\2\2\u03fa\u03fb"+
		"\7N\2\2\u03fb\u03fc\7G\2\2\u03fc\u03fd\7U\2\2\u03fd\u00b8\3\2\2\2\u03fe"+
		"\u03ff\7E\2\2\u03ff\u0400\7Q\2\2\u0400\u0401\7N\2\2\u0401\u0402\7W\2\2"+
		"\u0402\u0403\7O\2\2\u0403\u0404\7P\2\2\u0404\u0405\7U\2\2\u0405\u00ba"+
		"\3\2\2\2\u0406\u0407\7E\2\2\u0407\u0408\7Q\2\2\u0408\u0409\7N\2\2\u0409"+
		"\u040a\7W\2\2\u040a\u040b\7O\2\2\u040b\u040c\7P\2\2\u040c\u00bc\3\2\2"+
		"\2\u040d\u040e\7W\2\2\u040e\u040f\7U\2\2\u040f\u0410\7G\2\2\u0410\u00be"+
		"\3\2\2\2\u0411\u0412\7R\2\2\u0412\u0413\7C\2\2\u0413\u0414\7T\2\2\u0414"+
		"\u0415\7V\2\2\u0415\u0416\7K\2\2\u0416\u0417\7V\2\2\u0417\u0418\7K\2\2"+
		"\u0418\u0419\7Q\2\2\u0419\u041a\7P\2\2\u041a\u041b\7U\2\2\u041b\u00c0"+
		"\3\2\2\2\u041c\u041d\7H\2\2\u041d\u041e\7W\2\2\u041e\u041f\7P\2\2\u041f"+
		"\u0420\7E\2\2\u0420\u0421\7V\2\2\u0421\u0422\7K\2\2\u0422\u0423\7Q\2\2"+
		"\u0423\u0424\7P\2\2\u0424\u0425\7U\2\2\u0425\u00c2\3\2\2\2\u0426\u0427"+
		"\7F\2\2\u0427\u0428\7T\2\2\u0428\u0429\7Q\2\2\u0429\u042a\7R\2\2\u042a"+
		"\u00c4\3\2\2\2\u042b\u042c\7W\2\2\u042c\u042d\7P\2\2\u042d\u042e\7K\2"+
		"\2\u042e\u042f\7Q\2\2\u042f\u0430\7P\2\2\u0430\u00c6\3\2\2\2\u0431\u0432"+
		"\7G\2\2\u0432\u0433\7Z\2\2\u0433\u0434\7E\2\2\u0434\u0435\7G\2\2\u0435"+
		"\u0436\7R\2\2\u0436\u0437\7V\2\2\u0437\u00c8\3\2\2\2\u0438\u0439\7O\2"+
		"\2\u0439\u043a\7K\2\2\u043a\u043b\7P\2\2\u043b\u043c\7W\2\2\u043c\u043d"+
		"\7U\2\2\u043d\u00ca\3\2\2\2\u043e\u043f\7K\2\2\u043f\u0440\7P\2\2\u0440"+
		"\u0441\7V\2\2\u0441\u0442\7G\2\2\u0442\u0443\7T\2\2\u0443\u0444\7U\2\2"+
		"\u0444\u0445\7G\2\2\u0445\u0446\7E\2\2\u0446\u0447\7V\2\2\u0447\u00cc"+
		"\3\2\2\2\u0448\u0449\7V\2\2\u0449\u044a\7Q\2\2\u044a\u00ce\3\2\2\2\u044b"+
		"\u044c\7V\2\2\u044c\u044d\7C\2\2\u044d\u044e\7D\2\2\u044e\u044f\7N\2\2"+
		"\u044f\u0450\7G\2\2\u0450\u0451\7U\2\2\u0451\u0452\7C\2\2\u0452\u0453"+
		"\7O\2\2\u0453\u0454\7R\2\2\u0454\u0455\7N\2\2\u0455\u0456\7G\2\2\u0456"+
		"\u00d0\3\2\2\2\u0457\u0458\7U\2\2\u0458\u0459\7V\2\2\u0459\u045a\7T\2"+
		"\2\u045a\u045b\7C\2\2\u045b\u045c\7V\2\2\u045c\u045d\7K\2\2\u045d\u045e"+
		"\7H\2\2\u045e\u045f\7[\2\2\u045f\u00d2\3\2\2\2\u0460\u0461\7C\2\2\u0461"+
		"\u0462\7N\2\2\u0462\u0463\7V\2\2\u0463\u0464\7G\2\2\u0464\u0465\7T\2\2"+
		"\u0465\u00d4\3\2\2\2\u0466\u0467\7T\2\2\u0467\u0468\7G\2\2\u0468\u0469"+
		"\7P\2\2\u0469\u046a\7C\2\2\u046a\u046b\7O\2\2\u046b\u046c\7G\2\2\u046c"+
		"\u00d6\3\2\2\2\u046d\u046e\7C\2\2\u046e\u046f\7T\2\2\u046f\u0470\7T\2"+
		"\2\u0470\u0471\7C\2\2\u0471\u0472\7[\2\2\u0472\u00d8\3\2\2\2\u0473\u0474"+
		"\7O\2\2\u0474\u0475\7C\2\2\u0475\u0476\7R\2\2\u0476\u00da\3\2\2\2\u0477"+
		"\u0478\7U\2\2\u0478\u0479\7V\2\2\u0479\u047a\7T\2\2\u047a\u047b\7W\2\2"+
		"\u047b\u047c\7E\2\2\u047c\u047d\7V\2\2\u047d\u00dc\3\2\2\2\u047e\u047f"+
		"\7E\2\2\u047f\u0480\7Q\2\2\u0480\u0481\7O\2\2\u0481\u0482\7O\2\2\u0482"+
		"\u0483\7G\2\2\u0483\u0484\7P\2\2\u0484\u0485\7V\2\2\u0485\u00de\3\2\2"+
		"\2\u0486\u0487\7U\2\2\u0487\u0488\7G\2\2\u0488\u0489\7V\2\2\u0489\u00e0"+
		"\3\2\2\2\u048a\u048b\7T\2\2\u048b\u048c\7G\2\2\u048c\u048d\7U\2\2\u048d"+
		"\u048e\7G\2\2\u048e\u048f\7V\2\2\u048f\u00e2\3\2\2\2\u0490\u0491\7F\2"+
		"\2\u0491\u0492\7C\2\2\u0492\u0493\7V\2\2\u0493\u0494\7C\2\2\u0494\u00e4"+
		"\3\2\2\2\u0495\u0496\7U\2\2\u0496\u0497\7V\2\2\u0497\u0498\7C\2\2\u0498"+
		"\u0499\7T\2\2\u0499\u049a\7V\2\2\u049a\u00e6\3\2\2\2\u049b\u049c\7V\2"+
		"\2\u049c\u049d\7T\2\2\u049d\u049e\7C\2\2\u049e\u049f\7P\2\2\u049f\u04a0"+
		"\7U\2\2\u04a0\u04a1\7C\2\2\u04a1\u04a2\7E\2\2\u04a2\u04a3\7V\2\2\u04a3"+
		"\u04a4\7K\2\2\u04a4\u04a5\7Q\2\2\u04a5\u04a6\7P\2\2\u04a6\u00e8\3\2\2"+
		"\2\u04a7\u04a8\7E\2\2\u04a8\u04a9\7Q\2\2\u04a9\u04aa\7O\2\2\u04aa\u04ab"+
		"\7O\2\2\u04ab\u04ac\7K\2\2\u04ac\u04ad\7V\2\2\u04ad\u00ea\3\2\2\2\u04ae"+
		"\u04af\7T\2\2\u04af\u04b0\7Q\2\2\u04b0\u04b1\7N\2\2\u04b1\u04b2\7N\2\2"+
		"\u04b2\u04b3\7D\2\2\u04b3\u04b4\7C\2\2\u04b4\u04b5\7E\2\2\u04b5\u04b6"+
		"\7M\2\2\u04b6\u00ec\3\2\2\2\u04b7\u04b8\7O\2\2\u04b8\u04b9\7C\2\2\u04b9"+
		"\u04ba\7E\2\2\u04ba\u04bb\7T\2\2\u04bb\u04bc\7Q\2\2\u04bc\u00ee\3\2\2"+
		"\2\u04bd\u04be\7K\2\2\u04be\u04bf\7I\2\2\u04bf\u04c0\7P\2\2\u04c0\u04c1"+
		"\7Q\2\2\u04c1\u04c2\7T\2\2\u04c2\u04c3\7G\2\2\u04c3\u00f0\3\2\2\2\u04c4"+
		"\u04c5\7K\2\2\u04c5\u04c6\7H\2\2\u04c6\u00f2\3\2\2\2\u04c7\u04c8\7R\2"+
		"\2\u04c8\u04c9\7Q\2\2\u04c9\u04ca\7U\2\2\u04ca\u04cb\7K\2\2\u04cb\u04cc"+
		"\7V\2\2\u04cc\u04cd\7K\2\2\u04cd\u04ce\7Q\2\2\u04ce\u04cf\7P\2\2\u04cf"+
		"\u00f4\3\2\2\2\u04d0\u04d4\7?\2\2\u04d1\u04d2\7?\2\2\u04d2\u04d4\7?\2"+
		"\2\u04d3\u04d0\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u00f6\3\2\2\2\u04d5\u04d6"+
		"\7>\2\2\u04d6\u04d7\7?\2\2\u04d7\u04d8\7@\2\2\u04d8\u00f8\3\2\2\2\u04d9"+
		"\u04da\7>\2\2\u04da\u04db\7@\2\2\u04db\u00fa\3\2\2\2\u04dc\u04dd\7#\2"+
		"\2\u04dd\u04de\7?\2\2\u04de\u00fc\3\2\2\2\u04df\u04e0\7>\2\2\u04e0\u00fe"+
		"\3\2\2\2\u04e1\u04e2\7>\2\2\u04e2\u04e6\7?\2\2\u04e3\u04e4\7#\2\2\u04e4"+
		"\u04e6\7@\2\2\u04e5\u04e1\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6\u0100\3\2"+
		"\2\2\u04e7\u04e8\7@\2\2\u04e8\u0102\3\2\2\2\u04e9\u04ea\7@\2\2\u04ea\u04ee"+
		"\7?\2\2\u04eb\u04ec\7#\2\2\u04ec\u04ee\7>\2\2\u04ed\u04e9\3\2\2\2\u04ed"+
		"\u04eb\3\2\2\2\u04ee\u0104\3\2\2\2\u04ef\u04f0\7-\2\2\u04f0\u0106\3\2"+
		"\2\2\u04f1\u04f2\7/\2\2\u04f2\u0108\3\2\2\2\u04f3\u04f4\7,\2\2\u04f4\u010a"+
		"\3\2\2\2\u04f5\u04f6\7\61\2\2\u04f6\u010c\3\2\2\2\u04f7\u04f8\7\'\2\2"+
		"\u04f8\u010e\3\2\2\2\u04f9\u04fa\7F\2\2\u04fa\u04fb\7K\2\2\u04fb\u04fc"+
		"\7X\2\2\u04fc\u0110\3\2\2\2\u04fd\u04fe\7\u0080\2\2\u04fe\u0112\3\2\2"+
		"\2\u04ff\u0500\7(\2\2\u0500\u0114\3\2\2\2\u0501\u0502\7~\2\2\u0502\u0116"+
		"\3\2\2\2\u0503\u0504\7~\2\2\u0504\u0505\7~\2\2\u0505\u0118\3\2\2\2\u0506"+
		"\u0507\7`\2\2\u0507\u011a\3\2\2\2\u0508\u0509\7R\2\2\u0509\u050a\7G\2"+
		"\2\u050a\u050b\7T\2\2\u050b\u050c\7E\2\2\u050c\u050d\7G\2\2\u050d\u050e"+
		"\7P\2\2\u050e\u050f\7V\2\2\u050f\u011c\3\2\2\2\u0510\u0511\7D\2\2\u0511"+
		"\u0512\7W\2\2\u0512\u0513\7E\2\2\u0513\u0514\7M\2\2\u0514\u0515\7G\2\2"+
		"\u0515\u0516\7V\2\2\u0516\u011e\3\2\2\2\u0517\u0518\7Q\2\2\u0518\u0519"+
		"\7W\2\2\u0519\u051a\7V\2\2\u051a\u0120\3\2\2\2\u051b\u051c\7Q\2\2\u051c"+
		"\u051d\7H\2\2\u051d\u0122\3\2\2\2\u051e\u051f\7U\2\2\u051f\u0520\7Q\2"+
		"\2\u0520\u0521\7T\2\2\u0521\u0522\7V\2\2\u0522\u0124\3\2\2\2\u0523\u0524"+
		"\7E\2\2\u0524\u0525\7N\2\2\u0525\u0526\7W\2\2\u0526\u0527\7U\2\2\u0527"+
		"\u0528\7V\2\2\u0528\u0529\7G\2\2\u0529\u052a\7T\2\2\u052a\u0126\3\2\2"+
		"\2\u052b\u052c\7F\2\2\u052c\u052d\7K\2\2\u052d\u052e\7U\2\2\u052e\u052f"+
		"\7V\2\2\u052f\u0530\7T\2\2\u0530\u0531\7K\2\2\u0531\u0532\7D\2\2\u0532"+
		"\u0533\7W\2\2\u0533\u0534\7V\2\2\u0534\u0535\7G\2\2\u0535\u0128\3\2\2"+
		"\2\u0536\u0537\7Q\2\2\u0537\u0538\7X\2\2\u0538\u0539\7G\2\2\u0539\u053a"+
		"\7T\2\2\u053a\u053b\7Y\2\2\u053b\u053c\7T\2\2\u053c\u053d\7K\2\2\u053d"+
		"\u053e\7V\2\2\u053e\u053f\7G\2\2\u053f\u012a\3\2\2\2\u0540\u0541\7V\2"+
		"\2\u0541\u0542\7T\2\2\u0542\u0543\7C\2\2\u0543\u0544\7P\2\2\u0544\u0545"+
		"\7U\2\2\u0545\u0546\7H\2\2\u0546\u0547\7Q\2\2\u0547\u0548\7T\2\2\u0548"+
		"\u0549\7O\2\2\u0549\u012c\3\2\2\2\u054a\u054b\7T\2\2\u054b\u054c\7G\2"+
		"\2\u054c\u054d\7F\2\2\u054d\u054e\7W\2\2\u054e\u054f\7E\2\2\u054f\u0550"+
		"\7G\2\2\u0550\u012e\3\2\2\2\u0551\u0552\7W\2\2\u0552\u0553\7U\2\2\u0553"+
		"\u0554\7K\2\2\u0554\u0555\7P\2\2\u0555\u0556\7I\2\2\u0556\u0130\3\2\2"+
		"\2\u0557\u0558\7U\2\2\u0558\u0559\7G\2\2\u0559\u055a\7T\2\2\u055a\u055b"+
		"\7F\2\2\u055b\u055c\7G\2\2\u055c\u0132\3\2\2\2\u055d\u055e\7U\2\2\u055e"+
		"\u055f\7G\2\2\u055f\u0560\7T\2\2\u0560\u0561\7F\2\2\u0561\u0562\7G\2\2"+
		"\u0562\u0563\7R\2\2\u0563\u0564\7T\2\2\u0564\u0565\7Q\2\2\u0565\u0566"+
		"\7R\2\2\u0566\u0567\7G\2\2\u0567\u0568\7T\2\2\u0568\u0569\7V\2\2\u0569"+
		"\u056a\7K\2\2\u056a\u056b\7G\2\2\u056b\u056c\7U\2\2\u056c\u0134\3\2\2"+
		"\2\u056d\u056e\7T\2\2\u056e\u056f\7G\2\2\u056f\u0570\7E\2\2\u0570\u0571"+
		"\7Q\2\2\u0571\u0572\7T\2\2\u0572\u0573\7F\2\2\u0573\u0574\7T\2\2\u0574"+
		"\u0575\7G\2\2\u0575\u0576\7C\2\2\u0576\u0577\7F\2\2\u0577\u0578\7G\2\2"+
		"\u0578\u0579\7T\2\2\u0579\u0136\3\2\2\2\u057a\u057b\7T\2\2\u057b\u057c"+
		"\7G\2\2\u057c\u057d\7E\2\2\u057d\u057e\7Q\2\2\u057e\u057f\7T\2\2\u057f"+
		"\u0580\7F\2\2\u0580\u0581\7Y\2\2\u0581\u0582\7T\2\2\u0582\u0583\7K\2\2"+
		"\u0583\u0584\7V\2\2\u0584\u0585\7G\2\2\u0585\u0586\7T\2\2\u0586\u0138"+
		"\3\2\2\2\u0587\u0588\7F\2\2\u0588\u0589\7G\2\2\u0589\u058a\7N\2\2\u058a"+
		"\u058b\7K\2\2\u058b\u058c\7O\2\2\u058c\u058d\7K\2\2\u058d\u058e\7V\2\2"+
		"\u058e\u058f\7G\2\2\u058f\u0590\7F\2\2\u0590\u013a\3\2\2\2\u0591\u0592"+
		"\7H\2\2\u0592\u0593\7K\2\2\u0593\u0594\7G\2\2\u0594\u0595\7N\2\2\u0595"+
		"\u0596\7F\2\2\u0596\u0597\7U\2\2\u0597\u013c\3\2\2\2\u0598\u0599\7V\2"+
		"\2\u0599\u059a\7G\2\2\u059a\u059b\7T\2\2\u059b\u059c\7O\2\2\u059c\u059d"+
		"\7K\2\2\u059d\u059e\7P\2\2\u059e\u059f\7C\2\2\u059f\u05a0\7V\2\2\u05a0"+
		"\u05a1\7G\2\2\u05a1\u05a2\7F\2\2\u05a2\u013e\3\2\2\2\u05a3\u05a4\7E\2"+
		"\2\u05a4\u05a5\7Q\2\2\u05a5\u05a6\7N\2\2\u05a6\u05a7\7N\2\2\u05a7\u05a8"+
		"\7G\2\2\u05a8\u05a9\7E\2\2\u05a9\u05aa\7V\2\2\u05aa\u05ab\7K\2\2\u05ab"+
		"\u05ac\7Q\2\2\u05ac\u05ad\7P\2\2\u05ad\u0140\3\2\2\2\u05ae\u05af\7K\2"+
		"\2\u05af\u05b0\7V\2\2\u05b0\u05b1\7G\2\2\u05b1\u05b2\7O\2\2\u05b2\u05b3"+
		"\7U\2\2\u05b3\u0142\3\2\2\2\u05b4\u05b5\7M\2\2\u05b5\u05b6\7G\2\2\u05b6"+
		"\u05b7\7[\2\2\u05b7\u05b8\7U\2\2\u05b8\u0144\3\2\2\2\u05b9\u05ba\7G\2"+
		"\2\u05ba\u05bb\7U\2\2\u05bb\u05bc\7E\2\2\u05bc\u05bd\7C\2\2\u05bd\u05be"+
		"\7R\2\2\u05be\u05bf\7G\2\2\u05bf\u05c0\7F\2\2\u05c0\u0146\3\2\2\2\u05c1"+
		"\u05c2\7N\2\2\u05c2\u05c3\7K\2\2\u05c3\u05c4\7P\2\2\u05c4\u05c5\7G\2\2"+
		"\u05c5\u05c6\7U\2\2\u05c6\u0148\3\2\2\2\u05c7\u05c8\7U\2\2\u05c8\u05c9"+
		"\7G\2\2\u05c9\u05ca\7R\2\2\u05ca\u05cb\7C\2\2\u05cb\u05cc\7T\2\2\u05cc"+
		"\u05cd\7C\2\2\u05cd\u05ce\7V\2\2\u05ce\u05cf\7G\2\2\u05cf\u05d0\7F\2\2"+
		"\u05d0\u014a\3\2\2\2\u05d1\u05d2\7H\2\2\u05d2\u05d3\7W\2\2\u05d3\u05d4"+
		"\7P\2\2\u05d4\u05d5\7E\2\2\u05d5\u05d6\7V\2\2\u05d6\u05d7\7K\2\2\u05d7"+
		"\u05d8\7Q\2\2\u05d8\u05d9\7P\2\2\u05d9\u014c\3\2\2\2\u05da\u05db\7G\2"+
		"\2\u05db\u05dc\7Z\2\2\u05dc\u05dd\7V\2\2\u05dd\u05de\7G\2\2\u05de\u05df"+
		"\7P\2\2\u05df\u05e0\7F\2\2\u05e0\u05e1\7G\2\2\u05e1\u05e2\7F\2\2\u05e2"+
		"\u014e\3\2\2\2\u05e3\u05e4\7T\2\2\u05e4\u05e5\7G\2\2\u05e5\u05e6\7H\2"+
		"\2\u05e6\u05e7\7T\2\2\u05e7\u05e8\7G\2\2\u05e8\u05e9\7U\2\2\u05e9\u05ea"+
		"\7J\2\2\u05ea\u0150\3\2\2\2\u05eb\u05ec\7E\2\2\u05ec\u05ed\7N\2\2\u05ed"+
		"\u05ee\7G\2\2\u05ee\u05ef\7C\2\2\u05ef\u05f0\7T\2\2\u05f0\u0152\3\2\2"+
		"\2\u05f1\u05f2\7E\2\2\u05f2\u05f3\7C\2\2\u05f3\u05f4\7E\2\2\u05f4\u05f5"+
		"\7J\2\2\u05f5\u05f6\7G\2\2\u05f6\u0154\3\2\2\2\u05f7\u05f8\7W\2\2\u05f8"+
		"\u05f9\7P\2\2\u05f9\u05fa\7E\2\2\u05fa\u05fb\7C\2\2\u05fb\u05fc\7E\2\2"+
		"\u05fc\u05fd\7J\2\2\u05fd\u05fe\7G\2\2\u05fe\u0156\3\2\2\2\u05ff\u0600"+
		"\7N\2\2\u0600\u0601\7C\2\2\u0601\u0602\7\\\2\2\u0602\u0603\7[\2\2\u0603"+
		"\u0158\3\2\2\2\u0604\u0605\7H\2\2\u0605\u0606\7Q\2\2\u0606\u0607\7T\2"+
		"\2\u0607\u0608\7O\2\2\u0608\u0609\7C\2\2\u0609\u060a\7V\2\2\u060a\u060b"+
		"\7V\2\2\u060b\u060c\7G\2\2\u060c\u060d\7F\2\2\u060d\u015a\3\2\2\2\u060e"+
		"\u060f\7I\2\2\u060f\u0610\7N\2\2\u0610\u0611\7Q\2\2\u0611\u0612\7D\2\2"+
		"\u0612\u0613\7C\2\2\u0613\u0614\7N\2\2\u0614\u015c\3\2\2\2\u0615\u0616"+
		"\7V\2\2\u0616\u0617\7G\2\2\u0617\u0618\7O\2\2\u0618\u0619\7R\2\2\u0619"+
		"\u061a\7Q\2\2\u061a\u061b\7T\2\2\u061b\u061c\7C\2\2\u061c\u061d\7T\2\2"+
		"\u061d\u0623\7[\2\2\u061e\u061f\7V\2\2\u061f\u0620\7G\2\2\u0620\u0621"+
		"\7O\2\2\u0621\u0623\7R\2\2\u0622\u0615\3\2\2\2\u0622\u061e\3\2\2\2\u0623"+
		"\u015e\3\2\2\2\u0624\u0625\7Q\2\2\u0625\u0626\7R\2\2\u0626\u0627\7V\2"+
		"\2\u0627\u0628\7K\2\2\u0628\u0629\7Q\2\2\u0629\u062a\7P\2\2\u062a\u062b"+
		"\7U\2\2\u062b\u0160\3\2\2\2\u062c\u062d\7W\2\2\u062d\u062e\7P\2\2\u062e"+
		"\u062f\7U\2\2\u062f\u0630\7G\2\2\u0630\u0631\7V\2\2\u0631\u0162\3\2\2"+
		"\2\u0632\u0633\7V\2\2\u0633\u0634\7D\2\2\u0634\u0635\7N\2\2\u0635\u0636"+
		"\7R\2\2\u0636\u0637\7T\2\2\u0637\u0638\7Q\2\2\u0638\u0639\7R\2\2\u0639"+
		"\u063a\7G\2\2\u063a\u063b\7T\2\2\u063b\u063c\7V\2\2\u063c\u063d\7K\2\2"+
		"\u063d\u063e\7G\2\2\u063e\u063f\7U\2\2\u063f\u0164\3\2\2\2\u0640\u0641"+
		"\7F\2\2\u0641\u0642\7D\2\2\u0642\u0643\7R\2\2\u0643\u0644\7T\2\2\u0644"+
		"\u0645\7Q\2\2\u0645\u0646\7R\2\2\u0646\u0647\7G\2\2\u0647\u0648\7T\2\2"+
		"\u0648\u0649\7V\2\2\u0649\u064a\7K\2\2\u064a\u064b\7G\2\2\u064b\u064c"+
		"\7U\2\2\u064c\u0166\3\2\2\2\u064d\u064e\7D\2\2\u064e\u064f\7W\2\2\u064f"+
		"\u0650\7E\2\2\u0650\u0651\7M\2\2\u0651\u0652\7G\2\2\u0652\u0653\7V\2\2"+
		"\u0653\u0654\7U\2\2\u0654\u0168\3\2\2\2\u0655\u0656\7U\2\2\u0656\u0657"+
		"\7M\2\2\u0657\u0658\7G\2\2\u0658\u0659\7Y\2\2\u0659\u065a\7G\2\2\u065a"+
		"\u065b\7F\2\2\u065b\u016a\3\2\2\2\u065c\u065d\7U\2\2\u065d\u065e\7V\2"+
		"\2\u065e\u065f\7Q\2\2\u065f\u0660\7T\2\2\u0660\u0661\7G\2\2\u0661\u0662"+
		"\7F\2\2\u0662\u016c\3\2\2\2\u0663\u0664\7F\2\2\u0664\u0665\7K\2\2\u0665"+
		"\u0666\7T\2\2\u0666\u0667\7G\2\2\u0667\u0668\7E\2\2\u0668\u0669\7V\2\2"+
		"\u0669\u066a\7Q\2\2\u066a\u066b\7T\2\2\u066b\u066c\7K\2\2\u066c\u066d"+
		"\7G\2\2\u066d\u066e\7U\2\2\u066e\u016e\3\2\2\2\u066f\u0670\7N\2\2\u0670"+
		"\u0671\7Q\2\2\u0671\u0672\7E\2\2\u0672\u0673\7C\2\2\u0673\u0674\7V\2\2"+
		"\u0674\u0675\7K\2\2\u0675\u0676\7Q\2\2\u0676\u0677\7P\2\2\u0677\u0170"+
		"\3\2\2\2\u0678\u0679\7G\2\2\u0679\u067a\7Z\2\2\u067a\u067b\7E\2\2\u067b"+
		"\u067c\7J\2\2\u067c\u067d\7C\2\2\u067d\u067e\7P\2\2\u067e\u067f\7I\2\2"+
		"\u067f\u0680\7G\2\2\u0680\u0172\3\2\2\2\u0681\u0682\7C\2\2\u0682\u0683"+
		"\7T\2\2\u0683\u0684\7E\2\2\u0684\u0685\7J\2\2\u0685\u0686\7K\2\2\u0686"+
		"\u0687\7X\2\2\u0687\u0688\7G\2\2\u0688\u0174\3\2\2\2\u0689\u068a\7W\2"+
		"\2\u068a\u068b\7P\2\2\u068b\u068c\7C\2\2\u068c\u068d\7T\2\2\u068d\u068e"+
		"\7E\2\2\u068e\u068f\7J\2\2\u068f\u0690\7K\2\2\u0690\u0691\7X\2\2\u0691"+
		"\u0692\7G\2\2\u0692\u0176\3\2\2\2\u0693\u0694\7H\2\2\u0694\u0695\7K\2"+
		"\2\u0695\u0696\7N\2\2\u0696\u0697\7G\2\2\u0697\u0698\7H\2\2\u0698\u0699"+
		"\7Q\2\2\u0699\u069a\7T\2\2\u069a\u069b\7O\2\2\u069b\u069c\7C\2\2\u069c"+
		"\u069d\7V\2\2\u069d\u0178\3\2\2\2\u069e\u069f\7V\2\2\u069f\u06a0\7Q\2"+
		"\2\u06a0\u06a1\7W\2\2\u06a1\u06a2\7E\2\2\u06a2\u06a3\7J\2\2\u06a3\u017a"+
		"\3\2\2\2\u06a4\u06a5\7E\2\2\u06a5\u06a6\7Q\2\2\u06a6\u06a7\7O\2\2\u06a7"+
		"\u06a8\7R\2\2\u06a8\u06a9\7C\2\2\u06a9\u06aa\7E\2\2\u06aa\u06ab\7V\2\2"+
		"\u06ab\u017c\3\2\2\2\u06ac\u06ad\7E\2\2\u06ad\u06ae\7Q\2\2\u06ae\u06af"+
		"\7P\2\2\u06af\u06b0\7E\2\2\u06b0\u06b1\7C\2\2\u06b1\u06b2\7V\2\2\u06b2"+
		"\u06b3\7G\2\2\u06b3\u06b4\7P\2\2\u06b4\u06b5\7C\2\2\u06b5\u06b6\7V\2\2"+
		"\u06b6\u06b7\7G\2\2\u06b7\u017e\3\2\2\2\u06b8\u06b9\7E\2\2\u06b9\u06ba"+
		"\7J\2\2\u06ba\u06bb\7C\2\2\u06bb\u06bc\7P\2\2\u06bc\u06bd\7I\2\2\u06bd"+
		"\u06be\7G\2\2\u06be\u0180\3\2\2\2\u06bf\u06c0\7E\2\2\u06c0\u06c1\7C\2"+
		"\2\u06c1\u06c2\7U\2\2\u06c2\u06c3\7E\2\2\u06c3\u06c4\7C\2\2\u06c4\u06c5"+
		"\7F\2\2\u06c5\u06c6\7G\2\2\u06c6\u0182\3\2\2\2\u06c7\u06c8\7T\2\2\u06c8"+
		"\u06c9\7G\2\2\u06c9\u06ca\7U\2\2\u06ca\u06cb\7V\2\2\u06cb\u06cc\7T\2\2"+
		"\u06cc\u06cd\7K\2\2\u06cd\u06ce\7E\2\2\u06ce\u06cf\7V\2\2\u06cf\u0184"+
		"\3\2\2\2\u06d0\u06d1\7E\2\2\u06d1\u06d2\7N\2\2\u06d2\u06d3\7W\2\2\u06d3"+
		"\u06d4\7U\2\2\u06d4\u06d5\7V\2\2\u06d5\u06d6\7G\2\2\u06d6\u06d7\7T\2\2"+
		"\u06d7\u06d8\7G\2\2\u06d8\u06d9\7F\2\2\u06d9\u0186\3\2\2\2\u06da\u06db"+
		"\7U\2\2\u06db\u06dc\7Q\2\2\u06dc\u06dd\7T\2\2\u06dd\u06de\7V\2\2\u06de"+
		"\u06df\7G\2\2\u06df\u06e0\7F\2\2\u06e0\u0188\3\2\2\2\u06e1\u06e2\7R\2"+
		"\2\u06e2\u06e3\7W\2\2\u06e3\u06e4\7T\2\2\u06e4\u06e5\7I\2\2\u06e5\u06e6"+
		"\7G\2\2\u06e6\u018a\3\2\2\2\u06e7\u06e8\7K\2\2\u06e8\u06e9\7P\2\2\u06e9"+
		"\u06ea\7R\2\2\u06ea\u06eb\7W\2\2\u06eb\u06ec\7V\2\2\u06ec\u06ed\7H\2\2"+
		"\u06ed\u06ee\7Q\2\2\u06ee\u06ef\7T\2\2\u06ef\u06f0\7O\2\2\u06f0\u06f1"+
		"\7C\2\2\u06f1\u06f2\7V\2\2\u06f2\u018c\3\2\2\2\u06f3\u06f4\7Q\2\2\u06f4"+
		"\u06f5\7W\2\2\u06f5\u06f6\7V\2\2\u06f6\u06f7\7R\2\2\u06f7\u06f8\7W\2\2"+
		"\u06f8\u06f9\7V\2\2\u06f9\u06fa\7H\2\2\u06fa\u06fb\7Q\2\2\u06fb\u06fc"+
		"\7T\2\2\u06fc\u06fd\7O\2\2\u06fd\u06fe\7C\2\2\u06fe\u06ff\7V\2\2\u06ff"+
		"\u018e\3\2\2\2\u0700\u0701\7F\2\2\u0701\u0702\7C\2\2\u0702\u0703\7V\2"+
		"\2\u0703\u0704\7C\2\2\u0704\u0705\7D\2\2\u0705\u0706\7C\2\2\u0706\u0707"+
		"\7U\2\2\u0707\u070f\7G\2\2\u0708\u0709\7U\2\2\u0709\u070a\7E\2\2\u070a"+
		"\u070b\7J\2\2\u070b\u070c\7G\2\2\u070c\u070d\7O\2\2\u070d\u070f\7C\2\2"+
		"\u070e\u0700\3\2\2\2\u070e\u0708\3\2\2\2\u070f\u0190\3\2\2\2\u0710\u0711"+
		"\7F\2\2\u0711\u0712\7C\2\2\u0712\u0713\7V\2\2\u0713\u0714\7C\2\2\u0714"+
		"\u0715\7D\2\2\u0715\u0716\7C\2\2\u0716\u0717\7U\2\2\u0717\u0718\7G\2\2"+
		"\u0718\u0721\7U\2\2\u0719\u071a\7U\2\2\u071a\u071b\7E\2\2\u071b\u071c"+
		"\7J\2\2\u071c\u071d\7G\2\2\u071d\u071e\7O\2\2\u071e\u071f\7C\2\2\u071f"+
		"\u0721\7U\2\2\u0720\u0710\3\2\2\2\u0720\u0719\3\2\2\2\u0721\u0192\3\2"+
		"\2\2\u0722\u0723\7F\2\2\u0723\u0724\7H\2\2\u0724\u0725\7U\2\2\u0725\u0194"+
		"\3\2\2\2\u0726\u0727\7V\2\2\u0727\u0728\7T\2\2\u0728\u0729\7W\2\2\u0729"+
		"\u072a\7P\2\2\u072a\u072b\7E\2\2\u072b\u072c\7C\2\2\u072c\u072d\7V\2\2"+
		"\u072d\u072e\7G\2\2\u072e\u0196\3\2\2\2\u072f\u0730\7C\2\2\u0730\u0731"+
		"\7P\2\2\u0731\u0732\7C\2\2\u0732\u0733\7N\2\2\u0733\u0734\7[\2\2\u0734"+
		"\u0735\7\\\2\2\u0735\u0736\7G\2\2\u0736\u0198\3\2\2\2\u0737\u0738\7E\2"+
		"\2\u0738\u0739\7Q\2\2\u0739\u073a\7O\2\2\u073a\u073b\7R\2\2\u073b\u073c"+
		"\7W\2\2\u073c\u073d\7V\2\2\u073d\u073e\7G\2\2\u073e\u019a\3\2\2\2\u073f"+
		"\u0740\7N\2\2\u0740\u0741\7K\2\2\u0741\u0742\7U\2\2\u0742\u0743\7V\2\2"+
		"\u0743\u019c\3\2\2\2\u0744\u0745\7U\2\2\u0745\u0746\7V\2\2\u0746\u0747"+
		"\7C\2\2\u0747\u0748\7V\2\2\u0748\u0749\7K\2\2\u0749\u074a\7U\2\2\u074a"+
		"\u074b\7V\2\2\u074b\u074c\7K\2\2\u074c\u074d\7E\2\2\u074d\u074e\7U\2\2"+
		"\u074e\u019e\3\2\2\2\u074f\u0750\7R\2\2\u0750\u0751\7C\2\2\u0751\u0752"+
		"\7T\2\2\u0752\u0753\7V\2\2\u0753\u0754\7K\2\2\u0754\u0755\7V\2\2\u0755"+
		"\u0756\7K\2\2\u0756\u0757\7Q\2\2\u0757\u0758\7P\2\2\u0758\u0759\7G\2\2"+
		"\u0759\u075a\7F\2\2\u075a\u01a0\3\2\2\2\u075b\u075c\7G\2\2\u075c\u075d"+
		"\7Z\2\2\u075d\u075e\7V\2\2\u075e\u075f\7G\2\2\u075f\u0760\7T\2\2\u0760"+
		"\u0761\7P\2\2\u0761\u0762\7C\2\2\u0762\u0763\7N\2\2\u0763\u01a2\3\2\2"+
		"\2\u0764\u0765\7F\2\2\u0765\u0766\7G\2\2\u0766\u0767\7H\2\2\u0767\u0768"+
		"\7K\2\2\u0768\u0769\7P\2\2\u0769\u076a\7G\2\2\u076a\u076b\7F\2\2\u076b"+
		"\u01a4\3\2\2\2\u076c\u076d\7T\2\2\u076d\u076e\7G\2\2\u076e\u076f\7X\2"+
		"\2\u076f\u0770\7Q\2\2\u0770\u0771\7M\2\2\u0771\u0772\7G\2\2\u0772\u01a6"+
		"\3\2\2\2\u0773\u0774\7I\2\2\u0774\u0775\7T\2\2\u0775\u0776\7C\2\2\u0776"+
		"\u0777\7P\2\2\u0777\u0778\7V\2\2\u0778\u01a8\3\2\2\2\u0779\u077a\7N\2"+
		"\2\u077a\u077b\7Q\2\2\u077b\u077c\7E\2\2\u077c\u077d\7M\2\2\u077d\u01aa"+
		"\3\2\2\2\u077e\u077f\7W\2\2\u077f\u0780\7P\2\2\u0780\u0781\7N\2\2\u0781"+
		"\u0782\7Q\2\2\u0782\u0783\7E\2\2\u0783\u0784\7M\2\2\u0784\u01ac\3\2\2"+
		"\2\u0785\u0786\7O\2\2\u0786\u0787\7U\2\2\u0787\u0788\7E\2\2\u0788\u0789"+
		"\7M\2\2\u0789\u01ae\3\2\2\2\u078a\u078b\7T\2\2\u078b\u078c\7G\2\2\u078c"+
		"\u078d\7R\2\2\u078d\u078e\7C\2\2\u078e\u078f\7K\2\2\u078f\u0790\7T\2\2"+
		"\u0790\u01b0\3\2\2\2\u0791\u0792\7T\2\2\u0792\u0793\7G\2\2\u0793\u0794"+
		"\7E\2\2\u0794\u0795\7Q\2\2\u0795\u0796\7X\2\2\u0796\u0797\7G\2\2\u0797"+
		"\u0798\7T\2\2\u0798\u01b2\3\2\2\2\u0799\u079a\7G\2\2\u079a\u079b\7Z\2"+
		"\2\u079b\u079c\7R\2\2\u079c\u079d\7Q\2\2\u079d\u079e\7T\2\2\u079e\u079f"+
		"\7V\2\2\u079f\u01b4\3\2\2\2\u07a0\u07a1\7K\2\2\u07a1\u07a2\7O\2\2\u07a2"+
		"\u07a3\7R\2\2\u07a3\u07a4\7Q\2\2\u07a4\u07a5\7T\2\2\u07a5\u07a6\7V\2\2"+
		"\u07a6\u01b6\3\2\2\2\u07a7\u07a8\7N\2\2\u07a8\u07a9\7Q\2\2\u07a9\u07aa"+
		"\7C\2\2\u07aa\u07ab\7F\2\2\u07ab\u01b8\3\2\2\2\u07ac\u07ad\7T\2\2\u07ad"+
		"\u07ae\7Q\2\2\u07ae\u07af\7N\2\2\u07af\u07b0\7G\2\2\u07b0\u01ba\3\2\2"+
		"\2\u07b1\u07b2\7T\2\2\u07b2\u07b3\7Q\2\2\u07b3\u07b4\7N\2\2\u07b4\u07b5"+
		"\7G\2\2\u07b5\u07b6\7U\2\2\u07b6\u01bc\3\2\2\2\u07b7\u07b8\7E\2\2\u07b8"+
		"\u07b9\7Q\2\2\u07b9\u07ba\7O\2\2\u07ba\u07bb\7R\2\2\u07bb\u07bc\7C\2\2"+
		"\u07bc\u07bd\7E\2\2\u07bd\u07be\7V\2\2\u07be\u07bf\7K\2\2\u07bf\u07c0"+
		"\7Q\2\2\u07c0\u07c1\7P\2\2\u07c1\u07c2\7U\2\2\u07c2\u01be\3\2\2\2\u07c3"+
		"\u07c4\7R\2\2\u07c4\u07c5\7T\2\2\u07c5\u07c6\7K\2\2\u07c6\u07c7\7P\2\2"+
		"\u07c7\u07c8\7E\2\2\u07c8\u07c9\7K\2\2\u07c9\u07ca\7R\2\2\u07ca\u07cb"+
		"\7C\2\2\u07cb\u07cc\7N\2\2\u07cc\u07cd\7U\2\2\u07cd\u01c0\3\2\2\2\u07ce"+
		"\u07cf\7V\2\2\u07cf\u07d0\7T\2\2\u07d0\u07d1\7C\2\2\u07d1\u07d2\7P\2\2"+
		"\u07d2\u07d3\7U\2\2\u07d3\u07d4\7C\2\2\u07d4\u07d5\7E\2\2\u07d5\u07d6"+
		"\7V\2\2\u07d6\u07d7\7K\2\2\u07d7\u07d8\7Q\2\2\u07d8\u07d9\7P\2\2\u07d9"+
		"\u07da\7U\2\2\u07da\u01c2\3\2\2\2\u07db\u07dc\7K\2\2\u07dc\u07dd\7P\2"+
		"\2\u07dd\u07de\7F\2\2\u07de\u07df\7G\2\2\u07df\u07e0\7Z\2\2\u07e0\u01c4"+
		"\3\2\2\2\u07e1\u07e2\7K\2\2\u07e2\u07e3\7P\2\2\u07e3\u07e4\7F\2\2\u07e4"+
		"\u07e5\7G\2\2\u07e5\u07e6\7Z\2\2\u07e6\u07e7\7G\2\2\u07e7\u07e8\7U\2\2"+
		"\u07e8\u01c6\3\2\2\2\u07e9\u07ea\7N\2\2\u07ea\u07eb\7Q\2\2\u07eb\u07ec"+
		"\7E\2\2\u07ec\u07ed\7M\2\2\u07ed\u07ee\7U\2\2\u07ee\u01c8\3\2\2\2\u07ef"+
		"\u07f0\7Q\2\2\u07f0\u07f1\7R\2\2\u07f1\u07f2\7V\2\2\u07f2\u07f3\7K\2\2"+
		"\u07f3\u07f4\7Q\2\2\u07f4\u07f5\7P\2\2\u07f5\u01ca\3\2\2\2\u07f6\u07f7"+
		"\7C\2\2\u07f7\u07f8\7P\2\2\u07f8\u07f9\7V\2\2\u07f9\u07fa\7K\2\2\u07fa"+
		"\u01cc\3\2\2\2\u07fb\u07fc\7N\2\2\u07fc\u07fd\7Q\2\2\u07fd\u07fe\7E\2"+
		"\2\u07fe\u07ff\7C\2\2\u07ff\u0800\7N\2\2\u0800\u01ce\3\2\2\2\u0801\u0802"+
		"\7K\2\2\u0802\u0803\7P\2\2\u0803\u0804\7R\2\2\u0804\u0805\7C\2\2\u0805"+
		"\u0806\7V\2\2\u0806\u0807\7J\2\2\u0807\u01d0\3\2\2\2\u0808\u0809\7E\2"+
		"\2\u0809\u080a\7W\2\2\u080a\u080b\7T\2\2\u080b\u080c\7T\2\2\u080c\u080d"+
		"\7G\2\2\u080d\u080e\7P\2\2\u080e\u080f\7V\2\2\u080f\u0810\7a\2\2\u0810"+
		"\u0811\7F\2\2\u0811\u0812\7C\2\2\u0812\u0813\7V\2\2\u0813\u0814\7G\2\2"+
		"\u0814\u01d2\3\2\2\2\u0815\u0816\7E\2\2\u0816\u0817\7W\2\2\u0817\u0818"+
		"\7T\2\2\u0818\u0819\7T\2\2\u0819\u081a\7G\2\2\u081a\u081b\7P\2\2\u081b"+
		"\u081c\7V\2\2\u081c\u081d\7a\2\2\u081d\u081e\7V\2\2\u081e\u081f\7K\2\2"+
		"\u081f\u0820\7O\2\2\u0820\u0821\7G\2\2\u0821\u0822\7U\2\2\u0822\u0823"+
		"\7V\2\2\u0823\u0824\7C\2\2\u0824\u0825\7O\2\2\u0825\u0826\7R\2\2\u0826"+
		"\u01d4\3\2\2\2\u0827\u082d\7)\2\2\u0828\u082c\n\2\2\2\u0829\u082a\7^\2"+
		"\2\u082a\u082c\13\2\2\2\u082b\u0828\3\2\2\2\u082b\u0829\3\2\2\2\u082c"+
		"\u082f\3\2\2\2\u082d\u082b\3\2\2\2\u082d\u082e\3\2\2\2\u082e\u0830\3\2"+
		"\2\2\u082f\u082d\3\2\2\2\u0830\u083c\7)\2\2\u0831\u0837\7$\2\2\u0832\u0836"+
		"\n\3\2\2\u0833\u0834\7^\2\2\u0834\u0836\13\2\2\2\u0835\u0832\3\2\2\2\u0835"+
		"\u0833\3\2\2\2\u0836\u0839\3\2\2\2\u0837\u0835\3\2\2\2\u0837\u0838\3\2"+
		"\2\2\u0838\u083a\3\2\2\2\u0839\u0837\3\2\2\2\u083a\u083c\7$\2\2\u083b"+
		"\u0827\3\2\2\2\u083b\u0831\3\2\2\2\u083c\u01d6\3\2\2\2\u083d\u083f\5\u01ef"+
		"\u00f8\2\u083e\u083d\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u083e\3\2\2\2\u0840"+
		"\u0841\3\2\2\2\u0841\u0842\3\2\2\2\u0842\u0843\7N\2\2\u0843\u01d8\3\2"+
		"\2\2\u0844\u0846\5\u01ef\u00f8\2\u0845\u0844\3\2\2\2\u0846\u0847\3\2\2"+
		"\2\u0847\u0845\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084a"+
		"\7U\2\2\u084a\u01da\3\2\2\2\u084b\u084d\5\u01ef\u00f8\2\u084c\u084b\3"+
		"\2\2\2\u084d\u084e\3\2\2\2\u084e\u084c\3\2\2\2\u084e\u084f\3\2\2\2\u084f"+
		"\u0850\3\2\2\2\u0850\u0851\7[\2\2\u0851\u01dc\3\2\2\2\u0852\u0854\5\u01ef"+
		"\u00f8\2\u0853\u0852\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0853\3\2\2\2\u0855"+
		"\u0856\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0858\t\4\2\2\u0858\u01de\3\2"+
		"\2\2\u0859\u085b\5\u01ef\u00f8\2\u085a\u0859\3\2\2\2\u085b\u085c\3\2\2"+
		"\2\u085c\u085a\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u01e0\3\2\2\2\u085e\u0860"+
		"\5\u01ef\u00f8\2\u085f\u085e\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u085f\3"+
		"\2\2\2\u0861\u0862\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0864\5\u01ed\u00f7"+
		"\2\u0864\u086c\3\2\2\2\u0865\u0867\5\u01eb\u00f6\2\u0866\u0868\5\u01ed"+
		"\u00f7\2\u0867\u0866\3\2\2\2\u0867\u0868\3\2\2\2\u0868\u0869\3\2\2\2\u0869"+
		"\u086a\6\u00f1\2\2\u086a\u086c\3\2\2\2\u086b\u085f\3\2\2\2\u086b\u0865"+
		"\3\2\2\2\u086c\u01e2\3\2\2\2\u086d\u086f\5\u01ef\u00f8\2\u086e\u086d\3"+
		"\2\2\2\u086f\u0870\3\2\2\2\u0870\u086e\3\2\2\2\u0870\u0871\3\2\2\2\u0871"+
		"\u0873\3\2\2\2\u0872\u0874\5\u01ed\u00f7\2\u0873\u0872\3\2\2\2\u0873\u0874"+
		"\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0876\7F\2\2\u0876\u087f\3\2\2\2\u0877"+
		"\u0879\5\u01eb\u00f6\2\u0878\u087a\5\u01ed\u00f7\2\u0879\u0878\3\2\2\2"+
		"\u0879\u087a\3\2\2\2\u087a\u087b\3\2\2\2\u087b\u087c\7F\2\2\u087c\u087d"+
		"\6\u00f2\3\2\u087d\u087f\3\2\2\2\u087e\u086e\3\2\2\2\u087e\u0877\3\2\2"+
		"\2\u087f\u01e4\3\2\2\2\u0880\u0882\5\u01ef\u00f8\2\u0881\u0880\3\2\2\2"+
		"\u0882\u0883\3\2\2\2\u0883\u0881\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0886"+
		"\3\2\2\2\u0885\u0887\5\u01ed\u00f7\2\u0886\u0885\3\2\2\2\u0886\u0887\3"+
		"\2\2\2\u0887\u0888\3\2\2\2\u0888\u0889\7D\2\2\u0889\u088a\7F\2\2\u088a"+
		"\u0895\3\2\2\2\u088b\u088d\5\u01eb\u00f6\2\u088c\u088e\5\u01ed\u00f7\2"+
		"\u088d\u088c\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u0890"+
		"\7D\2\2\u0890\u0891\7F\2\2\u0891\u0892\3\2\2\2\u0892\u0893\6\u00f3\4\2"+
		"\u0893\u0895\3\2\2\2\u0894\u0881\3\2\2\2\u0894\u088b\3\2\2\2\u0895\u01e6"+
		"\3\2\2\2\u0896\u089a\5\u01f1\u00f9\2\u0897\u089a\5\u01ef\u00f8\2\u0898"+
		"\u089a\7a\2\2\u0899\u0896\3\2\2\2\u0899\u0897\3\2\2\2\u0899\u0898\3\2"+
		"\2\2\u089a\u089b\3\2\2\2\u089b\u0899\3\2\2\2\u089b\u089c\3\2\2\2\u089c"+
		"\u01e8\3\2\2\2\u089d\u08a3\7b\2\2\u089e\u08a2\n\5\2\2\u089f\u08a0\7b\2"+
		"\2\u08a0\u08a2\7b\2\2\u08a1\u089e\3\2\2\2\u08a1\u089f\3\2\2\2\u08a2\u08a5"+
		"\3\2\2\2\u08a3\u08a1\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a6\3\2\2\2\u08a5"+
		"\u08a3\3\2\2\2\u08a6\u08a7\7b\2\2\u08a7\u01ea\3\2\2\2\u08a8\u08aa\5\u01ef"+
		"\u00f8\2\u08a9\u08a8\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08a9\3\2\2\2\u08ab"+
		"\u08ac\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08b1\7\60\2\2\u08ae\u08b0\5"+
		"\u01ef\u00f8\2\u08af\u08ae\3\2\2\2\u08b0\u08b3\3\2\2\2\u08b1\u08af\3\2"+
		"\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08bb\3\2\2\2\u08b3\u08b1\3\2\2\2\u08b4"+
		"\u08b6\7\60\2\2\u08b5\u08b7\5\u01ef\u00f8\2\u08b6\u08b5\3\2\2\2\u08b7"+
		"\u08b8\3\2\2\2\u08b8\u08b6\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08bb\3\2"+
		"\2\2\u08ba\u08a9\3\2\2\2\u08ba\u08b4\3\2\2\2\u08bb\u01ec\3\2\2\2\u08bc"+
		"\u08be\7G\2\2\u08bd\u08bf\t\6\2\2\u08be\u08bd\3\2\2\2\u08be\u08bf\3\2"+
		"\2\2\u08bf\u08c1\3\2\2\2\u08c0\u08c2\5\u01ef\u00f8\2\u08c1\u08c0\3\2\2"+
		"\2\u08c2\u08c3\3\2\2\2\u08c3\u08c1\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u01ee"+
		"\3\2\2\2\u08c5\u08c6\t\7\2\2\u08c6\u01f0\3\2\2\2\u08c7\u08c8\t\b\2\2\u08c8"+
		"\u01f2\3\2\2\2\u08c9\u08ca\7/\2\2\u08ca\u08cb\7/\2\2\u08cb\u08cf\3\2\2"+
		"\2\u08cc\u08ce\n\t\2\2\u08cd\u08cc\3\2\2\2\u08ce\u08d1\3\2\2\2\u08cf\u08cd"+
		"\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d3\3\2\2\2\u08d1\u08cf\3\2\2\2\u08d2"+
		"\u08d4\7\17\2\2\u08d3\u08d2\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d6\3"+
		"\2\2\2\u08d5\u08d7\7\f\2\2\u08d6\u08d5\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7"+
		"\u08d8\3\2\2\2\u08d8\u08d9\b\u00fa\2\2\u08d9\u01f4\3\2\2\2\u08da\u08db"+
		"\7\61\2\2\u08db\u08dc\7,\2\2\u08dc\u08dd\7,\2\2\u08dd\u08de\7\61\2\2\u08de"+
		"\u08df\3\2\2\2\u08df\u08e0\b\u00fb\2\2\u08e0\u01f6\3\2\2\2\u08e1\u08e2"+
		"\7\61\2\2\u08e2\u08e3\7,\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e8\n\n\2\2\u08e5"+
		"\u08e7\13\2\2\2\u08e6\u08e5\3\2\2\2\u08e7\u08ea\3\2\2\2\u08e8\u08e9\3"+
		"\2\2\2\u08e8\u08e6\3\2\2\2\u08e9\u08eb\3\2\2\2\u08ea\u08e8\3\2\2\2\u08eb"+
		"\u08ec\7,\2\2\u08ec\u08ed\7\61\2\2\u08ed\u08ee\3\2\2\2\u08ee\u08ef\b\u00fc"+
		"\2\2\u08ef\u01f8\3\2\2\2\u08f0\u08f2\t\13\2\2\u08f1\u08f0\3\2\2\2\u08f2"+
		"\u08f3\3\2\2\2\u08f3\u08f1\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u08f5\3\2"+
		"\2\2\u08f5\u08f6\b\u00fd\2\2\u08f6\u01fa\3\2\2\2\u08f7\u08f8\13\2\2\2"+
		"\u08f8\u01fc\3\2\2\2/\2\u027f\u02a3\u04d3\u04e5\u04ed\u0622\u070e\u0720"+
		"\u082b\u082d\u0835\u0837\u083b\u0840\u0847\u084e\u0855\u085c\u0861\u0867"+
		"\u086b\u0870\u0873\u0879\u087e\u0883\u0886\u088d\u0894\u0899\u089b\u08a1"+
		"\u08a3\u08ab\u08b1\u08b8\u08ba\u08be\u08c3\u08cf\u08d3\u08d6\u08e8\u08f3"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}