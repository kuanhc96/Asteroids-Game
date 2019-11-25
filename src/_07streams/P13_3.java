package _07streams;

import java.io.IOException;
import java.util.Set;

public class P13_3 {
    public static void main(String[] args) throws IOException {
        P13_1 wordLister = new P13_1();
        Set<String> phrases = wordLister.number2phrase(36459);
    }
}
