package com.creatio.crm.language.basics;



public class Practice_1 {

	public static void main(String[] args) {

    
		// Store text value
				String value = " Username : Admin | Password : admin123 ";
    

				System.out.println(value.length()); // get string size
				System.out.println(value.trim());// remove unwanted spaces from string
				System.out.println(value.charAt(5)); // get specific char from dtring
				System.out.println(value.replace(" ", "")); // remove complete space from string
				System.out.println(value.replaceAll("[a-zA-Z]", " ")); //remove all alphabet from string
				System.out.println(value.replaceAll("[0-9]", " ")); // remove all numbers from string
				System.out.println(value.substring(1,9));// extract specific part of string
				
				String rev= ""; // rev string
				String rev1 = "";
				for(int i=value.length()-1;i>=0;i--) {
					
					rev= rev+value.charAt(i);
					
				}
				System.out.println(rev);
				
				
				String name = "Niraj"; // immutable
				
				name.concat("Patil");
				System.out.println(name);
			
				StringBuffer sbf = new StringBuffer("Niraj");	
				
				sbf.append("Patil");
				System.out.println(sbf);
				
				StringBuilder sbd = new StringBuilder("Niraj");
				sbd.append("Patil");
				System.out.println(sbd);
					
				}
				
		}
		
	
	
