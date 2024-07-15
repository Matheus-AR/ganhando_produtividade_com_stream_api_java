package stream_api.desafio05;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer somaDosMaioresQueCinco = numeros.stream()
                .filter(n -> n > 5)
                .reduce(0, Integer::sum);

        double mediaDosMaioresQueCinco = (double) somaDosMaioresQueCinco / numeros.size();

        System.out.println("Média dos números maiores que 5: " + String.format("%.2f", mediaDosMaioresQueCinco));
    }
}
