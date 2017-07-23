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
	
<<<<<<< HEAD
	public MatrixSort( int value){
		String path = "src/main/resources/Clement Task.xlsx";
		new MatrixSort(path);
		convert(find(list, value));
		
	}
=======
	// why is your list just 1 row like this [1,3,4,5,6,7,8,8,2,2345,23452345,23467,4537,435,75]
	public static ArrayList<Integer> matrix = new ArrayList<>();
	
	private static String file = "src/main/resources/Clement Task.xlsx";
>>>>>>> 5ca27445931588089542412f641c30e54f39b58b
	
	public static void main(String [] args ){
		new MatrixSort(55);
		
		
	    //numbers u wanted were: 55, 35, 11, 2222 and 200,000
	}
	


	public static String find(ArrayList<Integer> s, int i){
		number = String.valueOf(i);
	
		for(int myValue : s)
			if(myValue == i) {
				
				index = s.indexOf(i);
				setLocation(String.valueOf(index));
				
				if(number.length() < 2) setLocation("0" + getLocation());
				

				}
		
		return getLocation();
		
	}
<<<<<<< HEAD
	
	
	public static String convert(String rowColIndex){
			
			String convert = "";
			String result = "";
			
			//each row needs to added by 1 to get the actual row;
			int actualRow = 0;
		
			if(rowColIndex.length() >= 2){ 
				row = rowColIndex.substring(0, 1);
=======
	// Why is it static and workbook is never closed
	public static void readExcelFile() throws FileNotFoundException, IOException{
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> RowIterator = sheet.iterator();
		
		while(RowIterator.hasNext()){
			Row nextRow = RowIterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			
			while(cellIterator.hasNext()){
				Cell cell = cellIterator.next();
				
				switch(cell.getCellType()){
				case Cell.CELL_TYPE_NUMERIC:
						matrix.add((int) cell.getNumericCellValue());
						//System.out.print(matrix);
						break;
			// what if the use is an idiot and its not numeric
>>>>>>> 5ca27445931588089542412f641c30e54f39b58b
				
				col = rowColIndex.substring(1);
				convert = CellReference.convertNumToColString(Integer.valueOf(col));
				actualRow = Integer.valueOf(row) + 1;
				setLocation(convert + actualRow);
				System.out.print("\n The number " + number + " is located at cell: " + getLocation());
				
				}
			
			if(rowColIndex.length() < 2){ 
				row = "1";
				col = rowColIndex;
				convert = CellReference.convertNumToColString(Integer.valueOf(col));
				setLocation(convert + row);
				result = "\n The number " + number + " is located at cell: " + getLocation();
				
				}
			
			return result;
		
	}
	
	
	public MatrixSort(String path){
		try{
			File excel = new File(path);
			FileInputStream fis = new FileInputStream(excel);
			XSSFWorkbook book = new XSSFWorkbook(fis);
			XSSFSheet sheet  = book.getSheetAt(0);
			
			Iterator<Row> itr = sheet.iterator();
				
				while(itr.hasNext()){
					Row row = itr.next();
					Iterator<Cell> cellIterator = row.cellIterator();
					while(cellIterator.hasNext()){
						Cell cell = cellIterator.next();
					   
						switch(cell.getCellType()){
						case Cell.CELL_TYPE_STRING:
							
							//System.out.print("\n" + cell.getStringCellValue() + "\t");
							break;
						case Cell.CELL_TYPE_NUMERIC:
							
							list.add((int) cell.getNumericCellValue());
							//System.out.print(cell.getNumericCellValue() + "\t");
							break;
						case Cell.CELL_TYPE_BOOLEAN:
							//System.out.print(cell.getBooleanCellValue() + "\t");
							break;
						default:
					
						}
					}
					System.out.print("");
				}book.close();
				
		}catch(FileNotFoundException fe){
			fe.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
	}
		
	}

	/**
	 * @return the location
	 */
	public static String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public static void setLocation(String location) {
		MatrixSort.location = location;
	}
}