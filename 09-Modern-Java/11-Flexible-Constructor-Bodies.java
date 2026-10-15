class User {
    private final String name;

    User(String name) {
        name = name == null || name.isBlank() ? "Unknown" : name;
        super();
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class FlexibleConstructorBodiesExample {
    public static void main(String[] args) {
        User user = new User("Shrutika");
        System.out.println("User: " + user.getName());
    }
}
