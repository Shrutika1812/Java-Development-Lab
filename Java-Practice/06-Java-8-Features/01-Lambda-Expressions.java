public class LambdaExpressions {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Lambda expression executed.");
        task.run();
    }
}
