package _04interfaces;

import java.util.*;

public class E9_17 { // sodacan
    public static void main(String[] args) {
        Measurable[] sodaCans = new Measurable[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            sodaCans[i] = (new SodaCan(r.nextDouble() * 12, r.nextDouble() * 2));
        }

        System.out.println("Avg Surface Area: " + Measurable.getAverage(sodaCans));
    }
}
