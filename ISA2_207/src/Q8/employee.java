
package Q8;

public class employee {
    private String name;
    private String jobTitle;
    private double basicSalary;

    // Constructor
    public employee(String name, String jobTitle, double basicSalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
    }

    
    public double calculateTotalSalary() {
        double DA = 0.1 * basicSalary; 
        double HRA = 5000;
        return basicSalary + DA + HRA;
    }

    
    public void BasicSalary(double newBasicSalary) {
        this.basicSalary = newBasicSalary;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    
    public static void main(String[] args) {
        
        employee Employee = new employee("Maria", "Assistant", 1800);
 
        double totalSalary = Employee.calculateTotalSalary();
        System.out.println("Total Salary: " + totalSalary);
    
        Employee.BasicSalary(35000);
        totalSalary = Employee.calculateTotalSalary();
        System.out.println("Total Salary: " + totalSalary);
    }


	public double calculate(double basicSalary2) {
		// TODO Auto-generated method stub
		return 2000.0;
	}
}