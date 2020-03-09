/*
The Program that checks that a given string is a palindrome.
A string is Palindrome if position of each character remain the same
in case even string is reversed.
For example 'MADAM' is a palindrome string as position of each character
remain same even if string 'MADAM' is reversed.
 */
public class Palindrome {
    public static void main(String[] args) {
        isPalindrome("porot");
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for( int i = 0; i < n/2; i++ )
            if (str.charAt(i) != str.charAt(n-i-1)) {
                System.out.println(str + " is not Palindrome");
                return false;
            }
        System.out.println(str + " is Palindrome");

        return true;
    }
}