package org.tnsindia.abstractkeyword;

public class Employe extends Person {
	
	private int Eid;
	public Employe(String name, String gender) {
		super(name, gender);
		int eid = 0;
		Eid = eid;
	
	}


	@Override
	public void work() {
		if(Eid==0)
		{
			System.out.println("Not Working");
		}
		else
		{
			System.out.println("Working as a Employee!");

		}
		
	} 

}
