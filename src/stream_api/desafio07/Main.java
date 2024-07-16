package stream_api.desafio07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .max(Comparator.naturalOrder());

        segundoMaior.ifPresent(System.out::println);
    }
}