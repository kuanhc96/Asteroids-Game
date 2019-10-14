import java.util.*;
public class E2_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter measurement (m): ");
		double meters = s.nextDouble();
		System.out.println(m2mi(meters));
		System.out.println(m2ft(meters));
		System.out.println(m2in(meters));
	}

	private static double m2mi(double m) {
		return m * 0.000621371192;
	}
	
	private static double m2ft(double m) {
		return m * 3.2808399;
	}

	private static double m2in(double m) {
		return m * 39.3700787;
	}
}
