package view;

import java.util.Random;
import controller.metodosCalc;

public class classMain {
    public static void main (String args []) {
        int vetor[] = new int[10]; // gerando vetor
        Random aleatorio = new Random();
        metodosCalc metodos = new metodosCalc();

        for(int i = 0; i < 10; i++) { // preenche o vetor
            vetor[i] = aleatorio.nextInt(100) + 1; // valor aletatorio entre 1 e 100
        }
        // Exibindo o vetor gerado
        System.out.print("Vetor gerado: \n"); // printa o vetor e seus valores
        for (int num : vetor) {
            System.out.print(num + " " );
        }

        System.out.println( "\nMenor valor:" + metodos.menorValor(vetor.length - 1, vetor[9], vetor)); 
        // Chamando a função e mostrando o menor valor
    }
}
