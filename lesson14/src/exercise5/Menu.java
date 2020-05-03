package exercise5;

import java.util.HashMap;
import java.util.Map;
//Exercise 5
//Write a method program that contains a pizza menu - we are interested only in pizza name and it's price.
//For simplification we can assume that all pizzas are sold in the same size and price is an Integer.
//Write a method that takes how much money there is in your wallet and it returns Map of pizzas and their prices, that you can afford

public class Menu {

    static HashMap<String, Integer> pizzas = new HashMap<>();

    public static void main(String[] args) {
        pizzas.put("Margarita", 5);
        pizzas.put("Salami", 6);
        pizzas.put("Prosciutto", 8);
        pizzas.put("Caprese", 11);

        offer(8);
    }

    static HashMap<String, Integer> offer(Integer wallet) {
        HashMap<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : pizzas.entrySet()) {
            if (wallet >= entry.getValue()) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        if (result.isEmpty()) {
            System.out.println("You dont have enough money :( ");
        } else {
            System.out.println("It's your choice: " + result);
        }
        return result;
    }
}
