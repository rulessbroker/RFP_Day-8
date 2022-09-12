package com.bridgelabz.empwage;

import java.util.Random;

public class EmpWageComputation {
	
	static int wagePerHr = 20;
	static int fullDayHr = 8;
	
public static void main(String[] args) {
	
		System.out.println("Welcome To Employee Wage Computation Program");
		
		DailyWage();
//		Employee Attendance
		
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
	}

//Employee Wage

public static int DailyWage() {
	int dailyWage = wagePerHr * fullDayHr;
	System.out.println("Employee Daily Wage is = " +dailyWage);
	return (dailyWage);
	}
	
}
