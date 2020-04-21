package restaurant.menu;

import restaurant.ingredient.Ingredient;
import java.util.List;

public class MainCourse extends Dish {

    public MainCourse(String name, List<Ingredient> ingredients, double dishPrice) {
        super(name, ingredients, dishPrice);
    }
}
