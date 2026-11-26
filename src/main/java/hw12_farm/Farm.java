package hw12_farm;

public class Farm {
    private FarmAnimal farmAnimal;

    public void setFarmAnimal(FarmAnimal animal) {
        this.farmAnimal = animal;
    }

    public void manageAnimal() {
        farmAnimal.feed();
        farmAnimal.produce();
    }
}
