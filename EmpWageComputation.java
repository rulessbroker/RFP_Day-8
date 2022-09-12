package com.bridgelabz.empwage;

import java.util.Random;

public class EmpWageComputation {
	
	static int wagePerHr = 20;
	static int fullDayHr = 8;
	static int partTimeHr = 4;
	
	static final int totlaWorkingHr = 100;
	 static final int totalWorkingDay = 20;
	 static final int isFullTime = 1;
	 static final int isPartTime = 2;
	 static int employeePresent = 1;
	
	public static void main(String[] args) {
		
			System.out.println("Welcome To Employee Wage Computation Program");
			
			GetEmpWage();
		}

	//Employee Daily Wage

	public static int DailyWage() {
		int dailyWage = wagePerHr * fullDayHr;
		System.out.println("Employee Daily Wage is = " +dailyWage);
		return (dailyWage);
		}

	//Employee Part time Wage

	public static int PartTimeWage() {
		int partTime = wagePerHr * partTimeHr;
		System.out.println("Employee Part Time Wage is = " +partTime);
		return (partTime);
		}
	
	//Employee Monthly Wage

	public static int MonthlyWage() {
		int monthlyDays = 20;
		int monthlyWage = monthlyDays * EmpWageComputation.DailyWage();
		System.out.println("Monthly wage of employee is = " +monthlyWage);
		return (monthlyWage);
	}
	
	//Employee Wage based on Cases

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
	
	//Employee Wage based on conditions.

	public static int GetEmpWage() {
		
        int dailyWage = 1;
        int day = 1;
        int workingHours = 0;
        int totalWage = 0;
        
        while (day <= totalWorkingDay && workingHours < totalWorkingDay) {
            int empRandom = (int) Math.floor(Math.random() * 10) % 3;
            
            switch (empRandom) {
            
                case isFullTime :
                    System.out.println("Employee is present Full time");
                    employeePresent = 20;
                    dailyWage = wagePerHr * fullDayHr;
                    workingHours += fullDayHr;
                    break;
                    
                case isPartTime :
                    System.out.println("Employee is present Part time");
                    employeePresent = 20;
                    dailyWage = wagePerHr * wagePerHr;
                    workingHours += partTimeHr;
                    break;
                    
                default:
                    System.out.println("Employee is absent");
            }

            System.out.println("Daily Wage for #" + day + "=>" + dailyWage);
            totalWage+=dailyWage;
            day++;

        }

        System.out.println("Total Working hours => " +workingHours);
        System.out.println("Total Wage => " +totalWage);
        System.out.println("Total Days =>" +day);
    
return 0;
      
	}
}