/*a microwave oven manufacturer recommends that when heating two items, 
add 50 percent to the heating time and when heating three items 
 * double the heating time. Heating more then 3 items at once is not recommended. 
 * Write a program to find out the recommended heating time.
 
sample input: item=2, heating time=5.0
Note switch case*/

package org.tnsif.challenges;
import java.util.Scanner;
public class HeatingTIme {

	public static void main(String[] args) {
		
		int items,ht=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items");
		items=sc.nextInt();
		switch(items)
		{
		case 1:System.out.println("recommended heating time is "+ ht);
		break;
		case 2: System.out.println("recommended heating time is "+ (ht+ht*0.5));
		break;
		case 3:System.out.println("recommended heating time is "+ 2*ht);
		break;
		default : System.out.println("heating more than 3 items at once is not recommended");
		}
	}

}
