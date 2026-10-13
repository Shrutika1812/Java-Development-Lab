@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;

        System.out.println("Result: " + addition.calculate(10, 20));
    }
}
