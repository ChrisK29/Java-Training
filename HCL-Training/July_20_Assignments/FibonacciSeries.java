package com.hcl;
import java.util.Scanner;

public class FibonacciSeries {

	static int fibonacci(int n) {
		if (n <= 1) {

		
		return n;
	}
	else
	{
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
			Scanner input = new Scanner(System.in);
			while(input.hasNextInt()) {
				System.out.println(fibonacci(input.nextInt()));
			}
	}

}
