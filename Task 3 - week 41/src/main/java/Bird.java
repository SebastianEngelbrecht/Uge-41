public class Bird extends Animal {

    public Bird(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void makeSound() {
        System.out.println("Peeb Peeb");
    }
}
