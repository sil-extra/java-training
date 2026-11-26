package hw12_museum;

public class Manuscript implements Exhibit{
    @Override
    public void preserve() {
        System.out.println("Manuscript requires controlled humidity");
    }

    @Override
    public void showHistory() {
        System.out.println("History of manuscript");
    }
}
