//it can be used to refer instance variable of current class
package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne {
	 int x,y;
	
	 void setdata(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	 void display()
	{
	System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemoOne t=new ThisKeywordDemoOne();
		t.setdata(4, 5);
		t.display();
		
	}

}