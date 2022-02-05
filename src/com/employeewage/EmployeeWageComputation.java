package com.employeewage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Start with Displaying\r\n"
				+ "Welcome to Employee\r\n"
				+ "Wage Computation\r\n"
				+ "Program on Master Branch");
		
		int IS_FULL_TIME = 1;
		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == IS_FULL_TIME)
			System.out.println("Employee is present!!: " + empCheck);
		else
			System.out.println("Employee is Absent!!: " + empCheck);

	}

}
