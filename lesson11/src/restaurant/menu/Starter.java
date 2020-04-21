package restaurant.menu;

import restaurant.ingredient.Ingredient;
import java.util.List;

public class Starter extends Dish {
    public Starter(String name, List<Ingredient> ingredients, double dishPrice) {
        super(name, ingredients, dishPrice);
    }
}
