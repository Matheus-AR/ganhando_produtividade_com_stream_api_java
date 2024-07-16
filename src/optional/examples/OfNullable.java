package optional.examples;

import java.util.Optional;

public class OfNullable {
    public static void main(String[] args) {
        String nullableValue = null;
        Optional<String> optionalValue = Optional.ofNullable(nullableValue);
        System.out.println(optionalValue.isPresent());
    }
}
