package org.tnsif.finalkeyword;

public class FinalVariable {
	//the blank final field NUM may not have been initialized
	//final int NUM;
	
	final float SALARY=78000.67f;
	
	public void print()
	{
		//we can not change the value of final variable
		//SALARY =89000.56f;
		
		System.out.println("Salary is:"+SALARY);
	}
}
