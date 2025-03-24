package com.creatio.crm.language.basics;

public class SwitchCaseConditionalStatementsInJava {
/**
	switch(Expression) {
	
	case1: 
		statements;
	case2: 
		statements;
	case3:
		ststements;
	
	}
	
	*/
	
	public static void main(String[] args) {
		// print  Valentines week
		
		String date= "10th";
		switch(date) {
		
		case  "7th" : 
			System.out.println("Today is Rose Day");
		break;
		case  "8th" : 
			System.out.println("Today is Propose Day");
		break;
		case  "9th" : 
			System.out.println("Today is Chocolate Day");
		break;
		case  "10th" : 
			System.out.println("Today is Teddy Day ");
		break;
		case  "11th" : 
			System.out.println("Today is Promise Day");
		break;
		case  "12th" : 
			System.out.println("Today is Hug Day");
		break;
		case  "13th" : 
			System.out.println("Today is Kiss Day");
		break;
		case  "14th" : 
			System.out.println("Today is Valentines Day");
		break;
		
		
		
		}
		
		

	}

}
