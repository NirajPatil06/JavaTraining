package ArrayListMethods;

import java.util.ArrayList;

public class ArrayAllMethods {

	public static void main(String[] args) {
		System.out.println("*********add Method****************");
		//1.add method
		// create an ArrayList
	    ArrayList<String> languages = new ArrayList<>();

	    // insert element to the arraylist
	    languages.add("Java");
	    languages.add("Python");


	    System.out.println("ArrayList: " + languages);
	    
	    System.out.println("*********addAll()Method****************");
	    //2.addAll() method
	    
	    ArrayList <String> progLang = new ArrayList<>();
	    progLang.add("java");
	    progLang.add("python");
	    System.out.println("progmLang :" + progLang);
	    
	    // create one more ArrayList
	    ArrayList <String> lang = new ArrayList <>();
	    lang.addAll(progLang);
	    System.out.println("lang :" + lang);
	    
	    System.out.println("*********clear Method****************");
	    ArrayList<String> game = new ArrayList<>();

	    // insert element to the arraylist
	    game.add("cricket");
	    game.add("kabbadi");
	    System.out.println(game);
	    game.clear();
	    System.out.println("After clear" + game);
	    
	    System.out.println("*********clone Method****************");
	    
	 // create an arraylist
        ArrayList<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(3);
        number.add(5);
        System.out.println("ArrayList: " + number);
        
        ArrayList<Integer> clonenumber = (ArrayList<Integer>)number.clone();
        System.out.println(clonenumber);
        
        
        System.out.println("*********contains() Method****************");
        ArrayList<String> languages1 = new ArrayList<>();
        languages1.add("Java");
        languages1.add("Python");
        languages1.add("JavaScript");
        System.out.println("ArrayList: " + languages1);

        // checks if 3 is present in the arraylist
        System.out.print("Is Java present in the arraylist: ");
        System.out.println(languages1.contains("Java"));
        
        
        
        System.out.println("*********get() Method****************");
        
        // create an ArrayList
        ArrayList<String> languages11 = new ArrayList<>();

        // insert element to the arraylist
        languages11.add("JavaScript");
        languages11.add("Java");
        languages11.add("Python");
        System.out.println("Programming Languages: " + languages11);

        // access element at index 1
        String element = languages11.get(1);
        System.out.println("Element at index 1: " + element);
        
        
        System.out.println("*********indexOf() Method****************");
        ArrayList<Integer> numbers = new ArrayList<>();

        // insert element to the arraylist
        numbers.add(22);
        numbers.add(13);
        numbers.add(35);
        numbers.add(13);
        System.out.println("Number ArrayList: " + numbers);

        // find the position of 13
        int position1 = numbers.indexOf(13);
        System.out.println("Index of 13: " + position1);

        // find the position of 50
        int position2 = numbers.indexOf(50);
        System.out.println("Index of 50: " + position2);
        
        System.out.println("*********isempty() Method****************");
        
        ArrayList <String> value = new ArrayList<>();
        System.out.println("New ArrayList created");
        boolean result = value.isEmpty();
        System.out.println("Results is:" + result);
        
        value.add("Charlie");
        value.add("sheru");
        
        boolean result2 = value.isEmpty();
        System.out.println("Results is:" + result2);
        
	
	
	}
	

}
