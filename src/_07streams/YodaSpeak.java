package _07streams;
import java.util.*;

public class YodaSpeak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        reverse(sentence);
    }

    public static void reverse(String sentence) {
        String reversed = "";
        String[] words = sentence.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        System.out.println(reversed);
    }



}
