package restaurant.menu;

import restaurant.ingredient.Ingredient;
import java.util.List;

public class Dessert extends Dish {
    public Dessert(String name, List<Ingredient> ingredients, double dishPrice) {
        super(name, ingredients, dishPrice);
    }
}
