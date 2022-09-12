package com.bridgelabz.empwage;

import java.util.Random;

public class EmpWageComputation {
	
	static int wagePerHr = 20;
	static int fullDayHr = 8;
	static int partTimeHr = 4;
	
	public static void main(String[] args) {
		
			System.out.println("Welcome To Employee Wage Computation Program");
			
			CheckEmployee();
			
			DailyWage();
			
			PartTimeWage();
		}

//Employee Wage

	public static int DailyWage() {
		int dailyWage = wagePerHr * fullDayHr;
		System.out.println("Employee Daily Wage is = " +dailyWage);
		return (dailyWage);
		}


	public static int CheckEmployee() {
		Random rand = new Random();
	    int random = 3;
		int randNum = rand.nextInt(random);
		
		switch(randNum) {
		case 1:
			System.out.println("Employee Is Present");
			break;
			
		case 2: 
			System.out.println("Employee is present Part time");
			break;
			
		default : 
			System.out.println("Employee is Absent");
		}
		return randNum;
		}

	public static int PartTimeWage() {
		int partTime = wagePerHr * partTimeHr;
		System.out.println("Employee Part Time Wage is = " +partTime);
		return (partTime);
		}
}