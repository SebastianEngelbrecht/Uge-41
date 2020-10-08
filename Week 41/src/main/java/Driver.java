public class Driver {
    String name;
    int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Is driven by " + name;
    }
}
