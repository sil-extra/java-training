package hw12_amusementpark;

public class Main {
    public static void main(String[] args) {
        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();
        AmusementPark park = new AmusementPark();

        park.setCurrentAttraction(rollerCoaster);
        park.showAttractionDescription();
        park.controlAttraction();

        park.setCurrentAttraction(carousel);
        park.showAttractionDescription();
        park.controlAttraction();
    }
}
