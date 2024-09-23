package com.dhanashri;

import java.util.*;

public class ExceptionHandling02 {
	// static double divide(int numrator , int denominator) {
	// return numrator/denominator;
	// }

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) { // try with resource

			System.out.print("Enter the first number : ");
			int num1 = sc.nextInt();
			System.out.print("Enter the second number : ");
			int num2 = sc.nextInt();

			double result = num1 / num2;

			// double result = divide(num1,num2);
			System.out.println("Result : " + result);
		}

		catch (ArithmeticException | InputMismatchException e) { // reference is created here
			if (e instanceof ArithmeticException)
				System.out.println("Divide by zero is not allowed");
			else
				System.err.println("Invalid Input");

		}

	}

}
