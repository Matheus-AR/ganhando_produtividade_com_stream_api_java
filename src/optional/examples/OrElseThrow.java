package optional.examples;

import java.util.Optional;

public class OrElseThrow {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));
    }
}
