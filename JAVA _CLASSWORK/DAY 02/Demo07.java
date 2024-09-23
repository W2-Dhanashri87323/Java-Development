//Constructor Chaining -->
public class Demo07 {

	public static void main(String[] args) {
		Person p = new Person();
		p.printRecord();

	}

}

class Person {
	private String name; // Instance variable
	private int age; // Instance variable

	public Person() {
		this("Dhanu", 22); // constructor chaining
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printRecord() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
	}
}
