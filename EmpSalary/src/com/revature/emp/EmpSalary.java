package com.revature.emp;

import java.nio.file.FileSystem;

public class EmpSalary {
	public static void main(String args[])
	{
		SalariedEmp se=new SalariedEmp();
		se.setEmpid(101);
		se.setEmpName("Abhijeet");
		se.setDaysPresent(20);
		System.out.println(se);
		System.out.println(se.calculateSalary(se.getDaysPresent()));
//		System.out.println(se.getBenefits());
		
		ContractualEmp ce=new ContractualEmp(201,"Abhijeet",120);
		System.out.println(ce);
		System.out.println(ce.calculateSalary(ce.getDaysPresent()));
	}

}
