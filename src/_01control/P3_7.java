import java.util.*;
public class P3_7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double income = s.nextDouble();
		double tax;
		if (income <= 50000) {
			tax = 0;
		} else if (income > 50000 && income <= 75000) {
			tax = 50000 * 0.01;
			tax += (income - 50000) * 0.02;
		} else if (income > 75000 && income <= 100000) {
			tax = 50000 * 0.01;
			tax += 25000 * 0.02;
			tax += (income - 75000) * 0.03; 
		} else if (income > 100000 && income <= 250000) {
			tax = 50000 * 0.01;
			tax += 25000 * 0.02;
			tax += 25000 * 0.03;
			tax += (income - 100000) * 0.04;
		} else if (income > 250000 && income <= 500000) {
			tax = 50000 * 0.01;
                        tax += 25000 * 0.02;
                        tax += 25000 * 0.03;
                        tax += 150000 * 0.04;
			tax += (income - 250000) * 0.05;
		} else {
			tax = 50000 * 0.01;
                        tax += 25000 * 0.02;
                        tax += 25000 * 0.03;
                        tax += 150000 * 0.04;
                        tax += 250000 * 0.05;
			tax += (income - 500000) * 0.06;
		}

		System.out.println(tax);
	}
}
