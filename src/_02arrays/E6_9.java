import java.util.*;
public class E6_9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("First input of integers:");
		String input = s.nextLine();
		String[] input1 = input.split("\\s+");
		System.out.println("Second input of integers:");
		input = s.nextLine();
		String[] input2 = input.split("\\s+");
		int[] intArray1 = str2intArray(input1);
		int[] intArray2 = str2intArray(input2);
		System.out.println(equals(intArray1, intArray2));
		
	}

	private static int[] str2intArray(String[] input) {
		int[] intArray = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			intArray[i] = Integer.parseInt(input[i]);
		}
		return intArray;
	}

	private static boolean equals(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					return false;
				}
			}
			return true;
		}
	}
}
