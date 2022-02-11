//Importante na linguagem escrever Java com letra maisculo.
//Importante que aqui tenha o o mesmo nome do arquivo.
grammar calculator;

//Analizador sintático
//Parse Rules
prog: expr;
//# diz que tem que gerar uma funcao que seta
expr: PARENTBER expr PARENTFECH #par
    | expr op=(MULT|DIV) expr   #OpBin
    | expr op=(PLUS|LESS) expr  #OpBin
    | INT                       #num
    ;

//Analizador léxico
//Signifca que poder contar do 0 a 9 e o + significa que poder ter mais numeros
//Lexar Roles
INT : ('0'..'9')+ ;
// Tokens
PLUS : '+' ;
LESS : '-' ;
MULT : '*' ;
DIV : '/';
PARENTBER : '(' ;
PARENTFECH : ')' ;

////Lembre-se que Rules pode referenciar outras Rules
////Exemplo mais complexo a baixo
////o asterisco indica que poder ter um N vars
////Parser Rules
//root: vars (LINE vars)*
//    ;
//
////variáveis
//vars: name=IDENT EQ value=expr #SetVar
//    ;
////soma e subtração
//expr: left=expr op=(ADD|SUB) rigth=expr #AddSub
//// o Ou aqui é que ele vê se tem uma sub ou div, se nao vai para multiplicação
//    | factor #AddSubEmpty
//    ;
////multiplicação e divisão
//factor: left=factor op=(MULT|DIV) rigth=factor #MultDiv
//    | term #MultDivEmply
//    ;
//
////Exponenciação
//term: left=term op=EXP rigth=term #Exp
//    | item #ExpEmpty
//    ;
//
//    // a esponencicao esta por ultimo por regras matematicas ja que o o ANTRL vai trabalhar em pilha
//
////Itens
//item: value=DECIMAL #Decimal
//    | value=DECIMAL #GetVar
//    | value=STRING #String
//    //aqui é só um exemplo com uma função onde que se ele chegar aqui com um texto
////    | 'Texto('value=expr')' #Texto
//    | '(' value=expr ')' #Paren
//    ;
//
////Lexar Rules
////aqui diz que é um conjunto de números que pode ser um ou mais e pode ter pontos
//DECIMAL: [0-9]+ ('.' [0-9]*)?;
//ADD: '+';
//SUB: '-';
//DIV: '/';
//MULT: '*';
//EXP: '^';
//fragment ESCAPED_QUOTE: '\\"';
//STRING: '""' (ESCAPED_QUOTE | ~('\n'|'\r'))*? '"';
//OPEN_P: '(';
//CLOSE_P: ')';
//IDENT: ('_'|[a-zA-Z])('.'|[0-9a-zA-Z])*;
//EQ:'=';
//LINE: '\n'|'\R\n';
////aqui diz que em caso de vazio ignora
//WS: ' ' -> skip
//    ;
//
