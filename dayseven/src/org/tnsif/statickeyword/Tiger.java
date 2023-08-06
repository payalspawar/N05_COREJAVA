package org.tnsif.statickeyword;

public class Tiger  extends Animal{
	
	void eat()
	{
		System.out.println("eating:child");
		
	}
	static void run()
	{
		
		/*we cannot override static methods*/
		System.out.println("running:child");
		
	}

}
