package stream_api.desafio06;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosMaiorQueDez = numeros.stream()
                .anyMatch(n -> n > 10);

        System.out.println("Existe algum número maior que 10? " + numerosMaiorQueDez);

        System.out.println("---------------------------------------------------");

        numeros.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);
    }
}
