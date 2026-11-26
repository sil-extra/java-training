package hw12_zoo;

public class Zoo {
    private Animal currentAnimal;

    public void setCurrentAnimal(Animal animal) {
        this.currentAnimal = animal;
    }

    public void showAnimalBehavior() {
        currentAnimal.makeSound();
        currentAnimal.move();
    }
}
