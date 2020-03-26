import java.util.*;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {

        Student bob = new Student("Bob", 36, false, "Berlin");
        Student alice = new Student("Alice", 25, true, "Moscow");
        Student john = new Student("John", 19, true, "San Fransisco");
        Student jane = new Student("Jane", 46, false, "Rio");

        jane.addFriend(bob);
        jane.addFriend(bob);
        jane.addFriend(alice);
        john.addFriend(alice);
        jane.introduce();
        john.introduce();


//
//        Account db = new Account(123);
//        Account n26 = new Account(987);
//        Customer yana = new Customer("Yana", "Karmanova", db);
//        Customer ira = new Customer("Irina", "Rykunova", n26);
//
//        yana.getAccount().deposit(90);
//        ira.getAccount().deposit(70);
//
//        yana.getAccount().withdraw(23);
//        ira.getAccount().withdraw(100);
//
//        yana.getAccount().transfer(n26, 30);



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
