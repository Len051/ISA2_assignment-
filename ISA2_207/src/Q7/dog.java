package Q7;

public class dog {
    private String name;
    private String breed;
   
    public dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public static void main(String[] args) {
      
        dog d1 = new dog("Reager" , "German Shepherd");
        dog d2 = new dog("Scubby", "lab");

    
        System.out.println("Before update:");
        System.out.println("Name of the first Dog: " + d1.getName() + ", Breed: " + d1.getBreed());
        System.out.println("Name of the second Dog: " + d2.getName() + ", Breed: " + d2.getBreed());


        d1.setName("Mocci");
        d1.setBreed("Bulldog");
        
        d2.setName("Franco");
        d2.setBreed("Husky");

        
        System.out.println("\nAfter Update");
        System.out.println("Name of the first Dog: " + d1.getName() + ", Breed: " + d1.getBreed());
        System.out.println("Name of the second Dog: " + d2.getName() + ", Breed: " + d2.getBreed());
    }
}