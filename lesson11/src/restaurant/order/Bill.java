package restaurant.order;

import restaurant.menu.Dish;
import restaurant.order.Order;

public class Bill {
    Order order;

    public Bill(Order order) {
        this.order = order;
    }

    public void printBill() {
        System.out.println();
        System.out.println("Your bill:");
        double sum = 0;
        for (Dish dish : this.order.selectedDishes) {
            System.out.println(dish.getName() + "................." + dish.getDishPrice());
            sum += dish.getDishPrice();
        }
        System.out.println("___________________");
        System.out.println("Amount " + "................." + sum);
        System.out.println("Please don't forget to leave a tip ;)");
        System.out.print("Bill number: ");
        System.out.println(hashCode());
    }

    @Override
    public int hashCode() {
        int result = this.order.hashCode();
        result = 31 * result;
        return result;
    }

}
