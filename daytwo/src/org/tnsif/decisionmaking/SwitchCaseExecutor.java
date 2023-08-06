//program to select caller tune
package org.tnsif.decisionmaking;
import java.util.Scanner;
public class SwitchCaseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter your choice");
char ch=sc.next().charAt(0);
switch(ch)
{
case '1': System.out.println("sanam re");break;
case '2':System.out.println(" tera fitoor");break;
case '3': System.out.println(" ae dil hai mushkil"); break;
case '4' : System.out.println(" hawayein");break;
default : System.out.println(" wrong input");
	
}

	}

}