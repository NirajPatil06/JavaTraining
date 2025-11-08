package variable.concepts;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {

		String[] arr1 = {
				"Price of mango is 700",
				"Price of apple is 300",
				"Price of Banana is 120"};
		//Output:
		//Cheapest fruit is Banana
		
		String chaepFruitprice ="";
		int minPrice = Integer.MAX_VALUE;
		
		for (String item :arr1) {
			
			String[] parts = item.split(" ");
			String fruit = parts[2];
			int price = Integer.parseInt(parts[4]);
			
			if(price <minPrice) {
				
				minPrice=price;
				chaepFruitprice = fruit;
			}
		}
		System.out.println("Cheapest fruit is " + chaepFruitprice);
		
		
	
			
		
			
			
		}
		}
		


