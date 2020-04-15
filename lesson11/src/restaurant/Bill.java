package restaurant;

public class Bill {

    void printBill(Order order){
        System.out.println();
        System.out.println("Your bill:");
        double sum = 0;
        for (Dish dish : order.selectedDishes){
            System.out.println(dish.getName() + "................." + dish.getDishPrice());
            sum += dish.getDishPrice();
        }
            System.out.println("___________________");
            System.out.println("Amount " + "................." + sum);
            System.out.println("Please don't forget to leave a tip ;)");
    }
}
