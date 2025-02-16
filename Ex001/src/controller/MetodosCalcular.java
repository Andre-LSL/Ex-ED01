package controller;

public class MetodosCalcular {


    public int calcular (int valor) {
        int soma = valor;
        return (soma < 1) ? 0 : soma + calcular(valor - 1);
        // Basicamente, um ternário. Ele verifica se o valor é menor que 1, caso seja, retorna 0. 
        // Caso não, ele entra na recursividade e calcula a soma dos valores anteriores a N.
        // Isso também garante que retorne 0 para valores negativos.
        }
    }



