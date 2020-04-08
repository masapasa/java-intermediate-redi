package restaurant;

import java.util.List;

public class Menu {

    private List<Dish> mainCourses;
    private List<Dish> desserts;
    private List<Dish> starters;

    public void printingMenu(){
        System.out.println("Please see our Menu");
        System.out.println();
        System.out.println("Starters");
        System.out.println();
        System.out.println("Main Course");
        for (Dish dish : mainCourses){
            System.out.println(dish.getName() + " ........... " + dish.getDishPrice() + " Euro");
        }
        System.out.println();
        System.out.println("Dessert");
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
}
