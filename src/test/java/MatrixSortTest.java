import static org.junit.Assert.*;

import org.junit.Test;

import runner.MatrixSort;

public class MatrixSortTest {
	
	
	@Test
	public void findValues(){
	MatrixSort	a = new MatrixSort(55);
	assertEquals("G4", a.getLocation());
	
	MatrixSort b = new MatrixSort(35);
	assertEquals("F5", b.getLocation());
	
	MatrixSort c = new MatrixSort(11);
	assertEquals("B3", b.getLocation());
	
	MatrixSort d = new MatrixSort(2222);
	assertEquals("J2", b.getLocation());
	
	
	MatrixSort e = new MatrixSort(200000);
	assertEquals("I9", b.getLocation());
	
		
	}

}
