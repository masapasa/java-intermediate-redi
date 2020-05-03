package exercise4;
//Exercise 4
//Write a static method intersection that will return an intersection of two sets given by parameters.
//Note - sets given by parameters may not be modified.

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(1);

        System.out.println(intersection(set1, set2));
    }

//returns an intersection of two sets given by parameters
    private static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : set1) {
            for (Integer j : set2) {
                if ((i.equals(j))) {
                    result.add(i);
                }
            }
        }
        return result;
    }
}
