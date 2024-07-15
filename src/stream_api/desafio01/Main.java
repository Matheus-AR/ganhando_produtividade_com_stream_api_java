package stream_api.desafio01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Mostre a lista na ordem numérica
        numeros.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
