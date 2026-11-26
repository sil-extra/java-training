package hw12_restaurant;

public class Drink extends Dish{
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void showDescription() {
        System.out.println("Drink with the volume: " + this.getVolume());
    }
}
