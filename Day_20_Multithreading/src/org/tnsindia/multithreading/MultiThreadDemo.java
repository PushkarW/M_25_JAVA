package org.tnsindia.multithreading;

public class MultiThreadDemo implements Runnable {

	public static void main(String[] args) {
		
		Thread t1=new Thread ("Thread1");
		Thread t2=new Thread ("Thread2");
		t1.start();
		t2.start();
		//lowest Priority is 5 and highest is 10
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
	}

	@Override
	public void run() {
		System.out.println("Thread is running");
		
	}

	
	
}
