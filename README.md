### Alunos
Anaclécio Ribeiro Brederodes Campos  
Brenno Pinto Lapa Rego Lima  
Franciele Silva de França  


# Linguagem para Circuitos Eletrônicos (LCE)
Neste projeto foi criada a Linguagem para Circutuios Eletrônicos (LCE) para fins decriação e análise de componentes eletrônicos.

## Estrutura
a linguagem possui dois comandos: `CRIAR` e `CONECTAR`

`CRIAR` registra um novo componente, incluindo seu nome e seus valores particulares de acordo com o tipo do componente.

`CONECTAR` conecta uma saída (A ou B) de componente eletrônico a um nó (fio).

A linguagem aceita quebra de linhas entre comandos.
### Exemplos:
A seguinte linha cria um resistor chamado "resistor1" que possui 10 ohms de resistência:

`CRIAR RESISTOR(10) resistor1;`

A seguinte linha cria um nó chamado "no1":

`CRIAR NO no1;`

A seguinte linha cria uma fonte de tensão de 30 volts chamada "fonte3":

`CRIAR FONTE(V,30) fonte3;`

A seguinte linha cria uma fonte de corrente de 30 volts chamada "fonte4":

`CRIAR FONTE(C,30) fonte4;`


A seguinte linha conecta a entrada A do componente chamado "resistor1" ao nó "no1":

CONECTAR resistor1 A EM no1;

## Como utilizar
Utilize o comando `java -cp "antlr-4.13.1-complete.jar;classes" MainLCE [string do seu programa]` para executar o programa.

Exemplo:

`java -cp "antlr-4.13.1-complete.jar;classes" MainLCE "CRIAR RESISTOR(10) resistor1;
CRIAR RESISTOR(20) resistor2;
CRIAR NO no1;
CRIAR NO no2;
CRIAR FONTE(V,30) fonte3;
CONECTAR resistor2 A EM fonte3;"`

## Sobre o projeto
Por agora, a linguagem apenas armazena o resultado dos inputs na memória e imprime as variáveis criadas como representação de cada componente do circuito e sua conexões no console, não sendo possível dentro dos limites de tempo e escopo do projeto finalizar a simulação do estado do circuito.

Além da linguagem, o projeto conta com a classe (não finalizada) "CircuitSolver" que, como o nome implica, realizaria a solução do circuito por meio de análise nodal.
