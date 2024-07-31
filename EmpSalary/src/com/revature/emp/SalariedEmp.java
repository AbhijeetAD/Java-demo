package com.revature.emp;

public class SalariedEmp extends Emloyee implements EmpBenefits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		public double calculateSalary(int present) {
			return 2000*present;
		}
		@Override
		public String getBenefits() {
			// TODO Auto-generated method stub
			return "Travel,Food,Insurance";
		}
	}


