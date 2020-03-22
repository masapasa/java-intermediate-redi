public class VowelsCounter {
    public static void main(String[] args) {
        vowelsCounter("Are you checking Upper case");
    }

    public static int vowelsCounter(String str) {   //method to count all vowels (English Alphabet) in a string

        int count = 0;
        char[] vowels = {'e', 'E', 'u', 'U', 'i', 'I', 'o', 'O', 'a', 'A'};
        for (int i = 0; i < str.length(); i++){
            char ltr = str.charAt(i);
            for (int j = 0; j < vowels.length; j++){
                if (ltr == vowels[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }

}
