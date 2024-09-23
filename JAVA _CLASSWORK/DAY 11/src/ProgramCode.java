import java.util.*;
class Invoice {

	private String number;
	private String description;
	private int quantity;
	private double price;
	
	
	public Invoice(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number :");
		number=sc.nextLine();
		System.out.println("Write the Description :");
		description=sc.nextLine();
		System.out.println("Enter the Quantity :");
		quantity= sc.nextInt();
		System.out.println("Enter the Price :");
		price = sc.nextDouble();
		
	}
	
//	public void getNumber(String number) {
//		this
//	}
//	
//	public void getNumber(String number) {
//		this
//	}
	
	public double calculateInvoice() {
		
	}
		
		
}


public class ProgramCode{
	public static void main(String [] args) {
		
		Invoice i = new Invoice();
	}
}
