﻿grammar CodeGrammar;

// Define the tokens

// Begin Statements
BEGIN: 'BEGIN CODE';
BEGINIF: 'BEGIN IF';

// End Statements
END: 'END CODE';
ENDIF: 'END IF';

// Input Output Statements
DISPLAY: 'DISPLAY:';

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

// Data Types
BOOL: 'BOOL';
CHAR: 'CHAR';
INT: 'INT';

// Conditional Statements
ELSE: 'ELSE';
IF: 'IF';
FALSE: 'FALSE';
TRUE: 'TRUE';

// Token Skips
WHITESPACE: [\t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;
NEWLINE: '\r'? '\n'| '\r';

// Define the grammar rules
code: BEGIN NEWLINE statement* NEWLINE END;

statement:
          (//variable_declaration
           assignment_statement
          | display_statement
          | if_block)
          | COMMENT
          ;

//variable_declaration: data_type identifier (ASSIGN expression)?;

data_type: INT | CHAR | BOOL;


assignment_statement: data_type IDENTIFIER ASSIGN expression* NEWLINE;


expression
    : literal                                   # constantExpression
    | IDENTIFIER                                # identifierExpression
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