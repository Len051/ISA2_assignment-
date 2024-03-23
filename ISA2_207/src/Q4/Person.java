package Q4;

public class Person {
	
	private String name;
	private int age;

		//Constructor
		Person(String name, int age)
		{
		this.name=name;
		this.age=age;
		}
		public String getname() {
			return name;
		}

		public int getage() { 
			return age;
		}

		public static void main(String[] args) {
		//TODO Auto-generated method stub

		Person obl=new Person("Kevin", 22);
		Person ob2=new Person("Aaron",19);

		System.out.println(obl.getname()+" is "+obl.getage()+" years");
		System.out.println(ob2.getname()+" is "+ob2.getage ()+" years");

}
}