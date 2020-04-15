package restaurant;

import java.util.List;

public class Starter extends Dish{
    public Starter(String name, List<String> ingredients, double dishPrice, boolean isVegetarian, boolean isVegan, boolean isGlutenFree) {
        super(name, ingredients, dishPrice, isVegetarian, isVegan, isGlutenFree);
    }
}
