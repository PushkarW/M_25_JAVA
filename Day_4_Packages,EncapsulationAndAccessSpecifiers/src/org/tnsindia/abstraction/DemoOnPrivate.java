package org.tnsindia.abstraction;

class A
{
	//private variable
	private int salary;

	//setters and getters to access private data members into another class
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

public class DemoOnPrivate {

	public static void main(String[] args) {
		A a=new A();
		a.setSalary(54000);
		System.out.println("The salary is: "+a.getSalary());

	}

}
