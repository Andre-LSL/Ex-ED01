package controller;

public class metodos {

    public int fatorialCalc (int valor) {
        return (valor == 0) ? 1: valor * fatorialCalc(valor - 1);
        // Recursiva utilizando um ternário. Condição de parada é quando o valor atingir 0, retornando 1.
        // Realiza a multiplicação: valor atual * o resultado da recursiva.
    }
}
