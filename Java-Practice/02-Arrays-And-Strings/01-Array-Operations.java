import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {40, 10, 30, 20, 50};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + Arrays.stream(numbers).max().orElse(0));
    }
}
