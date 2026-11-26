package hw12_amusementpark;

public class RollerCoaster implements Attraction{
    @Override
    public void maintain() {
        System.out.println("Roller Coaster requires Safety Check");
    }

    @Override
    public void info() {
        System.out.println("Roller coaster's description");
    }
}
