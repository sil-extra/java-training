package hw12_zoo;

public class Bird extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }

    @Override
    public void move() {
        System.out.println("Bird flies");
    }
}
