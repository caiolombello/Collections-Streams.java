package Optional;

import java.util.Optional;

public class Exercicio {
    public static void main(String[] args) {
        // Crie com estado vazio, estado presente e com null
        Optional<String> emptyOptionalString = Optional.empty();
        Optional<String> presentOptionalString = Optional.of("Presente");
        Optional<String> nullOptionalString = Optional.ofNullable(null);

        // Se presente, exiba o valor no console
        emptyOptionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente."));
        presentOptionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente."));
        nullOptionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente."));

        // Se vazio, lançe uma exceção IllegalStateException
        // Se vazio, exiba "Optional vazio" no console
        if (emptyOptionalString.isEmpty()) {
            System.out.println("Optional vazio.");
        }

        if (presentOptionalString.isEmpty()) {
            presentOptionalString.orElseThrow(IllegalStateException::new);
            System.out.println("Optional vazio.");
        }

        if (nullOptionalString.isEmpty()) {
            System.out.println("Optional vazio.");
        }

        // Se presente, transforme o valor e exiba no console
        // Se presente, pegue o valor do optional e atribua em uma variável
        if (presentOptionalString.isPresent()) {
            String valor = presentOptionalString.get();
        }

        presentOptionalString.map((valor) -> valor.concat(" está.")).ifPresent(System.out::println);

    }
}
