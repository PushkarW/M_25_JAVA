package org.tnsindia.abstraction;
class C
{
	//default variable
	String BikeModel;
	
}

public class DemoOnDefault {

	public static void main(String[] args) {
		
				C c=new C();
				
				/*If any data members is default then it can access only inside the same package,
				 * it can not be access outside the another package
				 */
				c.BikeModel="Yamaha MT-15";
				System.out.println("Bike Model is: "+c.BikeModel);

			}


	}
