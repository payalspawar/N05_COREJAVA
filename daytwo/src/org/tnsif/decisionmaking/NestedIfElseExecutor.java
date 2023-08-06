
//program to demonstrate nested if else

package org.tnsif.decisionmaking;
import java.util.Scanner;
public class NestedIfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
System.out.println("enter the age and weight");
int age = sc.nextInt();
int weight=sc.nextInt();

if ( age >=12)
{
	if (weight>=40)
	{
		System.out.println("eligible for bunjee jumping");
		if (weight>110)
			System.out.println("extra ropes will be added");
	}
}
else 
	System.out.println("not eligible");
sc.close();

	}

}