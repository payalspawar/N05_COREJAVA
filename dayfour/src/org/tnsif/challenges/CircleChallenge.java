/*there are N people standing in a circle waiting to be executed.the counting out 
begins at some point in the circle and          around a circle in a fixed direction in each step a certain no 
 * of people are skip and the next person is executed.the elimination pro      around the circle
 * (which is becoming smaller and smaller as the executed people are removed),
 * until only the last person remains
 * who is given freedom.
 * given the total no of person N and a no K which indicates that K-1 person 
 *     are skipped and the Kth person is 
 * killed in a circle. the task is to choose the person in the initial circle that survives */      
package org.tnsif.challenges;

import java.util.Scanner;

public class CircleChallenge {
	static int survive (int n,int k)
	{
		if(n==1)
			return 1;
		else
			return(survive(n-1,k)+k-1)%n+1;
	}

	public static void main(String[] args) {
			Scanner s =new Scanner (System.in);
			int n=s.nextInt();
			int k=s.nextInt();
			
			System.out.println(survive(n,k));
	}

}
