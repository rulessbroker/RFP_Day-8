package com.bridgelabz.empwage;

import java.util.Random;

public class EmpWageComputation {
	
public static void main(String[] args) {
		
		System.out.println("Welcome To Employee Wage Computation Program");
		
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
}
