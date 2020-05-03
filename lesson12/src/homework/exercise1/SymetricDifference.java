package homework.exercise1;

import java.util.HashSet;
import java.util.Set;

//Exercise 1
//Write a static method symetricDifference that will return the symetric difference between two sets given by parameters.
//Note - sets given by parameters may not be modified.

public class SymetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println(symetricDifference(set1, set2));
    }

    private static Set<Integer> symetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : set1) {
            if (!set2.contains(i)) {
                result.add(i);
            }
        }
        for (Integer j : set2) {
            if (!set1.contains(j)) {
                result.add(j);
            }
        }
        return result;
    }
}
