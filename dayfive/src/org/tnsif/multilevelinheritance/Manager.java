//this is our parent class 1 or super class
package org.tnsif.multilevelinheritance;

public class Manager {
	private String depname;
	private String name;
	private int empid;
	
	//default constructor
	public Manager() {
		
		// TODO Auto-generated constructor stub
		System.out.println("default constructor for manager");
	}

	//parameterized constructor
	public Manager(String depname, String name, int empid) {
		//super();
		this.depname = depname;
		this.name = name;
		this.empid = empid;
	}
	
	
	
//to string method
	@Override
	public String toString() {
		return "Manager [depname=" + depname + ", name=" + name + ", empid=" + empid + "]";
	}

	
	//getters and setters
	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
	
	
	
	
	

}
