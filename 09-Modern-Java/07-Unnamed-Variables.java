class UnnamedVariablesExample {
    public static void main(String[] args) {
        try {
            Integer.parseInt("not-a-number");
        } catch (NumberFormatException _) {
            System.out.println("Invalid number");
        }
    }
}
