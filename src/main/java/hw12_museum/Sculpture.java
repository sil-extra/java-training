package hw12_museum;

public class Sculpture implements Exhibit{
    @Override
    public void preserve() {
        System.out.println("The sculpture needs restoration.");
    }

    @Override
    public void showHistory() {
        System.out.println("The history of sculpture");
    }
}
