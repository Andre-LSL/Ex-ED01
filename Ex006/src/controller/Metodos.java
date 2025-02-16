package controller;

public class Metodos {
    public int FuncaoSoma (int primeiroValor, int segundoValor) {
        if (segundoValor == 0) { // verifica se o segundo valor já está == 0
            return primeiroValor; // retorna o primeiro valor
        } else {
            primeiroValor++; // incrementa +1 ao primeiro valor
            return FuncaoSoma(primeiroValor, segundoValor - 1); // chama a função recursiva
            // A lógica se resume em incrementar ao primeiro valor, enquanto o segundo valor
            // não for igual a 0. Dessa forma, realizamos a "adição" sem usar o operador.
            // Nesse caso, apenas retornamos o primeiro valor, ao chegar no fim da recursiva
        }
    }
}
