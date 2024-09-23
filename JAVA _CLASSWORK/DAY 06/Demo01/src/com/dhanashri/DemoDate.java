package com.dhanashri;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

//using Calendar class -->


public class DemoDate {
	public static void main(String[] args) {
		LocalDate l = LocalDate.now();
		int day = l.getDayOfMonth();
		int month = l.getMonthValue();
		int year = l.getYear();
		
		System.out.println(day + "/" + month +"/"+ year);
		
	}
	

	
//	public static void main1(String[] args) {
//		Calendar c = Calendar.getInstance();
//		int day1 = c.get(Calendar.DAY_OF_MONTH);
//		
//		int day = c.get(Calendar.DATE);
//		int month = c.get(Calendar.MONTH)+1;
//		int year = c.get(Calendar.YEAR);
//		
//		System.out.println(day + "/" + month +"/"+ year);
//		
//		
//	}
	
//	public static void main(String[] args) {
//	Date d = new Date();
//	int day = d.getDate();
//	int month = d.getMonth()+1 ;
//	int year = d.getYear() + 1900;
//	
//	System.out.println(day +"/"+ month + "/"+ year);
//	
//}
	
	

}
