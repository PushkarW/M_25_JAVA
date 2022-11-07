package org.tnsindia.abstractkeyword;

public class Executor {

	public static void main(String[] args) {
		Person p=new Employe("Pushkar","Male");
		Person p1=new Employe("Ranvijay","Male");
		System.out.println(p.toString());

		p.work();
		p1.work();
		p.changeName("Issamuddin");
		System.out.println(p.toString());

	}

}
