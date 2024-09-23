//Default -> package level private 

import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.acceptRecord(); // emp1.acceptRecord(emp1)
		emp1.printRecord();// emp1.printRecord(emp1);
		// salary ==> 1000.00

		emp1.setSalary(10000.00f); // emp1.setSalary(emp1,10000.00f);

		
		System.out.println("Updated salary " + emp1.getSalary()); // 10000.00
		// emp1.getSalary(emp1)
		emp1.printRecord(); //emp1.printRecord(emp1)
	}

}

class Employee {
	// Fields
	private String name; // Instance variable
	private int empid; // Instance variable
	private float salary; // Instance variable

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEmpid() {
		return empid;
	}

	// this = emp1
	// setter / mutator
	public void setSalary(float salary) {
		this.salary = salary;
	}

	// this = emp1
	// getter / inspector
	public float getSalary() {
		return salary;
	}

	// Methods
	// this = emp1
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Name : ");
		this.name = sc.nextLine();

		System.out.print("Empid : ");
		this.empid = sc.nextInt();

		System.out.print("Salary : ");
		this.salary = sc.nextFloat();
	}

	// this = emp1
	public void printRecord() {
		System.out.println("Name : " + this.name);
		System.out.println("Empid : " + this.empid);
		System.out.println("Salary : " + this.salary);
	}
}



