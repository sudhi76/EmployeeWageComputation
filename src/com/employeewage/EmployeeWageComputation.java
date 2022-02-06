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
		final int MAX_WORKING_DAYS = 20;
		final int MAX_WORKING_HOURS = 100;
		//variable
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalworkingDays = 0;
		int totalworkingHour = 0;
		
		//Computing salary for 20 days
		while (totalworkingHour < MAX_WORKING_HOURS && totalworkingDays < MAX_WORKING_DAYS) {
			totalworkingDays++;
					int empCheck = (int) Math.floor(Math.random() * 10) % 3;
					totalworkingDays++;
					switch(empCheck) {
						case 1: empHrs=8;
								break;
						case 2: empHrs=4;
								break;
						default: empHrs=0;
								break;	
				}
					empWage = EMP_RATE_PER_HOUR * empHrs;
					totalEmpWage += empWage;
					
			}
				System.out.println("Total wage for a month = " + totalEmpWage);
			}

		}
