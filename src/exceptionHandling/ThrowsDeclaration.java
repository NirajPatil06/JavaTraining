package exceptionHandling;

public class ThrowsDeclaration {

	public static void main(String[] args) throws InterruptedException  {
//ex.1
		int a = 10;
		int b =2;
		int result = a/b;
		System.out.println(result);
		Thread.sleep(2000);
		
	//ex.2	
		System.out.println("Balaji");
		Thread.sleep(2000);
		System.out.println("Bharathi");
		Thread.sleep(3000);
		System.out.println("Lavanya");
				
	}

}
