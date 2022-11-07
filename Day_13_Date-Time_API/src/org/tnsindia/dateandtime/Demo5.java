package org.tnsindia.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo5 {

	public static void main(String[] args) 
	{
		LocalDateTime l=LocalDateTime.now();
		DateTimeFormatter d=DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
		String x=l.format(d);
		System.out.println(x);
	
	}

}
