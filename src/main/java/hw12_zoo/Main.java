package hw12_zoo;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        Animal bird = new Bird();
        Zoo zoo = new Zoo();

        zoo.setCurrentAnimal(elephant);
        zoo.showAnimalBehavior();

        zoo.setCurrentAnimal(bird);
        zoo.showAnimalBehavior();
    }
}
