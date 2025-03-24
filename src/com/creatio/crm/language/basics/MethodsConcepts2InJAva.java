package com.creatio.crm.language.basics;

public class MethodsConcepts2InJAva {
	// Method with arguments
	 void launctTheApplication(String browser, String url){
		System.out.println("Launch the "+browser+"  browser");
	System.out.println("Enter url "+url+" and launch application");
	}
	// Method without arguments
	void loginToTheApplication() {
		
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
	}
	// method without return type
	void logoutFromTheApplication() {
		
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}	
	// method with return type
		double getBalance() {
			System.out.println("Navigate to account section");
			System.out.println("Capture the Account balance");
			double balance = 1000.50;
			return balance;
		}
		//default constructor
		MethodsConcepts2InJAva(){}
		
		
		//parameterized constructor
		MethodsConcepts2InJAva(String name){
			
			
		}
	public static void main(String[] args) {
		MethodsConcepts2InJAva obj = new MethodsConcepts2InJAva();
		
	//	launctTheApplication(); 
        obj.launctTheApplication("Chrome","www.google.com");
        obj.loginToTheApplication();
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
        obj.logoutFromTheApplication();

        obj.launctTheApplication("Chrome","www.google.com");
        obj.loginToTheApplication();
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		obj.logoutFromTheApplication();

		 obj.launctTheApplication("Chrome","www.google.com");
	        obj.loginToTheApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutFromTheApplication();

		 obj.launctTheApplication("Chrome","www.google.com");
	        obj.loginToTheApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutFromTheApplication();
		
		 obj.launctTheApplication("Chrome","www.google.com");
	     obj.loginToTheApplication();
		System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50;
		obj.logoutFromTheApplication();
	}

}
