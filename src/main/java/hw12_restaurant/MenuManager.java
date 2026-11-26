package hw12_restaurant;

import java.util.ArrayList;
import java.util.List;

public class MenuManager {
    private List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish dish) {
        this.dishes.add(dish);
    }

    public void showMenu() {
        for(int i = 0; i < dishes.size(); i++) {
            this.dishes.get(i).showDescription();
        }
    }
}
