
/*pratik is so much interested in gardening and hence he plants more tress in his gardern
he plants in a rectangular fashion with the order of rows and columns and no the trees in a
row wise orders.he planted the mango tree only in first row first column and last column .
so given a tree no and rows and columns,
your task is to find out whether the given tree is mango tree or not.
n=5 n belongs to rows and columns.t=11 t is tree nos*/




package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeExecutor {
		
    static void isMangoTree(int n,int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
		{
			System.out.println("Mango Tree");
		}
		else
		{
		System.out.println("Not Mango Tree");
		}
	}
	
	public static void main(String[] args) {
			
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the values of n and t:");
	int n=s.nextInt();
	int t=s.nextInt();
	isMangoTree(n,t);
	}

}
