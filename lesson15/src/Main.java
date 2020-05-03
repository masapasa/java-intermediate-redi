public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addPayment(new Payment(123, -10.5, Category.CAFE, 4, 2020));
        bank.addPayment(new Payment(127, 33, Category.INCOME, 5, 2020));
        bank.addPayment(new Payment(124, -5, Category.TRANSPORT, 3, 2020));
        bank.addPayment(new Payment(127, -15, Category.TRANSPORT, 4, 2020));
        bank.addPayment(new Payment(125, 20, Category.INCOME, 4, 2020));
        bank.addPayment(new Payment(126, 3, Category.INCOME, 4, 2020));

        System.out.println(bank.biggestPayment());
        System.out.println(bank.totalIncome());
        bank.alphGrouping();
        bank.selectStatistics();
        bank.biggestIncome();
        bank.totalSpending();
        bank.totalSpendingByMonth();
    }
}
