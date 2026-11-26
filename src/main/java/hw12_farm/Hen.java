package hw12_farm;

public class Hen implements FarmAnimal{
    @Override
    public void feed() {
        System.out.println("The hen requires grain.");
    }

    @Override
    public void produce() {
        System.out.println("The hen lays eggs.");
    }
}
