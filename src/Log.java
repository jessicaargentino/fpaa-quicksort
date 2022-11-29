import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Log {

    public static void logQuickSortInsertion(int entrada, int m, Tempo tempo, int compara, int move)
            throws IOException {

        FileWriter arq = new FileWriter("rlt-quicksortInsertion.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.println(
                "Tamanho da entrada: " + entrada +
                        " | Tamanho M: " + m +
                        " | Tempo de execucao: " + tempo.getTime() +
                        " | Numero de comparacoes: " + compara +
                        " | Movimentacoes: " + move);

        gravarArq.close();
    }

    public static void logQuickSort(int entrada, Tempo tempo, int compara, int move) throws IOException {

        FileWriter arq = new FileWriter("rlt-quicksort.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.println(
                "Tamanho da entrada: " + entrada +
                        " | Tempo de execucao: " + tempo.getTime() +
                        " | Numero de comparacoes: " + compara +
                        " | Movimentacoes: " + move);

        gravarArq.close();
    }
}
