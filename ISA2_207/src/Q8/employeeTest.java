package Q8;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class employeeTest {

    @Test
    public void testDACalculation() {
        
        double basicSalary = 20000;
        double expectedDA = 0.1 * basicSalary; 
        
        employee Employee = new employee("Maria","Assistant",1800);
        double actualDA = Employee.calculate(basicSalary);
        assertEquals(expectedDA, actualDA, 0.01); 
    }
}