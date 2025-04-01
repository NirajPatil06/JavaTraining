package stringOperationAndDataConversion;

public class StringOperations {

	public static void main(String[] args) {

		// Store text value
				String value = " Username : Admin | Password : admin123 ";
				System.out.println(value);
				
		//Total chars available with in the String ==> String.length();	
				System.out.println(value.length());
				
		//Get Specific char from specific index ==> String.charAt(Index);
				System.out.println(value.charAt(5));
				
		//Reverse the String	
				String reverseString = " ";
				for(int i= value.length()-1; i>=0;i--)
				{
					reverseString = reverseString+value.charAt(i);
				}
				System.out.println(reverseString);

				
		//Remove unwanted spaces from the String ==> String.trim();
				System.out.println("Normal Value:" + value);
				System.out.println("Trim Value:" +value.trim());
				
		//Remove all spaces from String ==> String.replace(oldChars, newChars);
				System.out.println(value.replace(" ", ""));
				
		//Remove all alphabets from String ==> String.replaceAll(regExp, newChars);
				System.out.println(value.replaceAll("[a-zA-Z]", ""));

		//Remove all numbers from String ==> String.replaceAll(regExp, newChars);
				System.out.println(value.replaceAll("[0-9]", ""));
				
		//Remove all special chars from String ==> String.replaceAll(regExp, newChars);
				System.out.println(value.replaceAll("[^a-zA-Z0-9]", ""));
				
		//Change the case of chars ==>String.toUpperCase(); String.toLowerCase();
				System.out.println(value);
				System.out.println(value.toUpperCase());
				System.out.println(value.toLowerCase());
				
		//Extract the Specific part of the text ==> String.subString(beginingIndex,endIndex);
				System.out.println(value.substring(5, 9));
				
		//Extract the Specific part of the text from dynamic String==> String.split(regExp); [] array of Strings
				String [] values = value.split(" ");
				System.out.println("Username is:"+values[3]);
				System.out.println("Password is:"+values[7]);
				
		//Compare text values ==> equals (exact match), equalsIgnoreCase (exact match without case sensitive), contains (partial match), startWith(prefix), endsWith(trailing chars) 
				String name = "Bharath";
				System.out.println(name.equals("bharath"));
				System.out.println(name.equals("Bharath")); // equals is case sensitive
				System.out.println(name.equalsIgnoreCase("bharath")); 
				System.out.println(name.contains("hara"));
				System.out.println(name.contains("Hara"));
				System.out.println(name.startsWith("Bha"));
				System.out.println(name.endsWith("ath"));
				
				// How to store text values without using String class
				
				//String ==> immutable class
				//StringBuffer ==> synchronized mutable class
				//StringBuilder ==> non-synchronized mutable class
				
				String empName = "Bharath";
				
				//immutable
				empName.concat(" Reddy");
				System.out.println(empName);
				
				
				//mutable
				StringBuffer sbf = new StringBuffer("Bharath");
				StringBuilder sbd = new StringBuilder("Bharath");
				
				sbf.append(" Reddy");
				sbd.append(" Reddy");
				
				System.out.println(sbf);
				System.out.println(sbd);
				
	}
	

}
