import java.util.*;
public class E4_17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = "";
		while (n != 0) {
			str = str + (n % 2);
			n = n / 2;
		}
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(str.length() - i - 1));
		}
		System.out.println();
	}
}
