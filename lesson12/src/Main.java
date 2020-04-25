import java.util.*;

public class Main {
    public static void main(String[] args) {



        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Exercise 4 - " + intersection(set1, set2));
        System.out.println("Exercise 5 - " + union(set1, set2));
        System.out.println("Exercise 6 - " + difference(set1, set2));

//Exercise 7
//Create a TreeSet containing integers that will maintain descending order of numbers
        TreeSet<String> treeSet = new TreeSet<String>(Comparator.reverseOrder());
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        System.out.println("Exercise 7 - " + treeSet);

        System.out.println("Homework Exercise 1 - " + symetricDifference(set1, set2));

        int[] values = {4, 2, 3, 4, 5, 6, 1};
        System.out.print("Homework Exercise 2 - ");
        for (int value : arrayOfUniqueValues(values)) {
            System.out.print(value + " ");
        }
        System.out.println();

        String str = "unique characters";
        System.out.println("Homework Exercise 3 - " + str);
        System.out.print("Unique characters - ");
        for (Character uniqueCharacter : uniqueCharacters(str)) {
            System.out.print(uniqueCharacter + " ");
        }
        System.out.println("\n");

        String str1 = "unique";
        System.out.println("Homework Exercise 4 - " + str1);
        System.out.print("Duplicate characters - ");
        for (Character duplicateCharacter : duplicateCharacters(str1)) {
            System.out.print(duplicateCharacter + " ");
        }
    }

    //Homework
//Exercise 4  method that takes a String and returns all duplicate characters of this String
    private static Set<Character> duplicateCharacters(String str) {
        char[] arr = str.toCharArray();
        Set<Character> let = new HashSet<>();
        Set<Character> result = new TreeSet<>();
        for (char c : arr) {
            if (let.contains(c)) {
                result.add(c);
            } else {
                let.add(c);
            }
        }
        return result;
    }

    //Homework
//Exercise 3  method that takes a String and returns all unique characters of this String
    private static Set<Character> uniqueCharacters(String str) {
        char result[] = str.toCharArray();
        Set<Character> uniChar = new TreeSet<>();
        for (char c : result) {
            uniChar.add(c);
        }
        return uniChar;
    }


    //Homework
//Exercise 2  method that takes an array with integers and return an array of unique values of the array
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

    //Homework
//Exercise 1  returns the symetric difference between t wo sets given by parameters
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

    //Exercise 6  difference between two sets given by parameters
    private static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : set1) {
            if (!set2.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }


    //Exercise 5    returns an union of two sets given by parameters
    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    //Exercise 4   returns an intersection of two sets given by parameters
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

////Exercise 2
////returns a HashSet containing a collection of n unique random numbers in range 0-100.
////In the main method iterate over the returned Set and print each number multiplied by 2.
////Where n is a number of random elements in set
////Exercise 3
////Change data type in previous exercise from HashSet to TreeSet
//        Set<Integer> numbers = randomSet(10);
//
//        for (int number : numbers) {
//            System.out.println(number * 2);
//        }
//        System.out.println("\n\n");
//        Set<Integer> treeSetNumbers = new TreeSet<>(numbers);
////        treeSetNumbers.forEach(num -> System.out.println(num * 2));
//        for (int num : treeSetNumbers) {
//            System.out.println(num * 2);
//        }
//    }
//
//    static Set<Integer> randomSet(int n) {
//        Set<Integer> numbers = new HashSet<>();
//        Random r = new Random();
//        for (int i = 0; i < n; i++) {
//            int value = r.nextInt(100);
//            numbers.add(value);
//        }
//        return numbers;
//    }
//}
////Exercise 1
//public static void main(String[] args) {
//        Set<String> fruits = new HashSet<>();
//        fruits.add("banana");
//        fruits.add("apple");
//        fruits.add("orange");
//        fruits.add("grapes");
//
//        for (String fruit : fruits) {
//            System.out.print(fruit + " ");
//        }
//        System.out.println();
////        fruits.clear();
//        if (fruits.isEmpty()) {
//            System.out.println("I'm empty");
//        } else if (!fruits.isEmpty()) {
//            System.out.println("I'm not empty");
//        }
//}

