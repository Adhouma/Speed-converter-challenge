package com.learnJava;

public class SpeedConverter {

	/**
	 * Write a method called toMilesPerHour that has 1 parameter of type double with the name
	 * kilometersPerHour.
	 * This method needs to return the rounded value of the calculation of type long.
	 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to 
	 * indicate an invalid value.
	 * Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.
	 * 
	 * Write another method called printConversion with one parameter of type double with the name:
	 * kilometersPerHour
	 * This method should not return anything (void) and it need to calculate milesPerHour from the
	 * kilometersPerHour parameter then it need to print a message in the format "XX km/h = YY ml/h"
	 * 
	 *  XX represents the original value kilometersPerHour
	 *  YY the rounded milesPerHour from the kilometersPerHour parameter.
	 *  
	 *  If the parameter kilometersPerHour is < 0 then print "Invalid value".
	 */
	public static void main(String[] args) {
		// Should return 1.5 km/h = 1 ml/h
		printConversion(1.5);
		// Should return 10.25 km/h = 6 ml/h
		printConversion(10.25);
		// Invalid value
		printConversion(-5.6);
		// Should return 25.42 km/h = 16 ml/h
		printConversion(25.42);
		// Should return 75.114 km/h = 47 ml/h
		printConversion(75.114);
	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour < 0) {
			return -1;
		} else {
			return Math.round(kilometersPerHour * 0.62);
		}
	}
	
	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour < 0) {
			System.out.println("Invalid value");
		} else {
			long milesPerHour = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " ml/h");
		}
	}

}
