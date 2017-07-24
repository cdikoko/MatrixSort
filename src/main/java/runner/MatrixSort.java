package runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * MatrixSort Author: Clement Dikoko Date: 2/28/2017 Title: MatrixSort
 * 
 */

public class MatrixSort {

	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static int index = 0;
	public static String number = "";
	private static String location = "";
	public static String row;
	public static String col;

	public MatrixSort(int value) {
		String path = "src/main/resources/Clement Task .xlsx";
		new MatrixSort(path);
		find(list, value);
		convert(getIndex());

	}

	

	private static String getIndex() {
		// gets a string version of the index: Location in Array 
		return String.valueOf(index);
	}



	public static void main(String[] args) {
		new MatrixSort(79);

		//numbers u wanted were: 55, 35, 11, 2222 and 200,000
	}


	public MatrixSort(String path) {
		try {
			File excel = new File(path);
			FileInputStream fis = new FileInputStream(excel);
			XSSFWorkbook book = new XSSFWorkbook(fis);
			XSSFSheet sheet = book.getSheetAt(0);

			Iterator<Row> itr = sheet.iterator();

			while (itr.hasNext()) {
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();

					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						System.out.print("Please Use Numerical Values \t");
						break;
					case Cell.CELL_TYPE_NUMERIC:

						list.add((int) cell.getNumericCellValue());
						//System.out.print(cell.getNumericCellValue() + "\t");
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.print("Please Use Numerical Values");
						break;
					default:

					}
				}
				System.out.print("");
			}
			book.close();

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}


}