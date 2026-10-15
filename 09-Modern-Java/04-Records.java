record Employee(String name, double salary) {}

class RecordsExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Shrutika", 50000);

        System.out.println("Name: " + employee.name());
        System.out.println("Salary: " + employee.salary());
    }
}
