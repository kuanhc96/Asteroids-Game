package _07streams;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class P13_1 {

    // P13_1
    public Set<String> listWords(long number) {
        String stringNumber = "" + number;
        Set<String> words = new HashSet<String>();
        listWords(words, stringNumber, "");
        return words;
    }

    private void listWords(Set<String> words, String number, String current) {
        if (number.equals("")) {
            words.add(current);
            //System.out.println(current);
        } else if (number.charAt(0) == '2') {
            listWords(words, number.substring(1), current + 'A');
            listWords(words, number.substring(1), current + 'B');
            listWords(words, number.substring(1), current + 'C');
        } else if (number.charAt(0) == '3') {
            listWords(words, number.substring(1), current + 'D');
            listWords(words, number.substring(1), current + 'E');
            listWords(words, number.substring(1), current + 'F');
        } else if (number.charAt(0) == '4') {
            listWords(words, number.substring(1), current + 'G');
            listWords(words, number.substring(1), current + 'H');
            listWords(words, number.substring(1), current + 'I');
        } else if (number.charAt(0) == '5') {
            listWords(words, number.substring(1), current + 'J');
            listWords(words, number.substring(1), current + 'K');
            listWords(words, number.substring(1), current + 'L');
        } else if (number.charAt(0) == '6') {
            listWords(words, number.substring(1), current + 'M');
            listWords(words, number.substring(1), current + 'N');
            listWords(words, number.substring(1), current + 'O');
        } else if (number.charAt(0) == '7') {
            listWords(words, number.substring(1), current + 'P');
            listWords(words, number.substring(1), current + 'Q');
            listWords(words, number.substring(1), current + 'R');
            listWords(words, number.substring(1), current + 'S');
        } else if (number.charAt(0) == '8') {
            listWords(words, number.substring(1), current + 'T');
            listWords(words, number.substring(1), current + 'U');
            listWords(words, number.substring(1), current + 'V');
        } else if (number.charAt(0) == '9') {
            listWords(words, number.substring(1), current + 'W');
            listWords(words, number.substring(1), current + 'X');
            listWords(words, number.substring(1), current + 'Y');
            listWords(words, number.substring(1), current + 'Z');
        } else {
            listWords(words, number.substring(1), current + number.charAt(0));
        }
    }

    // P13_2
    public Set<String> listLegalWords(long number) throws IOException {
        return listLegalWords("/usr/share/dict/words", number);
    }

    public Set<String> listLegalWords(String filePath, long number) throws IOException {
        File words = new File(filePath);
        Scanner s = new Scanner(words);
        Set<String> possibleWords = listWords(number);
        Set<String> legalWords = new HashSet<String>();
        while (s.hasNext()) {
            String word = s.next();
            legalWords.add(word.toUpperCase());
        }
        Set<String> wordsPassed = new HashSet<String>();
        for (String word :
                possibleWords) {
            if (legalWords.contains(word)) {
                wordsPassed.add(word);
                //System.out.println(word);
            }
        }
        return wordsPassed;
    }

    // P13_3
    public Set<String> number2phrase(long number) throws IOException {
        Set<String> phrases = listLegalWords(number);
        if (phrases.isEmpty()) {
            phrases = listWords(number);
        }
        for (String word :
                phrases) {
            System.out.println(word);
        }
        return phrases;
    }

}
