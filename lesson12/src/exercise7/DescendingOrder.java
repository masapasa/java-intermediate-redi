package exercise7;
//Exercise 7
//Create a TreeSet containing integers that will maintain descending order of numbers.
//Hint: Look at alternative TreeSet constructors.

import java.util.Comparator;
import java.util.TreeSet;

public class DescendingOrder {
    public static void main(String[] args) {

    TreeSet<String> treeSet = new TreeSet<String>(Comparator.reverseOrder());
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        System.out.println("Exercise 7 - " + treeSet);
    }
}
