import java.util.*;
public class E2_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input First Value: ");
		int a = s.nextInt();
		System.out.println("Input Second Value: ");
		int b = s.nextInt();
		System.out.println(sum(a, b));
		System.out.println(difference(a, b));
		System.out.println(product(a, b));
		System.out.println(avg(a, b));
		System.out.println(distance(a, b));
		System.out.println(max(a, b));
		System.out.println(min(a, b));
		
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}

	private static int difference(int a, int b) {
		return a - b;
	}

	private static int product(int a, int b) {
		return a * b;
	}

	private static double avg(int a, int b) {
		return (a * 1.0 + b)/2.0;
	}

	private static int distance(int a, int b) {
		return Math.abs(a - b);
	}

	private static int max(int a, int b) {
		return Math.max(a, b);
	}

	private static int min (int a, int b) {
		return Math.min(a, b);
	}
}
