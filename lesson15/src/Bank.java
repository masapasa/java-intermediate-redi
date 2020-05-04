import java.util.*;

public class Bank {
    HashSet<Payment> payments = new HashSet<>();

    //add some payments in our bank
    public void addPayment(Payment payment) {
        payments.add(payment);
//        System.out.println("Transaction: " + payment.getAmount());
    }

    //Show the user their the most expensive payment
    public Payment biggestPayment() {
        Payment big = null;
        for (Payment payment : payments) {
            if (big == null) {
                big = payment;
            } else if (payment.getAmount() < 0 && big.getAmount() > payment.getAmount()) {
                big = payment;
            }
        }
        System.out.println("The biggest payment is: " + big);
        return big;
    }

    //Show the user their total income
    public double totalIncome() {
        double sum = 0;
        for (Payment payment : payments) {
            if (payment.getAmount() > 0) {
                sum += payment.getAmount();
            }
        }
        System.out.println("The total income is: " + sum);
        return sum;
    }

    //Show the user their spending grouped by type, alphabetically ordered by the type name
    public void alphGrouping() {
        TreeMap<Category, Double> alphabetSort = new TreeMap<>();
        for (Payment payment : payments) {
            Category category = payment.getCategory();
            if (alphabetSort.containsKey(category)) {
                double sum = alphabetSort.get(category) + payment.getAmount();
                alphabetSort.put(category, sum);
            } else {
                alphabetSort.put(category, payment.getAmount());
            }
        }
        System.out.println("How do you spend your money: ");
        for (Map.Entry<Category, Double> entry : alphabetSort.entrySet()) {
            System.out.println(entry);
        }
    }

    //Give the user opportunity to choose what statistics they want to see:
    public void selectStatistics() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter what statistics you want to see:");
        System.out.println(
                "1 - My biggest payment\n" +
                        "2 - My total income\n" +
                        "3 - How do I spend my money\n" +
                        "4 - Statistics for 1 year\n" +
                        "0 - exit\n");
        System.out.print("User's input> ");
        int cat = input.nextInt();
        boolean isContinue = true;
        while (isContinue) {
            if (cat == 1) {
                biggestPayment();
            } else if (cat == 2) {
                totalIncome();
            } else if (cat == 3) {
                alphGrouping();
            } else if (cat == 4) {
                System.out.println("Enter a year:");
                cat = input.nextInt();
                totalSpendingByYear(cat);
            } else if (cat == 0) {
                System.out.println("See you next time :)\n");
                isContinue = false;
            } else {
                System.out.println("Please clarify your answer\n");
            }
            if (cat != 0) {
                System.out.print("User's input> ");
                cat = input.nextInt();
            }
        }
    }

    //Show the user their biggest income
    public Payment biggestIncome() {
        Payment big = null;
        for (Payment payment : payments) {
            if (payment.getAmount() > 0) {
                if (big == null) {
                    big = payment;
                } else if (big.getAmount() < payment.getAmount()) {
                    big = payment;
                }
            }
        }
        System.out.println("The biggest income is: " + big);
        return big;
    }

    //Show the user their total spending
    public double totalSpending() {
        double sum = 0;
        for (Payment payment : payments) {
            sum += payment.getAmount();
        }
        System.out.println("You spent in total: " + sum);
        return sum;
    }

    //Show the user their spendings & earnings grouped by month during this year, chronologically ordered.
    // Make sure that you print the month even if there are no payments.
    public void totalSpendingByMonth() {
        HashMap<Integer, Double> spendings = new HashMap<>();
        HashMap<Integer, Double> earnings = new HashMap<>();
        for (Payment payment : payments) {
            Integer month = payment.getMonth();
            Date key = new GregorianCalendar(payment.getYear(), payment.getMonth() - 1, 0).getTime();
            if (payment.getAmount() >= 0) {
                if (earnings.containsKey(month)) {
                    Double currentSum = earnings.get(month) + payment.getAmount();
                    earnings.put(month, currentSum);
                } else {
                    earnings.put(month, payment.getAmount());
                }
            } else {
                if (spendings.containsKey(month)) {
                    Double currentSum = spendings.get(month);
                    currentSum += payment.getAmount();
                    spendings.put(month, currentSum);
                } else {
                    spendings.put(month, payment.getAmount());
                }
            }
        }
        for (int i = 1; i <= 12; i++) {
            System.out.println("In " + month(i) + " you spent: " + spendings.getOrDefault(i, 0d) + "€" + " and earned: " + earnings.getOrDefault(i, 0d) + "€");
        }
    }

    //converts month index to it's name
    public String month(int mon) {
        String monthString;
        switch (mon) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        return monthString;
    }
//Show the user their spendings & earnings grouped by month during chosen year, chronologically ordered. Make sure that you print the month even if there are no payments. For that you will need to make the bank terminal menu more interactive:
//
//> Enter what statistics you want to see:
//1 - My biggest payment
//2 - My total income
//3 - How do I spend my money
//4 - Statistics for 1 year
//0 - exit
//
//User's input> 4
//
//> Enter a year:
//
//User's input> 2018
//
//In January 2018 you spent: 143$ and earned: 2300$
//In February 2018 you spent: 260$ and earned: 2300$
//In March 2018 you spent: 0$ and earned: 2300$
//In April 2018 you spent: 107$ and earned: 2500$

    public void totalSpendingByYear(int year) {

        HashMap<Integer, Double> spendings = new HashMap<>();
        HashMap<Integer, Double> earnings = new HashMap<>();
        for (Payment payment : payments) {
            Integer month = payment.getMonth();
            Date key = new GregorianCalendar(year, payment.getMonth() - 1, 0).getTime();
            if (payment.getYear() == year) {
                if (payment.getAmount() >= 0) {
                    if (earnings.containsKey(month)) {
                        Double currentSum = earnings.get(month) + payment.getAmount();
                        earnings.put(month, currentSum);
                    } else {
                        earnings.put(month, payment.getAmount());
                    }
                } else {
                    if (spendings.containsKey(month)) {
                        Double currentSum = spendings.get(month);
                        currentSum += payment.getAmount();
                        spendings.put(month, currentSum);
                    } else {
                        spendings.put(month, payment.getAmount());
                    }
                }
            System.out.println("In " + month(month) + " " + year +  " you spent: " + spendings.getOrDefault(month, 0d) + "€" + " and earned: " + earnings.getOrDefault(month, 0d) + "€");
            }
        }

    }
}
