package homework.exercise4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//Exercise 4 (Optional)
//Write a method that takes a String and returns all duplicate characters of this String

public class DuplicateCharacters {
    public static void main(String[] args) {

        String str1 = "unique";
        System.out.print("Duplicate characters - ");
        for (Character duplicateCharacter : duplicateCharacters(str1)) {
            System.out.print(duplicateCharacter + " ");
        }
    }

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
}
