import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Shrutika");
        names.add("Avadhut");
        names.add("Rahul");

        System.out.println(names);
        System.out.println("First name: " + names.get(0));
    }
}
