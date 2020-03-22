public class LongestWord {
    public static void main(String[] args) {
        longestStrInArray(new String[]{"Are", "you", "checking", "Upper", "case"});
        longestStrInSentence("you have an array");
    }

    public static String longestStrInArray(String[] str) {  //find the longest String in the array
        System.out.println();
        String longestWord = "";

        for (String word : str) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println("The longest word is " + "<" + longestWord + ">");
        return longestWord;
    }

    public static String longestStrInSentence(String str) { //the method to find a longest word in the sentence
        System.out.println();
        String longestWord = "";
        String[] words = str.split(" ");

        return longestStrInArray(words);                    //reuse the first method in the second method

//        for (String word : words) {                       //first version
//            if (word.length() > longestWord.length()) {
//                longestWord = word;
//            }
//            System.out.print(word + " ");
//        }
//        System.out.println();
//        System.out.println("The longest word is " + "<" + longestWord + ">");
//        return longestWord;
    }

}
