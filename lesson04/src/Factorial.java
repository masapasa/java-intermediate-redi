/*
Write a program that calculates the factorial of a positive integer n,
factorial is the product of all positive integers less than or equal to n:
For example, The value of 0! is 1,
according to the convention for an empty product 4! = 123*4 = 24
 */
public class Factorial {
    public static void main(String[] args) {
        factorial(5);
    }

    public static long factorial(int n) {     //the method only counts correctly up to 16!
        int m = 1;
        for (int i = 1; i <= n; i++) {
            m *= i;
        }
        System.out.println(n + "!" + " = " + m);
        return m;
    }
}
