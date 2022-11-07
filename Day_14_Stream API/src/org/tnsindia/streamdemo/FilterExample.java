package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList(new String[]{"Hema","Rekha","Jaya","Sushma"});
		obj.stream().filter((i->i.length()<6)).forEach((i)->System.out.print(i+" "));
	}

}
