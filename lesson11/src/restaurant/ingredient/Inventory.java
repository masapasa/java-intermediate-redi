package restaurant.ingredient;

import restaurant.ingredient.AnotherIngredient;
import restaurant.ingredient.Ingredient;
import restaurant.ingredient.Meat;
import restaurant.ingredient.Vegetables;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private static Map<String, Ingredient> inventory = new HashMap<>();

    public Inventory() {
        init();
    }

    private void init() {
        Ingredient meat = new Meat("meat", 10);
        Ingredient vegetables = new Vegetables("vegetables", 20);
        Ingredient another = new AnotherIngredient("another", 30);

        inventory.put("avocado", vegetables);
        inventory.put("onion", vegetables);
        inventory.put("tomatoes", vegetables);
        inventory.put("jalapeno pepper", vegetables);
        inventory.put("garlic", vegetables);
        inventory.put("lemon", vegetables);
        inventory.put("chickpeas", vegetables);
        inventory.put("sesame", vegetables);
        inventory.put("aubergine", vegetables);
        inventory.put("zucchini", vegetables);
        inventory.put("berries", vegetables);
        inventory.put("medjool dates", vegetables);
        inventory.put("walnuts", vegetables);
        inventory.put("cashew", vegetables);
        inventory.put("maple syrup", vegetables);
        inventory.put("coconut yogurt", vegetables);
        inventory.put("meat", meat);
        inventory.put("salmon", meat);
        inventory.put("egg", meat);
        inventory.put("cheese", meat);
        inventory.put("mascarpone", meat);
        inventory.put("ricotta", meat);
        inventory.put("yoghurt", meat);
        inventory.put("bread", another);
        inventory.put("nudels", another);
        inventory.put("espresso", another);
        inventory.put("cookies", another);

    }

    public static Map<String, Ingredient> getInventory() {
        return inventory;
    }
}
