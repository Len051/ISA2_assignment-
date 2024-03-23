package Q1;

import static org.junit.Assert.*;

import org.junit.Test;

public class addintergersjunit {

	
	@Test
	public void addpositive_test() {
		assertEquals(30,addintegers.add(10,20));	
		}
	@Test
	public void addnegative_test() {
		assertEquals(-30,addintegers.add(-20,-10));	
		}
	@Test
	public void addzero_test() {
		assertEquals(20,addintegers.add(20,0));	
		}


}
