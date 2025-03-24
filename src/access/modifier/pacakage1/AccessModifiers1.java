package access.modifier.pacakage1;

public class AccessModifiers1 {
	
	public String name = "Niraj";
	
	

	public static void main(String[] args) {

		AccessModifiers1 obj = new AccessModifiers1();
		System.out.println(obj.name);
		System.out.println(obj.getName());
		
	}

	public String getName()
	
	{
		
		return name;
	}
	
	
	public void setNewName(String newName) 
	{
		name =newName;
		System.out.println(name);
	}
}
