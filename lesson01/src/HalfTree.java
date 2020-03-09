/*
Write a program that for given value of variable ‘height’
will print out the right-half of a pine tree to the console.

The tree starts with “I” on the top and ends with “M” on the bottom.
The tree is built from “X” and “Y” characters one after another
 */
public class HalfTree {
    public static void main(String[] args) {
        printHalfTree(7);
    }

    public static void printHalfTree(int height) {
        System.out.println("I");
        for (int i = 2; i <= height - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.print("X");
                } else System.out.print("Y");
            }
            System.out.println();
        }
        System.out.println("M");
    }
}
