package optional.examples;

import java.util.Optional;

public class Empty {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.empty();
        System.out.println(optionalValue.isPresent());
    }
}
