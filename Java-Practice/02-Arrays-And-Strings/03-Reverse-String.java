public class ReverseString {
    public static void main(String[] args) {
        String text = "Java";
        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }
}
