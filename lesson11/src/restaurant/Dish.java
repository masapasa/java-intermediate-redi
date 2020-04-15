package restaurant;

import java.util.List;
import java.util.Map;

public abstract class Dish {
    private String name;
    private List<String> ingredients;
    private double dishPrice;
    private boolean isVegetarian;
    private boolean isVegan;
    private boolean isGlutenFree;

    public Dish(String name, double dishPrice) {
        this.name = name;
        this.dishPrice = dishPrice;
    }

    public Dish(String name, List<String> ingredients, double dishPrice, boolean isVegetarian, boolean isVegan, boolean isGlutenFree) {
        this.name = name;
        this.ingredients = ingredients;
        setIsVegetarian();

        this.dishPrice = dishPrice;
//        this.isVegetarian = isVegetarian;
        this.isVegan = isVegan;
        this.isGlutenFree = isGlutenFree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    private void setIsVegetarian() {
        this.isVegetarian = true;
        Map<String, Ingredient> inventory = Inventory.getInventory();
        for (String ingredient : ingredients) {
            Ingredient ingredient1 = inventory.get(ingredient);
            if (ingredient1.name.equals("meat")) {
                this.isVegetarian = false;
            }
        }
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }
}
