# Teste Técnico da Target Sistemas
#### Járdesson Ribeiro

##### Questão 1 - Enunciado
```
1) Observe o trecho de código abaixo: 

 	int INDICE = 13, SOMA = 0, K = 0; 

 	enquanto K < INDICE faça 

	{ 

		K = K + 1; 

		SOMA = SOMA + K; 

	} 

 	imprimir(SOMA); 
 
Ao final do processamento, qual será o valor da variável SOMA? 
```
##### Resposta da questão 1: 
```
int INDICE = 13, SOMA = 0, K = 0;

enquanto k < INDICE:
    k = k + 1;
    soma = soma + k;

Vamos ter 13 voltas

1° volta: k = 0(valor de k) + 1 e soma = 0(valor de soma) + k, k = 1 e soma = 1;
2° volta: k = 1(valor de k) + 1 e soma = 1(valor de soma) + k, k = 2 e soma = 3;
3° volta: k = 2(valor de k) + 1 e soma = 3(valor de soma) + k, k = 3 e soma = 6;
continua...

Observe que valor de soma sempre é dado por soma_atual = soma_anterior + valor_k_atual 
e o valor de valor_k_atual sempre sobe 1 em cada volta.
logo temos:
1° 0 + volta1 = 1
2° 1 + volta2 = 3
3° 3 + volta3 = 6
4° 6 + volta4 = 10
.
.
.
13° 78 + volta13 = 91 que é o valor final da soma = 91.
```
##### Questão 2 - Enunciado
```
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a 
soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um 
programa na linguagem que desejar onde, informado um número, ele calcule a sequência de 
Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. 
IMPORTANTE:  
    Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código; 
```
##### Resposta da questão 2: [Código](https://github.com/jardessonrb/teste-tecnico-target-sistemas/blob/main/src/main/java/testetecnico/questao2/Questao2.java)

```Java
public static String fibonacci(int numeroBuscado){
    if(numeroBuscado == 0 || numeroBuscado == 1){
        return String.format("O número %d pertence a sequência de Fibonacci ", numeroBuscado);
    }

    List<Integer> fibonacciList = new ArrayList<>();
    fibonacciList.add(0);
    fibonacciList.add(1);
    for (int i = 2; fibonacciList.get(i - 1) <= numeroBuscado; i++) {
        fibonacciList.add(fibonacciList.get(i - 1) + fibonacciList.get(i - 2));

        if(fibonacciList.get(fibonacciList.size() - 1) == numeroBuscado){
            return String.format("O número %d pertence a sequência de Fibonacci ", numeroBuscado);
        }
    }

    return String.format("O número %d não pertence a sequência de Fibonacci ", numeroBuscado);
}
```

##### Questão 3 - Enunciado

```
3) Descubra a lógica e complete o próximo elemento:  
```
##### Resposta da questão 3:

```
a) 1, 3, 5, 7, ___
resposta: 9
lógica: Sequência dos números ímpares.

b) 2, 4, 8, 16, 32, 64, ____
resposta: 128
lógica: O número atual é o dobro do anterior, começando por 2.

c) 0, 1, 4, 9, 16, 25, 36, ____
resposta: 49
lógica: O número atual é a soma do número anterior com o número ímpar da sequência dos ímpares.
Exemplo: 0, 0 + 1 = 1, 1 + 3 = 4, 4 + 5 = 9, 9 + 7 = 16, 16 + 9 = 25, 25 + 11 = 36, 36 + 13 = 49.

d) 4, 16, 36, 64, ____
resposta: 100
lógica: A diferença entre os números vai somando a diferença anterior mais 8 começando entre 4 e 16
Exemplo: 4 -> 16 dif = 12, 16 -> 36 dif = 20(12 + 8), 36 -> 64 dif = 28(20 + 8), 64 -> 100 dif = 36(28 + 8)

e) 1, 1, 2, 3, 5, 8, ____
resposta: 13
lógica: Sequência de Finonacci.

f) 2,10, 12, 16, 17, 18, 19, ____
resposta: 200
lógica: Sequência dos números que na forma escrita começa com a letra D.
exemplo: 2(dois), 10(dez), 12(doze), 16(dezesseis), 17(dezessete), 18(dezoito), 19(dezenove) e 200(duzento). Entre 19 e 200,
existem os númerais que não começam com a letra D.
```

