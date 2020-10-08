public class Animal implements AnimalSound {

private int numberOfLegs;


    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void makeSound() {
        System.out.println("Undefined animals make no sounds");
    }
}
