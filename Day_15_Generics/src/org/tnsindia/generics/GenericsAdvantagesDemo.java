package org.tnsindia.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class GenericsAdvantagesDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> obj=new LinkedList<>();
		obj.add("Pushkar");
		//1.Type safety
		obj.add("Wanjari");
		System.out.println(obj);
		//2. TypeCasting not Required
		List<Integer> obj1=new ArrayList<>();
		obj1.add(15);
		//3. Compile Time Checking
		Integer d=obj1.get(0);
		System.out.println(obj1);
	}

}
