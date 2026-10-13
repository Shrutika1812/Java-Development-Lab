class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println(id + " - " + name);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Employee employee = new Employee("Shrutika", 101);
        employee.display();
    }
}
