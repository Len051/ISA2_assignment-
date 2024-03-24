package Q4;

import static org.junit.Assert.*;

import org.junit.Test;

public class countnumbersTest {

	@Test
	public void testcountnumbers () {
	        assertEquals(4, countnumbers.Countnumbers(1234));
	    }

	    @Test
	    public void testCountDigitsZero() {
	        assertEquals(1, countnumbers.Countnumbers(0));
	    }
	}


