package com.creatio.crm.language.basics;

import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
	// Print the data and go to next line
		System.out.println("Hello, World!");
		
	// Print the data and stay on same line	
		System.out.print("Hello");
		System.out.print("World!");
		System.out.println();
		
	// Print the statement with specific format
		System.out.printf("My name is %s and My age is %d and My visa status is %b","Sagar", 26, true);
		System.out.println();
		
		System.out.printf("My name is %s", "Niraj");
		System.out.println();
		
    // Print the statement with explicit format for digits
		
		System.out.format("Pi value is %.2f", 3.14587);
		System.out.println();
		
	// Print the logs along with time stamp
		Logger.getLogger("MyLogger").info("Currently i'm in line no 25, program is executing well");
		Logger.getLogger("MyLogger").warning("Currently i'm in line no 27, consider its warning");
		Logger.getLogger("MyLogger").info("Info");
    // Print error message
		System.err.println("Getting error in  line 30");
		
		
		
		
		

	}

}
