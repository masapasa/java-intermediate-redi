package restaurant;

import java.util.*;

public class Restaraunt {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Dish guacamole = new Starter("Guacamole", Arrays.asList("avocado", "onion", "tomatoes", "jalapeno pepper", "garlic", "lemon"), 3, true, true, true);
        Dish hummus = new Starter("Hummus", Arrays.asList("chickpeas", "lemon", "garlic", "sesame"), 2.5, true, true, true);
        Dish bruschetta = new Starter("Bruschetta", Arrays.asList("bread", "garlic", "avocado", "lemon", "salmon"), 4.8, false, false, false);

        Dish pasta = new MainCourse("Pasta Carbonara", Arrays.asList("nudels", "egg", "meat", "cheese"), 8, false, false, false);
        Dish amatriciana = new MainCourse("Amatriciana", Arrays.asList("meat", "tomatoes", "cheese"), 8.5, false, false, true);
        Dish mousaka = new MainCourse("Mousaka", Arrays.asList("aubergine", "zucchini", "tomatoes"), 9.9, true, true, true);

        Dish tiramisu = new Dessert("Tiramisu", Arrays.asList("mascarpone", "espresso", "cookies", "egg"), 6, false, false, false);
        Dish strawGlass = new Dessert("Strawberry dessert in a glass", Arrays.asList("cookies", "berries", "ricotta", "mascarpone", "yoghurt", "lemon"), 5.5, false, false, false);
        Dish cheesecake = new Dessert("Cheesecake", Arrays.asList("medjool dates", "walnuts", "cashew", "lemon", "maple syrup", "coconut yogurt", "berries"), 5, true, true, true);

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

        Bill myBill = new Bill();
        myBill.printBill(order);


    }
}
