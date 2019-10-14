import java.util.*;
public class E4_1e {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int length = Integer.toString(a).length();
		int factor = (int) Math.pow(10, length);
		int sum = 0;
		for (int i = 0; i < length; i++) {
			int current = a / factor;
			if (current % 2 != 0) {
				sum += current;
			}
			
			a = a % factor;
			factor = factor / 10;
		}
		if ((a % 10) % 2 != 0) {
			sum += a % 10;
		}
		
		System.out.println(sum);
	}
}
