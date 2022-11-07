package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collection;

public class DemoOnCollectionInterface {

	public static void main(String[] args) {
		Collection obj=new ArrayList<>();
		//adding the values
		obj.add("Pushkar");
		obj.add('x');
		obj.add(85.90f);
		System.out.println("The elements in collections are: "+obj);

	}

}
