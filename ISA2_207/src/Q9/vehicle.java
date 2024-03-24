package Q9;

	class vehicle_base {
		int horsepower=50;
		vehicle_base(int horsepower)
		{
		this.horsepower=horsepower;
		}
		void drive()
		{
		System.out.println("Someone is driving the car");
		}
		}
		class Cars extends vehicle_base{
		int horsepower=80;
		String make;
		void drive() {
		System.out.println(super.horsepower);
		System.out.println(horsepower);
		super.drive();
		System.out.println("The car is parked");
		}
		Cars(int horsepower,String make){
		super(horsepower);
		this.make=make;
		}
		}
		public class vehicle {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars ca=new Cars(109872635,"BMW");
		ca.drive();
		}

}
