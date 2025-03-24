package com.creatio.crm.language.basics;

public class SingleDimentionalArray {

	public static void main(String[] args) {


		// declaring array
		
				//Approach 1
				
			/*	int b[] =new int[5];
				
				b[0]=100;
				b[1]=200;
				b[2]=300;
				b[3]=400;
				b[5]=500;
				
				*/
				
				//Approach2
				
				int a[]= {100,200,300,400,500};
				
				//find length of an array
				
				System.out.println(a.length);
				
				//read single value from array
				
				System.out.println(a[3]);
				
				//reading all the values from array
				// normal for loop
				
				for(int i=0;i<a.length;i++) {
					
					System.out.println(a[i]);
					
					//enhanced for loop/ for..each loop
					
					for(int x:a)
					{
						System.out.println(x);
						
					}
	}

	}
}
