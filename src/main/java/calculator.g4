//Importante na linguagem escrever Java com letra maisculo.
//Importante que aqui tenha o o mesmo nome do arquivo.
grammar calculator;

//Analizador sintático

prog: expr;
expr: PARENTBER expr PARENTFECH #par
    | expr op=(MULT|DIV) expr   #OpBin
    | expr op=(PLUS|LESS) expr  #OpBin
    | INT                       #num
    ;

//Analizador léxico
//Signifca que poder contar do 0 a 9 e o + significa que poder ter mais numeros
INT : ('0'..'9')+ ;
// Tokens
PLUS : '+' ;
LESS : '-' ;
MULT : '*' ;
DIV : '/';
PARENTBER : '(' ;
PARENTFECH : ')' ;

