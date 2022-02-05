package com.employeewage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Start with Displaying\r\n"
				+ "Welcome to Employee\r\n"
				+ "Wage Computation\r\n"
				+ "Program on Master Branch");
		//constant
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		//variable
		int empHrs = 0;
		int empWage = 0;
	
		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present!!: " + empCheck);
		    empHrs = 8;
		}
		else {
			System.out.println("Employee is Absent!!: " + empCheck);
			empHrs = 0;
		}
		
		empWage = empHrs * EMP_RATE_PER_HOUR; 
	    System.out.println("Employee wage: " + empWage);
			
	}

}
