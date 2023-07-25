package org.tnsif.operates;

import java.util.Scanner;

public class Donation {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		
		int age=sc.nextInt();
		
		
		int weight=sc.nextInt();
		if(age>=18 && weight>=50)
		{
			System.out.println("u r capable");
		}
		else
		{
			System.out.println("u r not capable");
		}
	}

}
