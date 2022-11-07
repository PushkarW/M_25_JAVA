package org.tnsindia.dateandtime;

import java.time.LocalTime;
import java.time.ZoneId;

@SuppressWarnings("unused")
public class Demo_6 {

	public static void main(String[] args) {
		//LocalTime t=LocalTime.now(ZoneId.of("Asia/Kolkata"));
		
		for (String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
