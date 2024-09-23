//Step 1 : Understand requirement and Declare the class 

import java.util.Scanner;

class Date {
	// Step 2: Declare the fields
	// Step 4: access modifiers
	private int day;
	private int month;
	private int year;

	// this = birthDate
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Day : ");
		this.day = sc.nextInt();

		System.out.print("Month : ");
		this.month = sc.nextInt();

		System.out.print("Year : ");
		this.year = sc.nextInt();

	}

	// this = birthDate
	public void printRecord() {
		// System.out.println("Day : "+this.day);
		// System.out.println("Month : "+this.month);
		// System.out.println("Year : "+this.year);

		System.out.println(+day + " / " + month + " / " + year);
	}
}

public class Dem05 {

	public static void main(String[] args) {
		// step3 :
		Date birthDate = new Date();
		// step5:
		birthDate.acceptRecord();// birthDate.acceptRecord(birthDate)
		birthDate.printRecord(); // birthDate.printRecord(birthDate)

	}

}

/*
 * Date dt1 = new Date( );
 * Date dt2 = dt1; // shallow copy of references
 * 
 */
