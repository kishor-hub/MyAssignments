package weekend.assignments.week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		// Define the range for the Fibonacci series
		int range = 8;

		// Initialize the first two numbers in the Fibonacci series
		int num1 = 0;
		int num2 = 1;

		System.out.print("Fibonacci Series up to " + range + ": ");

		
		for (int i = 1; i <= range; i++) {
			System.out.print(num1 + " ");

			// Calculate the next Fibonacci number
			int nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
		}
	}
}
