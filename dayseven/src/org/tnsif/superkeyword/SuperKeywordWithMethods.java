package org.tnsif.superkeyword;

class Sports
{
	String sportsName="Cricket";
	void display()
	{
		System.out.println("Sports name is:"+sportsName);
	}
}

class Cricket extends Sports
{
	int noOfPlayers=11;
	void display() 
	{
		super.display();
		System.out.println("No of players is:"+noOfPlayers);
	}
}
public class SuperKeywordWithMethods {

	public static void main(String[] args) {
		Cricket c=new Cricket();
		c.display();

	}

}
