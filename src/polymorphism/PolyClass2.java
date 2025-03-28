package polymorphism;

public class PolyClass2 {
	
	//overriding
		public int sumOfNumbers(int a, int b) {
			int c = a + b;
			return c;
		}
		
		//overloading
		public int sumOfNumbers(int a, int b, int c) {
			int d = a + b + c;
			return d;
		}

	public static void main(String[] args) {
		PolyClass2 obj = new PolyClass2 ();
		
	}

}
