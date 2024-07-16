package stream_api.desafio19;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 30, 45);

        int somaDivisiveisPor3e5 = numeros.stream()
                .filter(n -> n % 3 == 0)
                .filter(n -> n % 5 == 0)
                .reduce(0, Integer::sum);

        System.out.println("Soma dos numeros divisíveis por 3 e 5: " + somaDivisiveisPor3e5);
    }
}
