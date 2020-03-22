import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student bob = new Student("Bob", 36, false, "Berlin");
        bob.friends.add("Alice");
        bob.friends.add("Jane");

        Student alice = new Student("Alice", 25, true, "Moscow");
        bob.friends.add("Bob");
        bob.friends.add("Jane");

        Student john = new Student("John", 19, true, "San Fransisco");
        bob.friends.add("Alice");
        bob.friends.add("Jane");

        Student jane = new Student("Jane", 46, false, "Rio");
        bob.friends.add("John");
        bob.friends.add("Alice");
        bob.friends.add("Bob");


/*//        Car mini = new Car("Mini Cooper", 50, 210, false, new String[]{"name1", "name2"});
        Car mini = new Car("Mini Cooper", 50, 210, false);

        mini.drive();
        mini.drive();
        mini.refuel();
        mini.drive();

//        Car ferrari = new Car();
//        ferrari.name = "Ferrari";
//        ferrari.broken = true;
//        ferrari.fuelLevel = 100;
//        ferrari.maxSpeed = 340;
//
//        ferrari.drive();
//
//        Car beatle = new Car();
*/

    }
}
