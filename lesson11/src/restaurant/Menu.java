package restaurant;

import java.util.List;

public class Menu {

    private List<Dish> mainCourses;
    private List<Dish> desserts;
    private List<Dish> starters;
    private List<Dish> drinks;


    public void printingMenu() {
        System.out.println("Hello! We're happy to see you! Please see our Menu");
        System.out.println("Starters");
        printCategory(starters);
        System.out.println();
        System.out.println("Main Course");
        printCategory(mainCourses);
        System.out.println();
        System.out.println("Dessert");
        printCategory(desserts);
    }

    void printCategory(List<Dish> category) {
        int i = 1;
        for (Dish dish : category) {
            System.out.println(i + ". " + dish.getName() + " ........... " + dish.getDishPrice() + " €");
            i++;
        }
    }


    public List<Dish> getMainCourse() {
        return mainCourses;
    }

    public void setMainCourse(List<Dish> mainCourse) {
        this.mainCourses = mainCourse;
    }

    public List<Dish> getDessert() {
        return desserts;
    }

    public void setDessert(List<Dish> dessert) {
        this.desserts = dessert;
    }

    public List<Dish> getStarters() {
        return starters;
    }

    public void setStarters(List<Dish> starters) {
        this.starters = starters;
    }

    public List<Dish> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Dish> drinks) {
        this.drinks = drinks;
    }
}
