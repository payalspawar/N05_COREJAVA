//program to demonstrate on access specifier


package org.tnsif.accessspecifier;

public class Bank {
	
	public String bankName;
	private int pinNo;
	long accountNo=23657487638612L;
	
	public void displayPublic()
	{
		System.out.println("Bank nameis:"+bankName);
	}
	private void displayPrivate()
	{
		System.out.println("Pin no is:"+pinNo);
		

	}
	void displayDefault()
	{
		System.out.println("Acc no is:"+accountNo);
	}

}
