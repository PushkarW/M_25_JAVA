package org.tnsindia.generics;

public class Executor {

	public static void main(String[] args) {
		Sender<String>obj=new Sender<>();
		obj.setMessage("Generic Class Demo");
		obj.sendMessage();
		System.out.println();
		
		Email em=new Email();
		em.setForm("wpushkar7@gmail.com");
		em.setTo("pushkarwanjari1999@gmail.com");
		em.setSubject("Java Full Stack Assignment");
		em.setBody("Need to Complete all the Projects before time.");
		System.out.println(em.getBody());
		
		Sender<Email>obj1=new Sender<Email>();
		obj1.setMessage(em);
		obj1.getMessage();
		obj1.sendMessage();
	
	}

}
