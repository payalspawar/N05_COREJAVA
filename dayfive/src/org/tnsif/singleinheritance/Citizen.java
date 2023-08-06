//this is my base class
package org.tnsif.singleinheritance;

public class Citizen {
	private String city;
	private int pincode;
	private long aadharcardNO;
	
	
	//default constructor
	
	public Citizen() {
		System.out.println("default constructor");
	}
	
	//parameterised constructor
	public Citizen(String city, int pincode, long aadharcardNO, long contactNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.aadharcardNO = aadharcardNO;
		this.contactNo = contactNo;
		System.out.println("parameterised constructor");

	}
	//getters and setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAadharcardNO() {
		return aadharcardNO;
	}
	public void setAadharcardNO(long aadharcardNO) {
		this.aadharcardNO = aadharcardNO;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	private long contactNo;
}
