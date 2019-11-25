package _07streams;
import java.util.*;
public class YodaSpeakRecursive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        reverse(sentence, "");
    }

    public static void reverse(String sentence, String reverse) {
        if (sentence.equals("")) {
            System.out.println(reverse);
        } else {
            int i = 0;
            while (i < sentence.length() && sentence.charAt(i) != ' ') {
                i++;
            }
            reverse = sentence.substring(0, i) + " " + reverse;
            if (i < sentence.length()) {
                sentence = sentence.substring(i + 1);
            } else {
                sentence = sentence.substring(i);
            }

            reverse(sentence, reverse);

        }
    }
}
