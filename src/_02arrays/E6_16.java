import java.util.*;
public class E6_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Values: ");
		String input = scan.nextLine();
		String[] inputArray = input.split("\\s+");
		int[] intArray = str2intArray(inputArray);
		printHist(intArray);
		
	}

	private static int[] str2intArray(String[] array) {
		int[] intArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			intArray[i] = Integer.parseInt(array[i]);
		}
		return intArray;
	}

	private static int findMax(int[] array) {
		int max = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	private static int[] generateProportions(int[] intArray) {
		int max = findMax(intArray);
		int tallest = 20;
		int[] proportions = new int[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			proportions[i] = (int) (intArray[i] * 1.0 / max * tallest);
		}
		return proportions;
	}
	
	private static void printHist(int[] intArray) {
		int[] proportions = generateProportions(intArray);
		int max = findMax(proportions);
		int numLoops = max;
		for (int i = 0; i < numLoops; i++) {
			for (int j = 0; j < proportions.length; j++) {
				if (proportions[j] < max) {
					System.out.print(" ");
				} else {
					System.out.print("*");
					proportions[j]--;
					max = proportions[j];
				}
				
			}
			System.out.println();
		}
	}
}
