package view;

import javax.swing.JOptionPane;
import controller.MetodosCalcular;

public class classMain {
    public static void main (String args []) {
        int N;
        MetodosCalcular metodos = new MetodosCalcular(); // Cria o objeto metodos, com as funções da classe MetodosCalcular.
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N")); // Permite ao usuário digitar o valor
        System.out.println(metodos.calcular(N)); //  Chama a função recursiva e exibe o resultado.
    }
}
