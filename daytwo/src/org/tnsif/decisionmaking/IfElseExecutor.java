package org.tnsif.decisionmaking;
import java.util.Scanner;
public class IfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter age and weight");
int age=sc.nextInt();
int weight=sc.nextInt();
if(age>18 && weight>50)
	System.out.println("eligible");
else
	
System.out.println("not eligible");
sc.close();
	}

}