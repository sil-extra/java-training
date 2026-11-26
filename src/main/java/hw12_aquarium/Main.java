package hw12_aquarium;

public class Main {
    public static void main(String[] args) {
        SeaCreature starFish = new StarFish();
        SeaCreature shark = new Shark();
        Aquarium aquarium = new Aquarium();

        aquarium.setCurrentCreature(starFish);
        aquarium.showSeaCreatureBehavior();

        aquarium.setCurrentCreature(shark);
        aquarium.showSeaCreatureBehavior();
    }
}
