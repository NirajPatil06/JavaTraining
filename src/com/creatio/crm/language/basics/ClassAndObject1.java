package com.creatio.crm.language.basics;

public class ClassAndObject1 {

	String empName = "Niraj";
	int empId = 8884;
	//Object : New instance of class  / new copy of the class

	public static void main(String[] args) {

		ClassAndObject1 obj = new ClassAndObject1();
		
		System.out.println(obj.empName);
	}

}
