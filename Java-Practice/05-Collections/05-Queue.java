import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Task 1");
        queue.offer("Task 2");
        queue.offer("Task 3");

        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.poll());
        System.out.println("Remaining: " + queue);
    }
}
