import java.util.*;
public class P3_13 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		String roman = generateRoman(year);
		System.out.println(roman);		
	}

	private static String millenium (int year) {
		String roman = "";
		int millenium = year / 1000;
		for (int i = 0; i < millenium; i++) {
                        roman += "M";
                }
		return roman;
	}

	private static String hundred (int year) {
		String roman = "";
		if (year >= 1000) {
			year = year % 1000;
		}

		int hundred = year / 100;
		if (hundred != 0) {
			if (hundred < 4) {
				for (int i = 0; i < hundred; i++) {
					roman += "C";
				}	
			} else if (hundred == 4) {
				roman += "CD";
			} else if (hundred == 5) {
				roman += "D";
			} else if (hundred < 9) {
				roman += "D";
				for (int i = 5; i < hundred; i++) {
					roman += "C";
				}
			} else {
				roman += "CM";
			}
		}
		return roman;
	}

	private static String ten (int year) {
		String roman = "";
		if (year >= 100) {
			year = year % 100;
		}
		
		int ten = year / 10;
                if (ten != 0) {
			if (ten < 4) {
                        	for (int i = 0; i < ten; i++) {
                                	roman += "X";
                        	}
                	} else if (ten == 4) {
                        	roman += "XL";
                	} else if (ten == 5) {
                        	roman += "L";
                	} else if (ten < 9) {
                        	roman += "L";
                        	for (int i = 5; i < ten; i++) {
                                	roman += "X";
                        	}
                	} else {
                        	roman += "XC";
                	}
		}
                return roman;
	}

	private static String single (int year) {
		if (year >= 10) {
			year = year % 10;
		}

		String roman = "";
                if (year != 0) {
			if (year < 4) {
                        	for (int i = 0; i < year; i++) {
                                	roman += "I";
                        	}
                	} else if (year == 4) {
                        	roman += "IV";
                	} else if (year == 5) {
                        	roman += "V";
                	} else if (year < 9) {
                        	roman += "V";
                        	for (int i = 5; i < year; i++) {
                                	roman += "I";
                        	}
                	} else {
                        	roman += "IX";
                	}
		}
                return roman;
	}

	private static String  generateRoman(int year) {
		String roman = "";
		roman += millenium(year);
		roman += hundred(year);
		roman += ten(year);
		roman += single(year);
		return roman;
	}
}
