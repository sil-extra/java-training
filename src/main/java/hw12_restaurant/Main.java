package hw12_restaurant;

public class Main {
    public static void main(String[] args) {
        Dish hotDish = new HotDish(65);
        Dish drink = new Drink(250);
        MenuManager manager = new MenuManager();

        manager.addDish(hotDish);
        manager.addDish(drink);
        manager.showMenu();
    }
}
