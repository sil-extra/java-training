package hw12_botanicalgarden;

public class BotanicalGarden {
    private Plant currentPlant;

    public void setCurrentPlant(Plant plant) {
        this.currentPlant = plant;
    }

    public void takeCareOfPlant() {
        currentPlant.light();
        currentPlant.water();
    }
}
