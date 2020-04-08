package restaurant;

public abstract class Dish {
    private String name;
    private String ingredients;
    private double dishPrice;
    private boolean isVegetarian;

    public Dish(String name, String ingredients, double dishPrice, boolean isVegetarian) {
        this.name = name;
        this.ingredients = ingredients;
        this.dishPrice = dishPrice;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
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

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }
}
