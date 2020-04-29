package exercise1;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("************HashMap************");

        HashMap<String, String> employees = new HashMap<>();

        employees.put("a1234", "Steve Jobs");
        employees.put("a1235", "Bill Gates");
        employees.put("a1236", "Jeff Bezos");
        employees.put("a1237", "Larry Page");
        employees.put("a1238", "Sergey Brin");
        employees.put("a1239", "Sergey Brin");

        System.out.println(employees);

        employees.forEach(
                (key, value) -> System.out.println("key is " + key + " value is " + value)
        );

        System.out.println("************TReeMap************");

        TreeMap<String, String> employeesTreeMap = new TreeMap<>();
        employeesTreeMap.put("a1234", "Steve Jobs");
        employeesTreeMap.put("a1235", "Bill Gates");
        employeesTreeMap.put("a1236", "Jeff Bezos");
        employeesTreeMap.put("a1237", "Larry Page");
        employeesTreeMap.put("a1238", "Sergey Brin");
        employeesTreeMap.put("a1239", "Sergey Brin");
        employeesTreeMap.put("A1239", "Apper case");

        employeesTreeMap.forEach(
                (key, value) -> System.out.println("key is " + key + " value is " + value)
        );
    }
}
