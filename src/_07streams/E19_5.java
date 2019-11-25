package _07streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E19_5 {
    /*
    Write a method

    public static <T> String toString(Stream<T> stream, int n)
    that turns a Stream<T> into a comma-separated list of its first n elements.
     */

    public static void main(String[] args) {
        Integer[] values = {5, 3, 2, 6, 1, 10};
        int n = 3;
        Stream<Integer> streamVals = Stream.of(values);
        String result = toString(streamVals, n);
        System.out.println(result);

    }

    public static <T> String toString(Stream<T> stream, int n) {
        String result = stream
                        .map(v -> v.toString())
                        .limit(n)
                        .collect(Collectors.joining(", "));
        return result;
    }

}
