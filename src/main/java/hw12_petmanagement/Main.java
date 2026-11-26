package hw12_petmanagement;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();
        PetSitter petSitter = new PetSitter();

        petSitter.setCurrentPet(dog);
        petSitter.takeCareOfPet();

        petSitter.setCurrentPet(cat);
        petSitter.takeCareOfPet();
    }
}
