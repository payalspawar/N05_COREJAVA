package org.tnsif.superkeyword;

//parent class
class State
{
	String StateName="Punjab";
	
}

//child class
class Capital extends State
{
	String StateName="Hariyana";
	String Capital="Chandigarh";
	
	public void display()
	{
		System.out.println(super.StateName); //punjab
		System.out.println(StateName);  //hariyana
	}
}


//driver class
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Capital c=new Capital();
		c.display();
		

	}

}
