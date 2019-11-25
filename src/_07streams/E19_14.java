package _07streams;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class E19_14 {
    /*
    Read all words from a file into an ArrayList<String>, then turn it into a parallel stream.
    Use the dictionary file words.txt provided with the book’s companion code.
    Use filters and the findAny method to find any palindrome that has at least five letters, then print the word.
    What happens when you run the program multiple times?
     */
    public static void main(String[] args) throws IOException {
        Optional<String> wordStream = getWordsInFile("/usr/share/dict/words")
                                    .filter(v -> v.length() >= 5)
                                    .filter(v -> {
                                        boolean isPalindrome = true;
                                        for (int i = 0; i < v.length() / 2; i++) {
                                            if (v.charAt(i) != v.charAt(v.length() - i - 1)) {
                                                isPalindrome = false;
                                            }
                                        }
                                        if (isPalindrome) {
                                            System.out.println(v);
                                        }

                                        return isPalindrome;
                                    })
                                    .findAny();

    }

    public static Stream<String> getWordsInFile(String pathName) throws IOException {
        File file = new File(pathName);
        Scanner s = new Scanner(file);
        List<String> wordList = new ArrayList<String>();
        while (s.hasNext()) {
            wordList.add(s.next());
        }
        return wordList.parallelStream();
    }

}
