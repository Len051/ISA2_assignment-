package Q11;
import java.util.Scanner;

class TeacherTeaches extends teacher1 {
 private String name;

 public TeacherTeaches(String type) {
     this.type = type;
 }

 public void Subjects() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the subject: ");
     name = scanner.nextLine();
     scanner.close();
     System.out.println("The teacher is teaching " + name);
 }
}

public class teachers {
 public static void main(String[] args) {

     TeacherTeaches teacher = new TeacherTeaches("Mathematics");

     teacher.teacher();

     teacher.Subjects();
 }
}