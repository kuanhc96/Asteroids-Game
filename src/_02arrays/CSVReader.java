import java.io.*;
import java.util.*;
public class CSVReader {
	
	private File csvFile;

	public CSVReader(String fileName) throws FileNotFoundException {
		csvFile = new File(fileName);
	}

	public int numberOfRows() throws FileNotFoundException {
		int numRows = 0;
		Scanner scan = new Scanner(csvFile);
		while (scan.hasNextLine()) {
			numRows++;
         scan.nextLine();
		}
		return numRows;
	}

	public int numberOfFields(int row) throws FileNotFoundException {
		Scanner scan = new Scanner(csvFile);
		String currentRow = findRow(row);
		String[] fields = currentRow.split(",");
		return fields.length;
	}

	public String field(int row, int column) throws FileNotFoundException {
		Scanner scan = new Scanner(csvFile);
		String currentRow = findRow(row);
		String[] fields = currentRow.split(",");
		return fields[column - 1];
	}
	
	private String findRow(int row) throws FileNotFoundException {
		Scanner scan = new Scanner(csvFile);
                String currentRow = "";
                for (int i = 0; i < row; i++) {
                        currentRow = scan.nextLine();
                }
		return currentRow;
	}
}
