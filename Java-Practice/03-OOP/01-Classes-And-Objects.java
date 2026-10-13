class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Shrutika";
        student.age = 24;
        student.display();
    }
}
