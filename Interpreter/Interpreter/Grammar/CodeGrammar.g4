grammar CodeGrammar;

// Define the tokens
AND: '&';
ASSIGN: '=';
BEGIN: 'BEGIN CODE';
BEGINIF: 'BEGIN IF';
BOOL: 'BOOL';
CHAR: 'CHAR';
COMMA: ',';
DISPLAY: 'DISPLAY:';
DIV: '/';
ELSE: 'ELSE';
END: 'END CODE';
ENDIF: 'END IF';
EQ: '==';
FALSE: 'FALSE';
GT: '>';
GTE: '>=';
IF: 'IF';
INT: 'INT';
LBRACK: '[';
LT: '<';
LTE: '<=';
LPAREN: '(';
MINUS: '-';
MOD: '%';
MULT: '*';
NEWLINE: '\r'? '\n'| '\r';
NEQ: '!=';
NOT: '!';
OR: '|';
PLUS: '+';
RBRACK: ']';
RPAREN: ')';
TRUE: 'TRUE';
WHITESPACE: [\t\r\n]+ -> skip;

// Define the grammar rules
code: statement* EOF;

statement: BEGIN 
           NEWLINE
          (//variable_declaration
           assignment_statement
          | display_statement
          | if_block)
          NEWLINE       
          END   

          ;

//variable_declaration: data_type identifier (ASSIGN expression)?;

data_type: INT | CHAR | BOOL;


assignment_statement: data_type IDENTIFIER ASSIGN expression NEWLINE;


expression: literal
           | IDENTIFIER
           | expression (PLUS | MINUS | MULT | DIV | MOD) expression
           | LPAREN expression RPAREN
           //| expression (EQ | NEQ | GT | LT | GTE | LTE) expression
           //| expression (AND | OR) expression
           | NOT expression
           ;

literal: INTEGER
        | FLOAT
        | STRING
        | BOOLEAN
        ;

INTEGER: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
STRING: ('"' ~'"'* '"' | '\'' ~'\''* '\'');
BOOLEAN: TRUE | FALSE;

display_statement: DISPLAY':' expression NEWLINE;

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

if_statement: IF LPAREN expression RPAREN if_block (ELSE ifelse_block)?;

if_block: BEGINIF statement* ENDIF;

ifelse_block: block | if_block;

block: 'update me later hehe';


// Define the lexer rules
INT_LITERAL: DIGIT+;
CHAR_LITERAL: '\'' (~'\'' | '\\' .)* '\'';
ID: LETTER (LETTER | DIGIT | '_')*;

fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];