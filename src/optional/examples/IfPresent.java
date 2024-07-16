package optional.examples;

import java.util.Optional;

public class IfPresent {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello");
        optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));
    }
}
