import static org.junit.Assert.*;

import org.junit.Test;

import runner.MatrixSort;

public class MatrixSortTest {
	
	
	@Test
	public void findValues(){
	MatrixSort	a = new MatrixSort(5005);
	assertEquals("J10", a.getLocation());
	
	MatrixSort b = new MatrixSort(1012);
	assertEquals("J3", b.getLocation());
	
	MatrixSort c = new MatrixSort(6);
	assertEquals("D1", b.getLocation());
	
	MatrixSort d = new MatrixSort(3);
	assertEquals("A2", b.getLocation());
	
	
	
		
	}

}
