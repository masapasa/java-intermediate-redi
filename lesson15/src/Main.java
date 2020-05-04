public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addPayment(new Payment(1, 5, Category.INCOME, 4, 2019));
        bank.addPayment(new Payment(2, -10.5, Category.CAFE, 4, 2019));
        bank.addPayment(new Payment(3, -4.5, Category.TRANSPORT, 4, 2019));
        bank.addPayment(new Payment(4, 33, Category.INCOME, 5, 2019));
        bank.addPayment(new Payment(5, 7, Category.INCOME, 5, 2019));
        bank.addPayment(new Payment(6, -5, Category.CAFE, 5, 2019));
        bank.addPayment(new Payment(7, 20, Category.INCOME, 4, 2020));
        bank.addPayment(new Payment(8, 3, Category.INCOME, 4, 2020));
        bank.addPayment(new Payment(9, -15, Category.TRANSPORT, 4, 2020));

//        System.out.println(bank.biggestPayment());
//        System.out.println(bank.totalIncome());
//        bank.alphGrouping();
        bank.selectStatistics();
//        bank.biggestIncome();
//        bank.totalSpending();
//        bank.totalSpendingByMonth();
    }
}
