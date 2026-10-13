import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = null;

        Optional<String> optionalName = Optional.ofNullable(name);

        System.out.println(
                optionalName.orElse("Name not available")
        );
    }
}
