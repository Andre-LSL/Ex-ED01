package view;
import javax.swing.JOptionPane;
import controller.Metodos;

public class ClassMain {
    public static void main (String args[]) {
        int a, b; 
        Metodos mt = new Metodos(); 
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor da soma")); // recebe valor a
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor valor da soma")); // recebe valor b
        System.out.println(mt.FuncaoSoma(a, b)); // chama a função rec e exibe resultado
    }
}



