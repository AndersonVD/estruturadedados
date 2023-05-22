package tempoExecucao;

import java.util.Arrays;

public class TempoExecucaoAlgoritmo {
    public static void main(String[] args) {
        int[] tamanhosEntrada = { 1000, 10000, 100000, 1000000, 10000000, 100000000 };
        // Executa algoritmo para cada tamanho de entrada
        for (int tamanho : tamanhosEntrada) {
            int[] entrada = gerarEntrada(tamanho);

            // marca o tempo de invio
            long inicio = System.nanoTime();

            // Chama o algoritmo a ser testado
            meuAlgoritmo(entrada);

            // Marca o tempo de fim
            long fim = System.nanoTime();

            // Calcula o tempo de execução em milisegundos
            double tempoExecucao = (fim - inicio) / 10000000.0;

            System.out.println("Tempo de execução para tamanho " + tamanho + ":" + tempoExecucao + "ms");
        }
    }

    // Exemplo de algoritmo a ser testado
    public static void meuAlgoritmo(int[] arr) {
        Arrays.sort(arr);// ordena array
    }

    // Gera uma entrada aleatória para testes
    public static int[] gerarEntrada(int tamanho) {
        int[] arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

}
