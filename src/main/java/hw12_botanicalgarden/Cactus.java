package hw12_botanicalgarden;

public class Cactus implements Plant{
    @Override
    public void water() {
        System.out.println("Cactus requires rare watering");
    }

    @Override
    public void light() {
        System.out.println("Cactus requires lots of light");
    }
}
