package exercise5;

import java.util.HashSet;
import java.util.Set;

//Exercise 5
//Write a static method union that will return an union of two sets given by parameters.
//Note - sets given by parameters may not be modified.
public class Union {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println(union(set1, set2));
    }

//returns an union of two sets given by parameters
    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }
}
