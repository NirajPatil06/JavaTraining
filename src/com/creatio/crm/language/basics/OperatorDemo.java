package com.creatio.crm.language.basics;

public class OperatorDemo {

	public static void main(String[] args) {
		//1)Arithmetic operators + - * / %
				System.out.println("***************Arithmetic Operators*****************");
				int a=20,b=10;
				
				System.out.println("sum of a and b is:"+ (a+b));
				System.out.println("sum of a and b is:"+ (a-b));

				System.out.println("sum of a and b is:"+ (a*b));

				System.out.println("sum of a and b is:"+ (a/b));  //when we / operator it will return coefficient value
				System.out.println("sum of a and b is:"+ (a%b));  // when we % it will reminder value

				
				System.out.println("**************Relational/Camparison Operators*************");
				//2)Relational/Comparison Operators > >= < <= != ==
				// returns boolean values
				int c=40,d=15;
				
				System.out.println(c>d);
				System.out.println(c>=d);
				System.out.println(c<d);
				System.out.println(c<=d);
				System.out.println(a!=b);
				System.out.println(a==b);
				
				
				System.out.println("***********Logical Operators***************");
				
				//3)Logical Operators &&  ||  ! (AND OR NOT)
				//returns boolean value - true/false
				// works between 2 boolean values
				
				
				Boolean x=true;
				Boolean y=false;
				System.out.println(x && y);
				System.out.println(x || y);
				System.out.println(!x);
				System.out.println(!y);
				
				System.out.println("*************Increment&Decrement Operators *****************");
				
				//4)Increment & Decrement Operators  ++  --
				// ++ is called increment operator
				//Case1
				int e=10;
				System.out.println(e);
				
				e++; // e=e+1;
			System.out.println(e);
			
			//Case 2 post increment
			
			int f=25;
			int res= f++;
			 System.out.println(res);
			
			
			//Case3 pre increment	
				
		    int j=75;
		    int res1=++j;
		    System.out.println(res1);
		    
		    System.out.println("****************Decrement Operators*********");
		    
		    // Decrement Operators --
		    
		    //Case1 
		    int g=5;
		    g--;
		    System.out.println(g);
		    
		    //Case2 pre decrement
		    int h=15;
		    int h1=--h;
		    System.out.println(h1);
		    
		    //Case3 post decrement
		    
		    int k=12;
		    int k1=k--;
		    System.out.println(k1);
		    
		    System.out.println("************Assignment Operators********************");
		    
		    // Assignment Operators = += -= *= /= &=
		    
		    int l=15;
		    l+=5;
		    System.out.println(l);
		    
		    int z=50;
		    z-=20;
		    System.out.println(z);
		    
		    
		    int v=10;
		    v*=2;
		    System.out.println(v);
		    
		    
	}

}
