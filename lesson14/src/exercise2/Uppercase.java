package exercise2;

import java.util.HashMap;
//Exercise 2
//Go back to the previous problem and make your lookup method work with keys regardless of whether they are lower or uppercase.
// For example, both “a1234” and “A1234” should match Steve Jobs. Hint:
// very similar to the previous exercise, so if your solution is complex, you are overlooking the obvious.

public class Uppercase {
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
