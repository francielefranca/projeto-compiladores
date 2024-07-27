grammar LCE;

// Análise Sintática
start : statement+ EOF ;

//Comandos
statement : 'CRIAR ' creation=electronicComponentCreation' 'ECName=VAR';'#createComponent
    | 'CONECTAR 'ECName=VAR' 'slot=SLOTTYPE' EM 'NodeName=VAR';'#connectComponentToNode
    ;
//Expressoes
electronicComponentCreation
: 'RESISTOR''('resistance=NUM')'#resistor
| 'FONTE''('fontType=FONTTYPE','forceValue=NUM')' #font
| 'NO' #node
;
FONTTYPE : 'C' | 'V';
SLOTTYPE : 'A' | 'B';
NUM : [0-9]+ ;
VAR : [a-zA-Z][a-zA-Z0-9]+ ;

ESPACOS : (' '|'\n') -> skip ;