package exercise4;

import java.util.HashMap;

//Exercise 4
//Write a method that acts as a english-german dictionary. It takes one parameter - english word - and returns german translation.
//If word is not found it returns "Sorry, I don't know such word"
public class Dictionary {
    static HashMap<String, String> dictionary = new HashMap<>();

    public static void main(String[] args) {

        dictionary.put("dog", "Hund");
        dictionary.put("cat", "Katze");
        dictionary.put("boy", "Junge");
        dictionary.put("girl", "Madchen");

    }

    public static String transalte(String english) {
        return dictionary.getOrDefault(english, "Sorry, I don't know such word");
    }
}
