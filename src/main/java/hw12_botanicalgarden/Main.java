package hw12_botanicalgarden;

public class Main {
    public static void main(String[] args) {
        Plant orchid = new Orchid();
        Plant cactus = new Cactus();
        BotanicalGarden garden = new BotanicalGarden();

        garden.setCurrentPlant(orchid);
        garden.takeCareOfPlant();

        garden.setCurrentPlant(cactus);
        garden.takeCareOfPlant();
    }
}
