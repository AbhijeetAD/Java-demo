package com.revature.emp;

public class ContractualEmp extends Emloyee 
{

	public ContractualEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractualEmp(int empid, String empName, int daysPresent) {
		super(empid, empName, daysPresent);
		// TODO Auto-generated constructor stub
	}

	public double calculateSalary(int hours)
	{
		return 200*hours;
	}

	
}
