/*
Write the method squares that for X and Y given by
arguments prints the square of each number between X and Y.
 */

public class Square_Noun {

    public static void main(String[] args) {
        square(1, 3);
        square(5, 6);
        System.out.println();

        isFeminineNoun("Katze");
        isFeminineNoun("Hund");
        isFeminineNoun("Werbung");

    }

    public static void square(int x, int y) {
        for (int i = x; i <= y; i++) {
            double n = Math.pow(i, 2);
            System.out.println("Square of " + i + " = " + n);
        }
    }

    public static boolean isFeminineNoun (String str){
        boolean result = false;
        if(str!= null && str.length() > 0 && str.endsWith("e") || str.endsWith("ung")){
            result = true;
        }
        System.out.println("Is " + str + " feminine? - " + result);
        return result;
    }

}