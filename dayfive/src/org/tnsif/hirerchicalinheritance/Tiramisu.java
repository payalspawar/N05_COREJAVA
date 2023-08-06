package org.tnsif.hirerchicalinheritance;

public class Tiramisu extends Android{
	
	private int version;

	public int getVersion() {
		return version;
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}

	

} 
