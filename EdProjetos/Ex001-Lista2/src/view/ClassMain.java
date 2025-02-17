package view;

import javax.swing.JOptionPane;
import controller.*;

public class ClassMain {
    public static void main (String args []) {
        int valor, valorMultiplicar;
        Metodos mtd = new Metodos();
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser multiplicado."));
        valorMultiplicar = Integer.parseInt(JOptionPane.showInputDialog("Digite o multiplicador."));
        System.out.println(mtd.multiplicacao(valor, valorMultiplicar));
    }
}
