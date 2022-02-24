grammar tubaina;

capitulo : titulo secao+;
titulo: '[chapter ' FRASE  ']\n\n';

secao: '[section ' FRASE ']' paragrafos+;
paragrafos: '\n\n'  texto+ '\n\n'?;
//Interrogacao significa que eh opcional
texto: paragrafo | negrito | italico;

paragrafo: FRASE;
negrito: NEGRITO FRASE NEGRITO;

italico: ITALICO FRASE ITALICO;

ITALICO: '::';
NEGRITO: '**';
FRASE: [a-zA-Z0-9' ']+;
