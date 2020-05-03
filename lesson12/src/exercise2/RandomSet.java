package exercise2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
//Exercise 2
//Write a static method randomSet that will return a HashSet containing a collection of n unique random numbers in range 0-100.
//In the main method iterate over the returned Set and print each number multiplied by 2. Where n is a number of random elements in set.

public class RandomSet {
    public static void main(String[] args) {

        Set<Integer> numbers = randomSet(10);
        for (int number : numbers) {
            System.out.println(number * 2);
        }
        System.out.println("\n\n");
//Exercise 3
//Change data type in previous exercise from HashSet to TreeSet
        Set<Integer> treeSetNumbers = new TreeSet<>(numbers);
        for (int num : treeSetNumbers) { //treeSetNumbers.forEach(num -> System.out.println(num * 2));
            System.out.println(num * 2);
        }
    }

//This method returns a HashSet containing a collection of n unique random numbers in range 0-100.
//Where n is a number of random elements in set
    static Set<Integer> randomSet(int n) {
        Set<Integer> numbers = new HashSet<>();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int value = r.nextInt(100);
            numbers.add(value);
        }
        return numbers;
    }
}
