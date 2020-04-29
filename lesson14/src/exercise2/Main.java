package exercise2;

import java.util.HashMap;

public class Main {
    static HashMap<String, String> employees = new HashMap<>();

    public static void main(String[] args) {
        //Exercise 2
        addEmpolyee("a1234", "Steve Jobs");
        addEmpolyee("a1235", "Bill Gates");
        addEmpolyee("a1236", "Jeff Bezos");
        addEmpolyee("a1237", "Larry Page");
        addEmpolyee("a1238", "Sergey Brin");
        addEmpolyee("a1239", "Sergey Brin");
        addEmpolyee("A1239", "Aper Case");

        employees.forEach(
                (key, value) -> System.out.println("key is " + key + " value is " + value)
        );
    }

    static void addEmpolyee(String key, String value) {
        employees.put(key.toLowerCase(), value);
    }
}
