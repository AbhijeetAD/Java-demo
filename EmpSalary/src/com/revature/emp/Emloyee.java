package com.revature.emp;

public  class Emloyee {
	
	private int empid;
	private String empName;
	private int daysPresent;
	public Emloyee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emloyee(int empid, String empName, int daysPresent) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.daysPresent = daysPresent;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDaysPresent() {
		return daysPresent;
	}
	public void setDaysPresent(int daysPresent) {
		this.daysPresent = daysPresent;
	}
	@Override
	public String toString() {
		return "Emloyee [empid=" + empid + ", empName=" + empName + ", daysPresent=" + daysPresent + "]";
	}
	

}
