public class CaesarCipher {
    public static void main(String[] args) {

        cipher("hello", 3);
    }


    public static String cipher(String msg, int step) {
        String s = "";

        for (int i = 0; i < msg.length(); i++) {
            char c = (char) (msg.charAt(i) + step);

            if (c > 'z')
                s += (char) (msg.charAt(i) - (26 - step));
            else
                s += (char) (msg.charAt(i) + step);
        }

        System.out.println(s.toUpperCase());
        return s;
    }
}
