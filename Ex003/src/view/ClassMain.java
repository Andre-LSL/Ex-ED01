package view;

import javax.swing.JOptionPane;

import controller.metodos;

public class ClassMain {
    public static void main (String args []) {
        int valorFat;
        metodos mt = new metodos();
        
            do {
                valorFat = Integer.parseInt(JOptionPane.showInputDialog("Digite um entre 1 e 12 para calcular.")); 
            } while (valorFat > 12 || valorFat < 1); 
            // Verifica se o valor digitado é válido, caso não seja, requisita outra valor.
            // O proprio loop verifica o valor.

        System.out.println(mt.fatorialCalc(valorFat)); // Chama a recursiva e exibe o resultado.
    }
}
