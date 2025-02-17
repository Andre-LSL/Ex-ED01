package controller;

public class Metodos {

    public int multiplicacao (int valor, int multiplicador) {
        return (multiplicador == 1) ? valor : valor + multiplicacao(valor, multiplicador-1);
    }

}
