import java.util.*;
import java.io.*;
public class P7_5 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input CVS file name");
		String fileName = scan.next();
		CSVReader csv = new CSVReader(fileName);
		System.out.println(csv.numberOfRows());
		System.out.println(csv.numberOfFields(1));
		System.out.println(csv.field(1,1));
	}
}
