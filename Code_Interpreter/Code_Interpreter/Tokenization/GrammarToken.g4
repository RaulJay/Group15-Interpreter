grammar Tokens;

// Define lexer rules for numbers, operators, and parentheses
INT:   [0-9]+;
ADD:   '+';
SUB:   '-';
MUL:   '*';
DIV:   '/';
LPAR:  '(';
RPAR:  ')';

// Define parser rules for expressions and sub-expressions
expr:  term ((ADD | SUB) term)*;
term:  factor ((MUL | DIV) factor)*;
factor: INT | LPAR expr RPAR;

// Define entry point for parsing
start: expr;