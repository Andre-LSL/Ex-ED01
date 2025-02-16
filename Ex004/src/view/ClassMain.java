package view;

import javax.swing.JOptionPane;
import controller.metodos;
public class ClassMain {
    public static void main (String args []) {
        int vetor[] = new int[10]; // criamos o vetor N
        metodos mt = new metodos(); // criamos o objeto para chamar a função calc

        for(int i = 0; i < 10; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor")); 
            // preenchemos o vetor
        }
        System.out.println(mt.calcValores(vetor, vetor.length - 1)); // chamamos a recursiva e exibimos.
    }
}
