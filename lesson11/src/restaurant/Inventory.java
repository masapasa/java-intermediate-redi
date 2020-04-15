package restaurant;

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
        inventory.put("meat", meat);
        inventory.put("vegetables", vegetables);
    }

    public static Map<String, Ingredient> getInventory() {
        return inventory;
    }
}
