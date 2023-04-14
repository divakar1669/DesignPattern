//$Id$
package FactoryPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		 
		List<Employee> emp = new ArrayList<Employee>();
		
		Employee e1 = new Employee ("DIVYA",1003l,23,45879387,"divya@fb.com","email");
		emp.add(e1);
		Employee e2 = new Employee ("Raja",1004l,25,45879387,"raja@fb.com","mobile");
		Employee e3 = new Employee ("Ravi",1005l,53,45879387,"ravi@fb.com","mobile");
		Employee e4 = new Employee ("Ram",1005l,53,45879387,"ram@fb.com","email");
		Employee e5 = new Employee ("Somu",1005l,53,45879387,"somu@fb.com","post");
		
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		 
		Communication com; 
		Factory factory = new Factory();
		for(Employee e : emp)
		{
			com = factory.getModeOfCommunication(e.getPreferedMode());
			com.messageEmployee(e);
		}
		
		emp.forEach(e ->{
			factory.getModeOfCommunication(e.getPreferedMode()).messageEmployee(e);
		});
		
		
	}

}
