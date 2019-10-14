import java.util.*;
public class E4_1d {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s. nextInt();
		int addSum = 0;
		for (int i = a; i < b + 1; i++) {
			if (i % 2 != 0) {
				addSum += i;
			}
		}
		System.out.println(addSum);
	}
}
