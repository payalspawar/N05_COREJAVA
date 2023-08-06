package org.tnsif.hirerchicalinheritance;

public class Android {
	
	//private datamembers
	private String brandName;
	private String slotType;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	@Override
	public String toString() {
		return "Android [brandName=" + brandName + ", slotType=" + slotType + "]";
	}
	
	//default const
	public Android() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Android(String brandName, String slotType) {
		super();
		this.brandName = brandName;
		this.slotType = slotType;
	}
	
}
