package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
		FinalVariable f=new FinalVariable ();
		f.print();
		
		Circle c=new Circle();
		c.printShapeType();
		c.printShapeType(c.area);
	}

}
