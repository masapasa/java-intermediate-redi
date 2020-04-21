import java.util.Random;
import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 3, 5};
        int[] data1 = {11, 12, 13, 14, 15, 16, 17};
        int d = 3;
//        reversArray(data);
//        mergeArrays(data, data1);
//        generateRandomArray();
//        generateArray();
//        System.out.println(findAnElement(data, d));
//        System.out.println(findLastElement(data, d));
    }


    public static int[] reversArray(int[] data) {   //The method that will print an int array reversed
        int tmp;
        for (int i = 0; i < data.length / 2; i++) {
            tmp = data[data.length - 1 - i];
            data[data.length - 1 - i] = data[i];
            data[i] = tmp;
        }

        for (int datum : data) {
            System.out.println(datum);
        }
        return data;
    }

    public static void mergeArrays(int[] data, int[] data1) {  //The method that will merge two int arrays
        for (int datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
        for (int datum : data1) {
            System.out.print(datum + " ");
        }
        System.out.println();

        int[] merge = new int[data.length + data1.length];
        int i = 0, j = 0, k = 0;

        while (i < data.length && j < data1.length) {
            merge[k++] = data[i++];
            merge[k++] = data1[j++];
        }
        while (i < data.length) {
            merge[k++] = data[i++];
        }
        while (j < data1.length) {
            merge[k++] = data1[j++];
        }
        for (int datum : merge) {
            System.out.print(datum + " ");
        }
    }

    public static void generateRandomArray() {    // Create an array of random int values with the length given from the terminal
        System.out.print("Enter an array size ");
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int[] arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            Random r = new Random();
            int a = r.nextInt((100 - 0) + 1) + 0;
            arr[i] = a;
        }
        for (int datum : arr) {
            System.out.print(datum + " ");
        }
    }

    public static void generateArray() {    // Create an array with all elements are given by the user
        System.out.print("Enter an array size ");
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int[] arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            int a = i+1;
            System.out.print("Enter number " + a + " ");
            arr[i] = in.nextInt();
        }

        System.out.print("Your array is: ");
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    public static int findFirstElement(int[] data, int d){     //return a position of the element in this array or -1 if the element is not in the array
        for(int i=0; i<data.length; i++){       //Find the first position of the element
            if(data[i]==d) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastElement(int[] data, int d){     //Find the last position of the element
      int position = -1;
        for(int i=0; i<data.length; i++){
            if(data[i]==d) {
                position = i;
            }
        }
        return position;
    }

}
