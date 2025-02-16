package controller;

public class Metodos {

    public double calcularSoma (int valor) {
        return (valor == 1) ? 1 : 1.0/valor + calcularSoma(valor - 1);
        // a condição de parada torna-se 1, pois o primeiro valor da sequência é 1.
        // A divisão já ocorre em double pois o valor está divivindo 1.0, não apenas 1
        //Ele soma com o resultado da recursiva anterior.
    }
}
