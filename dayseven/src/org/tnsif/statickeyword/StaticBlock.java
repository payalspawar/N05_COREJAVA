package org.tnsif.statickeyword;

public class StaticBlock {
	
	static int salary;
	String companyName;
	/*static block is used to initialize the static variable we cannot assign 
	 * a value for any non static variable inside the static block /
	 */
	static
	{
		//companyName="Accenture";
		salary = 55000 ;
	}
	//static method
	static void print()
	{
		System.out.println(salary);
	}

	public static void main(String[] args) {
		print();

	}

}
