package com.creatio.crm.language.basics;

public class DocumentationComments {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(CalculateIntrest(100000, 24, 9.0));
		
	
	}
	/**
	 * This is common function to provide the total interest amount
	 * 
	 * @param amount - total loan amount
	 * @param months - total no of months
	 * @param intrest - rate of interest
	 * @return - interest amount for specific duration
	 * @version - 1.0
	 * @throws InterruptedException 
	 * @throws - NullPointerException
	 * @author Niraj Patil
	 * 
	 */
	public static double CalculateIntrest(int amount, int months, double intrest) throws InterruptedException {
		Thread.sleep(2000);
		double  ToatalIntrest = (amount * months * intrest /100)/12;
		return  ToatalIntrest;
		
		
	
	}
		
}
