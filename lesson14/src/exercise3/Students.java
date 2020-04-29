package exercise3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Students {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        students.put("Burak", "Turkey");
        students.put("Olumide", "Nigeria");
        students.put("Yana", "Ukraine");
        students.put("Irina", "Kazakhstan");
        students.put("Stefan", "Germany");
        students.put("Flo", "Germany");

        students.forEach(
                (key, value) -> System.out.println("name: " + key + " country: " + value)
        );

        Set countries = new HashSet<>(students.values());
        System.out.println("Our students come from " + countries);

    }
}
