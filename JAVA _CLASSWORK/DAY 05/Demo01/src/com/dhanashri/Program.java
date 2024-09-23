package com.dhanashri;

public class Program {

	public static void main(String[] args) {
	   
  	  Duck duck = new Duck();	
    
      
      Flyable d = new Duck(); // polymorphic declaration
      
     d.fly(); 
     d.eat(); 
     duck.name(); 
      
      
 //    d.fly(); // not ok or not good practice 
 //    d.eat(); // not ok
    
      
  
 
		
	}

}
 