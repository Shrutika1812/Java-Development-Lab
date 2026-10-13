import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "Shrutika");
        employees.put(102, "Rahul");

        System.out.println(employees);
        System.out.println("Employee 101: " + employees.get(101));
    }
}
