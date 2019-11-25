package _07streams;

import java.util.*;

public class E13_20 {
    /*
    Given an integer price, list all possible ways of paying for it with $100, $20, $5, and $1 bills, using recursion.
    Don’t list duplicates.
     */

    public static void main(String[] args) {
        Set<String> methods = new HashSet<String>();
        listPaymentMethods(methods, 23, 0, 0, 0, 0);
        for (String method : methods) {
            System.out.println(method);
        }
    }

    public static void listPaymentMethods(Set<String> methods, int price, int num1, int num5, int num20, int num100) {
        if (price == 0) {
            methods.add("$1: " + num1 + " $5: " + num5 + " $20: " + num20 + " $100: " + num100);
        } else if (price > 0) {
            listPaymentMethods(methods, price - 1, num1 + 1, num5, num20, num100);
            listPaymentMethods(methods, price - 5, num1, num5 + 1, num20, num100);
            listPaymentMethods(methods, price - 20, num1, num5, num20 + 1, num100);
            listPaymentMethods(methods, price - 100, num1, num5, num20, num100 + 1);
        }
    }
}
