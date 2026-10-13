public class StringOperations {
    public static void main(String[] args) {
        String text = "Java Programming";

        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Contains Java: " + text.contains("Java"));
        System.out.println("First character: " + text.charAt(0));
    }
}
