//$Id$
package FactoryPattern;

public class PostalCommunication implements Communication {
 
	@Override
	public void messageEmployee(Employee emp) {
		System.out.println("Employee "+emp.getName()+" is communicated via Post ");

	}

}
