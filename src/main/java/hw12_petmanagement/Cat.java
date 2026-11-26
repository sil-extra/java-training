package hw12_petmanagement;

public class Cat extends Pet{
    @Override
    public void eat() {
        System.out.println("The cat eats wet food");
    }

    @Override
    public void beActive() {
        System.out.println("The cat plays");
    }
}
