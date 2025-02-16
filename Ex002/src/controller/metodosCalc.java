package controller;

public class metodosCalc {

    public int menorValor (int tamanho, int menorValor, int vetor[]) {
        if (tamanho < 0) { // Como vetor vai de 0 até x, a condição de parada torna-se < 0.
            return menorValor;
        } else {
            if (vetor[tamanho] < menorValor) { // Verifica se o valor atual é menor ou não
                menorValor = vetor[tamanho]; // realiza a troca de valores caso for
            }
            return menorValor(tamanho-1, menorValor, vetor); // Se não parou, há mais vetor para correr, então chama a recursividade
        }
    }
}
