import java.util.*;
import java.io.*;
public class E7_4 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sysScan = new Scanner(System.in);
		System.out.println("Input file name");
		String fileName = sysScan.next();
		File file = new File(fileName);
		printLines(file);
	}
	private static void printLines(File file) throws FileNotFoundException {
		int counter = 1;
		Scanner scanFile = new Scanner(file);
		while (scanFile.hasNext()) {
			System.out.print("/* " + counter + " */ ");
			System.out.println(scanFile.nextLine());
			counter++;
		}
	}
}
