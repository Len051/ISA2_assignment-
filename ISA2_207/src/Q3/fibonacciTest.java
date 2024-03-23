package Q3;

import static org.junit.Assert.*;

import org.junit.Test;

public class fibonacciTest {

	@Test
	public void testpositive() {
		
	        int n = 6; 
	        int result = fibonacci.generate(n);
	        assertEquals(8, result);
	}
	
	 @Test
	    public void testforone() {
	      
	        int n = 1;
	        int result = fibonacci.generate(n);
	        assertEquals(8, result);
	    }

}
