package _07streams;

import java.util.Scanner;
import java.util.stream.Stream;

public class E19_7 {
    /*
    Write a lambda expression for a function that turns a string into a string made of the first letter,
    three periods, and the last letter, such as "W...d".
    (Assume the string has at least two letters.)
    Then write a program that reads words into a stream, applies the lambda expression to each element,
    and prints the result.
    Filter out any words with fewer than two letters.
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input Words:");
        String[] words = s.nextLine().split("\\s+");
        Stream<String> streamWords = words2Stream(words);
        streamWords.forEach(v -> System.out.println(v));
    }

    public static Stream<String> words2Stream(String[] words) {
        Stream<String> result = Stream.of(words)
                                .filter(v -> v.length() > 1)
                                //.sorted((u, v) -> u.compareTo(v))
                                .map(v -> v.charAt(0) + "..." + v.charAt(v.length() - 1));
        return result;
    }
}
