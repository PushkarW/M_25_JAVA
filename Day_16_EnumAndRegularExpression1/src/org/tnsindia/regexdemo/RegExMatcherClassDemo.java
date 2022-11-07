package org.tnsindia.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMatcherClassDemo {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("Pushkar");
		Matcher m=p.matcher("My name is Pushkar");
		while(m.find())
		{
			System.out.println("Pattern found at: "+m.start()+" "+m.end());
		}
	}

}
