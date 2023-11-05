grammar SESGrammar;

//Parser rules
ses                     	: sentence+ EOF;

sentence                	: (aspect | specialization | multiaspect | variable | range | aspectReutil | specReutil | variableDependance) ENDSENTENCE
							;

aspect                  	: FROM identifier PERSPECTIVE COMMA? identifier TOBE MADEOF identifierListAnd
							;

specialization				: identifier CANBE identifierListOr IN identifier
							;

multiaspect             	: FROM identifier PERSPECTIVE COMMA? identifier TOBE MADEOF MORETHANONE identifier
							;

variable                	: identifier HAS identifierListAnd
							;

range                   	: RANGEOF existingVar TOBE rangeType
							;

aspectReutil       			: FROM identifier PERSPECTIVE COMMA identifier TOBE LIKE identifier
							;
						
specReutil      			: identifier TOBE LIKE identifier IN identifier
							;

variableDependance			: existingVar DEPENDSON existingVarListAnd
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
							| BOOLSTR			#rangeTypeBoolean
							;

rangeOfString				: STRINGSTR									#rangeOfStringUnspecified
							| STRINGSTR WITHVALUES identifierListAnd	#rangeOfStringSpecified
							;

rangeOfFloat				: FLTSTR							#rangeOfFloatUnspecified
							| FLTSTR WITHVALUES floatInterval	#rangeOfFloatSpecified
							;

floatInterval				: BEGININTERV floatingPoint COMMA floatingPoint ENDINTERV
							;

floatingPoint				: FLOAT
							| INTEGER
							;

rangeOfInteger				: INTSTR						#rangeOfIntegerUnspecified
							| INTSTR WITHVALUES intInterval	#rangeOfIntegerSpecified
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
MADEOF                  : M A D E ' ' O F;
MORETHANONE             : M O R E ' ' T H A N ' ' O N E;
HAS                     : H A S;
RANGEOF                 : R A N G E ' ' O F;
POSSESSIVE              : '\'' | '\'s';
OR                      : O R;
AND                     : A N D;
STRINGSTR               : S T R I N G;
BOOLSTR                 : B O O L E A N;
INTSTR                  : I N T E G E R;
FLTSTR                  : F L O A T | D O U B L E;
WITHVALUES              : W I T H ' ' V A L U E S;
LIKE                    : L I K E;
IN                      : I N;
TOBE                    : I S | A R E;
DEPENDSON				: C O M E S ' ' F R O M | D E P E N D S ' ' O N;
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