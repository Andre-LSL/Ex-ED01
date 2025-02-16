package controller;

public class metodos {

    public int calcValores (int vt[], int tamanho) {
        int count = 0; // Cria o contador
         if (tamanho < 0) { // verifica se o vetor foi percorrido
            return 0; // caso tenha sido percorrido, retorna 0 
         } else { // caso não, continua a recursiva
            if (vt[tamanho] < 0) { // verifica se o valor é negativo
                count++; // caso seja incrementa 1
            }
            return count + calcValores(vt, tamanho - 1); // retorna o contador e chama a recursiva
            // dessa forma temos como realizar a contagem, basta retornar o contador 
            // e somar com o resultado da proxima chamada.
         }
    }
}
