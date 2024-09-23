package demo02;

class Initializer{
	//field initializer
	public static int id=1;
	public static int age=30;
	
	//Object Initializer
	{
		this.id=2;
		this.age= 40;
	}
	
	//Constructor initializer
	public Initializer() {
		this.id = 1;
		this.age =50;
	}	
	
}

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\t\tFIELD INI");
		System.out.println("Id ::"+Initializer.id);
		System.out.println("Age ::"+Initializer.age);
		
		Initializer i =new Initializer();
		System.out.println("\t\tCONSTURCTOR INI");
		System.out.println("Id ::"+i.id);
		System.out.println("Age ::"+i.age);
		
		System.out.println("\t\tFIELD INI");
		System.out.println("Id ::"+Initializer.id);
		System.out.println("Age ::"+Initializer.age);
		}

}
