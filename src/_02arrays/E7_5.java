import java.util.*;
import java.io.*;
public class E7_5 {
        public static void main(String[] args) throws FileNotFoundException {
                File file;
		if (args.length == 0) {
			Scanner sysScan = new Scanner(System.in);
                	System.out.println("Input file name");
                	String fileName = sysScan.next();
                	file = new File(fileName);
                } else {
			file = new File(args[0]);
		}
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
