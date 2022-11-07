package org.tnsindia.dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeDemo {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		LocalTime obj=LocalTime.now();
		System.out.println(d);
		System.out.println(obj);
	}

}
