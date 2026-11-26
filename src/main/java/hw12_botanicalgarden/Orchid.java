package hw12_botanicalgarden;

public class Orchid implements Plant{
    @Override
    public void water() {
        System.out.println("Orchid requires high humidity");
    }

    @Override
    public void light() {
        System.out.println("Orchid requires shade");
    }
}
