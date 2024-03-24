package Q10;

	public class student {
		String name,address;
		int age;
		student(){
		name="unknown";
		age=0;
		address="not available";
		}
	void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
		
		void setInfo(String name,int age,String address) {
			this.name=name;
			this.age=age;
			this.address=address;
		}
	void display()
	{
		System.out.println("Name: "+name+" \nAge: "+age+" \nAddress:"+address);
		System.out.println("\n");
	}
		
		public static void main(String[] args) {
			student stu[]=new student[3];
			
			stu[0]=new student();
			stu[1]=new student();
			stu[2]=new student();
			stu[0].setInfo("Venessa", 19, "margao");
			stu[1].setInfo("Kinesha", 20, "fatorda");
			stu[2].setInfo("Shanice", 19, "varca");
			stu[0].display();
			stu[1].display();
			stu[2].display();
	}
}

