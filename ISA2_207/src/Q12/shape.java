package Q12;
	public abstract class shape
	{
		abstract double calculateArea();
		abstract double calculatePerimeter();
	}

	class Circle extends shape
	{

		double radius;
		public Circle(double radius)
		{
			this.radius = radius;
		}
		@Override
		double calculateArea()

		{
			return Math.PI * radius * radius;
		}
		
		@Override
		double calculatePerimeter()
		{
			return 2 * Math.PI * radius;
		}
	}
		
	class Triangle extends shape {
		private double side_A;
		private double side_B;
		private double side_C;
			
		public Triangle(double side_A, double side_B,double side_C)
	{
			this.side_A = side_A;
			this.side_B = side_B;
			this.side_C = side_C;
}
		@Override
			double calculateArea() {
			// Using Heron's formula to calculate the area of a triangle
			double s = (side_A + side_B + side_C) / 2;
			return Math.sqrt(s * (s - side_A) * (s -side_B) * (s -side_C));
		}
		@Override
		double calculatePerimeter()
		{
			return side_A + side_B + side_C;
		}

		public static void main(String[] args) {
			Circle circle = new Circle(60.0);
			System.out.println("Circle Area: " +circle.calculateArea());
			System.out.println("Circle Perimeter: " +circle.calculatePerimeter());

			Triangle triangle = new Triangle(20.0, 30.0,40.0);

			System.out.println("Triangle Area: "+triangle.calculateArea());
			System.out.println("Triangle Perimeter: "+triangle.calculatePerimeter());

		}
}