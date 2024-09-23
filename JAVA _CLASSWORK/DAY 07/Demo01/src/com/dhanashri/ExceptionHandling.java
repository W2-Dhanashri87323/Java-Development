package com.dhanashri;

import java.util.Scanner;

public class ExceptionHandling {

	static double divide(int numrator, int denominator) {
		if (denominator == 0) {
			throw new RuntimeException("cannot divide by zero"); // anonumous instance
		}
		return (double) numrator / denominator;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the first number : ");
			int num1 = sc.nextInt();
			System.out.print("Enter the second number : ");
			int num2 = sc.nextInt();
			double result = divide(num1, num2);
			System.out.println("Result : " + result);
		}

		catch (RuntimeException e) { // reference is created here
			// e.printStackTrace(); // identity & prints exception that is happening with
			// solution ,for developers
			System.out.println("Divide by zero is not allowed");
			System.out.println("Error : " + e.getMessage());

		} finally {
			sc.close();
		}

	}

}
