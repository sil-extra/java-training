package hw12_amusementpark;

public class AmusementPark {
    private Attraction currentAttraction;

    public void setCurrentAttraction(Attraction attraction) {
        this.currentAttraction = attraction;
    }

    public void controlAttraction() {
        currentAttraction.maintain();
    }

    public void showAttractionDescription() {
        currentAttraction.info();
    }
}
