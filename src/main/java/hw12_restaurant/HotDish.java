package hw12_restaurant;

public class HotDish extends Dish{
    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature(){
        return this.temperature;
    }

    public void showDescription() {
        System.out.println("Hot dish with the temperature: " + this.getTemperature());
    }
}
