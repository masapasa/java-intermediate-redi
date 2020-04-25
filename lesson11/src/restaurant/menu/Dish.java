package restaurant.menu;

import restaurant.ingredient.Ingredient;
import restaurant.ingredient.Inventory;

import java.util.List;
import java.util.Map;

public abstract class Dish {
    private String name;
    private List<Ingredient> ingredients;
    private double dishPrice;
    private boolean isVegetarian;
    private boolean isVegan;
    private boolean isGlutenFree;

    public Dish(String name, double dishPrice) {
        this.name = name;
        this.dishPrice = dishPrice;
    }

    public Dish(String name, List<Ingredient> ingredients, double dishPrice) {
        this.name = name;
        this.ingredients = ingredients;
        setIsVegetarian();
        setIsVegan();
        setIsGlutenFree();
        this.dishPrice = dishPrice;
    }

    private void setIsVegetarian() {
        this.isVegetarian = true;
        Map<String, Ingredient> inventory = Inventory.getInventory();

        for (Ingredient ingredient : ingredients) {
            Ingredient ingredient1 = inventory.get(ingredient);
            if (ingredient1 != null) {
                if (ingredient1.getName().equals("meat")) {
                    this.isVegetarian = false;
                }
            }
        }
    }

    private void setIsVegan() {
        this.isVegan = true;
        Map<String, Ingredient> inventory = Inventory.getInventory();

        for (Ingredient ingredient : ingredients) {
            Ingredient ingredient1 = inventory.get(ingredient);
            if (ingredient1 != null) {
                if (ingredient1.getName().equals("meat")) {
                    this.isVegan = false;
                }
            }
        }
    }

    private void setIsGlutenFree() {
        this.isGlutenFree = true;
        Map<String, Ingredient> inventory = Inventory.getInventory();

        for (Ingredient ingredient : ingredients) {
            Ingredient ingredient1 = inventory.get(ingredient);
            if (ingredient1 != null) {
                if (ingredient1.getName().equals("glutenIn")) {
                    this.isGlutenFree = false;
                }
            }
        }
    }

    public boolean isVegetarian() { return isVegetarian; }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }
}
