import java.util.*;
public class P5_24 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String roman = s.next();
		System.out.println(convertString(roman));
	}

	private static int convertString(String roman) {
		int year = 0;
		while (roman.length() != 0) {
			int first = convertChar(roman.charAt(0));
			int second = 0;
			if (roman.length() > 1) {
				second = convertChar(roman.charAt(1));
			}
			
			if (roman.length() == 1 || first >= second) {
				year += first;
				roman = roman.substring(1);
			} else {
				int difference = second - first;
				year += difference;
				roman = roman.substring(2);
			}
		}
		return year;
	}
	
	private static int convertChar(char roman) {
		if (roman == 'M') {
			return 1000;
		} else if (roman == 'D') {
			return 500;
		} else if (roman == 'C') {
			return 100;
		} else if (roman == 'L') {
			return 50;
		} else if (roman == 'X') {
			return 10;
		} else if (roman == 'V') {
			return 5;
		} else {
			return 1;
		}
	}
}
