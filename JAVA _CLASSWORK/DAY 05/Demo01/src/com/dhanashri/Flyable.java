package com.dhanashri;

public interface Flyable {
	public static final String eye = null ;
	public static final String legs = null ;
	 
    public abstract void fly();
    public abstract void eat();	
	
}

class Duck implements Flyable{
	
	public void name() {
		System.out.println("Name of duck is duckling " );
	}


	@Override
	public void fly() {
		System.out.println(" duck can fly");
		
	}

	@Override
	public void eat() {
	 System.out.println(" duck can eat ");
		
	}
	
} 

class Parrot implements Flyable{
	
	@Override
	public void fly() {
		System.out.println("Paarrot can fly");
	}
	
	@Override
	public void eat() {
		System.out.println("Parraot can eat ");
	}
}