##### Questão 4 - Enunciado
```
4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. 
Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. 
Seu objetivo é descobrir qual interruptor controla qual lâmpada.

Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, 
qual interruptor controla cada lâmpada?  
```
##### Resposta da questão 4:

```
Vamos imaginar os três interruptores como sendo 1, 2 e 3 e vamos chamar as salas de A, B e C:

1° Cenário(O único que seria fácil identificar)

1° ida na sala A:
1(ligado), 2(desligado), 3(desligado)
    Se A estiver acesa, sabemos que o interruptor 1 ascende a lâmpada de A:
2° ida vamos na sala B:
1(ligado), 2(ligado), 3(desligado)
    Se B estiver acesa  o interruptor 2 controla a lâmpada de B e o 3 controla a sala C.
    Se B estiver apagada o interruptor 3 controla a lâmpada de B e o 2 controla a sala C.

2° Cenário

1° ida na sala A:
1(ligado), 2(desligado), 3(desligado)
    Se A estiver apagado, então A pode ser controlado pelos interruptores 2 e 3, e B ou C podem ser controlados por 1
2° ida:
    Não importa qual seria a configuração de interruptores, com apenas duas viagens, sempre seria possível não ter certeza qual
    interruptor liga qual lâmpada.
    Exemplo 1:
        1(desligado), 2(ligado), 3(desligado)
        Se for na B podemos ter:
            se B apagada, logo o interruptor 1 e 3 poderiam controlar a lâmpada da sala B (Impossível).
            Se B acesa logo, o 2 controla B, 3 controla A e 1 controla C.(Possível)

    Exemplo 2:
            1(ligado), 2(desligado), 3(ligado)
            Se for na B podemos ter:
                se B apagada, logo o interruptor 2 controla a lâmpada da sala B, 3 controla a A e o 1 controla a C.(Possível)
                Se B acesa logo, o 1 ou 3 controlam B, 2 ou 3 controlam A e 1 ou 3 controlam C o que não pode ser determinado(Impossível)
UMA SOLUÇÃO USANDO OUTRA LÓGICA SERIA:
Como apenas ligar e visitar a sala não garante total certeza em todos os casos, podemos pensar em algo como
ter uma outra "variável" que pudesse auxiliar a memórizar qual já passamos.

Vamos pensar no cenário como mencionamos acima, onde temos o interruptor 1, 2 e 3 e as salas A, B e C:
poderia ligar o interruptor 2 e deixar por um tempo suficiente para "esquentar a lâmpada, por exemplo, e
em seguida eu poderia desligar e ligar o interruptor 1, e o 3 deixar desligado. 
1° visita: iria na sala A:
    Se a lâmpada da sala A estivesse acesa:
        Interruptor 1 controla a lâmpada da sala A
    Se a lâmpada da sala A estivesse apagada:
        E se estivesse fria: Interruptor 3 controla a lâmpada da sala A.
        E se estivesse quente: Interruptor 2 controla a lâmpada da sala A.
2° Visita: iria na sala B
    Como já sei o interruptor que controla a lâmpada da sala A, me resta dois interruptores para as sala B e C.
    Deixaria um interruptor ligado e outro desligado:
        Se a lâmpada da sala B estivesse acesa, o interruptor que estivesse ativo seria o interruptor de B
        Se a lãmpada da sala B estivesse apagada, o interruptor seria o que estivesse desligado.
        
Assim saberia os 3 interruptores das 3 salas.
```

##### Questão 5 - Enunciado
```
5) Escreva um programa que inverta os caracteres de um string. 

IMPORTANTE: 
	a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser 
	previamente definida no código; 
	b) Evite usar funções prontas, como, por exemplo, reverse; 
```

##### Resposta da questão 5:[Código](https://github.com/jardessonrb/teste-tecnico-target-sistemas/blob/main/src/main/java/testetecnico/questao5/Questao5.java)
```Java
public static String reverterString(String texto){
        StringBuilder textoInvertido = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0 ; i--) {
            textoInvertido.append(texto.charAt(i));
        }
        return textoInvertido.toString();
    }
```
