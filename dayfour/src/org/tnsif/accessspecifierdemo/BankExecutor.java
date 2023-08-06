package org.tnsif.accessspecifierdemo;
import org.tnsif.accessspecifier.*;
public class BankExecutor {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.bankName="SBI";
		b.displayPublic();
		/*
		 * pin no and display private method are private so we can not access into another class
		 *  and another package only we can access private data members inside same class*/
		//b.pinNo;
		//b.displayPrivate;
		
		/*account no and displayDefault method are default 
		 * thats why we are not able to access into another package.
		 * only we can access within same package*/
		//b.accountNo;
		//b.displayDefault;
	}

}
