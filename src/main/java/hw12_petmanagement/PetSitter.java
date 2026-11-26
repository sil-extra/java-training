package hw12_petmanagement;

public class PetSitter {
    private Pet currentPet;

    public void setCurrentPet(Pet pet) {
        this.currentPet = pet;
    }

    public void takeCareOfPet() {
        currentPet.beActive();
        currentPet.eat();
    }
}
