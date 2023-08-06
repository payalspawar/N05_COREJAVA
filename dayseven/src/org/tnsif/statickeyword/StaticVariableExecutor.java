package org.tnsif.statickeyword;

/*if any variable is non static and outside the main function and if you want to access
 * that variable inside the main function then we make that viable as static*/
class StaticVariableExecutor {
	
	static int num=67;

	public static void main(String[] args) {
		System.out.println(num);
		

	}

}
