package _07streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E19_16 {
    /*
    Read all words in a file and group them by the first letter (in lowercase).
    Print the average word length for each initial letter.
    Use collect and Collectors.groupingBy.

     */


    public static void main(String[] args) throws IOException {
        Map<String, List<String>> groupedWords = groupWordsInFile("/usr/share/dict/words");
        for (String word :
                groupedWords.keySet()) {
            double avgLength = groupedWords.get(word).stream().collect(Collectors.averagingDouble(v -> v.length()));
            System.out.println("Average Length for word starting with " + word + " is: " + avgLength);
        }
    }

    public static Map<String, List<String>> groupWordsInFile(String pathName) throws FileNotFoundException {
        File legalWords = new File(pathName);
        Scanner s = new Scanner(legalWords);
        List<String> words = new ArrayList<>();
        while (s.hasNext()) {
            words.add(s.next().toLowerCase());
        }
        Stream<String> wordStream = words.stream();
        //Map<Character, Integer> characterAvgStringLengthMap =
        //        wordStream.collect(Collectors.groupingBy(v -> v.charAt(0), Collectors.averagingDouble(u -> u.length())));
        Map<String, List<String>> characterStringMap = wordStream.collect(Collectors.groupingBy(v -> v.substring(0, 1)));
        return characterStringMap;

    }





}
