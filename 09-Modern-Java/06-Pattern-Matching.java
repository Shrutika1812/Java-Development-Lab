record Point(int x, int y) {}

class PatternMatchingExample {
    public static void main(String[] args) {
        Object value = new Point(10, 20);

        if (value instanceof Point(int x, int y)) {
            System.out.println("X: " + x);
            System.out.println("Y: " + y);
        }
    }
}
