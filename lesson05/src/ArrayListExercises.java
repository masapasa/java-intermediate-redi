import java.util.*;

public class ArrayListExercises {
    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 3, 5};
        Integer[] data1 = {11, 12, 13, 14, 15, 16, 17};
        List<Integer> numbers = new ArrayList<>(Arrays.asList(data));
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(data1));
        int d = 3;

//        Collections.reverse(numbers);     // print reversed ArrayList numbers
//        for (int number : numbers) {
//            System.out.print(number + " ");
//        }
//        mergeArrays(numbers, numbers1);
//        generateRandomArray();
//        generateArray();
//        System.out.println(findFirstElement(numbers1, d));
//        System.out.println(findLastElement(numbers, d));

    }

    public static void mergeArrays(List<Integer> data, List<Integer> data1) {  // method that will merge two ArrayLists in one
        System.out.print("1st array: ");
        for (int datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
        System.out.print("2nd array: ");
        for (int datum : data1) {
            System.out.print(datum + " ");
        }
        System.out.println();

        List<Integer> merge = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < data.size() && j < data1.size()) {
            merge.add(k++, data.get(i++));
            merge.add(k++, data1.get(j++));
        }
        while (i < data.size()) {
            merge.add(k++, data.get(i++));
        }
        while (j < data1.size()) {
            merge.add(k++, data1.get(j++));
        }
        System.out.print("Merged array list: ");
        for (int datum : merge) {
            System.out.print(datum + " ");
        }
    }

    public static void generateRandomArray() {    // Create an array of random int values with the length given from the terminal
        System.out.print("Enter an array size ");
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arraySize; i++) {
            Random r = new Random();
            int a = r.nextInt((100 - 0) + 1) + 0;
            arr.add(a);
        }
        for (int datum : arr) {
            System.out.print(datum + " ");
        }
    }

    public static void generateArray() {    // Create an array with all elements are given by the user
        System.out.print("Enter an array size ");
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arraySize; i++) {
            int a = i + 1;
            System.out.print("Enter number " + a + " ");
            arr.add(in.nextInt());
        }

        System.out.print("Your array is: ");
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }
//------------------------------------------

    public static int findFirstElement(List<Integer> data, int d) {     //return a position of the element in this array or -1 if the element is not in the array
        for (int i = 0; i < data.size(); i++) {       //Find the first position of the element
            if (data.get(i) == d) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastElement(List<Integer> data, int d) {     //Find the last position of the element
        int position = -1;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == d) {
                position = i;
            }
        }
        return position;
    }


}
