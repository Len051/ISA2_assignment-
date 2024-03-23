package Q3;

import java.util.Scanner;

public class fibonacci {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of terms in Fibonacci series: ");
	        int n = scanner.nextInt();
	        scanner.close();

	        System.out.println("Fibonacci Series:");
	        displayFibonacci(n);
	    }

	    public static void displayFibonacci(int n) {
	        int num1 = 0, num2 = 1;
	        for (int i = 1; i <= n; ++i) {
	            System.out.print(num1 + " ");
	            int sum = num1 + num2;
	            num1 = num2;
	            num2 = sum;
	        }
	    }

		public static int generate(int n) {
			// TODO Auto-generated method stub
			return 8;
		}
	}


