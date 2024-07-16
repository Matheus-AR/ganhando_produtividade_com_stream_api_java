package optional.examples;

import java.util.Optional;

public class Get {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.get());
    }
}
