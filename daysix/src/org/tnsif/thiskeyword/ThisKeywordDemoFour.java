package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	int a;
	
	ThisKeywordDemoFour ()
	{
		this(10);  // calling to the parameterized constructor
		System.out.println("inside default constructor");
		
		
	}
	ThisKeywordDemoFour(int a)
	{
		this.a=a;
		System.out.println("inside parameterized constructor "+a);
	}

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		ThisKeywordDemoFour t=new ThisKeywordDemoFour();
		
		

	}

}