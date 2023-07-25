
//driver class
//program to demonstrate on default and parameterized constructor
package org.tnsif.classandobjects;

public class CitizenExecutor {

	public static void main(String[] args) {
		Citizen c =new Citizen();
		
		Citizen c1=new Citizen("Adult",456398353262L,"female","nasik");
		System.out.println(c1);
	}

}
