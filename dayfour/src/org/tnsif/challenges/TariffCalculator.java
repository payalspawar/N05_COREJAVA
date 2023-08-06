/*write a program to calculate hotel tariff (budget) .
The room rent is 12% high during peak season
 * (april to june is peak and november to december ).Note use the switch cases
 * sample input; month=3(march),rent=1500/day, days
 */

package org.tnsif.challenges;
import java.util.Scanner;
public class TariffCalculator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		float rent;
		int days; 
		int month;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month and number of days and rent");
		month=sc.nextInt();
		days=sc.nextInt();
		rent=sc.nextFloat();
		switch(month)
		{
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:System.out.println("the tariff is " +(rent+rent*0.12)*days);
		break;
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:System.out.println("the tariff is "+rent*days);
		break;
		default: System.out.println("wrong month eneterd");
		
		}
		

	}

}