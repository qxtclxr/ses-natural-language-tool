grammar SES_Grammar;

//Parser rules
ses                     : sentence EOF | sentence sentence_recursive EOF;
sentence_recursive      : sentence | sentence sentence_recursive;
sentence                : (asp | spec | multiasp | var | range | asp_recycle | spec_recycle) ENDSENTENCE;

asp                     : FROM asp_type PERSPECTIVE COMMA entity TOBE MADEOF component_set;
spec                    : entity CANBE variant_set IN spec_type;
multiasp                : FROM multiasp_type PERSPECTIVE COMMA entity TOBE MADEOF MORETHANONE entity;
var                     : entity HAS variable_set;
range                   : RANGEOF entity POSSESSIVE variable TOBE range_type;

variant_set             : entity | variant_set_recursive OR entity | variant_set_recursive COMMA OR entity;
variant_set_recursive   : variant_set_recursive COMMA entity | entity;
spec_type              	: identifier_recursive;

component_set           : entity | component_set_recursive AND entity | component_set_recursive COMMA AND entity;
component_set_recursive : component_set_recursive COMMA entity | entity;
asp_type                : identifier_recursive;

variable_set            : variable | variable_set_recursive AND variable | variable_set_recursive COMMA AND variable;
variable_set_recursive  : variable_set_recursive COMMA variable | variable;
variable                : identifier_recursive;

multiasp_type          	: identifier_recursive;

range_type              : range_str | range_flt |  range_int | BOOLSTR;
range_str               : STRINGSTR | STRINGSTR WITHVALUES string_set;
string_set              : identifier_recursive | string_set_recursive AND identifier_recursive | string_set_recursive COMMA AND identifier_recursive;
string_set_recursive    : string_set_recursive COMMA  identifier_recursive | identifier_recursive;
range_flt               : (FLTSTR | DBLSTR) | (FLTSTR | DBLSTR) WITHVALUES flt_interval;
flt_interval            : BEGININTERV flt COMMA  flt ENDINTERV;
flt                     : FLOAT | INTEGER;
range_int               : INTSTR | INTSTR WITHVALUES int_interval;
int_interval            : BEGININTERV INTEGER COMMA  INTEGER ENDINTERV;

asp_recycle             : FROM asp_type PERSPECTIVE COMMA  entity TOBE LIKE entity;
spec_recycle            : entity TOBE LIKE entity IN spec_type;

entity                  : identifier_recursive;

identifier_recursive    : IDENTIFIER | IDENTIFIER identifier_recursive;

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
FLTSTR                  : F L O A T;
DBLSTR                  : D O U B L E;
WITHVALUES              : W I T H ' ' V A L U E S;
LIKE                    : L I K E;
IN                      : I N;
TOBE                    : I S | A R E;
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