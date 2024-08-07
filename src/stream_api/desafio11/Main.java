package stream_api.desafio11;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double somaQuadrados = numeros.stream()
                .reduce(0, (n1, n2) -> n1 * n1 + n2 * n2);

        System.out.println(somaQuadrados);
    }
}
