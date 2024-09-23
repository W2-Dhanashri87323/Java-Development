//Default -> package level private 

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.acceptRecord(); // emp1.acceptRecord(emp1)
		emp1.printRecord();// emp1.printRecord(emp1);

		Employee emp2 = new Employee();
		emp2.acceptRecord(); // emp2.acceptRecord(emp2);
		emp2.printRecord(); // emp2.printRecord(emp2);

	}

	public static void main3(String[] args) {
		// Employee emp3; // object reference / reference
		// new Employee(); // annonymous instance
		Employee emp4 = new Employee();// Instance with reference
		// Employee class is instantiated
	}

	public static void main2(String[] args) {
		// emp1 , emp2 , emp3 are local references . Hence it will take space on java
		// stack
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
	}

	public static void main1(String[] args) {
		Employee emp = new Employee(); // reference with instance
		// emp -> Object reference
		// new Employee(); --> Instance
		emp.acceptRecord();
		emp.printRecord();

	}

}


class Employee {
	// Fields
	private String name; // Instance variable
	private int empid; // Instance variable
	private float salary; // Instance variable

	// Methods
	// this = emp1
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Name : ");
		this.name = sc.nextLine();

		System.out.print("Empid : ");
		empid = sc.nextInt();

		System.out.print("Salary : ");
		salary = sc.nextFloat();
	}

	// this = emp1
	public void printRecord() {
		System.out.println("Name : " + this.name);
		System.out.println("Empid : " + empid);
		System.out.println("Salary : " + salary);
	}
}

