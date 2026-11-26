package hw12_farm;

public class Cow implements FarmAnimal{
    @Override
    public void feed() {
        System.out.println("The cow needs to be grazed.");
    }

    @Override
    public void produce() {
        System.out.println("The cow produces milk.");
    }
}
