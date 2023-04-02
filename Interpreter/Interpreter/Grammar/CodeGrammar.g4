grammar CodeGrammar;

// Define the tokens

// Begin Statements
BEGIN: 'BEGIN CODE';
BEGINIF: 'BEGIN IF';

// End Statements
END: 'END CODE';
ENDIF: 'END IF';

// Input Output Statements
DISPLAY: 'DISPLAY';

// Operators
AND: '&';
ASSIGN: '=';
DIV: '/';
PLUS: '+';
MOD: '%';
MULT: '*';
MINUS: '-';
NEQ: '!=';
NOT: '!';
OR: '|';
GT: '>';
GTE: '>=';
LT: '<';
LTE: '<=';
EQ: '==';
POWER: '**';

// Special Characters
COMMA: ',';
RBRACK: ']';
RPAREN: ')';
LBRACK: '[';
LPAREN: '(';
COLON: ':';

// Data Types
BOOL: 'BOOL';
CHAR: 'CHAR';
INT: 'INT';
FLOAT: 'FLOAT';

// Conditional Statements
ELSE: 'ELSE';
IF: 'IF';
FALSE: 'FALSE';
TRUE: 'TRUE';

// Token Skips
WHITESPACE: [\t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;
NEWLINE: '\r'? '\n'| '\r';

// Define the grammar rules parent / root
code: NEWLINE? BEGIN NEWLINE statement* NEWLINE END;

statement
        : declaration_statement
        | display_statement
        | if_block
        | COMMENT
        ;

//variable_declaration: data_type identifier (ASSIGN expression)?;

data_type: INT | CHAR | BOOL | FLOAT;

declaration: IDENTIFIER ((ASSIGN IDENTIFIER)* (ASSIGN expression))? (COMMA IDENTIFIER (ASSIGN expression)?)* ;
declaration_statement: data_type declaration NEWLINE;


expression
    : literal                                   # literalExpression
    | LPAREN expression RPAREN                  # parenthesizeExpression
    | expression exponentOp expression          # exponentExpression    
    | expression multOp expression              # multiplicationExpression
    | expression addOp expression               # additionExpression
    | expression compareOp expression           # comparisonExpression
    | expression boolOp expression              # booleanExpression
    ;

multOp: MULT | DIV | MOD ;
addOp: PLUS | MINUS;
compareOp: LT | GT | LTE | GTE | EQ | NEQ;
boolOp: AND | OR ;
exponentOp: POWER;

literal: INTEGER
        | FLOATING
        | STRING
        | BOOLEAN
        ;

INTEGER: [0-9]+;
FLOATING: [0-9]+ '.' [0-9]+;
STRING: ('"' ~'"'* '"' | '\'' ~'\''* '\'');
BOOLEAN: TRUE | FALSE;

display_statement: DISPLAY':' expression NEWLINE?;


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