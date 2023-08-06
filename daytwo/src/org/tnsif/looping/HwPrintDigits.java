//to print number of digits in a number
package org.tnsif.looping;
import java.util.Scanner;
public class HwPrintDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
int flag=0;
do
{
	n=n/10;
	flag++;
}while(n>0);
System.out.println(flag);
	}

}
