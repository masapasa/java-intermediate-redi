package homework.exercise2;
//Exercise 2
//Write a method that takes an array with integers and return an array of unique values of the array

import java.util.HashSet;
import java.util.Set;

public class ArrayOfUniqueValues {
    public static void main(String[] args) {

        int[] values = {4, 2, 3, 4, 5, 6, 1};
        for (int value : arrayOfUniqueValues(values)) {
            System.out.print(value + " ");
        }
    }

    private static int[] arrayOfUniqueValues(int[] numbers) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : numbers) {
            result.add(i);
        }

        int[] uniqueValues = new int[result.size()];
        int c = 0;
        for (int x : result) {
            uniqueValues[c++] = x;
        }
        return uniqueValues;
    }

}
