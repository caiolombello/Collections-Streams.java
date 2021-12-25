package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        // Adicione 5 números inteiros: 3, 88, 20, 44, 3
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        // Navegue no Set exibindo cada número no console
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Remova o primeiro item do Set
        Iterator<Integer> iterator = numeros.iterator();
        numeros.remove(iterator.next());
        System.out.println(numeros);

        // Adicione um novo número no Set: 23
        numeros.add(23);

        // Verifique o tamanho do Set
        System.out.println(numeros.size());

        // Verifique se o Set está vazio
        System.out.println(numeros.isEmpty());
    }
}
