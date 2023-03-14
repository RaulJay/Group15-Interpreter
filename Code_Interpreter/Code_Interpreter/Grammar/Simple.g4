grammar CodeGrammar;

// Define the tokens
INT: 'INT';
CHAR: 'CHAR';
BOOL: 'BOOL';
FLOAT: 'FLOAT';
TRUE: 'TRUE';
FALSE: 'FALSE';
DISPLAY: 'DISPLAY:';
END: 'END';
ASSIGN: '=';
SEMI: ';';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
EQ: '==';
NEQ: '!=';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
AND: '&';
OR: '|';
NOT: '!';
NEWLINE: '\r'? '\n'| '\r';
WHITESPACE: [\t\r\n]+ -> skip;

// Define the grammar rules
code: statement* EOF;

statement: (variable_declaration
          | assignment_statement
          | display_statement
          | if_block)
          NEWLINE
          ;

variable_declaration: data_type identifier (ASSIGN expression)? SEMI;

data_type: INT | CHAR | BOOL;

identifier: ID /*[a-zA-Z_][a-zA-Z0-9_] */;

assignment_statement: identifier ASSIGN expression SEMI;


expression: literal
           | identifier
           | expression (PLUS | MINUS | MULT | DIV | MOD) expression
           | LPAREN expression RPAREN
           | expression (EQ | NEQ | GT | LT | GTE | LTE) expression
           | expression (AND | OR) expression
           | NOT expression
           ;

literal: INT_LITERAL
        | CHAR_LITERAL
        | FLOAT
        | bool
        ;

bool: TRUE | FALSE;

display_statement: DISPLAY expression (COMMA expression)* SEMI;

if_block: 'IF' LPAREN expression RPAREN block ('ELSE' ifelse_block)?;

block: 'update me later hehe';
ifelse_block: block | if_block;


// Define the lexer rules
INT_LITERAL: DIGIT+;
CHAR_LITERAL: '\'' (~'\'' | '\\' .)* '\'';
ID: LETTER (LETTER | DIGIT | '_')*;

fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];