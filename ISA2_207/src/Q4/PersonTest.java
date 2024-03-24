package Q4;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		
		Person person1=new Person("Kevin",22);
		assertEquals("Kevin",person1.getName());
		assertEquals(22,person1.getAge());
		
		Person person2=new Person("Aaron",19);
		assertEquals("Aaron",person2.getName());
		assertEquals(19,person2.getAge());
		
	}
	@Test
	 public void testConstructor() {
	        String ob1 = "Kevin";
	        int ob2 = 22;
	        Person person1 = new Person(ob1, ob2);
	        assertEquals(ob1, person1.getName());
	        assertEquals(ob2, person1.getAge());
	        
	        String ob3 = "Aaron";
	        int ob4 = 19;
	        Person person2 = new Person(ob3, ob4);
	        assertEquals(ob3, person2.getName());
	        assertEquals(ob4, person2.getAge());
	    }
	
	

}
