package com.dhanashri;



public class Inheritance{
	public static void main(String[] args) {
		Student s1 = new Student("Raj",21,25,7927);
		s1.DisplayRecord1();
		System.out.println("name : " + s1.getter("Dhanshri"));
		 
	}
}

class Person {
	private String name;
	private int age;
	
	public Person(String name,int age ) {
		this.name=name;
		this.age=age;
	}
	
	public void DisplayRecord(String name, int age) {
		System.out.println("Name :  " + this.name );
		System.out.println("Age :  " + this.age);
	}
	
	public String getter(String name) {
		return this.name = name;
	}
	

}

class Student extends Person{
	private int id;
	private int number;
	
	public Student(String name,int age ,int id,int number) {
		super(name,age);
		System.out.println("PARAMETERIZED ");
		this.id=id;
		this.number=number;
	}
	
	public void DisplayRecord1() {
		super.DisplayRecord(null , 0);
		System.out.println("DISPLAY STUDENT RECORD");
		System.out.println("ID : " + this.id);
		System.out.println("Number  : " +  this.number);
	}
	
	
	
}
