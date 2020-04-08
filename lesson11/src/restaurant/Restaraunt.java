package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaraunt {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Dish pasta = new MainCourse("Pasta Carbonara", "nudels, egg, hum, cheese", 8, false);
        Dish amatriciana = new MainCourse("Amatriciana", "Bacon, black pepper, tommato sause, parmesan", 8.5, false);
        Dish mousaka = new MainCourse("Mousaka", "aubergine, zucchini, tomato", 9.9, true);

        List<Dish> mainCourses = new ArrayList<>();
        mainCourses.add(pasta);
        mainCourses.add(amatriciana);
        mainCourses.add(mousaka);

        menu.setMainCourse(mainCourses);
        menu.printingMenu();
    }
}
