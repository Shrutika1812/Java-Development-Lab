class VarExample {
    public static void main(String[] args) {

        // Local variable type inference using var
        var name = "Shrutika";
        var age = 24;
        var salary = 50000.0;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // var can also be used with collections
        var skills = java.util.List.of(
                "Java",
                "Spring Boot",
                "SQL"
        );

        System.out.println("\nSkills:");
        skills.forEach(System.out::println);
    }
}
