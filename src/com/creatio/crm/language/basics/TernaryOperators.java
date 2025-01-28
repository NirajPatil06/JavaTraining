package com.creatio.crm.language.basics;

public class TernaryOperators {

	public static void main(String[] args) {
 
		// Ternary Operators
		//Var=exp? result1 : result2; 		
				
		//example 1
				int a=1000,b=200;
				
				int x =(a>b)? a:b;
				System.out.println(x);
				
				
		//Example2
				int k=(1==1)? 100:200;
				System.out.println(k);
				
				
		//Example3
				int person_age=30;
				String res= (person_age>=18)? "Eligible":"Not Eligible";
				System.out.println(res);
	}

}
