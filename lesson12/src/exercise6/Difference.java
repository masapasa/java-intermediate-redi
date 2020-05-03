package exercise6;
//Exercise 6
//Write a static method difference that will return a difference between two sets given by parameters.
//Note - sets given by parameters may not be modified.

import java.util.HashSet;
import java.util.Set;

public class Difference {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println(difference(set1, set2));
    }

//difference between two sets given by parameters
    private static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : set1) {
            if (!set2.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
