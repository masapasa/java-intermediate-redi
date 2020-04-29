package exercise4;

import java.util.HashMap;

public class Dictionary {
        static HashMap<String, String> dictionary = new HashMap<>();

    public static void main(String[] args) {

        dictionary.put("dog", "Hund");
        dictionary.put("cat", "Katze");
        dictionary.put("boy", "Junge");
        dictionary.put("girl", "Madchen");

    }

    public static String transalte (String english){
        return dictionary.getOrDefault(english, "Sorry, I don't know such word");
    }

}
