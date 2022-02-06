package com.employeewage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Start with Displaying\r\n"
				+ "Welcome to Employee\r\n"
				+ "Wage Computation\r\n"
				+ "Program on Master Branch");
		//constant
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20;
		//variable
		int empHrs = 0;
		int empWage = 0;
	
		//Computation
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
			case IS_FULL_TIME:
			empHrs = 8;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
	}
		
		empWage = empHrs * EMP_RATE_PER_HOUR; 
	    System.out.println("Employee wage: " + empWage);
			
	}

}
