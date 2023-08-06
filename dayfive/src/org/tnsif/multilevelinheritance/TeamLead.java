package org.tnsif.multilevelinheritance;

//child class2
//parent class2
public class TeamLead extends Manager{
	private String leadname;
	private int tlid;
	private String project;
	
	
	public String getLeadname() {
		return leadname;
	}
	public void setLeadname(String leadname) {
		this.leadname = leadname;
	}
	public int getTlid() {
		return tlid;
	}
	public void setTlid(int tlid) {
		this.tlid = tlid;
	}
	
	//to string method
	@Override
	public String toString() {
		return "TeamLead [leadname=" + leadname + ", tlid=" + tlid + ", toString()=" + super.toString() + "]";
	}
	
	public TeamLead(String leadname, int tlid, String project,String depname,String name ,int empid) {
		super(depname,name,empid);
		this.leadname = leadname;
		this.tlid = tlid;
		this.project = project;
	}
	
	
	
	

}