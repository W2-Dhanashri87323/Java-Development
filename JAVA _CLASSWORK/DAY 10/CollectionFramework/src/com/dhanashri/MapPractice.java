package com.dhanashri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class MapPractice {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1,"Dhanshri");
		map.put(2, "Raj");
		
		System.out.println(map);
		
		System.out.println("GET METHOD :"+map.get(2));
		
		if(map.containsKey(1)){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println("KEYSET : "+map.keySet());
		
		System.out.println("VALUES :" + map.values() );
		
		System.out.println(map.entrySet());
		
		//map.Entry
		
	
		
		
		
		
		
		
		
		
		
	}
}
