//$Id$
package FactoryPattern;

public class Employee {
	
	String name;
	Long EmpID;
	int age;
	int Phone;
	String email;
	String preferedMode;
	
	public String getPreferedMode() {
		return preferedMode;
	}

	public void setPreferedMode(String preferedMode) {
		this.preferedMode = preferedMode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEmpID() {
		return EmpID;
	}

	public void setEmpID(Long empID) {
		EmpID = empID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public Employee(String name,	Long EmpID,	int age,int Phone,String email,String preferedMode)
	{
		this.name=name;
		this.EmpID=EmpID;
		this.age=age;
		this.Phone=Phone;
		this.email=email;
		this.preferedMode=preferedMode;
	}

}
