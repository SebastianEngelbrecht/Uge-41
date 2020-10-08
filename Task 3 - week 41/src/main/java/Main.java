public class Main {
    public static void main (String[] args){
        Animal cat = new Cat(4);
        Animal bird = new Bird(2);
        Animal dog = new Dog(4);
        Zoo zoo = new Zoo();


        zoo.addAnimal(cat);
        zoo.addAnimal(dog);
        zoo.addAnimal(bird);
        zoo.makeAllSounds();
        zoo.numberOfLegs();

    }
}
