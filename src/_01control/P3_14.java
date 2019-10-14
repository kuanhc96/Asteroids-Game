import java.util.*;
public class P3_14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input Year:");
		int year = s.nextInt();
		System.out.print("Leap Year? ");
		System.out.println((year % 400 == 0 || year % 100 != 0) && year % 4 ==0);
	}
}
