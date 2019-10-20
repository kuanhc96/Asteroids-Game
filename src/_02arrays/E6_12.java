import java.util.*;
public class E6_12 {
	public static void main(String[] args) {
		int[] array = generateRandomArray(20);
		Arrays.sort(array, 0, array.length); 		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	private static int[] generateRandomArray(int size) {
		int[] array = new int[size];
		Random rand = new Random();
		for (int i = 0; i < 20; i++) {
			array[i] = rand.nextInt(100);
		}
		return array;
	}

}
