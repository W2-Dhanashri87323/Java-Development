package demo02;


class Learning{
	private int bookID;
	private String bookName;
	
	public Learning(int bookID1, String bookName1) {
		this.bookID = bookID1;
		this.bookName=bookName1;	
	}
	
	public void displayRecord() {
		System.out.println("BookID : : " + this.bookID);
		System.out.println("BookName : : " + this.bookName);
		
	}
	
	//getter for name 
	String printName() {
		return this.bookName;
		
	}
	
}

public class PractiseTest {

	public static void main(String[] args) {
		Learning l = new Learning(1, " abc");
		l.displayRecord();
		System.out.println("Name : " +  l.printName());

	}

}