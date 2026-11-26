package hw12_amusementpark;

public class Carousel implements Attraction{
    @Override
    public void maintain() {
        System.out.println("Carousel requires Maintenance");
    }

    @Override
    public void info() {
        System.out.println("Carousel's description");
    }
}
