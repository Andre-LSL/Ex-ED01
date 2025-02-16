package view;
import javax.swing.JOptionPane;
import controller.Metodos;
public class ClassMain {
    public static void main (String args[]) {
        int n;
        Metodos mt = new Metodos(); // cria o obj 
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor N para somar com seus anteriores.")); // requisita um valor
        System.out.println(mt.calcularSoma(n)); // Chama a função e exibe o seu resultdado
    }
}
