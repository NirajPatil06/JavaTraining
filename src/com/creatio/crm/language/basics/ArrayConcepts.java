package com.creatio.crm.language.basics;

public class ArrayConcepts {

	public static void main(String[] args) {

		// Arrays ==> Data type can store multiple values with similar data type together at one place
		// Syntax to initialize array : DataType [] Variable = new DataType [size/length];
	    // Syntax to Store value in array : DataType [Index] = Value;
		// Syntax to retrieve value in array : DataType [Index] ;
		// Syntax to check total values in array : Variable.length;

		
		// Direct initialization method
		
		String [] empName = {"Sam","Jon"};
		System.out.println(empName.length);
		System.out.println("empName is: "+ empName[0] + empName[1]);
		
		// Declaration with size
		
		String [] stateNames = new String [3];
		
		stateNames  [0] = "Maharastra";
		stateNames  [1] = "Gujrat";
		stateNames  [2] = "MP";
		
		// 2D Array
		/*
		 * 2D array is essentially an "array of arrays." It can be visualized as a table
		 * or a matrix with rows and columns.
		 */

		// Imagine a scenario where we store the details of employees: Employee ID,
		// Name, and Department.
		
		String [] [] emp = {{ "101", "Alice", "HR" }, { "102", "Bob", "IT" }, { "103", "Charlie", "Finance" } };
		
		System.out.println(emp [0][2]);
		System.out.println(emp[2][2]);
		// Approach 2
		
		String [][] emp1 = new String [3][3];
		
		emp1 [0][0]= "101";
		emp1 [0][1]= "Alica";
		emp1 [0][2]= "HR";
		emp1 [1][0]= "102";
		emp1 [1][1]= "bob";
		emp1 [1][2]= "IT";
		emp1 [2][0]= "103";
		emp1 [2][1]= "charlie";
		emp1 [2][2]= "Finance";
		
		System.out.println(emp1[1][2]);
		
		// 3D array is an "array of 2D arrays." It can be visualized as a collection of
				// matrices or a 3D grid.

				// Assume a company with offices in two locations. Each location has its own
				// list of employees, and we want to store Employee ID, Name, and Department for
				// each location.
		// Approach 1
		String[][][] company = { { { "101", "Alice", "HR" }, { "102", "Bob", "IT" } },
				{ { "201", "David", "Finance" }, { "202", "Eva", "Marketing" } } };
		
		
		// Approach 2
		
		String [][][] companyData = new String [4][3][3];
		
		companyData [0][0][1]= "101";
		
		

	}

}
