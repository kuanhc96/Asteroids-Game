import java.util.*;
public class E6_1 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = r.nextInt(100);
			if (i % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
		for (int i = 9; i >=0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.print(array[0] + " " + array[9]);
		System.out.println();
		
		
	}
}
