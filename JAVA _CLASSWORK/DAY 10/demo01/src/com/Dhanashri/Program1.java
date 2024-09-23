package com.Dhanashri;

class Multiplicant implements Comparable<Multiplicant> {
	private int num1;
	private int num2;
	private int result;

	public Multiplicant(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		multiplication();
	}

	public void multiplication() {
		this.result = num1 * num2;
	}

	// @Override
	// public boolean equals(Object obj) {
	// Multiplicant other = (Multiplicant) obj;
	// if (this.num1 != other.num1)
	// return false;
	// if (this.num2 != other.num2)
	// return false;
	// return true;
	// }

	@Override
	public int compareTo(Multiplicant other) {
		if (this.result == other.result)
			return 0;
		if (this.result > other.result)
			return 1;
		else
			return -1;
	}

}

public class Program1 {

	public static void main(String[] args) {
		Multiplicant m1 = new Multiplicant(10, 5);
		Multiplicant m2 = new Multiplicant(15, 5);
		System.out.print(m1.compareTo(m2));
	}

}
