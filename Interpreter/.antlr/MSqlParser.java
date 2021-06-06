// Generated from d:\University\sophomore\Lower\DataBase\Lab\MiniSQL\ours\Interpreter\MSql.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, SPACE=20, COMMENT_INPUT=21, LINE_COMMENT=22, AS=23, 
		CREATE=24, SELECT=25, FROM=26, TABLE=27, MAX=28, SUM=29, AVG=30, MIN=31, 
		COUNT=32, ALL=33, DISTINCT=34, WHERE=35, GROUP=36, BY=37, ORDER=38, HAVING=39, 
		NOT=40, IS=41, TRUE=42, FALSE=43, UNKNOWN=44, BETWEEN=45, AND=46, IN=47, 
		OR=48, ASC=49, DESC=50, LIMIT=51, OFFSET=52, CONSTRAINT=53, PRIMARY=54, 
		KEY=55, DEFAULT=56, CHECK=57, FOREIGN=58, NULL_LITERAL=59, INDEX=60, UNIQUE=61, 
		DROP=62, ON=63, INSERT=64, INTO=65, VALUES=66, VALUE=67, ANY=68, SOME=69, 
		BINARY=70, COLLATE=71, SOUNDS=72, LIKE=73, REGEXP=74, ESCAPE=75, RLIKE=76, 
		MEMBER=77, OF=78, ROW=79, EXISTS=80, INTERVAL=81, DIV=82, MOD=83, DELETE=84, 
		PARTITION=85, USING=86, LOCAL_ID=87, GLOBAL_ID=88, BIT_STRING=89, INT=90, 
		CHAR=91, FLOAT=92, SIGNED=93, UNSIGNED=94, ZEROFILL=95, ARMSCII8=96, ASCII=97, 
		BIG5=98, CP1250=99, CP1251=100, CP1256=101, CP1257=102, CP850=103, CP852=104, 
		CP866=105, CP932=106, DEC8=107, EUCJPMS=108, EUCKR=109, GB2312=110, GBK=111, 
		GEOSTD8=112, GREEK=113, HEBREW=114, HP8=115, KEYBCS2=116, KOI8R=117, KOI8U=118, 
		LATIN1=119, LATIN2=120, LATIN5=121, LATIN7=122, MACCE=123, MACROMAN=124, 
		SJIS=125, SWE7=126, TIS620=127, UCS2=128, UJIS=129, UTF16=130, UTF16LE=131, 
		UTF32=132, UTF8=133, UTF8MB3=134, UTF8MB4=135, ID=136, DOT_ID=137, TEXT_STRING=138, 
		REVERSE_QUOTE_ID=139, REAL_LITERAL=140, DECIMAL_LITERAL=141, HEXADECIMAL_LITERAL=142, 
		NULL_SPEC_LITERAL=143, START_NATIONAL_STRING_LITERAL=144, STRING_LITERAL=145, 
		STRING_CHARSET_NAME=146;
	public static final int
		RULE_sqlStatements = 0, RULE_createTable = 1, RULE_createDefinitions = 2, 
		RULE_createDefinition = 3, RULE_columnDefinition = 4, RULE_dataType = 5, 
		RULE_lengthOneDimension = 6, RULE_lengthTwoOptionalDimension = 7, RULE_columnConstraint = 8, 
		RULE_tableConstraint = 9, RULE_dropTable = 10, RULE_createIndex = 11, 
		RULE_indexColumnNames = 12, RULE_indexColumnName = 13, RULE_dropIndex = 14, 
		RULE_selectStatement = 15, RULE_selectElements = 16, RULE_selectElement = 17, 
		RULE_tableSources = 18, RULE_whereClause = 19, RULE_fromClause = 20, RULE_groupByClause = 21, 
		RULE_groupByItem = 22, RULE_havingClause = 23, RULE_orderByClause = 24, 
		RULE_orderByExpression = 25, RULE_limitClause = 26, RULE_logicalOperator = 27, 
		RULE_comparisonOperator = 28, RULE_bitOperator = 29, RULE_mathOperator = 30, 
		RULE_jsonOperator = 31, RULE_value = 32, RULE_decimalLiteral = 33, RULE_hexadecimalLiteral = 34, 
		RULE_booleanLiteral = 35, RULE_textLiteral = 36, RULE_stringLiteral = 37, 
		RULE_collationName = 38, RULE_nullNotnull = 39, RULE_defaultValue = 40, 
		RULE_unaryOperator = 41, RULE_constant = 42, RULE_fullColumnName = 43, 
		RULE_functionCall = 44, RULE_aggregateWindowedFunction = 45, RULE_functionArg = 46, 
		RULE_functionArgs = 47, RULE_uid = 48, RULE_fullId = 49, RULE_dottedId = 50, 
		RULE_tableName = 51, RULE_tables = 52, RULE_insertStatement = 53, RULE_uidList = 54, 
		RULE_insertStatementValue = 55, RULE_expressions = 56, RULE_expression = 57, 
		RULE_predicate = 58, RULE_expressionAtom = 59, RULE_mysqlVariable = 60, 
		RULE_expressionsWithDefaults = 61, RULE_expressionOrDefault = 62, RULE_deleteStatement = 63, 
		RULE_singleDeleteStatement = 64, RULE_multipleDeleteStatement = 65, RULE_limitClauseAtom = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"sqlStatements", "createTable", "createDefinitions", "createDefinition", 
			"columnDefinition", "dataType", "lengthOneDimension", "lengthTwoOptionalDimension", 
			"columnConstraint", "tableConstraint", "dropTable", "createIndex", "indexColumnNames", 
			"indexColumnName", "dropIndex", "selectStatement", "selectElements", 
			"selectElement", "tableSources", "whereClause", "fromClause", "groupByClause", 
			"groupByItem", "havingClause", "orderByClause", "orderByExpression", 
			"limitClause", "logicalOperator", "comparisonOperator", "bitOperator", 
			"mathOperator", "jsonOperator", "value", "decimalLiteral", "hexadecimalLiteral", 
			"booleanLiteral", "textLiteral", "stringLiteral", "collationName", "nullNotnull", 
			"defaultValue", "unaryOperator", "constant", "fullColumnName", "functionCall", 
			"aggregateWindowedFunction", "functionArg", "functionArgs", "uid", "fullId", 
			"dottedId", "tableName", "tables", "insertStatement", "uidList", "insertStatementValue", 
			"expressions", "expression", "predicate", "expressionAtom", "mysqlVariable", 
			"expressionsWithDefaults", "expressionOrDefault", "deleteStatement", 
			"singleDeleteStatement", "multipleDeleteStatement", "limitClauseAtom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "','", "')'", "'*'", "'&'", "'|'", "'='", "'>'", 
			"'<'", "'!'", "'^'", "'/'", "'%'", "'+'", "'-'", "'--'", "'~'", "'.'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'ARMSCII8'", "'ASCII'", "'BIG5'", "'CP1250'", 
			"'CP1251'", "'CP1256'", "'CP1257'", "'CP850'", "'CP852'", "'CP866'", 
			"'CP932'", "'DEC8'", "'EUCJPMS'", "'EUCKR'", "'GB2312'", "'GBK'", "'GEOSTD8'", 
			"'GREEK'", "'HEBREW'", "'HP8'", "'KEYBCS2'", "'KOI8R'", "'KOI8U'", "'LATIN1'", 
			"'LATIN2'", "'LATIN5'", "'LATIN7'", "'MACCE'", "'MACROMAN'", "'SJIS'", 
			"'SWE7'", "'TIS620'", "'UCS2'", "'UJIS'", "'UTF16'", "'UTF16LE'", "'UTF32'", 
			"'UTF8'", "'UTF8MB3'", "'UTF8MB4'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "SPACE", "COMMENT_INPUT", 
			"LINE_COMMENT", "AS", "CREATE", "SELECT", "FROM", "TABLE", "MAX", "SUM", 
			"AVG", "MIN", "COUNT", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", "ORDER", 
			"HAVING", "NOT", "IS", "TRUE", "FALSE", "UNKNOWN", "BETWEEN", "AND", 
			"IN", "OR", "ASC", "DESC", "LIMIT", "OFFSET", "CONSTRAINT", "PRIMARY", 
			"KEY", "DEFAULT", "CHECK", "FOREIGN", "NULL_LITERAL", "INDEX", "UNIQUE", 
			"DROP", "ON", "INSERT", "INTO", "VALUES", "VALUE", "ANY", "SOME", "BINARY", 
			"COLLATE", "SOUNDS", "LIKE", "REGEXP", "ESCAPE", "RLIKE", "MEMBER", "OF", 
			"ROW", "EXISTS", "INTERVAL", "DIV", "MOD", "DELETE", "PARTITION", "USING", 
			"LOCAL_ID", "GLOBAL_ID", "BIT_STRING", "INT", "CHAR", "FLOAT", "SIGNED", 
			"UNSIGNED", "ZEROFILL", "ARMSCII8", "ASCII", "BIG5", "CP1250", "CP1251", 
			"CP1256", "CP1257", "CP850", "CP852", "CP866", "CP932", "DEC8", "EUCJPMS", 
			"EUCKR", "GB2312", "GBK", "GEOSTD8", "GREEK", "HEBREW", "HP8", "KEYBCS2", 
			"KOI8R", "KOI8U", "LATIN1", "LATIN2", "LATIN5", "LATIN7", "MACCE", "MACROMAN", 
			"SJIS", "SWE7", "TIS620", "UCS2", "UJIS", "UTF16", "UTF16LE", "UTF32", 
			"UTF8", "UTF8MB3", "UTF8MB4", "ID", "DOT_ID", "TEXT_STRING", "REVERSE_QUOTE_ID", 
			"REAL_LITERAL", "DECIMAL_LITERAL", "HEXADECIMAL_LITERAL", "NULL_SPEC_LITERAL", 
			"START_NATIONAL_STRING_LITERAL", "STRING_LITERAL", "STRING_CHARSET_NAME"
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
	public String getGrammarFileName() { return "MSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SqlStatementsContext extends ParserRuleContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public SqlStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatements; }
	}

	public final SqlStatementsContext sqlStatements() throws RecognitionException {
		SqlStatementsContext _localctx = new SqlStatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sqlStatements);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				createTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				createIndex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				dropTable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				dropIndex();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				insertStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				deleteStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				selectStatement();
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(MSqlParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public CreateDefinitionsContext createDefinitions() {
			return getRuleContext(CreateDefinitionsContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(CREATE);
			setState(144);
			match(TABLE);
			setState(145);
			tableName();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(146);
				createDefinitions();
				}
			}

			setState(149);
			match(T__0);
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

	public static class CreateDefinitionsContext extends ParserRuleContext {
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
		}
		public CreateDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitions; }
	}

	public final CreateDefinitionsContext createDefinitions() throws RecognitionException {
		CreateDefinitionsContext _localctx = new CreateDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__1);
			setState(152);
			createDefinition();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(153);
				match(T__2);
				setState(154);
				createDefinition();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(T__3);
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

	public static class CreateDefinitionContext extends ParserRuleContext {
		public CreateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition; }
	 
		public CreateDefinitionContext() { }
		public void copyFrom(CreateDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnDeclarationContext extends CreateDefinitionContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ColumnDeclarationContext(CreateDefinitionContext ctx) { copyFrom(ctx); }
	}
	public static class ConstraintDeclarationContext extends CreateDefinitionContext {
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public ConstraintDeclarationContext(CreateDefinitionContext ctx) { copyFrom(ctx); }
	}

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createDefinition);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ColumnDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				uid();
				setState(163);
				columnDefinition();
				}
				break;
			case T__2:
			case T__3:
			case CONSTRAINT:
			case PRIMARY:
			case CHECK:
			case UNIQUE:
				_localctx = new ConstraintDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				tableConstraint();
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			dataType();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << CONSTRAINT) | (1L << PRIMARY) | (1L << KEY) | (1L << DEFAULT) | (1L << CHECK) | (1L << NULL_LITERAL) | (1L << UNIQUE))) != 0) || _la==NULL_SPEC_LITERAL) {
				{
				{
				setState(169);
				columnConstraint();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(MSqlParser.CHAR, 0); }
		public LengthOneDimensionContext lengthOneDimension() {
			return getRuleContext(LengthOneDimensionContext.class,0);
		}
		public TerminalNode INT() { return getToken(MSqlParser.INT, 0); }
		public TerminalNode ZEROFILL() { return getToken(MSqlParser.ZEROFILL, 0); }
		public TerminalNode SIGNED() { return getToken(MSqlParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(MSqlParser.UNSIGNED, 0); }
		public TerminalNode FLOAT() { return getToken(MSqlParser.FLOAT, 0); }
		public LengthTwoOptionalDimensionContext lengthTwoOptionalDimension() {
			return getRuleContext(LengthTwoOptionalDimensionContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dataType);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(CHAR);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(176);
					lengthOneDimension();
					}
				}

				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(INT);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(180);
					lengthOneDimension();
					}
				}

				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGNED || _la==UNSIGNED) {
					{
					setState(183);
					_la = _input.LA(1);
					if ( !(_la==SIGNED || _la==UNSIGNED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(186);
					match(ZEROFILL);
					}
				}

				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(FLOAT);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(190);
					lengthTwoOptionalDimension();
					}
				}

				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGNED || _la==UNSIGNED) {
					{
					setState(193);
					_la = _input.LA(1);
					if ( !(_la==SIGNED || _la==UNSIGNED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(196);
					match(ZEROFILL);
					}
				}

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

	public static class LengthOneDimensionContext extends ParserRuleContext {
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public LengthOneDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthOneDimension; }
	}

	public final LengthOneDimensionContext lengthOneDimension() throws RecognitionException {
		LengthOneDimensionContext _localctx = new LengthOneDimensionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lengthOneDimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__1);
			setState(202);
			decimalLiteral();
			setState(203);
			match(T__3);
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

	public static class LengthTwoOptionalDimensionContext extends ParserRuleContext {
		public List<DecimalLiteralContext> decimalLiteral() {
			return getRuleContexts(DecimalLiteralContext.class);
		}
		public DecimalLiteralContext decimalLiteral(int i) {
			return getRuleContext(DecimalLiteralContext.class,i);
		}
		public LengthTwoOptionalDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthTwoOptionalDimension; }
	}

	public final LengthTwoOptionalDimensionContext lengthTwoOptionalDimension() throws RecognitionException {
		LengthTwoOptionalDimensionContext _localctx = new LengthTwoOptionalDimensionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lengthTwoOptionalDimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__1);
			setState(206);
			decimalLiteral();
			setState(207);
			match(T__2);
			setState(208);
			decimalLiteral();
			setState(209);
			match(T__3);
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

	public static class ColumnConstraintContext extends ParserRuleContext {
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	 
		public ColumnConstraintContext() { }
		public void copyFrom(ColumnConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryKeyColumnConstraintContext extends ColumnConstraintContext {
		public TerminalNode KEY() { return getToken(MSqlParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(MSqlParser.PRIMARY, 0); }
		public PrimaryKeyColumnConstraintContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
	}
	public static class CheckColumnConstraintContext extends ColumnConstraintContext {
		public UidContext name;
		public TerminalNode CHECK() { return getToken(MSqlParser.CHECK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(MSqlParser.CONSTRAINT, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public CheckColumnConstraintContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
	}
	public static class UniqueKeyColumnConstraintContext extends ColumnConstraintContext {
		public TerminalNode UNIQUE() { return getToken(MSqlParser.UNIQUE, 0); }
		public TerminalNode KEY() { return getToken(MSqlParser.KEY, 0); }
		public UniqueKeyColumnConstraintContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
	}
	public static class NullColumnConstraintContext extends ColumnConstraintContext {
		public NullNotnullContext nullNotnull() {
			return getRuleContext(NullNotnullContext.class,0);
		}
		public NullColumnConstraintContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
	}
	public static class DefaultColumnConstraintContext extends ColumnConstraintContext {
		public TerminalNode DEFAULT() { return getToken(MSqlParser.DEFAULT, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public DefaultColumnConstraintContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnConstraint);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL_LITERAL:
			case NULL_SPEC_LITERAL:
				_localctx = new NullColumnConstraintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				nullNotnull();
				}
				break;
			case DEFAULT:
				_localctx = new DefaultColumnConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(DEFAULT);
				setState(213);
				defaultValue();
				}
				break;
			case PRIMARY:
			case KEY:
				_localctx = new PrimaryKeyColumnConstraintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIMARY) {
					{
					setState(214);
					match(PRIMARY);
					}
				}

				setState(217);
				match(KEY);
				}
				break;
			case UNIQUE:
				_localctx = new UniqueKeyColumnConstraintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(UNIQUE);
				setState(220);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(219);
					match(KEY);
					}
					break;
				}
				}
				break;
			case CONSTRAINT:
			case CHECK:
				_localctx = new CheckColumnConstraintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(222);
					match(CONSTRAINT);
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(223);
						((CheckColumnConstraintContext)_localctx).name = uid();
						}
					}

					}
				}

				setState(228);
				match(CHECK);
				setState(229);
				match(T__1);
				setState(230);
				expression(0);
				setState(231);
				match(T__3);
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

	public static class TableConstraintContext extends ParserRuleContext {
		public UidContext name;
		public TerminalNode PRIMARY() { return getToken(MSqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(MSqlParser.KEY, 0); }
		public List<UidContext> uid() {
			return getRuleContexts(UidContext.class);
		}
		public UidContext uid(int i) {
			return getRuleContext(UidContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(MSqlParser.CONSTRAINT, 0); }
		public TerminalNode UNIQUE() { return getToken(MSqlParser.UNIQUE, 0); }
		public TerminalNode CHECK() { return getToken(MSqlParser.CHECK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableConstraint);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(235);
					match(CONSTRAINT);
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(236);
						((TableConstraintContext)_localctx).name = uid();
						}
					}

					}
				}

				setState(241);
				match(PRIMARY);
				setState(242);
				match(KEY);
				setState(243);
				match(T__1);
				setState(244);
				uid();
				setState(245);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(247);
					match(CONSTRAINT);
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(248);
						((TableConstraintContext)_localctx).name = uid();
						}
					}

					}
				}

				setState(253);
				match(UNIQUE);
				setState(254);
				match(KEY);
				setState(255);
				match(T__1);
				setState(256);
				uid();
				setState(257);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(259);
					match(CONSTRAINT);
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(260);
						((TableConstraintContext)_localctx).name = uid();
						}
					}

					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(265);
					match(CONSTRAINT);
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(266);
						((TableConstraintContext)_localctx).name = uid();
						}
					}

					}
				}

				setState(271);
				match(CHECK);
				setState(272);
				match(T__1);
				setState(273);
				expression(0);
				setState(274);
				match(T__3);
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MSqlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(MSqlParser.TABLE, 0); }
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(DROP);
			setState(279);
			match(TABLE);
			setState(280);
			tables();
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

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MSqlParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(MSqlParser.INDEX, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode ON() { return getToken(MSqlParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexColumnNamesContext indexColumnNames() {
			return getRuleContext(IndexColumnNamesContext.class,0);
		}
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(CREATE);
			setState(283);
			match(INDEX);
			setState(284);
			uid();
			setState(285);
			match(ON);
			setState(286);
			tableName();
			setState(287);
			indexColumnNames();
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

	public static class IndexColumnNamesContext extends ParserRuleContext {
		public List<IndexColumnNameContext> indexColumnName() {
			return getRuleContexts(IndexColumnNameContext.class);
		}
		public IndexColumnNameContext indexColumnName(int i) {
			return getRuleContext(IndexColumnNameContext.class,i);
		}
		public IndexColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexColumnNames; }
	}

	public final IndexColumnNamesContext indexColumnNames() throws RecognitionException {
		IndexColumnNamesContext _localctx = new IndexColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_indexColumnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__1);
			setState(290);
			indexColumnName();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(291);
				match(T__2);
				setState(292);
				indexColumnName();
				}
			}

			setState(295);
			match(T__3);
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

	public static class IndexColumnNameContext extends ParserRuleContext {
		public Token sortType;
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MSqlParser.STRING_LITERAL, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MSqlParser.DESC, 0); }
		public IndexColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexColumnName; }
	}

	public final IndexColumnNameContext indexColumnName() throws RecognitionException {
		IndexColumnNameContext _localctx = new IndexColumnNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_indexColumnName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(297);
				uid();
				}
				break;
			case STRING_LITERAL:
				{
				setState(298);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(301);
				match(T__1);
				setState(302);
				decimalLiteral();
				setState(303);
				match(T__3);
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(307);
				((IndexColumnNameContext)_localctx).sortType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((IndexColumnNameContext)_localctx).sortType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MSqlParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(MSqlParser.INDEX, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(DROP);
			setState(311);
			match(INDEX);
			setState(312);
			uid();
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

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MSqlParser.SELECT, 0); }
		public SelectElementsContext selectElements() {
			return getRuleContext(SelectElementsContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(SELECT);
			setState(315);
			selectElements();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(316);
				fromClause();
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(319);
				groupByClause();
				}
			}

			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(322);
				havingClause();
				}
			}

			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(325);
				orderByClause();
				}
			}

			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(328);
				limitClause();
				}
			}

			setState(331);
			match(T__0);
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

	public static class SelectElementsContext extends ParserRuleContext {
		public Token star;
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_selectElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(333);
				((SelectElementsContext)_localctx).star = match(T__4);
				}
				break;
			case 2:
				{
				setState(334);
				selectElement();
				}
				break;
			}
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(337);
				match(T__2);
				setState(338);
				selectElement();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SelectElementContext extends ParserRuleContext {
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
	 
		public SelectElementContext() { }
		public void copyFrom(SelectElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectFunctionElementContext extends SelectElementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode AS() { return getToken(MSqlParser.AS, 0); }
		public SelectFunctionElementContext(SelectElementContext ctx) { copyFrom(ctx); }
	}
	public static class SelectColumnElementContext extends SelectElementContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode AS() { return getToken(MSqlParser.AS, 0); }
		public SelectColumnElementContext(SelectElementContext ctx) { copyFrom(ctx); }
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selectElement);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new SelectColumnElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				fullColumnName();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(345);
						match(AS);
						}
					}

					setState(348);
					uid();
					}
				}

				}
				break;
			case 2:
				_localctx = new SelectFunctionElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				functionCall();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(352);
						match(AS);
						}
					}

					setState(355);
					uid();
					}
				}

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

	public static class TableSourcesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TableSourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSources; }
	}

	public final TableSourcesContext tableSources() throws RecognitionException {
		TableSourcesContext _localctx = new TableSourcesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableSources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			tableName();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(361);
				match(T__2);
				setState(362);
				tableName();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MSqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(WHERE);
			setState(369);
			expression(0);
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

	public static class FromClauseContext extends ParserRuleContext {
		public ExpressionContext whereExpr;
		public TerminalNode FROM() { return getToken(MSqlParser.FROM, 0); }
		public TableSourcesContext tableSources() {
			return getRuleContext(TableSourcesContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(MSqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(FROM);
			setState(372);
			tableSources();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(373);
				match(WHERE);
				setState(374);
				((FromClauseContext)_localctx).whereExpr = expression(0);
				}
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(MSqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(MSqlParser.BY, 0); }
		public List<GroupByItemContext> groupByItem() {
			return getRuleContexts(GroupByItemContext.class);
		}
		public GroupByItemContext groupByItem(int i) {
			return getRuleContext(GroupByItemContext.class,i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(GROUP);
			setState(378);
			match(BY);
			setState(379);
			groupByItem();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(380);
				match(T__2);
				setState(381);
				groupByItem();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class GroupByItemContext extends ParserRuleContext {
		public Token order;
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MSqlParser.DESC, 0); }
		public GroupByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByItem; }
	}

	public final GroupByItemContext groupByItem() throws RecognitionException {
		GroupByItemContext _localctx = new GroupByItemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_groupByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			fullColumnName();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(388);
				((GroupByItemContext)_localctx).order = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((GroupByItemContext)_localctx).order = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(MSqlParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(HAVING);
			setState(392);
			expression(0);
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(MSqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MSqlParser.BY, 0); }
		public List<OrderByExpressionContext> orderByExpression() {
			return getRuleContexts(OrderByExpressionContext.class);
		}
		public OrderByExpressionContext orderByExpression(int i) {
			return getRuleContext(OrderByExpressionContext.class,i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(ORDER);
			setState(395);
			match(BY);
			setState(396);
			orderByExpression();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(397);
				match(T__2);
				setState(398);
				orderByExpression();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class OrderByExpressionContext extends ParserRuleContext {
		public Token order;
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MSqlParser.DESC, 0); }
		public OrderByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpression; }
	}

	public final OrderByExpressionContext orderByExpression() throws RecognitionException {
		OrderByExpressionContext _localctx = new OrderByExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_orderByExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			fullColumnName();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(405);
				((OrderByExpressionContext)_localctx).order = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderByExpressionContext)_localctx).order = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class LimitClauseContext extends ParserRuleContext {
		public DecimalLiteralContext offset;
		public DecimalLiteralContext limit;
		public TerminalNode LIMIT() { return getToken(MSqlParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(MSqlParser.OFFSET, 0); }
		public List<DecimalLiteralContext> decimalLiteral() {
			return getRuleContexts(DecimalLiteralContext.class);
		}
		public DecimalLiteralContext decimalLiteral(int i) {
			return getRuleContext(DecimalLiteralContext.class,i);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(LIMIT);
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(409);
					((LimitClauseContext)_localctx).offset = decimalLiteral();
					setState(410);
					match(T__2);
					}
					break;
				}
				setState(414);
				((LimitClauseContext)_localctx).limit = decimalLiteral();
				}
				break;
			case 2:
				{
				setState(415);
				((LimitClauseContext)_localctx).limit = decimalLiteral();
				setState(416);
				match(OFFSET);
				setState(417);
				((LimitClauseContext)_localctx).offset = decimalLiteral();
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MSqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(MSqlParser.OR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logicalOperator);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(AND);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(T__5);
				setState(423);
				match(T__5);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				match(OR);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				match(T__6);
				setState(426);
				match(T__6);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comparisonOperator);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				match(T__9);
				setState(433);
				match(T__7);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				match(T__8);
				setState(435);
				match(T__7);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(436);
				match(T__9);
				setState(437);
				match(T__8);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(438);
				match(T__10);
				setState(439);
				match(T__7);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(440);
				match(T__9);
				setState(441);
				match(T__7);
				setState(442);
				match(T__8);
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

	public static class BitOperatorContext extends ParserRuleContext {
		public BitOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitOperator; }
	}

	public final BitOperatorContext bitOperator() throws RecognitionException {
		BitOperatorContext _localctx = new BitOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bitOperator);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(T__9);
				setState(446);
				match(T__9);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(T__8);
				setState(448);
				match(T__8);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				match(T__5);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				match(T__11);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				match(T__6);
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

	public static class MathOperatorContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(MSqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MSqlParser.MOD, 0); }
		public MathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperator; }
	}

	public final MathOperatorContext mathOperator() throws RecognitionException {
		MathOperatorContext _localctx = new MathOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==DIV || _la==MOD) ) {
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

	public static class JsonOperatorContext extends ParserRuleContext {
		public JsonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonOperator; }
	}

	public final JsonOperatorContext jsonOperator() throws RecognitionException {
		JsonOperatorContext _localctx = new JsonOperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_jsonOperator);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				match(T__15);
				setState(457);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(T__15);
				setState(459);
				match(T__8);
				setState(460);
				match(T__8);
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

	public static class ValueContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TextLiteralContext textLiteral() {
			return getRuleContext(TextLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_value);
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				uid();
				}
				break;
			case TEXT_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				textLiteral();
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				decimalLiteral();
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

	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(MSqlParser.DECIMAL_LITERAL, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(DECIMAL_LITERAL);
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

	public static class HexadecimalLiteralContext extends ParserRuleContext {
		public TerminalNode HEXADECIMAL_LITERAL() { return getToken(MSqlParser.HEXADECIMAL_LITERAL, 0); }
		public TerminalNode STRING_CHARSET_NAME() { return getToken(MSqlParser.STRING_CHARSET_NAME, 0); }
		public HexadecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiteral; }
	}

	public final HexadecimalLiteralContext hexadecimalLiteral() throws RecognitionException {
		HexadecimalLiteralContext _localctx = new HexadecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_hexadecimalLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_CHARSET_NAME) {
				{
				setState(470);
				match(STRING_CHARSET_NAME);
				}
			}

			setState(473);
			match(HEXADECIMAL_LITERAL);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MSqlParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class TextLiteralContext extends ParserRuleContext {
		public TerminalNode TEXT_STRING() { return getToken(MSqlParser.TEXT_STRING, 0); }
		public TextLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textLiteral; }
	}

	public final TextLiteralContext textLiteral() throws RecognitionException {
		TextLiteralContext _localctx = new TextLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_textLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(TEXT_STRING);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(MSqlParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(MSqlParser.STRING_LITERAL, i);
		}
		public TerminalNode START_NATIONAL_STRING_LITERAL() { return getToken(MSqlParser.START_NATIONAL_STRING_LITERAL, 0); }
		public TerminalNode STRING_CHARSET_NAME() { return getToken(MSqlParser.STRING_CHARSET_NAME, 0); }
		public TerminalNode COLLATE() { return getToken(MSqlParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_stringLiteral);
		int _la;
		try {
			int _alt;
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
				case STRING_CHARSET_NAME:
					{
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==STRING_CHARSET_NAME) {
						{
						setState(479);
						match(STRING_CHARSET_NAME);
						}
					}

					setState(482);
					match(STRING_LITERAL);
					}
					break;
				case START_NATIONAL_STRING_LITERAL:
					{
					setState(483);
					match(START_NATIONAL_STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(487); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(486);
						match(STRING_LITERAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(489); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
				case STRING_CHARSET_NAME:
					{
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==STRING_CHARSET_NAME) {
						{
						setState(491);
						match(STRING_CHARSET_NAME);
						}
					}

					setState(494);
					match(STRING_LITERAL);
					}
					break;
				case START_NATIONAL_STRING_LITERAL:
					{
					setState(495);
					match(START_NATIONAL_STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(498);
					match(COLLATE);
					setState(499);
					collationName();
					}
					break;
				}
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

	public static class CollationNameContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MSqlParser.STRING_LITERAL, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_collationName);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				uid();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(STRING_LITERAL);
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

	public static class NullNotnullContext extends ParserRuleContext {
		public TerminalNode NULL_LITERAL() { return getToken(MSqlParser.NULL_LITERAL, 0); }
		public TerminalNode NULL_SPEC_LITERAL() { return getToken(MSqlParser.NULL_SPEC_LITERAL, 0); }
		public TerminalNode NOT() { return getToken(MSqlParser.NOT, 0); }
		public NullNotnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullNotnull; }
	}

	public final NullNotnullContext nullNotnull() throws RecognitionException {
		NullNotnullContext _localctx = new NullNotnullContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_nullNotnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(508);
				match(NOT);
				}
			}

			setState(511);
			_la = _input.LA(1);
			if ( !(_la==NULL_LITERAL || _la==NULL_SPEC_LITERAL) ) {
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

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode NULL_LITERAL() { return getToken(MSqlParser.NULL_LITERAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(513);
				match(NULL_LITERAL);
				}
				break;
			case 2:
				{
				setState(515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(514);
					unaryOperator();
					}
					break;
				}
				setState(517);
				constant();
				}
				break;
			case 3:
				{
				setState(518);
				match(T__1);
				setState(519);
				expression(0);
				setState(520);
				match(T__3);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MSqlParser.NOT, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << NOT))) != 0)) ) {
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

	public static class ConstantContext extends ParserRuleContext {
		public Token nullLiteral;
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public HexadecimalLiteralContext hexadecimalLiteral() {
			return getRuleContext(HexadecimalLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode REAL_LITERAL() { return getToken(MSqlParser.REAL_LITERAL, 0); }
		public TerminalNode BIT_STRING() { return getToken(MSqlParser.BIT_STRING, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(MSqlParser.NULL_LITERAL, 0); }
		public TerminalNode NULL_SPEC_LITERAL() { return getToken(MSqlParser.NULL_SPEC_LITERAL, 0); }
		public TerminalNode NOT() { return getToken(MSqlParser.NOT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_constant);
		int _la;
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				stringLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				decimalLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(T__15);
				setState(529);
				decimalLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				hexadecimalLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				booleanLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(532);
				match(REAL_LITERAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(533);
				match(BIT_STRING);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(534);
					match(NOT);
					}
				}

				setState(537);
				((ConstantContext)_localctx).nullLiteral = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL_LITERAL || _la==NULL_SPEC_LITERAL) ) {
					((ConstantContext)_localctx).nullLiteral = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class FullColumnNameContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public List<DottedIdContext> dottedId() {
			return getRuleContexts(DottedIdContext.class);
		}
		public DottedIdContext dottedId(int i) {
			return getRuleContext(DottedIdContext.class,i);
		}
		public FullColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullColumnName; }
	}

	public final FullColumnNameContext fullColumnName() throws RecognitionException {
		FullColumnNameContext _localctx = new FullColumnNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fullColumnName);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				uid();
				setState(545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(541);
					dottedId();
					setState(543);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(542);
						dottedId();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				matchWildcard();
				setState(548);
				dottedId();
				setState(550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(549);
					dottedId();
					}
					break;
				}
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AggregateFunctionCallContext extends FunctionCallContext {
		public AggregateWindowedFunctionContext aggregateWindowedFunction() {
			return getRuleContext(AggregateWindowedFunctionContext.class,0);
		}
		public AggregateFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionCall);
		try {
			_localctx = new AggregateFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			aggregateWindowedFunction();
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

	public static class AggregateWindowedFunctionContext extends ParserRuleContext {
		public Token starArg;
		public Token aggregator;
		public FunctionArgContext functionArg() {
			return getRuleContext(FunctionArgContext.class,0);
		}
		public TerminalNode AVG() { return getToken(MSqlParser.AVG, 0); }
		public TerminalNode MAX() { return getToken(MSqlParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(MSqlParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(MSqlParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(MSqlParser.COUNT, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(MSqlParser.DISTINCT, 0); }
		public AggregateWindowedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateWindowedFunction; }
	}

	public final AggregateWindowedFunctionContext aggregateWindowedFunction() throws RecognitionException {
		AggregateWindowedFunctionContext _localctx = new AggregateWindowedFunctionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_aggregateWindowedFunction);
		int _la;
		try {
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << SUM) | (1L << AVG) | (1L << MIN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(557);
				match(T__1);
				setState(558);
				functionArg();
				setState(559);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(COUNT);
				setState(562);
				match(T__1);
				setState(567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(563);
					((AggregateWindowedFunctionContext)_localctx).starArg = match(T__4);
					}
					break;
				case 2:
					{
					setState(565);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(564);
						functionArg();
						}
						break;
					}
					}
					break;
				}
				setState(569);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				match(COUNT);
				setState(571);
				match(T__1);
				setState(572);
				((AggregateWindowedFunctionContext)_localctx).aggregator = match(DISTINCT);
				setState(573);
				functionArgs();
				setState(574);
				match(T__3);
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

	public static class FunctionArgContext extends ParserRuleContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public FunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArg; }
	}

	public final FunctionArgContext functionArg() throws RecognitionException {
		FunctionArgContext _localctx = new FunctionArgContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			fullColumnName();
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

	public static class FunctionArgsContext extends ParserRuleContext {
		public List<FullColumnNameContext> fullColumnName() {
			return getRuleContexts(FullColumnNameContext.class);
		}
		public FullColumnNameContext fullColumnName(int i) {
			return getRuleContext(FullColumnNameContext.class,i);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			fullColumnName();
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(581);
				match(T__2);
				setState(582);
				fullColumnName();
				}
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class UidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MSqlParser.ID, 0); }
		public UidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uid; }
	}

	public final UidContext uid() throws RecognitionException {
		UidContext _localctx = new UidContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_uid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(ID);
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

	public static class FullIdContext extends ParserRuleContext {
		public List<UidContext> uid() {
			return getRuleContexts(UidContext.class);
		}
		public UidContext uid(int i) {
			return getRuleContext(UidContext.class,i);
		}
		public TerminalNode DOT_ID() { return getToken(MSqlParser.DOT_ID, 0); }
		public FullIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullId; }
	}

	public final FullIdContext fullId() throws RecognitionException {
		FullIdContext _localctx = new FullIdContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fullId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			uid();
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(591);
				match(DOT_ID);
				}
				break;
			case 2:
				{
				setState(592);
				match(T__18);
				setState(593);
				uid();
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

	public static class DottedIdContext extends ParserRuleContext {
		public TerminalNode DOT_ID() { return getToken(MSqlParser.DOT_ID, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public DottedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedId; }
	}

	public final DottedIdContext dottedId() throws RecognitionException {
		DottedIdContext _localctx = new DottedIdContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_dottedId);
		try {
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				match(DOT_ID);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				match(T__18);
				setState(598);
				uid();
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

	public static class TableNameContext extends ParserRuleContext {
		public FullIdContext fullId() {
			return getRuleContext(FullIdContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			fullId();
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

	public static class TablesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tables; }
	}

	public final TablesContext tables() throws RecognitionException {
		TablesContext _localctx = new TablesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_tables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			tableName();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(604);
				match(T__2);
				setState(605);
				tableName();
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InsertStatementContext extends ParserRuleContext {
		public UidListContext columns;
		public TerminalNode INSERT() { return getToken(MSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(MSqlParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public InsertStatementValueContext insertStatementValue() {
			return getRuleContext(InsertStatementValueContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(MSqlParser.PARTITION, 0); }
		public UidListContext uidList() {
			return getRuleContext(UidListContext.class,0);
		}
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_insertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(INSERT);
			setState(612);
			match(INTO);
			setState(613);
			tableName();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(614);
				match(PARTITION);
				setState(615);
				match(T__1);
				setState(616);
				((InsertStatementContext)_localctx).columns = uidList();
				setState(617);
				match(T__3);
				}
			}

			setState(621);
			insertStatementValue();
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

	public static class UidListContext extends ParserRuleContext {
		public List<UidContext> uid() {
			return getRuleContexts(UidContext.class);
		}
		public UidContext uid(int i) {
			return getRuleContext(UidContext.class,i);
		}
		public UidListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uidList; }
	}

	public final UidListContext uidList() throws RecognitionException {
		UidListContext _localctx = new UidListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_uidList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			uid();
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(624);
				match(T__2);
				setState(625);
				uid();
				}
				}
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InsertStatementValueContext extends ParserRuleContext {
		public Token insertFormat;
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(MSqlParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(MSqlParser.VALUE, 0); }
		public List<ExpressionsWithDefaultsContext> expressionsWithDefaults() {
			return getRuleContexts(ExpressionsWithDefaultsContext.class);
		}
		public ExpressionsWithDefaultsContext expressionsWithDefaults(int i) {
			return getRuleContext(ExpressionsWithDefaultsContext.class,i);
		}
		public InsertStatementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatementValue; }
	}

	public final InsertStatementValueContext insertStatementValue() throws RecognitionException {
		InsertStatementValueContext _localctx = new InsertStatementValueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_insertStatementValue);
		int _la;
		try {
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				selectStatement();
				}
				break;
			case VALUES:
			case VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				((InsertStatementValueContext)_localctx).insertFormat = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==VALUES || _la==VALUE) ) {
					((InsertStatementValueContext)_localctx).insertFormat = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(633);
				match(T__1);
				setState(635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(634);
					expressionsWithDefaults();
					}
					break;
				}
				setState(637);
				match(T__3);
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(638);
					match(T__2);
					setState(639);
					match(T__1);
					setState(641);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(640);
						expressionsWithDefaults();
						}
						break;
					}
					setState(643);
					match(T__3);
					}
					}
					setState(648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			expression(0);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(652);
				match(T__2);
				setState(653);
				expression(0);
				}
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IsExpressionContext extends ExpressionContext {
		public Token testValue;
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IS() { return getToken(MSqlParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(MSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MSqlParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(MSqlParser.UNKNOWN, 0); }
		public TerminalNode NOT() { return getToken(MSqlParser.NOT, 0); }
		public IsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpressionContext extends ExpressionContext {
		public Token notOperator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MSqlParser.NOT, 0); }
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PredicateExpressionContext extends ExpressionContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicateExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(660);
				((NotExpressionContext)_localctx).notOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==NOT) ) {
					((NotExpressionContext)_localctx).notOperator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(661);
				expression(4);
				}
				break;
			case 2:
				{
				_localctx = new IsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(662);
				predicate(0);
				setState(663);
				match(IS);
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(664);
					match(NOT);
					}
				}

				setState(667);
				((IsExpressionContext)_localctx).testValue = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << UNKNOWN))) != 0)) ) {
					((IsExpressionContext)_localctx).testValue = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				_localctx = new PredicateExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(669);
				predicate(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(672);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(673);
					logicalOperator();
					setState(674);
					expression(4);
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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

	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SoundsLikePredicateContext extends PredicateContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode SOUNDS() { return getToken(MSqlParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(MSqlParser.LIKE, 0); }
		public SoundsLikePredicateContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionAtomPredicateContext extends PredicateContext {
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(MSqlParser.LOCAL_ID, 0); }
		public ExpressionAtomPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class JsonMemberOfPredicateContext extends PredicateContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode MEMBER() { return getToken(MSqlParser.MEMBER, 0); }
		public TerminalNode OF() { return getToken(MSqlParser.OF, 0); }
		public JsonMemberOfPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class InPredicateContext extends PredicateContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IN() { return getToken(MSqlParser.IN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MSqlParser.NOT, 0); }
		public InPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class SubqueryComparasionPredicateContext extends PredicateContext {
		public Token quantifier;
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode ALL() { return getToken(MSqlParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(MSqlParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(MSqlParser.SOME, 0); }
		public SubqueryComparasionPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class BetweenPredicateContext extends PredicateContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(MSqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(MSqlParser.AND, 0); }
		public TerminalNode NOT() { return getToken(MSqlParser.NOT, 0); }
		public BetweenPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class BinaryComparasionPredicateContext extends PredicateContext {
		public PredicateContext left;
		public PredicateContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public BinaryComparasionPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class IsNullPredicateContext extends PredicateContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IS() { return getToken(MSqlParser.IS, 0); }
		public NullNotnullContext nullNotnull() {
			return getRuleContext(NullNotnullContext.class,0);
		}
		public IsNullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class LikePredicateContext extends PredicateContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(MSqlParser.LIKE, 0); }
		public TerminalNode NOT() { return getToken(MSqlParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(MSqlParser.ESCAPE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MSqlParser.STRING_LITERAL, 0); }
		public LikePredicateContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class RegexpPredicateContext extends PredicateContext {
		public Token regex;
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode REGEXP() { return getToken(MSqlParser.REGEXP, 0); }
		public TerminalNode RLIKE() { return getToken(MSqlParser.RLIKE, 0); }
		public TerminalNode NOT() { return getToken(MSqlParser.NOT, 0); }
		public RegexpPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
	}

	public final PredicateContext predicate() throws RecognitionException {
		return predicate(0);
	}

	private PredicateContext predicate(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredicateContext _localctx = new PredicateContext(_ctx, _parentState);
		PredicateContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExpressionAtomPredicateContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(682);
				match(LOCAL_ID);
				}
				break;
			}
			setState(685);
			expressionAtom(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(749);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryComparasionPredicateContext(new PredicateContext(_parentctx, _parentState));
						((BinaryComparasionPredicateContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(687);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(688);
						comparisonOperator();
						setState(689);
						((BinaryComparasionPredicateContext)_localctx).right = predicate(9);
						}
						break;
					case 2:
						{
						_localctx = new BetweenPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(691);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(693);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(692);
							match(NOT);
							}
						}

						setState(695);
						match(BETWEEN);
						setState(696);
						predicate(0);
						setState(697);
						match(AND);
						setState(698);
						predicate(7);
						}
						break;
					case 3:
						{
						_localctx = new SoundsLikePredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(700);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(701);
						match(SOUNDS);
						setState(702);
						match(LIKE);
						setState(703);
						predicate(6);
						}
						break;
					case 4:
						{
						_localctx = new RegexpPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(704);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(706);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(705);
							match(NOT);
							}
						}

						setState(708);
						((RegexpPredicateContext)_localctx).regex = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==REGEXP || _la==RLIKE) ) {
							((RegexpPredicateContext)_localctx).regex = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(709);
						predicate(4);
						}
						break;
					case 5:
						{
						_localctx = new InPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(710);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(712);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(711);
							match(NOT);
							}
						}

						setState(714);
						match(IN);
						setState(715);
						match(T__1);
						setState(718);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
						case 1:
							{
							setState(716);
							selectStatement();
							}
							break;
						case 2:
							{
							setState(717);
							expressions();
							}
							break;
						}
						setState(720);
						match(T__3);
						}
						break;
					case 6:
						{
						_localctx = new IsNullPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(722);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(723);
						match(IS);
						setState(724);
						nullNotnull();
						}
						break;
					case 7:
						{
						_localctx = new SubqueryComparasionPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(725);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(726);
						comparisonOperator();
						setState(727);
						((SubqueryComparasionPredicateContext)_localctx).quantifier = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (ALL - 33)) | (1L << (ANY - 33)) | (1L << (SOME - 33)))) != 0)) ) {
							((SubqueryComparasionPredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(728);
						match(T__1);
						setState(729);
						selectStatement();
						setState(730);
						match(T__3);
						}
						break;
					case 8:
						{
						_localctx = new LikePredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(732);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(734);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(733);
							match(NOT);
							}
						}

						setState(736);
						match(LIKE);
						setState(737);
						predicate(0);
						setState(740);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
						case 1:
							{
							setState(738);
							match(ESCAPE);
							setState(739);
							match(STRING_LITERAL);
							}
							break;
						}
						}
						break;
					case 9:
						{
						_localctx = new JsonMemberOfPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(742);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(743);
						match(MEMBER);
						setState(744);
						match(OF);
						setState(745);
						match(T__1);
						setState(746);
						predicate(0);
						setState(747);
						match(T__3);
						}
						break;
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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

	public static class ExpressionAtomContext extends ParserRuleContext {
		public ExpressionAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAtom; }
	 
		public ExpressionAtomContext() { }
		public void copyFrom(ExpressionAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryExpressionAtomContext extends ExpressionAtomContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public UnaryExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}
	public static class CollateExpressionAtomContext extends ExpressionAtomContext {
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(MSqlParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public CollateExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}
	public static class MysqlVariableExpressionAtomContext extends ExpressionAtomContext {
		public MysqlVariableContext mysqlVariable() {
			return getRuleContext(MysqlVariableContext.class,0);
		}
		public MysqlVariableExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}
	public static class NestedExpressionAtomContext extends ExpressionAtomContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NestedExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}
	public static class NestedRowExpressionAtomContext extends ExpressionAtomContext {
		public TerminalNode ROW() { return getToken(MSqlParser.ROW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NestedRowExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}
	public static class MathExpressionAtomContext extends ExpressionAtomContext {
		public ExpressionAtomContext left;
		public ExpressionAtomContext right;
		public MathOperatorContext mathOperator() {
			return getRuleContext(MathOperatorContext.class,0);
		}
		public List<ExpressionAtomContext> expressionAtom() {
			return getRuleContexts(ExpressionAtomContext.class);
		}
		public ExpressionAtomContext expressionAtom(int i) {
			return getRuleContext(ExpressionAtomContext.class,i);
		}
		public MathExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}
	public static class ExistsExpressionAtomContext extends ExpressionAtomContext {
		public TerminalNode EXISTS() { return getToken(MSqlParser.EXISTS, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public ExistsExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}
	public static class JsonExpressionAtomContext extends ExpressionAtomContext {
		public ExpressionAtomContext left;
		public ExpressionAtomContext right;
		public JsonOperatorContext jsonOperator() {
			return getRuleContext(JsonOperatorContext.class,0);
		}
		public List<ExpressionAtomContext> expressionAtom() {
			return getRuleContexts(ExpressionAtomContext.class);
		}
		public ExpressionAtomContext expressionAtom(int i) {
			return getRuleContext(ExpressionAtomContext.class,i);
		}
		public JsonExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}
	public static class SubqueryExpressionAtomContext extends ExpressionAtomContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public SubqueryExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}
	public static class ConstantExpressionAtomContext extends ExpressionAtomContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallExpressionAtomContext extends ExpressionAtomContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}
	public static class BinaryExpressionAtomContext extends ExpressionAtomContext {
		public TerminalNode BINARY() { return getToken(MSqlParser.BINARY, 0); }
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public BinaryExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}
	public static class FullColumnNameExpressionAtomContext extends ExpressionAtomContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public FullColumnNameExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}
	public static class BitExpressionAtomContext extends ExpressionAtomContext {
		public ExpressionAtomContext left;
		public ExpressionAtomContext right;
		public BitOperatorContext bitOperator() {
			return getRuleContext(BitOperatorContext.class,0);
		}
		public List<ExpressionAtomContext> expressionAtom() {
			return getRuleContexts(ExpressionAtomContext.class);
		}
		public ExpressionAtomContext expressionAtom(int i) {
			return getRuleContext(ExpressionAtomContext.class,i);
		}
		public BitExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionAtomContext expressionAtom() throws RecognitionException {
		return expressionAtom(0);
	}

	private ExpressionAtomContext expressionAtom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionAtomContext _localctx = new ExpressionAtomContext(_ctx, _parentState);
		ExpressionAtomContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_expressionAtom, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(755);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new FullColumnNameExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(756);
				fullColumnName();
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(757);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new MysqlVariableExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(758);
				mysqlVariable();
				}
				break;
			case 5:
				{
				_localctx = new UnaryExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(759);
				unaryOperator();
				setState(760);
				expressionAtom(9);
				}
				break;
			case 6:
				{
				_localctx = new BinaryExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(762);
				match(BINARY);
				setState(763);
				expressionAtom(8);
				}
				break;
			case 7:
				{
				_localctx = new NestedExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(764);
				match(T__1);
				setState(765);
				expression(0);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(766);
					match(T__2);
					setState(767);
					expression(0);
					}
					}
					setState(772);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(773);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new NestedRowExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(775);
				match(ROW);
				setState(776);
				match(T__1);
				setState(777);
				expression(0);
				setState(780); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(778);
					match(T__2);
					setState(779);
					expression(0);
					}
					}
					setState(782); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(784);
				match(T__3);
				}
				break;
			case 9:
				{
				_localctx = new ExistsExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(786);
				match(EXISTS);
				setState(787);
				match(T__1);
				setState(788);
				selectStatement();
				setState(789);
				match(T__3);
				}
				break;
			case 10:
				{
				_localctx = new SubqueryExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(791);
				match(T__1);
				setState(792);
				selectStatement();
				setState(793);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(812);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						_localctx = new BitExpressionAtomContext(new ExpressionAtomContext(_parentctx, _parentState));
						((BitExpressionAtomContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(797);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(798);
						bitOperator();
						setState(799);
						((BitExpressionAtomContext)_localctx).right = expressionAtom(4);
						}
						break;
					case 2:
						{
						_localctx = new MathExpressionAtomContext(new ExpressionAtomContext(_parentctx, _parentState));
						((MathExpressionAtomContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(801);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(802);
						mathOperator();
						setState(803);
						((MathExpressionAtomContext)_localctx).right = expressionAtom(3);
						}
						break;
					case 3:
						{
						_localctx = new JsonExpressionAtomContext(new ExpressionAtomContext(_parentctx, _parentState));
						((JsonExpressionAtomContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(805);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(806);
						jsonOperator();
						setState(807);
						((JsonExpressionAtomContext)_localctx).right = expressionAtom(2);
						}
						break;
					case 4:
						{
						_localctx = new CollateExpressionAtomContext(new ExpressionAtomContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(809);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(810);
						match(COLLATE);
						setState(811);
						collationName();
						}
						break;
					}
					} 
				}
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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

	public static class MysqlVariableContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(MSqlParser.LOCAL_ID, 0); }
		public TerminalNode GLOBAL_ID() { return getToken(MSqlParser.GLOBAL_ID, 0); }
		public MysqlVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mysqlVariable; }
	}

	public final MysqlVariableContext mysqlVariable() throws RecognitionException {
		MysqlVariableContext _localctx = new MysqlVariableContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_mysqlVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			_la = _input.LA(1);
			if ( !(_la==LOCAL_ID || _la==GLOBAL_ID) ) {
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

	public static class ExpressionsWithDefaultsContext extends ParserRuleContext {
		public List<ExpressionOrDefaultContext> expressionOrDefault() {
			return getRuleContexts(ExpressionOrDefaultContext.class);
		}
		public ExpressionOrDefaultContext expressionOrDefault(int i) {
			return getRuleContext(ExpressionOrDefaultContext.class,i);
		}
		public ExpressionsWithDefaultsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionsWithDefaults; }
	}

	public final ExpressionsWithDefaultsContext expressionsWithDefaults() throws RecognitionException {
		ExpressionsWithDefaultsContext _localctx = new ExpressionsWithDefaultsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_expressionsWithDefaults);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			expressionOrDefault();
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(820);
				match(T__2);
				setState(821);
				expressionOrDefault();
				}
				}
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionOrDefaultContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(MSqlParser.DEFAULT, 0); }
		public ExpressionOrDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOrDefault; }
	}

	public final ExpressionOrDefaultContext expressionOrDefault() throws RecognitionException {
		ExpressionOrDefaultContext _localctx = new ExpressionOrDefaultContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expressionOrDefault);
		try {
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				match(DEFAULT);
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

	public static class DeleteStatementContext extends ParserRuleContext {
		public SingleDeleteStatementContext singleDeleteStatement() {
			return getRuleContext(SingleDeleteStatementContext.class,0);
		}
		public MultipleDeleteStatementContext multipleDeleteStatement() {
			return getRuleContext(MultipleDeleteStatementContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_deleteStatement);
		try {
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				singleDeleteStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				multipleDeleteStatement();
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

	public static class SingleDeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(MSqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(MSqlParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(MSqlParser.PARTITION, 0); }
		public UidListContext uidList() {
			return getRuleContext(UidListContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(MSqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(MSqlParser.LIMIT, 0); }
		public LimitClauseAtomContext limitClauseAtom() {
			return getRuleContext(LimitClauseAtomContext.class,0);
		}
		public SingleDeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeleteStatement; }
	}

	public final SingleDeleteStatementContext singleDeleteStatement() throws RecognitionException {
		SingleDeleteStatementContext _localctx = new SingleDeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_singleDeleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(DELETE);
			setState(836);
			match(FROM);
			setState(837);
			tableName();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(838);
				match(PARTITION);
				setState(839);
				match(T__1);
				setState(840);
				uidList();
				setState(841);
				match(T__3);
				}
			}

			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(845);
				match(WHERE);
				setState(846);
				expression(0);
				}
			}

			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(849);
				orderByClause();
				}
			}

			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(852);
				match(LIMIT);
				setState(853);
				limitClauseAtom();
				}
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

	public static class MultipleDeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(MSqlParser.DELETE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode FROM() { return getToken(MSqlParser.FROM, 0); }
		public TableSourcesContext tableSources() {
			return getRuleContext(TableSourcesContext.class,0);
		}
		public TerminalNode USING() { return getToken(MSqlParser.USING, 0); }
		public TerminalNode WHERE() { return getToken(MSqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultipleDeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleDeleteStatement; }
	}

	public final MultipleDeleteStatementContext multipleDeleteStatement() throws RecognitionException {
		MultipleDeleteStatementContext _localctx = new MultipleDeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_multipleDeleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(DELETE);
			setState(896);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(857);
				tableName();
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(858);
					match(T__18);
					setState(859);
					match(T__4);
					}
				}

				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(862);
					match(T__2);
					setState(863);
					tableName();
					setState(866);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__18) {
						{
						setState(864);
						match(T__18);
						setState(865);
						match(T__4);
						}
					}

					}
					}
					setState(872);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(873);
				match(FROM);
				setState(874);
				tableSources();
				}
				break;
			case FROM:
				{
				setState(876);
				match(FROM);
				setState(877);
				tableName();
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(878);
					match(T__18);
					setState(879);
					match(T__4);
					}
				}

				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(882);
					match(T__2);
					setState(883);
					tableName();
					setState(886);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__18) {
						{
						setState(884);
						match(T__18);
						setState(885);
						match(T__4);
						}
					}

					}
					}
					setState(892);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(893);
				match(USING);
				setState(894);
				tableSources();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(898);
				match(WHERE);
				setState(899);
				expression(0);
				}
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

	public static class LimitClauseAtomContext extends ParserRuleContext {
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public MysqlVariableContext mysqlVariable() {
			return getRuleContext(MysqlVariableContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public LimitClauseAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClauseAtom; }
	}

	public final LimitClauseAtomContext limitClauseAtom() throws RecognitionException {
		LimitClauseAtomContext _localctx = new LimitClauseAtomContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_limitClauseAtom);
		try {
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(902);
				decimalLiteral();
				}
				break;
			case LOCAL_ID:
			case GLOBAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(903);
				mysqlVariable();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				uid();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 57:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 58:
			return predicate_sempred((PredicateContext)_localctx, predIndex);
		case 59:
			return expressionAtom_sempred((ExpressionAtomContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean predicate_sempred(PredicateContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressionAtom_sempred(ExpressionAtomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		case 13:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0094\u038e\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\u0090\n\2\3\3\3\3\3\3\3\3\5\3\u0096\n\3\3\3\3\3\3\4\3\4\3\4\3\4\7"+
		"\4\u009e\n\4\f\4\16\4\u00a1\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u00a9\n\5"+
		"\3\6\3\6\7\6\u00ad\n\6\f\6\16\6\u00b0\13\6\3\7\3\7\5\7\u00b4\n\7\3\7\3"+
		"\7\5\7\u00b8\n\7\3\7\5\7\u00bb\n\7\3\7\5\7\u00be\n\7\3\7\3\7\5\7\u00c2"+
		"\n\7\3\7\5\7\u00c5\n\7\3\7\5\7\u00c8\n\7\5\7\u00ca\n\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00da\n\n\3\n\3\n\3\n\5\n"+
		"\u00df\n\n\3\n\3\n\5\n\u00e3\n\n\5\n\u00e5\n\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00ec\n\n\3\13\3\13\5\13\u00f0\n\13\5\13\u00f2\n\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00fc\n\13\5\13\u00fe\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0108\n\13\5\13\u010a\n\13\3\13\3\13\5"+
		"\13\u010e\n\13\5\13\u0110\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u0117\n\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16"+
		"\u0128\n\16\3\16\3\16\3\17\3\17\5\17\u012e\n\17\3\17\3\17\3\17\3\17\5"+
		"\17\u0134\n\17\3\17\5\17\u0137\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\5\21\u0140\n\21\3\21\5\21\u0143\n\21\3\21\5\21\u0146\n\21\3\21\5\21\u0149"+
		"\n\21\3\21\5\21\u014c\n\21\3\21\3\21\3\22\3\22\5\22\u0152\n\22\3\22\3"+
		"\22\7\22\u0156\n\22\f\22\16\22\u0159\13\22\3\23\3\23\5\23\u015d\n\23\3"+
		"\23\5\23\u0160\n\23\3\23\3\23\5\23\u0164\n\23\3\23\5\23\u0167\n\23\5\23"+
		"\u0169\n\23\3\24\3\24\3\24\7\24\u016e\n\24\f\24\16\24\u0171\13\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u017a\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u0181\n\27\f\27\16\27\u0184\13\27\3\30\3\30\5\30\u0188\n\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\7\32\u0192\n\32\f\32\16\32\u0195\13"+
		"\32\3\33\3\33\5\33\u0199\n\33\3\34\3\34\3\34\3\34\5\34\u019f\n\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u01a6\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u01ae\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u01be\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01c7"+
		"\n\37\3 \3 \3!\3!\3!\3!\3!\5!\u01d0\n!\3\"\3\"\3\"\5\"\u01d5\n\"\3#\3"+
		"#\3$\5$\u01da\n$\3$\3$\3%\3%\3&\3&\3\'\5\'\u01e3\n\'\3\'\3\'\5\'\u01e7"+
		"\n\'\3\'\6\'\u01ea\n\'\r\'\16\'\u01eb\3\'\5\'\u01ef\n\'\3\'\3\'\5\'\u01f3"+
		"\n\'\3\'\3\'\5\'\u01f7\n\'\5\'\u01f9\n\'\3(\3(\5(\u01fd\n(\3)\5)\u0200"+
		"\n)\3)\3)\3*\3*\5*\u0206\n*\3*\3*\3*\3*\3*\5*\u020d\n*\3+\3+\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\5,\u021a\n,\3,\5,\u021d\n,\3-\3-\3-\5-\u0222\n-\5-"+
		"\u0224\n-\3-\3-\3-\5-\u0229\n-\5-\u022b\n-\3.\3.\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\5/\u0238\n/\5/\u023a\n/\3/\3/\3/\3/\3/\3/\3/\5/\u0243\n/\3\60\3"+
		"\60\3\61\3\61\3\61\7\61\u024a\n\61\f\61\16\61\u024d\13\61\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\5\63\u0255\n\63\3\64\3\64\3\64\5\64\u025a\n\64\3\65"+
		"\3\65\3\66\3\66\3\66\7\66\u0261\n\66\f\66\16\66\u0264\13\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u026e\n\67\3\67\3\67\38\38\38\78\u0275"+
		"\n8\f8\168\u0278\138\39\39\39\39\59\u027e\n9\39\39\39\39\59\u0284\n9\3"+
		"9\79\u0287\n9\f9\169\u028a\139\59\u028c\n9\3:\3:\3:\7:\u0291\n:\f:\16"+
		":\u0294\13:\3;\3;\3;\3;\3;\3;\5;\u029c\n;\3;\3;\3;\5;\u02a1\n;\3;\3;\3"+
		";\3;\7;\u02a7\n;\f;\16;\u02aa\13;\3<\3<\5<\u02ae\n<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\5<\u02b8\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u02c5\n<\3<\3<"+
		"\3<\3<\5<\u02cb\n<\3<\3<\3<\3<\5<\u02d1\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\5<\u02e1\n<\3<\3<\3<\3<\5<\u02e7\n<\3<\3<\3<\3<\3<\3<"+
		"\3<\7<\u02f0\n<\f<\16<\u02f3\13<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\7=\u0303\n=\f=\16=\u0306\13=\3=\3=\3=\3=\3=\3=\3=\6=\u030f\n=\r="+
		"\16=\u0310\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u031e\n=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\7=\u032f\n=\f=\16=\u0332\13=\3>\3>\3?"+
		"\3?\3?\7?\u0339\n?\f?\16?\u033c\13?\3@\3@\5@\u0340\n@\3A\3A\5A\u0344\n"+
		"A\3B\3B\3B\3B\3B\3B\3B\3B\5B\u034e\nB\3B\3B\5B\u0352\nB\3B\5B\u0355\n"+
		"B\3B\3B\5B\u0359\nB\3C\3C\3C\3C\5C\u035f\nC\3C\3C\3C\3C\5C\u0365\nC\7"+
		"C\u0367\nC\fC\16C\u036a\13C\3C\3C\3C\3C\3C\3C\3C\5C\u0373\nC\3C\3C\3C"+
		"\3C\5C\u0379\nC\7C\u037b\nC\fC\16C\u037e\13C\3C\3C\3C\5C\u0383\nC\3C\3"+
		"C\5C\u0387\nC\3D\3D\3D\5D\u038c\nD\3D\2\5tvxE\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\2\17\3\2_`\3\2\63\64\5\2\7\7\17\23TU\3\2"+
		",-\4\2==\u0091\u0091\6\2\r\r\21\22\24\24**\3\2\36!\3\2DE\4\2\r\r**\3\2"+
		",.\4\2LLNN\4\2##FG\3\2YZ\2\u03f6\2\u008f\3\2\2\2\4\u0091\3\2\2\2\6\u0099"+
		"\3\2\2\2\b\u00a8\3\2\2\2\n\u00aa\3\2\2\2\f\u00c9\3\2\2\2\16\u00cb\3\2"+
		"\2\2\20\u00cf\3\2\2\2\22\u00eb\3\2\2\2\24\u0116\3\2\2\2\26\u0118\3\2\2"+
		"\2\30\u011c\3\2\2\2\32\u0123\3\2\2\2\34\u012d\3\2\2\2\36\u0138\3\2\2\2"+
		" \u013c\3\2\2\2\"\u0151\3\2\2\2$\u0168\3\2\2\2&\u016a\3\2\2\2(\u0172\3"+
		"\2\2\2*\u0175\3\2\2\2,\u017b\3\2\2\2.\u0185\3\2\2\2\60\u0189\3\2\2\2\62"+
		"\u018c\3\2\2\2\64\u0196\3\2\2\2\66\u019a\3\2\2\28\u01ad\3\2\2\2:\u01bd"+
		"\3\2\2\2<\u01c6\3\2\2\2>\u01c8\3\2\2\2@\u01cf\3\2\2\2B\u01d4\3\2\2\2D"+
		"\u01d6\3\2\2\2F\u01d9\3\2\2\2H\u01dd\3\2\2\2J\u01df\3\2\2\2L\u01f8\3\2"+
		"\2\2N\u01fc\3\2\2\2P\u01ff\3\2\2\2R\u020c\3\2\2\2T\u020e\3\2\2\2V\u021c"+
		"\3\2\2\2X\u022a\3\2\2\2Z\u022c\3\2\2\2\\\u0242\3\2\2\2^\u0244\3\2\2\2"+
		"`\u0246\3\2\2\2b\u024e\3\2\2\2d\u0250\3\2\2\2f\u0259\3\2\2\2h\u025b\3"+
		"\2\2\2j\u025d\3\2\2\2l\u0265\3\2\2\2n\u0271\3\2\2\2p\u028b\3\2\2\2r\u028d"+
		"\3\2\2\2t\u02a0\3\2\2\2v\u02ab\3\2\2\2x\u031d\3\2\2\2z\u0333\3\2\2\2|"+
		"\u0335\3\2\2\2~\u033f\3\2\2\2\u0080\u0343\3\2\2\2\u0082\u0345\3\2\2\2"+
		"\u0084\u035a\3\2\2\2\u0086\u038b\3\2\2\2\u0088\u0090\5\4\3\2\u0089\u0090"+
		"\5\30\r\2\u008a\u0090\5\26\f\2\u008b\u0090\5\36\20\2\u008c\u0090\5l\67"+
		"\2\u008d\u0090\5\u0080A\2\u008e\u0090\5 \21\2\u008f\u0088\3\2\2\2\u008f"+
		"\u0089\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\3\3\2\2\2\u0091\u0092"+
		"\7\32\2\2\u0092\u0093\7\35\2\2\u0093\u0095\5h\65\2\u0094\u0096\5\6\4\2"+
		"\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\7\3\2\2\u0098\5\3\2\2\2\u0099\u009a\7\4\2\2\u009a\u009f\5\b\5\2\u009b"+
		"\u009c\7\5\2\2\u009c\u009e\5\b\5\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7\6\2\2\u00a3\7\3\2\2\2\u00a4\u00a5\5b\62\2"+
		"\u00a5\u00a6\5\n\6\2\u00a6\u00a9\3\2\2\2\u00a7\u00a9\5\24\13\2\u00a8\u00a4"+
		"\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\t\3\2\2\2\u00aa\u00ae\5\f\7\2\u00ab"+
		"\u00ad\5\22\n\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\13\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b3\7]\2\2\u00b2\u00b4\5\16\b\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00ca\3\2\2\2\u00b5\u00b7\7\\\2\2\u00b6\u00b8\5\16\b\2\u00b7"+
		"\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\t\2"+
		"\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00be\7a\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00ca\3\2"+
		"\2\2\u00bf\u00c1\7^\2\2\u00c0\u00c2\5\20\t\2\u00c1\u00c0\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\t\2\2\2\u00c4\u00c3\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8\7a\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00b1\3\2"+
		"\2\2\u00c9\u00b5\3\2\2\2\u00c9\u00bf\3\2\2\2\u00ca\r\3\2\2\2\u00cb\u00cc"+
		"\7\4\2\2\u00cc\u00cd\5D#\2\u00cd\u00ce\7\6\2\2\u00ce\17\3\2\2\2\u00cf"+
		"\u00d0\7\4\2\2\u00d0\u00d1\5D#\2\u00d1\u00d2\7\5\2\2\u00d2\u00d3\5D#\2"+
		"\u00d3\u00d4\7\6\2\2\u00d4\21\3\2\2\2\u00d5\u00ec\5P)\2\u00d6\u00d7\7"+
		":\2\2\u00d7\u00ec\5R*\2\u00d8\u00da\78\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00ec\79\2\2\u00dc\u00de\7?\2\2\u00dd"+
		"\u00df\79\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00ec\3\2"+
		"\2\2\u00e0\u00e2\7\67\2\2\u00e1\u00e3\5b\62\2\u00e2\u00e1\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7;\2\2\u00e7\u00e8\7\4\2\2\u00e8"+
		"\u00e9\5t;\2\u00e9\u00ea\7\6\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00d5\3\2\2"+
		"\2\u00eb\u00d6\3\2\2\2\u00eb\u00d9\3\2\2\2\u00eb\u00dc\3\2\2\2\u00eb\u00e4"+
		"\3\2\2\2\u00ec\23\3\2\2\2\u00ed\u00ef\7\67\2\2\u00ee\u00f0\5b\62\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ed\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\78\2\2\u00f4"+
		"\u00f5\79\2\2\u00f5\u00f6\7\4\2\2\u00f6\u00f7\5b\62\2\u00f7\u00f8\7\6"+
		"\2\2\u00f8\u0117\3\2\2\2\u00f9\u00fb\7\67\2\2\u00fa\u00fc\5b\62\2\u00fb"+
		"\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00f9\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7?\2\2\u0100"+
		"\u0101\79\2\2\u0101\u0102\7\4\2\2\u0102\u0103\5b\62\2\u0103\u0104\7\6"+
		"\2\2\u0104\u0117\3\2\2\2\u0105\u0107\7\67\2\2\u0106\u0108\5b\62\2\u0107"+
		"\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0105\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u0117\3\2\2\2\u010b\u010d\7\67\2\2\u010c"+
		"\u010e\5b\62\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2"+
		"\2\2\u010f\u010b\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\7;\2\2\u0112\u0113\7\4\2\2\u0113\u0114\5t;\2\u0114\u0115\7\6\2"+
		"\2\u0115\u0117\3\2\2\2\u0116\u00f1\3\2\2\2\u0116\u00fd\3\2\2\2\u0116\u0109"+
		"\3\2\2\2\u0116\u010f\3\2\2\2\u0117\25\3\2\2\2\u0118\u0119\7@\2\2\u0119"+
		"\u011a\7\35\2\2\u011a\u011b\5j\66\2\u011b\27\3\2\2\2\u011c\u011d\7\32"+
		"\2\2\u011d\u011e\7>\2\2\u011e\u011f\5b\62\2\u011f\u0120\7A\2\2\u0120\u0121"+
		"\5h\65\2\u0121\u0122\5\32\16\2\u0122\31\3\2\2\2\u0123\u0124\7\4\2\2\u0124"+
		"\u0127\5\34\17\2\u0125\u0126\7\5\2\2\u0126\u0128\5\34\17\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7\6\2\2\u012a"+
		"\33\3\2\2\2\u012b\u012e\5b\62\2\u012c\u012e\7\u0093\2\2\u012d\u012b\3"+
		"\2\2\2\u012d\u012c\3\2\2\2\u012e\u0133\3\2\2\2\u012f\u0130\7\4\2\2\u0130"+
		"\u0131\5D#\2\u0131\u0132\7\6\2\2\u0132\u0134\3\2\2\2\u0133\u012f\3\2\2"+
		"\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0137\t\3\2\2\u0136\u0135"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\35\3\2\2\2\u0138\u0139\7@\2\2\u0139"+
		"\u013a\7>\2\2\u013a\u013b\5b\62\2\u013b\37\3\2\2\2\u013c\u013d\7\33\2"+
		"\2\u013d\u013f\5\"\22\2\u013e\u0140\5*\26\2\u013f\u013e\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0143\5,\27\2\u0142\u0141\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0146\5\60\31\2\u0145"+
		"\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0149\5\62"+
		"\32\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u014c\5\66\34\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3"+
		"\2\2\2\u014d\u014e\7\3\2\2\u014e!\3\2\2\2\u014f\u0152\7\7\2\2\u0150\u0152"+
		"\5$\23\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\u0157\3\2\2\2\u0153"+
		"\u0154\7\5\2\2\u0154\u0156\5$\23\2\u0155\u0153\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158#\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u015a\u015f\5X-\2\u015b\u015d\7\31\2\2\u015c\u015b\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\5b\62\2\u015f\u015c\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0169\3\2\2\2\u0161\u0166\5Z.\2\u0162\u0164"+
		"\7\31\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2"+
		"\u0165\u0167\5b\62\2\u0166\u0163\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169"+
		"\3\2\2\2\u0168\u015a\3\2\2\2\u0168\u0161\3\2\2\2\u0169%\3\2\2\2\u016a"+
		"\u016f\5h\65\2\u016b\u016c\7\5\2\2\u016c\u016e\5h\65\2\u016d\u016b\3\2"+
		"\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\'\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7%\2\2\u0173\u0174\5t;\2\u0174"+
		")\3\2\2\2\u0175\u0176\7\34\2\2\u0176\u0179\5&\24\2\u0177\u0178\7%\2\2"+
		"\u0178\u017a\5t;\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a+\3\2"+
		"\2\2\u017b\u017c\7&\2\2\u017c\u017d\7\'\2\2\u017d\u0182\5.\30\2\u017e"+
		"\u017f\7\5\2\2\u017f\u0181\5.\30\2\u0180\u017e\3\2\2\2\u0181\u0184\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183-\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0185\u0187\5X-\2\u0186\u0188\t\3\2\2\u0187\u0186\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188/\3\2\2\2\u0189\u018a\7)\2\2\u018a\u018b\5t;\2\u018b"+
		"\61\3\2\2\2\u018c\u018d\7(\2\2\u018d\u018e\7\'\2\2\u018e\u0193\5\64\33"+
		"\2\u018f\u0190\7\5\2\2\u0190\u0192\5\64\33\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\63\3\2\2"+
		"\2\u0195\u0193\3\2\2\2\u0196\u0198\5X-\2\u0197\u0199\t\3\2\2\u0198\u0197"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\65\3\2\2\2\u019a\u01a5\7\65\2\2\u019b"+
		"\u019c\5D#\2\u019c\u019d\7\5\2\2\u019d\u019f\3\2\2\2\u019e\u019b\3\2\2"+
		"\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a6\5D#\2\u01a1\u01a2"+
		"\5D#\2\u01a2\u01a3\7\66\2\2\u01a3\u01a4\5D#\2\u01a4\u01a6\3\2\2\2\u01a5"+
		"\u019e\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a6\67\3\2\2\2\u01a7\u01ae\7\60\2"+
		"\2\u01a8\u01a9\7\b\2\2\u01a9\u01ae\7\b\2\2\u01aa\u01ae\7\62\2\2\u01ab"+
		"\u01ac\7\t\2\2\u01ac\u01ae\7\t\2\2\u01ad\u01a7\3\2\2\2\u01ad\u01a8\3\2"+
		"\2\2\u01ad\u01aa\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae9\3\2\2\2\u01af\u01be"+
		"\7\n\2\2\u01b0\u01be\7\13\2\2\u01b1\u01be\7\f\2\2\u01b2\u01b3\7\f\2\2"+
		"\u01b3\u01be\7\n\2\2\u01b4\u01b5\7\13\2\2\u01b5\u01be\7\n\2\2\u01b6\u01b7"+
		"\7\f\2\2\u01b7\u01be\7\13\2\2\u01b8\u01b9\7\r\2\2\u01b9\u01be\7\n\2\2"+
		"\u01ba\u01bb\7\f\2\2\u01bb\u01bc\7\n\2\2\u01bc\u01be\7\13\2\2\u01bd\u01af"+
		"\3\2\2\2\u01bd\u01b0\3\2\2\2\u01bd\u01b1\3\2\2\2\u01bd\u01b2\3\2\2\2\u01bd"+
		"\u01b4\3\2\2\2\u01bd\u01b6\3\2\2\2\u01bd\u01b8\3\2\2\2\u01bd\u01ba\3\2"+
		"\2\2\u01be;\3\2\2\2\u01bf\u01c0\7\f\2\2\u01c0\u01c7\7\f\2\2\u01c1\u01c2"+
		"\7\13\2\2\u01c2\u01c7\7\13\2\2\u01c3\u01c7\7\b\2\2\u01c4\u01c7\7\16\2"+
		"\2\u01c5\u01c7\7\t\2\2\u01c6\u01bf\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c3"+
		"\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7=\3\2\2\2\u01c8"+
		"\u01c9\t\4\2\2\u01c9?\3\2\2\2\u01ca\u01cb\7\22\2\2\u01cb\u01d0\7\13\2"+
		"\2\u01cc\u01cd\7\22\2\2\u01cd\u01ce\7\13\2\2\u01ce\u01d0\7\13\2\2\u01cf"+
		"\u01ca\3\2\2\2\u01cf\u01cc\3\2\2\2\u01d0A\3\2\2\2\u01d1\u01d5\5b\62\2"+
		"\u01d2\u01d5\5J&\2\u01d3\u01d5\5D#\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3"+
		"\2\2\2\u01d4\u01d3\3\2\2\2\u01d5C\3\2\2\2\u01d6\u01d7\7\u008f\2\2\u01d7"+
		"E\3\2\2\2\u01d8\u01da\7\u0094\2\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\7\u0090\2\2\u01dcG\3\2\2\2\u01dd"+
		"\u01de\t\5\2\2\u01deI\3\2\2\2\u01df\u01e0\7\u008c\2\2\u01e0K\3\2\2\2\u01e1"+
		"\u01e3\7\u0094\2\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e7\7\u0093\2\2\u01e5\u01e7\7\u0092\2\2\u01e6\u01e2\3"+
		"\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01ea\7\u0093\2\2"+
		"\u01e9\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01ec\u01f9\3\2\2\2\u01ed\u01ef\7\u0094\2\2\u01ee\u01ed\3\2\2"+
		"\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f3\7\u0093\2\2\u01f1"+
		"\u01f3\7\u0092\2\2\u01f2\u01ee\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6"+
		"\3\2\2\2\u01f4\u01f5\7I\2\2\u01f5\u01f7\5N(\2\u01f6\u01f4\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01e6\3\2\2\2\u01f8\u01f2\3\2"+
		"\2\2\u01f9M\3\2\2\2\u01fa\u01fd\5b\62\2\u01fb\u01fd\7\u0093\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fdO\3\2\2\2\u01fe\u0200\7*\2\2\u01ff"+
		"\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\t\6"+
		"\2\2\u0202Q\3\2\2\2\u0203\u020d\7=\2\2\u0204\u0206\5T+\2\u0205\u0204\3"+
		"\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020d\5V,\2\u0208"+
		"\u0209\7\4\2\2\u0209\u020a\5t;\2\u020a\u020b\7\6\2\2\u020b\u020d\3\2\2"+
		"\2\u020c\u0203\3\2\2\2\u020c\u0205\3\2\2\2\u020c\u0208\3\2\2\2\u020dS"+
		"\3\2\2\2\u020e\u020f\t\7\2\2\u020fU\3\2\2\2\u0210\u021d\5L\'\2\u0211\u021d"+
		"\5D#\2\u0212\u0213\7\22\2\2\u0213\u021d\5D#\2\u0214\u021d\5F$\2\u0215"+
		"\u021d\5H%\2\u0216\u021d\7\u008e\2\2\u0217\u021d\7[\2\2\u0218\u021a\7"+
		"*\2\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021d\t\6\2\2\u021c\u0210\3\2\2\2\u021c\u0211\3\2\2\2\u021c\u0212\3\2"+
		"\2\2\u021c\u0214\3\2\2\2\u021c\u0215\3\2\2\2\u021c\u0216\3\2\2\2\u021c"+
		"\u0217\3\2\2\2\u021c\u0219\3\2\2\2\u021dW\3\2\2\2\u021e\u0223\5b\62\2"+
		"\u021f\u0221\5f\64\2\u0220\u0222\5f\64\2\u0221\u0220\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0224\3\2\2\2\u0223\u021f\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u022b\3\2\2\2\u0225\u0226\13\2\2\2\u0226\u0228\5f\64\2\u0227\u0229\5"+
		"f\64\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a"+
		"\u021e\3\2\2\2\u022a\u0225\3\2\2\2\u022bY\3\2\2\2\u022c\u022d\5\\/\2\u022d"+
		"[\3\2\2\2\u022e\u022f\t\b\2\2\u022f\u0230\7\4\2\2\u0230\u0231\5^\60\2"+
		"\u0231\u0232\7\6\2\2\u0232\u0243\3\2\2\2\u0233\u0234\7\"\2\2\u0234\u0239"+
		"\7\4\2\2\u0235\u023a\7\7\2\2\u0236\u0238\5^\60\2\u0237\u0236\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0235\3\2\2\2\u0239\u0237\3\2"+
		"\2\2\u023a\u023b\3\2\2\2\u023b\u0243\7\6\2\2\u023c\u023d\7\"\2\2\u023d"+
		"\u023e\7\4\2\2\u023e\u023f\7$\2\2\u023f\u0240\5`\61\2\u0240\u0241\7\6"+
		"\2\2\u0241\u0243\3\2\2\2\u0242\u022e\3\2\2\2\u0242\u0233\3\2\2\2\u0242"+
		"\u023c\3\2\2\2\u0243]\3\2\2\2\u0244\u0245\5X-\2\u0245_\3\2\2\2\u0246\u024b"+
		"\5X-\2\u0247\u0248\7\5\2\2\u0248\u024a\5X-\2\u0249\u0247\3\2\2\2\u024a"+
		"\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024ca\3\2\2\2"+
		"\u024d\u024b\3\2\2\2\u024e\u024f\7\u008a\2\2\u024fc\3\2\2\2\u0250\u0254"+
		"\5b\62\2\u0251\u0255\7\u008b\2\2\u0252\u0253\7\25\2\2\u0253\u0255\5b\62"+
		"\2\u0254\u0251\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255e"+
		"\3\2\2\2\u0256\u025a\7\u008b\2\2\u0257\u0258\7\25\2\2\u0258\u025a\5b\62"+
		"\2\u0259\u0256\3\2\2\2\u0259\u0257\3\2\2\2\u025ag\3\2\2\2\u025b\u025c"+
		"\5d\63\2\u025ci\3\2\2\2\u025d\u0262\5h\65\2\u025e\u025f\7\5\2\2\u025f"+
		"\u0261\5h\65\2\u0260\u025e\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2"+
		"\2\2\u0262\u0263\3\2\2\2\u0263k\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0266"+
		"\7B\2\2\u0266\u0267\7C\2\2\u0267\u026d\5h\65\2\u0268\u0269\7W\2\2\u0269"+
		"\u026a\7\4\2\2\u026a\u026b\5n8\2\u026b\u026c\7\6\2\2\u026c\u026e\3\2\2"+
		"\2\u026d\u0268\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270"+
		"\5p9\2\u0270m\3\2\2\2\u0271\u0276\5b\62\2\u0272\u0273\7\5\2\2\u0273\u0275"+
		"\5b\62\2\u0274\u0272\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277o\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u028c\5 \21\2"+
		"\u027a\u027b\t\t\2\2\u027b\u027d\7\4\2\2\u027c\u027e\5|?\2\u027d\u027c"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0288\7\6\2\2\u0280"+
		"\u0281\7\5\2\2\u0281\u0283\7\4\2\2\u0282\u0284\5|?\2\u0283\u0282\3\2\2"+
		"\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\7\6\2\2\u0286\u0280"+
		"\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u0279\3\2\2\2\u028b\u027a\3\2"+
		"\2\2\u028cq\3\2\2\2\u028d\u0292\5t;\2\u028e\u028f\7\5\2\2\u028f\u0291"+
		"\5t;\2\u0290\u028e\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293s\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0296\b;\1\2\u0296"+
		"\u0297\t\n\2\2\u0297\u02a1\5t;\6\u0298\u0299\5v<\2\u0299\u029b\7+\2\2"+
		"\u029a\u029c\7*\2\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d"+
		"\3\2\2\2\u029d\u029e\t\13\2\2\u029e\u02a1\3\2\2\2\u029f\u02a1\5v<\2\u02a0"+
		"\u0295\3\2\2\2\u02a0\u0298\3\2\2\2\u02a0\u029f\3\2\2\2\u02a1\u02a8\3\2"+
		"\2\2\u02a2\u02a3\f\5\2\2\u02a3\u02a4\58\35\2\u02a4\u02a5\5t;\6\u02a5\u02a7"+
		"\3\2\2\2\u02a6\u02a2\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9u\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ad\b<\1\2\u02ac"+
		"\u02ae\7Y\2\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2"+
		"\2\2\u02af\u02b0\5x=\2\u02b0\u02f1\3\2\2\2\u02b1\u02b2\f\n\2\2\u02b2\u02b3"+
		"\5:\36\2\u02b3\u02b4\5v<\13\u02b4\u02f0\3\2\2\2\u02b5\u02b7\f\b\2\2\u02b6"+
		"\u02b8\7*\2\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2"+
		"\2\2\u02b9\u02ba\7/\2\2\u02ba\u02bb\5v<\2\u02bb\u02bc\7\60\2\2\u02bc\u02bd"+
		"\5v<\t\u02bd\u02f0\3\2\2\2\u02be\u02bf\f\7\2\2\u02bf\u02c0\7J\2\2\u02c0"+
		"\u02c1\7K\2\2\u02c1\u02f0\5v<\b\u02c2\u02c4\f\5\2\2\u02c3\u02c5\7*\2\2"+
		"\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7"+
		"\t\f\2\2\u02c7\u02f0\5v<\6\u02c8\u02ca\f\f\2\2\u02c9\u02cb\7*\2\2\u02ca"+
		"\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\7\61"+
		"\2\2\u02cd\u02d0\7\4\2\2\u02ce\u02d1\5 \21\2\u02cf\u02d1\5r:\2\u02d0\u02ce"+
		"\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\7\6\2\2\u02d3"+
		"\u02f0\3\2\2\2\u02d4\u02d5\f\13\2\2\u02d5\u02d6\7+\2\2\u02d6\u02f0\5P"+
		")\2\u02d7\u02d8\f\t\2\2\u02d8\u02d9\5:\36\2\u02d9\u02da\t\r\2\2\u02da"+
		"\u02db\7\4\2\2\u02db\u02dc\5 \21\2\u02dc\u02dd\7\6\2\2\u02dd\u02f0\3\2"+
		"\2\2\u02de\u02e0\f\6\2\2\u02df\u02e1\7*\2\2\u02e0\u02df\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\7K\2\2\u02e3\u02e6\5v<"+
		"\2\u02e4\u02e5\7M\2\2\u02e5\u02e7\7\u0093\2\2\u02e6\u02e4\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02f0\3\2\2\2\u02e8\u02e9\f\3\2\2\u02e9\u02ea\7O"+
		"\2\2\u02ea\u02eb\7P\2\2\u02eb\u02ec\7\4\2\2\u02ec\u02ed\5v<\2\u02ed\u02ee"+
		"\7\6\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02b1\3\2\2\2\u02ef\u02b5\3\2\2\2\u02ef"+
		"\u02be\3\2\2\2\u02ef\u02c2\3\2\2\2\u02ef\u02c8\3\2\2\2\u02ef\u02d4\3\2"+
		"\2\2\u02ef\u02d7\3\2\2\2\u02ef\u02de\3\2\2\2\u02ef\u02e8\3\2\2\2\u02f0"+
		"\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2w\3\2\2\2"+
		"\u02f3\u02f1\3\2\2\2\u02f4\u02f5\b=\1\2\u02f5\u031e\5V,\2\u02f6\u031e"+
		"\5X-\2\u02f7\u031e\5Z.\2\u02f8\u031e\5z>\2\u02f9\u02fa\5T+\2\u02fa\u02fb"+
		"\5x=\13\u02fb\u031e\3\2\2\2\u02fc\u02fd\7H\2\2\u02fd\u031e\5x=\n\u02fe"+
		"\u02ff\7\4\2\2\u02ff\u0304\5t;\2\u0300\u0301\7\5\2\2\u0301\u0303\5t;\2"+
		"\u0302\u0300\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305"+
		"\3\2\2\2\u0305\u0307\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u0308\7\6\2\2\u0308"+
		"\u031e\3\2\2\2\u0309\u030a\7Q\2\2\u030a\u030b\7\4\2\2\u030b\u030e\5t;"+
		"\2\u030c\u030d\7\5\2\2\u030d\u030f\5t;\2\u030e\u030c\3\2\2\2\u030f\u0310"+
		"\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0313\7\6\2\2\u0313\u031e\3\2\2\2\u0314\u0315\7R\2\2\u0315\u0316\7\4"+
		"\2\2\u0316\u0317\5 \21\2\u0317\u0318\7\6\2\2\u0318\u031e\3\2\2\2\u0319"+
		"\u031a\7\4\2\2\u031a\u031b\5 \21\2\u031b\u031c\7\6\2\2\u031c\u031e\3\2"+
		"\2\2\u031d\u02f4\3\2\2\2\u031d\u02f6\3\2\2\2\u031d\u02f7\3\2\2\2\u031d"+
		"\u02f8\3\2\2\2\u031d\u02f9\3\2\2\2\u031d\u02fc\3\2\2\2\u031d\u02fe\3\2"+
		"\2\2\u031d\u0309\3\2\2\2\u031d\u0314\3\2\2\2\u031d\u0319\3\2\2\2\u031e"+
		"\u0330\3\2\2\2\u031f\u0320\f\5\2\2\u0320\u0321\5<\37\2\u0321\u0322\5x"+
		"=\6\u0322\u032f\3\2\2\2\u0323\u0324\f\4\2\2\u0324\u0325\5> \2\u0325\u0326"+
		"\5x=\5\u0326\u032f\3\2\2\2\u0327\u0328\f\3\2\2\u0328\u0329\5@!\2\u0329"+
		"\u032a\5x=\4\u032a\u032f\3\2\2\2\u032b\u032c\f\r\2\2\u032c\u032d\7I\2"+
		"\2\u032d\u032f\5N(\2\u032e\u031f\3\2\2\2\u032e\u0323\3\2\2\2\u032e\u0327"+
		"\3\2\2\2\u032e\u032b\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330"+
		"\u0331\3\2\2\2\u0331y\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334\t\16\2\2"+
		"\u0334{\3\2\2\2\u0335\u033a\5~@\2\u0336\u0337\7\5\2\2\u0337\u0339\5~@"+
		"\2\u0338\u0336\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b"+
		"\3\2\2\2\u033b}\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u0340\5t;\2\u033e\u0340"+
		"\7:\2\2\u033f\u033d\3\2\2\2\u033f\u033e\3\2\2\2\u0340\177\3\2\2\2\u0341"+
		"\u0344\5\u0082B\2\u0342\u0344\5\u0084C\2\u0343\u0341\3\2\2\2\u0343\u0342"+
		"\3\2\2\2\u0344\u0081\3\2\2\2\u0345\u0346\7V\2\2\u0346\u0347\7\34\2\2\u0347"+
		"\u034d\5h\65\2\u0348\u0349\7W\2\2\u0349\u034a\7\4\2\2\u034a\u034b\5n8"+
		"\2\u034b\u034c\7\6\2\2\u034c\u034e\3\2\2\2\u034d\u0348\3\2\2\2\u034d\u034e"+
		"\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u0350\7%\2\2\u0350\u0352\5t;\2\u0351"+
		"\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353\u0355\5\62"+
		"\32\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0358\3\2\2\2\u0356"+
		"\u0357\7\65\2\2\u0357\u0359\5\u0086D\2\u0358\u0356\3\2\2\2\u0358\u0359"+
		"\3\2\2\2\u0359\u0083\3\2\2\2\u035a\u0382\7V\2\2\u035b\u035e\5h\65\2\u035c"+
		"\u035d\7\25\2\2\u035d\u035f\7\7\2\2\u035e\u035c\3\2\2\2\u035e\u035f\3"+
		"\2\2\2\u035f\u0368\3\2\2\2\u0360\u0361\7\5\2\2\u0361\u0364\5h\65\2\u0362"+
		"\u0363\7\25\2\2\u0363\u0365\7\7\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3"+
		"\2\2\2\u0365\u0367\3\2\2\2\u0366\u0360\3\2\2\2\u0367\u036a\3\2\2\2\u0368"+
		"\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2\2\2\u036a\u0368\3\2"+
		"\2\2\u036b\u036c\7\34\2\2\u036c\u036d\5&\24\2\u036d\u0383\3\2\2\2\u036e"+
		"\u036f\7\34\2\2\u036f\u0372\5h\65\2\u0370\u0371\7\25\2\2\u0371\u0373\7"+
		"\7\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u037c\3\2\2\2\u0374"+
		"\u0375\7\5\2\2\u0375\u0378\5h\65\2\u0376\u0377\7\25\2\2\u0377\u0379\7"+
		"\7\2\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037b\3\2\2\2\u037a"+
		"\u0374\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037d\3\2"+
		"\2\2\u037d\u037f\3\2\2\2\u037e\u037c\3\2\2\2\u037f\u0380\7X\2\2\u0380"+
		"\u0381\5&\24\2\u0381\u0383\3\2\2\2\u0382\u035b\3\2\2\2\u0382\u036e\3\2"+
		"\2\2\u0383\u0386\3\2\2\2\u0384\u0385\7%\2\2\u0385\u0387\5t;\2\u0386\u0384"+
		"\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0085\3\2\2\2\u0388\u038c\5D#\2\u0389"+
		"\u038c\5z>\2\u038a\u038c\5b\62\2\u038b\u0388\3\2\2\2\u038b\u0389\3\2\2"+
		"\2\u038b\u038a\3\2\2\2\u038c\u0087\3\2\2\2{\u008f\u0095\u009f\u00a8\u00ae"+
		"\u00b3\u00b7\u00ba\u00bd\u00c1\u00c4\u00c7\u00c9\u00d9\u00de\u00e2\u00e4"+
		"\u00eb\u00ef\u00f1\u00fb\u00fd\u0107\u0109\u010d\u010f\u0116\u0127\u012d"+
		"\u0133\u0136\u013f\u0142\u0145\u0148\u014b\u0151\u0157\u015c\u015f\u0163"+
		"\u0166\u0168\u016f\u0179\u0182\u0187\u0193\u0198\u019e\u01a5\u01ad\u01bd"+
		"\u01c6\u01cf\u01d4\u01d9\u01e2\u01e6\u01eb\u01ee\u01f2\u01f6\u01f8\u01fc"+
		"\u01ff\u0205\u020c\u0219\u021c\u0221\u0223\u0228\u022a\u0237\u0239\u0242"+
		"\u024b\u0254\u0259\u0262\u026d\u0276\u027d\u0283\u0288\u028b\u0292\u029b"+
		"\u02a0\u02a8\u02ad\u02b7\u02c4\u02ca\u02d0\u02e0\u02e6\u02ef\u02f1\u0304"+
		"\u0310\u031d\u032e\u0330\u033a\u033f\u0343\u034d\u0351\u0354\u0358\u035e"+
		"\u0364\u0368\u0372\u0378\u037c\u0382\u0386\u038b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}