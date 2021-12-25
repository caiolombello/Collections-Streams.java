package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        // Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        // Navegue na lista exibindo cada nome no console.
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Substitua o nome Carlos por Roberto.
        nomes.set(2, "Roberto");

        // Retorne o nome da posição 1
        nomes.get(1);

        // Remova o nome da posição 4
        nomes.remove(4);

        // Remova o nome João
        nomes.remove("João");

        // Retorne a quantidade de itens na lista.
        System.out.println(nomes.size());

        // Verifique se o nome Juliano existe na lista
        System.out.println(nomes.contains("Juliano"));

        // Crie uma nova lista com os nomes: Ismael e Rodrigo
        List<String> nomes2 = new ArrayList<>();

        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        // Adicione todos os itens da nova lista na primeira lista criada
        nomes.addAll(nomes2);

        // Ordene os itens da lista por ordem alfabética
        Collections.sort(nomes);
        System.out.println(nomes);

        // Verifique se a lsita está vazia
        System.out.println(nomes.isEmpty());
    }
}
