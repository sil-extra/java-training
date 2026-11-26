package hw12_petmanagement;

public class Dog extends Pet{
    @Override
    public void eat() {
        System.out.println("The dog eats dry food");
    }

    @Override
    public void beActive() {
        System.out.println("The dog walks");
    }
}
