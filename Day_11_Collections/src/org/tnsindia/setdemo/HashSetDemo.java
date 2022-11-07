package org.tnsindia.setdemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//Set is an interface,we can't create the object for the set
				//Set s=new Set<>();
				//@SuppressWarnings("raw types")
				//1.HashSet is unordered and it does not contain duplicate element
				//2.Set contain at most one null element
				Set<Object> s=new HashSet<>();
				s.add("Pushkar");
				s.add('P');
				s.add(85.50f);
				s.add(2);
				s.add("Pushkar");
				s.add(null);
				s.add(null);
				System.out.println("The elements in the set are: "+s);


	}

}
