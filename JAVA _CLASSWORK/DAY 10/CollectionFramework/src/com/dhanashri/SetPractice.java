package com.dhanashri;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice{
	public static void main(String args[]) {
		Set<Integer> s = new HashSet<>();
		//Set<Integer> s = new LinkedHashSet<>();
		//Set<Integer> s = new TreeSet<>();
		s.add(1);
		Collections.addAll(s, 2,3,4,5,6);
		System.out.println(s);
		
		System.out.println("Size :"+s.size());
		
		s.remove(2);
		System.out.println("removed list"+s);
		
	}
}