package Q7;

import static org.junit.Assert.*;

import org.junit.Test;

public class dogTest {

    @Test
    public void testSetandGet() {
        dog dog1 = new dog("Reager", "German Shepherd");
        dog1.setName("Mocci");
        dog1.setBreed("Bulldog");
        assertEquals("Mocci", dog1.getName());
        assertEquals("Bulldog", dog1.getBreed());
        
        dog dog2 = new dog("Scubby", "lab");
        dog2.setName("Franco");
        dog2.setBreed("Husky");
        assertEquals("Franco", dog2.getName());
        assertEquals("Husky", dog2.getBreed());
    }

	}

