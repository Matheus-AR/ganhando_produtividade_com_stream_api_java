package optional.examples;

import java.util.Optional;

public class IsEmpty {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        System.out.println(optionalValue.isEmpty());
    }
}
