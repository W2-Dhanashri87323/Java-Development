package demo02;

class Constructor2{
	private String name;
	private int number;
	
	
	public Constructor2() {
		System.out.println("Parameterless");
		this.name="Dhanu";
		this.number= 10;
	}
	
	public Constructor2(String name1, int number1) {
		System.out.println("Parameterized");
		this.name = name1;
		this.number = number1;
		
	}
//  Facilitator
	void display() {
		System.out.println("Name ::"+this.name);
		System.out.println("Number ::"+this.number);
	}
	
	
//  getter for number 
	void displayNumber() {
		System.out.println (" Number :: " + this.number );
	}
//  getter for number 
	int printNumber() { // for printing only number separatly
		return this.number;
	}
	
// setter for name (Updater)
	void updateName(String name1) {
		this.name=name1;
	}
	
	

}

public class ConstructorSetter{
	public static void main(String[] args) {
		
		Constructor2 obj = new Constructor2();
		obj.updateName("Raj");
		obj.display();
		}
	}
