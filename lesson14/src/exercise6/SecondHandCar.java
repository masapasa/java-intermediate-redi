package exercise6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//Exercise 6
//Write a program that calculates average price of a second hand car based on the list of prices found on EBay.
//The method should return a map where key is a car name and value is a average price

public class SecondHandCar {
    static HashMap<String, List<Integer>> cars = new HashMap<>();

    public static void main(String[] args) {
        cars.put("Toyota", Arrays.asList(10000, 15000, 18000));
        cars.put("BMW", Arrays.asList(20000, 23000, 50000));
        cars.put("Audi", Arrays.asList(35000, 43000, 18000, 50000));

        averagePrice("Toyota");
        averagePrice("BMW");
        averagePrice("Audi");
    }

    static HashMap<String, Integer> averagePrice(String carName) {
        HashMap<String, Integer> average = new HashMap<>();

        List<Integer> prices = cars.get(carName);
        int sum = 0;
        for (Integer price : prices) {
            sum += price;
            average.put(carName, sum / prices.size());
        }
        System.out.println(average);
        return average;
    }
}
