package nonAccessModifiers;

public class NonAccessModifier {
	
	// 1.static
	// 2.abstract
	// 3.final
	// 4.synchronized
	// 5. volatile
	// 6. transient 
	
	//It's mandatory to use access modifiers before non-access modifiers
	
	//static non-access modifier
	
	//static can be used before data as well as methods/block
	
	static String name= "Niraj";
	
	static public void empId() {
		
		System.out.println(1234);
	}

	public static void main(String[] args) {

		System.out.println(name);
		empId();
		
	}

}
