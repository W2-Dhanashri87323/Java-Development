package com.dhanashri;

import java.util.Objects;


public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee("Dhanashri",22,23 );
		Object o1 = (Object) emp; //Upcasting
		Object o2 = emp; // Upcasting
		Object o3 = new Employee("Dhanashri ",22,23);
		
		if(emp.equals(o3)) {
			System.out.println("Same");
		}else {
			System.out.println("not same");
		}
	}
}

//equals method Practice -->
class Employee{
	private String name;
	private int age;
	private int id ;	
	
	public Employee(String name, int age, int id ) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public void print() {
		System.out.println("Name : " +  this.name);
		System.out.println("Age : " + this.age);
		System.out.println("ID : "+ this.id);
	}
	
	//self created overriden equals method from object class of {id}
	
	@Override 
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if (this == obj) {
			return true;
		}
		
    // if(getClass() != obj.getClass()) 
    //	return false; 
    //  }
		
		if (!(obj instanceof Employee)) {
			return false;                                                                                    //true
		}
		
		Employee other = (Employee) obj; //downcasting  Eqauls(Sub)--> Oject(super)                          //false
		return this.id == other.id;
	}
		
	
}


//public static void main2(String[] args) {
//Employee emp1 = new Employee();
//Employee emp2 = new Employee();
//
//if(emp1.equals(emp2)) { // equals method of java.lang object class and also compares on references
//	System.out.println("Same");
//}else {
//	System.out.println("not same"); // Ans is not same 
//}	
//
//}
//
//public static void main1(String args[]) {	
//Employee emp1 = new Employee();
//Employee emp2 = new Employee();
//
//if(emp1==emp2) { // compares on 2 different references
//	System.out.println("Same");
//}else {
//	System.out.println("not same"); // Ans is not same 
//}	



















