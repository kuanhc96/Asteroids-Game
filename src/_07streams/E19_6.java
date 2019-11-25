package _07streams;

import java.util.Currency;
import java.util.Set;
import java.util.stream.Stream;

public class E19_6 {
    /*
    The static getAvailableCurrencies method of the java.util.Currency class yields a set of Currency objects.
    Turn it into a stream and transform it into a stream of the currency display names.
    Print them in sorted order.
     */
    public static void main(String[] args) {
        Set<Currency> currencySet = Currency.getAvailableCurrencies();
        Stream<String> currencyStream = currency2Stream(currencySet);
        currencyStream.forEach(v -> System.out.println(v));
    }

    public static Stream<String> currency2Stream(Set<Currency> currencySet) {
        Stream<String> result = currencySet
                                .stream()
                                .map(v -> v.getDisplayName())
                                .sorted((u, v) -> u.compareTo(v));
        return result;
    }
}
