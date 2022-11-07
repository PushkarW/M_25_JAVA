package org.tnsindia.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Axis h=new Axis();
		//setting the values using setters method
		h.setPin_no(9999);
		//returning the output using getters method
		System.out.println("The pin of ATM is: "+h.getPin_no());

	}

}
