grammar SESGrammar;

//Parser rules
ses                     	: sentence+ EOF;

sentence                	: (aspect | specialization | multiaspect | variable | range | aspectReutil | specReutil | variableDependance) ENDSENTENCE
							;

aspect                  	: FROM identifier PERSPECTIVE COMMA? identifier TOBE MADE_OF identifierListAnd
							;

specialization				: identifier CANBE identifierListOr IN identifier
							;

multiaspect             	: FROM identifier PERSPECTIVE COMMA? identifier TOBE MADE_OF MORE_THAN_ONE identifier
							;

variable                	: identifier TO_HAVE identifierListAnd
							;

range                   	: RANGE_OF existingVar TOBE rangeType
							;

aspectReutil       			: FROM identifier PERSPECTIVE COMMA identifier TOBE LIKE identifier
							;
						
specReutil      			: identifier TOBE LIKE identifier IN identifier
							;

variableDependance			: existingVar DEPENDS_ON existingVarListAnd
							;

identifierListAnd			: identifier							#idAnd
							| identifierList COMMA? AND identifier	#idAndList
							;

identifierListOr			: identifier							#idOr
							| identifierList COMMA? OR identifier	#idOrList
							;

identifierList				: identifier						#idListBaseCase
							| identifierList COMMA identifier	#idListRecursion
							;

rangeType           		: rangeOfString		#rangeTypeString
							| rangeOfFloat		#rangeTypeFloat
							| rangeOfInteger	#rangeTypeInteger
							| BOOLEANLITERAL			#rangeTypeBoolean
							;

rangeOfString				: STRINGLITERAL									#rangeOfStringUnspecified
							| STRINGLITERAL WITH_VALUES identifierListAnd	#rangeOfStringSpecified
							;

rangeOfFloat				: FLOATLITERAL							#rangeOfFloatUnspecified
							| FLOATLITERAL WITH_VALUES floatInterval	#rangeOfFloatSpecified
							;

floatInterval				: BEGININTERV floatingPoint COMMA floatingPoint ENDINTERV
							;

floatingPoint				: FLOAT
							| INTEGER
							;

rangeOfInteger				: INTEGERLITERAL						#rangeOfIntegerUnspecified
							| INTEGERLITERAL WITH_VALUES intInterval	#rangeOfIntegerSpecified
							;
						
intInterval					: BEGININTERV INTEGER COMMA INTEGER ENDINTERV
							;

existingVarListAnd			: existingVar								#oneExistingVar
							| existingVarList COMMA? AND existingVar	#manyExistingVar
							;

existingVarList				: existingVar						#existingVarListBaseCase
							| existingVarList COMMA existingVar	#existingVarListRecursion
							;

existingVar					: identifier POSSESSIVE identifier
							;

identifier    				: IDENTIFIER+
							;

//Lexer rules
FROM                    : F R O M;
PERSPECTIVE             : P E R S P E C T I V E;
CANBE                   : C A N ' ' B E;
MADE_OF                 : M A D E ' ' O F;
MORE_THAN_ONE           : M O R E ' ' T H A N ' ' O N E;
TO_HAVE                 : H A S | H A V E;
RANGE_OF                : R A N G E ' ' O F;
POSSESSIVE              : '\'' | '\'s';
OR                      : O R;
AND                     : A N D;
STRINGLITERAL           : S T R I N G;
BOOLEANLITERAL          : B O O L E A N;
INTEGERLITERAL          : I N T E G E R;
FLOATLITERAL            : F L O A T | D O U B L E;
WITH_VALUES             : W I T H ' ' V A L U E S;
LIKE                    : L I K E;
IN                      : I N;
TOBE                    : I S | A R E;
DEPENDS_ON				: C O M E S ' ' F R O M | D E P E N D S ' ' O N;
OUTPUT					: O U T P U T;
COMMA                   : ',';
ENDSENTENCE             : '!' | '.';
ENDINTERV               : ']' | ')';
BEGININTERV             : '[' | '(';
INTEGER                 : '0' | [1-9][0-9]*;
FLOAT                   : ('0' | [1-9][0-9]*) ('.'[0-9]+);
IGNOREARTICLES          : (A | A N | T H E) -> skip;
IDENTIFIER              : [a-zA-Z]([a-zA-Z0-9\-_])*;
IGNOREEMPTY             : (' '|'\n'|'\r'|'\t') -> skip;

//Fragments
fragment A              : [aA\u00e1\u00c1]; /*Se agrupa con sus caracteres acentuados*/
fragment B              : [bB];
fragment C              : [cC];
fragment D              : [dD];
fragment E              : [eE\u00e9\u00c9]; /*Se agrupa con sus caracteres acentuados*/
fragment F              : [fF];
fragment G              : [gG];
fragment H              : [hH];
fragment I              : [iI\u00ed\u00cd]; /*Se agrupa con sus caracteres acentuados*/
fragment J              : [jJ];
fragment K              : [kK];
fragment L              : [lL];
fragment M              : [mM];
fragment N              : [nN];
fragment ENIE           : [\u00f1\u00d1];
fragment O              : [oO\u00f3\u00d3]; /*Se agrupa con sus caracteres acentuados*/
fragment P              : [pP];
fragment Q              : [qQ];
fragment R              : [rR];
fragment S              : [sS];
fragment T              : [tT];
fragment U              : [uU\u00fa\u00da]; /*Se agrupa con sus caracteres acentuados*/
fragment V              : [vV];
fragment W              : [wW];
fragment X              : [xX];
fragment Y              : [yY];
fragment Z              : [zZ];