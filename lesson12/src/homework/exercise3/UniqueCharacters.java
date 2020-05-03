package homework.exercise3;
//Exercise 3
//Write a method that takes a String and returns all unique characters of this String

import java.util.Set;
import java.util.TreeSet;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "unique characters";
        System.out.print("Unique characters - ");
        for (Character uniqueCharacter : uniqueCharacters(str)) {
            System.out.print(uniqueCharacter + " ");
        }
    }

    private static Set<Character> uniqueCharacters(String str) {
        char result[] = str.toCharArray();
        Set<Character> uniChar = new TreeSet<>();
        for (char c : result) {
            uniChar.add(c);
        }
        return uniChar;
    }
}
