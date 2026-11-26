package hw12_farm;

public class Main {
    public static void main(String[] args) {
        FarmAnimal cow = new Cow();
        FarmAnimal hen = new Hen();
        Farm farm = new Farm();

        farm.setFarmAnimal(cow);
        farm.manageAnimal();

        farm.setFarmAnimal(hen);
        farm.manageAnimal();
    }
}
