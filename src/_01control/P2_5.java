import java.util.*;
public class P2_5 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		double price = s.nextDouble();
		int dollars = (int) price;
		int cents = (int) ((price - dollars) * 100 + 0.5);
		System.out.println(dollars + " dollars, " + cents + " cents");
	}
}
