import java.util.*;
public class E3_14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		int day = s.nextInt();
		String season = "";
		if (month < 4) {
			season = "Winter";
		} else if (month < 7) {
			season = "Spring";
		} else if (month < 10) {
			season = "Summer";
		} else {
			season = "Fall";
		}
		
		if (month % 3 == 0 && day >= 21) {
			if (season.equals("Winter")) {
				season = "Spring";
			} else if (season.equals("Spring")) {
				season = "Summer";
			} else if (season.equals("Summer")) {
				season = "Fall";
			} else {
				season = "Winter";
			}
		}
		
		System.out.println(season);
	}
}
