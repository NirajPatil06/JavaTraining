package com.creatio.crm.language.basics;

public class Methods_Practice {
	//Method ==> Collection of Statements / Block of code having common purpose
	
	// Step 1: Identify the duplicate code written in sequence
	// Step 2: Create the block out side of the main method and add all duplicate lines inside the block { }
	// Step 3: Add name to the block
	// Step 4: call with same name whenever it's required
	
	//pre-defined methods
	//user defined methods
	
	//method without return type ==> void
	//method with return type ==> the datatype of return value
	//method with arguments
	//method without arguments
	
	//constructor methods ==> parameterized , default
	
	String test;
	public static void main(String[] args) {
		Methods_Practice obj = new Methods_Practice();
		obj.launchTheApplication("Chrome", "www.google.com");
		obj.loginToTheBrowser();
		obj.checkBalance();
		obj.logOutFromApplication();
		
		
	}

	
	       //method with arguments
			void launchTheApplication(String browser , String url){
			System.out.println("Launch the  "+  browser+"  browser");
			System.out.println("Enter  " + url + "  and launch application");
			
			}
			
			// method without return type
			void loginToTheBrowser(){
				System.out.println("Enter username as Bharath");
				System.out.println("Enter password as bharath123");
				System.out.println("Click on Login button");
			}
			
			// method with return type
			long checkBalance(){
			 long balance = 500000;	
			System.out.println("Account Balace is :"+ balance);
			return balance;
			}
			
			
			//method without arguments
			void logOutFromApplication(){System.out.println("Logout from application");
			System.out.println("Close the browser");
			}
	
	       //default constructor  
			Methods_Practice(){
				
			}
			
			
			
			
}
