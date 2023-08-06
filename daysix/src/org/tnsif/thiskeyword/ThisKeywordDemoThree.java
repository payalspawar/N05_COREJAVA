package org.tnsif.thiskeyword;

public class ThisKeywordDemoThree {
	
	void print(ThisKeywordDemoThree t)
	{
		System.out.println("hey there, i am using 'this' keyword");
	}
	void display()
	{
		//when you call any parameterized method inside any non parameterized method to overcome that we can use this keyword
		// as an argument in the method call
		//current object is used as parameter
		print(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemoThree t=new ThisKeywordDemoThree();
		t.display();
	}

}