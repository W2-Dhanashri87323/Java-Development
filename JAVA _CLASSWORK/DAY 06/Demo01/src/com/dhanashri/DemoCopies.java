package com.dhanashri;
import java.util.*;

public class DemoCopies {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = num1; //shallowcopy of int variable
		
		Date d1 = new Date(9,9,2024);
		Date d2 = d1; // shallowcopy of reference {variable}
		
		try {
			Date dt1 = new Date(23,11,2002);
			Date dt2 = dt1.clone(); //Shallowcopy of instances
			
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(dt2);
		
	}

}

class Date{
	private int day;
	private int month;
	private int year;
	
	public Date(int day,int month,int year) {
		this.day = day;
		this.month=month;
		this.year=year;
	}
	
	public Date clone() throws CloneNotSupportedException{
		Date other = (Date)super.clone();
		return other;
	}
	
}
