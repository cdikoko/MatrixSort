package runner;

import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.CellStyle;

import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFRow; 
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 * MatrixSort Author: Clement Dikoko Date: 2/28/2017 Title: MatrixSort
 * 
 */

public class MatrixSort {
	
	public static ArrayList<Integer> matrix = new ArrayList<>();
	
	private static String file = "src/main/resources/Clement Task.xlsx";
	
	
	
	public static void main(String[] args) throws IOException, NullPointerException{
//		matrix = new ArrayList<Integer>();
//		readFile(file);
//		
//		System.out.print("\n\n" +matrix.indexOf(55));
//		System.out.print(matrix);
		readExcelFile();
		MergeSort ms = new MergeSort(matrix);
		
		System.out.print(matrix);
	}
	
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
			
				
				
				
				
				
				
				
				
				
				}
			}
		}
		

		
		
		
		
		
		
		
		
	}
	
	//public static <E> ArrayList<E> readFile(String file)throws IOException{
//		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		//XSSFRow rows = sheet.getRow(0);
//		Iterator<Row> rowIterator = sheet.iterator();
//	
//		while(rowIterator.hasNext()){
//			Row row = rowIterator.next();
//			if(row.getCell(1) != null){
//				for(int i = 0; i < row.getPhysicalNumberOfCells(); i++){
//					Cell temp = row.getCell(1);
//					int column = (temp.getColumnIndex());
//					System.out.println("\n"+ temp + " is located at position: " +  " " + CellReference.convertNumToColString(column) + " " + (temp.getRowIndex()+1) + "\n");
//					i = 9;
//					
//				}
//			}
//			
//			Iterator<Cell> cellIterator = row.cellIterator();
//			
//		}
//		
//		
//		workbook.close();
//		return (ArrayList<E>) matrix;
//		
//	}
	
}