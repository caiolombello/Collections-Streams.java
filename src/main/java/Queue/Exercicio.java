package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        // Navegue na fila exibindo cada nome no console
        for (String nomes : fila) {
            System.out.println(nomes);
        }

        // Retorne o primeiro item da fila, sem removê-lo
        String aSerAtendido = fila.peek();
        System.out.println("\n" + aSerAtendido);

        // Retorne o primeiro item da fila, removendo o mesmo
        String atendido = fila.poll();
        System.out.println(atendido);

        // Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila.
        fila.add("Daniel");

        // Retorne o tamanho da lista
        System.out.println(fila.size());

        // Verifique se a lista está vazia
        System.out.println(fila.isEmpty());

        // Verifique se o nome Carlos está na lista
        System.out.println(fila.contains("Carlos"));
    }
}
