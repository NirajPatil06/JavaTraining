package com.creatio.crm.language.basics;

public class Methods_Practice2 {
	
	String carName ;
	int year;
	
	//parameterized constructor same as class name
	Methods_Practice2(String carNameis , int mfgYear){
		
		carName = carNameis;
		year = mfgYear;
	}

	public static void main(String[] args) {
      // created object 
		Methods_Practice2 obj = new Methods_Practice2("Nexon", 2025);
		System.out.println("car name is: "+ obj.carName + "  " +  "mfg year is : "+ obj.year);

		

	}

}
