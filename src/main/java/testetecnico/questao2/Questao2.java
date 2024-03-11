package testetecnico.questao2;

import java.util.ArrayList;
import java.util.List;

public class Questao2 {

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

    public static void main(String[] args) {
        int numeroBuscado = 1;
        System.out.println(Questao2.fibonacci(numeroBuscado));
    }
}
