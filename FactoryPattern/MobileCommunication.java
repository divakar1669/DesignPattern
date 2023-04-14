//$Id$
package FactoryPattern;

public class MobileCommunication implements Communication {

	@Override
	public void messageEmployee(Employee emp) {
		System.out.println("Employee "+emp.getName()+" is communicated via SMS "+emp.getPhone());
	}

}
