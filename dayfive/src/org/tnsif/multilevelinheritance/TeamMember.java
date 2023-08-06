package org.tnsif.multilevelinheritance;

public class TeamMember extends TeamLead {
	
	
	public TeamMember(String leadname, int tlid, String project, String depname, String name, int empid, int size, int duration) {
		super(leadname, tlid, project, depname, name, empid);
		this.size=size;
		this.duration=duration;
		// TODO Auto-generated constructor stub
	}


	private int size;
	private int duration;
	
	//getters and setters
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	

}