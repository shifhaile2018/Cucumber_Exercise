package com.qa.examples.cucumber_base;

/**
 * Calculator class for basic floating-point mathematical operations.
 * 
 * <br/><br/>
 * 
 * <b>Supported operations:</b>
 * <ul>
 * 	<li>Addition</li>
 * 	<li>Subtraction</li>
 * 	<li>Multiplication</li>
 * 	<li>Division</li>
 * </ul>
 * 
 * @author morga
 */
public class Calculator {

	public static double add(double a, double b) {
		return a + b;
	}
	
	public static double subtract(double a, double b) {
		return a - b;
	}
	
	public static double divide(double a, double b) {
		if (b != 0.0d) {
			return a / b;
		}
		return 0.0d;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
	}
}
