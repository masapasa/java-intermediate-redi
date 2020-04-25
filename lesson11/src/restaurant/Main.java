package restaurant;

import restaurant.ingredient.Ingredient;
import restaurant.ingredient.Inventory;
import restaurant.ingredient.Meat;
import restaurant.menu.*;
import restaurant.order.Bill;
import restaurant.order.Order;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Map<String, Ingredient> inventory = Inventory.getInventory();

        Dish guacamole = new Starter("Guacamole", Arrays.asList(inventory.get("avocado"), inventory.get("onion"), inventory.get("tomatoes"), inventory.get("jalapeno pepper"), inventory.get("garlic"), inventory.get("lemon")), 3);
        Dish hummus = new Starter("Hummus", Arrays.asList(inventory.get("chickpeas"), inventory.get("lemon"), inventory.get("garlic"), inventory.get("sesame")), 2.5);
        Dish bruschetta = new Starter("Bruschetta", Arrays.asList(inventory.get("bread"), inventory.get("garlic"), inventory.get("avocado"), inventory.get("lemon"), inventory.get("salmon")), 4.8);

        Dish pasta = new MainCourse("Pasta Carbonara", Arrays.asList(inventory.get("nudels"), inventory.get("egg"), inventory.get("meat"), inventory.get("cheese")), 8);
        Dish amatriciana = new MainCourse("Amatriciana", Arrays.asList(inventory.get("meat"), inventory.get("tomatoes"), inventory.get("cheese")), 8.5);
        Dish mousaka = new MainCourse("Mousaka", Arrays.asList(inventory.get("aubergine"), inventory.get("zucchini"), inventory.get("tomatoes")), 9.9);

        Dish tiramisu = new Dessert("Tiramisu", Arrays.asList(inventory.get("mascarpone"), inventory.get("espresso"), inventory.get("cookies"), inventory.get("egg")), 6);
        Dish strawGlass = new Dessert("Strawberry dessert in a glass", Arrays.asList(inventory.get("cookies"), inventory.get("berries"), inventory.get("ricotta"), inventory.get("mascarpone"), inventory.get("yoghurt"), inventory.get("lemon")), 5.5);
        Dish cheesecake = new Dessert("Cheesecake", Arrays.asList(inventory.get("medjool dates"), inventory.get("walnuts"), inventory.get("cashew"), inventory.get("lemon"), inventory.get("maple syrup"), inventory.get("coconut yogurt"), inventory.get("berries")), 5);

        Dish coffee = new Drink("Coffee", 2);
        Dish tee = new Drink("Tee", 1);
        Dish juice = new Drink("Juice", 1.2);

        List<Dish> mainCourses = new ArrayList<>();
        mainCourses.add(pasta);
        mainCourses.add(amatriciana);
        mainCourses.add(mousaka);

        List<Dish> starters = new ArrayList<>();
        starters.add(guacamole);
        starters.add(hummus);
        starters.add(bruschetta);

        List<Dish> desserts = new ArrayList<>();
        desserts.add(tiramisu);
        desserts.add(strawGlass);
        desserts.add(cheesecake);

        List<Dish> drinks = new ArrayList<>();
        drinks.add(coffee);
        drinks.add(tee);
        drinks.add(juice);

        menu.setMainCourse(mainCourses);
        menu.setStarters(starters);
        menu.setDessert(desserts);
        menu.setDrinks(drinks);
//        menu.printingMenu();

        Order order = new Order();
        order.makeOrder(menu);

        Bill myBill = new Bill(order);
        myBill.printBill();

    }
}
