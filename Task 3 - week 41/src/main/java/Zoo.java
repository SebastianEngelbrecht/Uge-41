import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo(){
        this.animals = new ArrayList();
    }

    public void makeAllSounds(){
        for (Animal animal: this.animals
             ) {
            animal.makeSound();
        }
    }

    public void numberOfLegs(){
        int sum = 0;
        for (Animal animals: this.animals
             ) {
            sum += animals.getNumberOfLegs();
        }
        System.out.println("Total number of legs is " + sum);
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);

    }

}
