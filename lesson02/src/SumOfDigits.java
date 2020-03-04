public class SumOfDigits {
    public static void main(String[] args) {
        getSumOfDigits(25);
    }

    public static int getSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
        return sum;
    }
}

