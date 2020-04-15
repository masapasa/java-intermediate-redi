package restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    List<Dish> selectedDishes = new ArrayList<>();

    public void makeOrder(Menu menu) {
        System.out.println("Hello! We're happy to see you!");
        System.out.println("What category do you want to order the dish from?");
        System.out.println("1 - starters, 2 - main course or 3 - dessert");
        Scanner input = new Scanner(System.in);
        int cat = input.nextInt();
        boolean isOrderComplete = false;

        while (!isOrderComplete) {
            if (cat == 1) {
                menu.printCategory(menu.getStarters());
                selectDishes(menu.getStarters());
            } else if (cat == 2) {
                menu.printCategory(menu.getMainCourse());
                selectDishes(menu.getMainCourse());
            } else if (cat == 3) {
                menu.printCategory(menu.getDessert());
                selectDishes(menu.getDessert());
            } else if (cat == 4) {
                menu.printCategory(menu.getDrinks());
                selectDishes(menu.getDrinks());
            } else {
                System.out.println("Please clarify your answer");
            }

            System.out.println("Are you done with your order? y(yes) or n(no)");
            String isOrderCompleteStr = input.next();
            if (isOrderCompleteStr.equals("y")) {
                isOrderComplete = true;
            } else {
                System.out.println("What category do you want to order the dish from?");
                System.out.println("1 - starters, 2 - main course or 3 - dessert");
                cat = input.nextInt();
            }

        }
        System.out.println("You ordered: ");
        for (Dish orderedDish : selectedDishes) {
            System.out.println(orderedDish.getName());
        }

    }

    public void selectDishes(List<Dish> categories) {
        boolean isContinue = true;
        Scanner input = new Scanner(System.in);
        while (isContinue) {
            System.out.println("Please, select a dish from the menu");
            int order = input.nextInt() - 1;
            Dish selectedDish = categories.get(order);
            this.selectedDishes.add(selectedDish);
            System.out.println(selectedDish.getName());
            System.out.println("Would you like something else? Answer Y(yes) or N(no)");
            String answer = input.next();
            if (answer.equals("n")){isContinue = false;}
        }
    }
}


