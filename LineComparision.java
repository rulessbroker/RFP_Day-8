package com.bridgelabz.empwage.linecomparision;

import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparision Computation Program \n");
		
		float X1, Y1, X2, Y2, X3, Y3, X4, Y4;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the coordinates for point p1 (x1, y1):  ");
		X1 = input.nextFloat();
		Y1 = input.nextFloat();
		
		System.out.println("Enter the coordinates for point p2 (x2, y2):");
		X2 = input.nextFloat();
		Y2 = input.nextFloat();

		System.out.println();
		
		System.out.println("Enter the coordinates for point p3 (x3, y3):");
		X3 = input.nextFloat();
		Y3 = input.nextFloat();
		
		System.out.println("Enter the coordinates for point p4 (x4, y4):");
		X4 = input.nextFloat();
		Y4 = input.nextFloat();
		
		System.out.println();
		
		double line1 = getLength(X1, Y1, X2, Y2);
		double line2 = getLength(X3, Y3, X4, Y4);
		
		 String lengthL1 = String.format("%.02f", line1);
		 String lengthL2 = String.format("%.02f", line2);
		 
		 if (lengthL1.equals(lengthL2)) {
		      System.out.println("The lines L1 and L2 are equal");
		    } else {
		      Integer L1 = (int) line1;
		      Integer L2 = (int) line2;

		      if (L1.compareTo(L2) > 0) {
		        System.out.println("Line 1 is greater.");
		      } else {
		        System.out.println("Line 2 is greater.");
		      }
		    }

		    input.close();
		}
	
	static double getLength(float X1, float Y1, float X2, float Y2) {
	    return Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));

	  }
}
