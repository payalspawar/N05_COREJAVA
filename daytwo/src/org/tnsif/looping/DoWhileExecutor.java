package org.tnsif.looping;
import java.util.Scanner;
public class DoWhileExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
do {
	System.out.println(" value of n is :" +n);
	n++;
}while(n<14);
	}

}