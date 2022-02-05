package com.employeewage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Start with Displaying\r\n"
				+ "Welcome to Employee\r\n"
				+ "Wage Computation\r\n"
				+ "Program on Master Branch");
		//constant
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		//variable
		int empHrs = 0;
		int empWage = 0;
	
		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if(empCheck == IS_FULL_TIME) {
		    empHrs = 8;
		}
		else if(empCheck == IS_PART_TIME) {
			empHrs = 4;
		}
		else
			empHrs = 0;
		
		empWage = empHrs * EMP_RATE_PER_HOUR; 
	    System.out.println("Employee wage: " + empWage);
			
	}

}
