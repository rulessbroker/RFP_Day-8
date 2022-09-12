package com.bridgelabz.empwage;

import java.util.Random;

import com.bl.empwage.EmpWageComputation;

public class EmpWageComputation {
	
	static int wagePerHr = 20;
	static int fullDayHr = 8;
	static int partTimeHr = 4;
	
	public static void main(String[] args) {
		
			System.out.println("Welcome To Employee Wage Computation Program");
			
			CheckEmployee();
			
			GetWage();
			
			MonthlyWage();
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
	
	public static int GetWage() {
		Random rand = new Random();
	    int random = 3;
		int randNum = rand.nextInt(random);
		
		switch(randNum) {
		case 1:
			System.out.println("Employee Full Time Wage is = " +EmpWageComputation.DailyWage());
			break;
			
		case 2: 
			System.out.println("Employee Part time wage is = " +EmpWageComputation.PartTimeWage());
			break;
			
		default : 
			System.out.println("Employee is Absent");
		}
		return 0;
		
	}
	
	public static int MonthlyWage() {
		int monthlyDays = 20;
		int monthlyWage = monthlyDays * EmpWageComputation.DailyWage();
		System.out.println("Monthly wage of employee is = " +monthlyWage);
		return (monthlyWage);
	}
}