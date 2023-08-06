package org.tnsif.instanceofdemo;

class Flower
{
	String name ="rose";
}

class Rose extends Flower
{
	String color ="red";
	
}
public class InstanceOfExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose r=new Rose();
		
		//System.out.println(r instanceof Flower);
		if (r instanceof Flower)
			System.out.println(true);
		else
			System.out.println(false);
		
				

	}

}
