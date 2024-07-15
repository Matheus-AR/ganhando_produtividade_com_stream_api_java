package stream_api.desafio04;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 0);

        numeros = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        numeros.forEach(System.out::println);
    }
}
