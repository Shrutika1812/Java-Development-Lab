import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.addFirst("Kolhapur");

        System.out.println(cities);
        cities.remove("Mumbai");
        System.out.println(cities);
    }
}
