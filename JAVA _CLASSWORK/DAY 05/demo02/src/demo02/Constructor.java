package demo02;

class Constructor1 {
	private String name;
	private int number;
	
	
	public Constructor1() {
		System.out.println("Parameterless");
		this.name="Dhanu";
		this.number= 10;
	}
	
	public Constructor1(String name1, int number1) {
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
	
	

}

public class Constructor{
	public static void main(String[] args) {
		
		Constructor1 c1 = new Constructor1();
		c1.displayNumber();
		c1.display();
		
		Constructor1 c2=new Constructor1("Dhanashri",12);
		c2.display();
		System.out.println("Something :: "+c2.printNumber());
		
		
		
		
		
	}
	}