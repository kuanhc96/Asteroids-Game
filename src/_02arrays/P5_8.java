import java.util.*;
public class P5_8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		System.out.println(isLeapYear(year));
	}

	public static boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
