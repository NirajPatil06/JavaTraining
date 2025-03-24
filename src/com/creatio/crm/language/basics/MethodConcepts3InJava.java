package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class MethodConcepts3InJava {

	public static void main(String[] args) {

		int[] empIds = { 1234, 1235, 1236 };

		for (int empId : empIds) {
			MethodConcepts4InJava obj = new MethodConcepts4InJava (empId);
			obj.printEmpDetails("Niraj");
			obj.printEmpAddress("Pune");
			obj.printEmpVisaDetails("HGG6576K");
		    obj.printEmpStayDetails("Hayath");
		   
		   
		
		}

//		MethodConcepts4 obj = new MethodConcepts4(1234);
//		obj.printEmpDetails("Venu");
//		obj.printEmpAddress("Hyderabad");
//		obj.printEmpVisaDetails("USDG6543G");
//		obj.printEmpStayDetails("Lemon Tree");
	}

}