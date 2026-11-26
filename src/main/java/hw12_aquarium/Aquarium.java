package hw12_aquarium;

public class Aquarium {
    private SeaCreature currentCreature;

    public void setCurrentCreature(SeaCreature seaCreature) {
        this.currentCreature = seaCreature;
    }

    public void showSeaCreatureBehavior() {
        currentCreature.move();
    }
}
