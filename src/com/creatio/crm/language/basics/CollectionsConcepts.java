package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class CollectionsConcepts {

	public static void main(String[] args) {


		//Challenges with Arrays
		
		// 1. Arrays are fixed in size
		// 2. Memory will be allocated at the beginning of creating array / static memory allocation
		// 3. Array allows similar data types only
		// 4. Modifications also not allowed
		
		
		// Collections Framework
		
		
		// List ==> ArrayList, LinkedList
		
		// 1. List can store multiple values with similar data type together at one place by allocating memory dynamically
		// 2. List can follow dynamic memory allocation
		// 3. List allows modifications
		// 4. List allows duplicate values
		
		// Set ==> LinkedList, LinkedHashSet, TreeSet
		
		// 1. Set can store multiple values with similar data type together at one place by allocating memory dynamically
		// 2. Set can follow dynamic memory allocation
		// 3. Set allows modifications
		// 4. Set won't allow duplicate values
		
		// Map ==> HashMap, LinkedHashMap, TreeMap, Hashtable
		
		// 1. Map can store multiple values with different data types in the form of Key and Value
		// 2. Map can follow dynamic memory allocation
		// 3. Map allows modifications
		// 4. Map won't allow duplicate keys but it allows duplicate values
		
		
		//Level 1
		String empName1 = "Bharath";
		int empId1=1234;
		
		String empName2 = "ABC";
		int empId2=1235;
		
		//Level 2
		String[] empNames = new String[3];
		empNames[0] = "Bharath";
		empNames[1] = "Dhilip";
		empNames[2] = "Alekya";
//		empNames[3] = "Aarika";
		
		int [] empIds = new int [3];
		empIds[0]=1234;
		empIds[1]=1235;
		empIds[2]=1236;
		
		/*****************************ArrrayList*******************/
		System.out.println("***************************ArrayList*************************");
		//Syntax to Initialize: List<DataType> variable = new ArrayList<DataType>();
		//Syntax to add data: variable.add(value);
				//Syntax to get the data: variable.get(index);
				//Syntax to remove the data:variable.remove(value);
				//Syntax to get the total value : variable.size();	
				// Order of Storing values:Insertion Order
				// Null Values: Allowed
				// Memory allocation:Contiguous
		
		List <String> studentName = new ArrayList <String>();
		
		studentName.add("Niraj");
		studentName.add("Janvi");
		studentName.add("Yatin");
		studentName.add("Niraj");
		studentName.add(null);
		studentName.get(1);
		studentName.remove("Yatin");
		
		System.out.println("Size of ArrrayList is:"+ studentName.size());
		System.out.println(studentName);
		
		
		/*****************************LinkedList*******************/
		System.out.println("***************************LinkedList*************************");
		
		
		//Syntax to Initialize: List<DataType> variable = new LinkedList<DataType>();
				//Syntax to add data: variable.add(value);
				//Syntax to get the data: variable.get(index);
				//Syntax to remove the data:variable.remove(value);
				//Syntax to get the total value : variable.size();
				// Order of Storing values: Insertion Order
				// Null Values: Allowed
				// Memory allocation: Random
		
		List <String> studentName1 = new LinkedList <String>();
		
		studentName1.add("Niraj");
		studentName1.add("Janvi");
		studentName1.add("Yatin");
		studentName1.add("Niraj");
		studentName1.add(null);
		//studentName.get(1);
		studentName1.remove("Yatin");
		
		System.out.println("Size of LinkedList is:"+ studentName1.size());
		System.out.println(studentName1);
		
		

		/*****************************HashSet*******************/
		System.out.println("***************************HashSet*************************");
		
		
		//Syntax to Initialize: Set<DataType> variable = new HashSet<DataType>();
				//Syntax to add data: variable.add(value);
				//Syntax to get the data: variable.get(index);
				//Syntax to remove the data:variable.remove(value);
				//Syntax to get the total value : variable.size();
				// Order of Storing values: Insertion Order
				// Null Values: Allowed
				// Memory allocation: Random
		
		Set <String> studentName2 = new HashSet <String>();
		
		studentName2.add("Niraj");
		studentName2.add("Janvi");
		studentName2.add("Yatin");
		studentName2.add("Niraj");
		studentName2.add(null);
		//studentName.get(1);
		studentName1.remove("Yatin");
		
		System.out.println("Size of HashSet is:"+ studentName2.size());
		System.out.println(studentName1);
		
		
		/*****************************LinkedHashSet*******************/
		System.out.println("***************************LinkedHashSet*************************");
		
		
		//Syntax to Initialize: Set<DataType> variable = new LinkedHashSet<DataType>();
				//Syntax to add data: variable.add(value);
				//Syntax to get the data: variable.get(index);
				//Syntax to remove the data:variable.remove(value);
				//Syntax to get the total value : variable.size();
				// Order of Storing values: Insertion Order
				// Null Values: Allowed
				// Memory allocation: Random
		
		Set <String> empNamesLinkedHashSet = new LinkedHashSet <String>();
		
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add("Dhilip");
		empNamesLinkedHashSet.add("Alekya");
		empNamesLinkedHashSet.add("KK");
		empNamesLinkedHashSet.add("Vinayak");
		empNamesLinkedHashSet.add("Balaji");
		empNamesLinkedHashSet.add("Aarika");
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add(null);
		empNamesLinkedHashSet.remove("Alekya");
//		empNamesLinkedHashSet.add(1,"Swapnil");		
		System.out.println("LinkedHashSet Size is : "+empNamesLinkedHashSet.size());
		System.out.println(empNamesLinkedHashSet);
		
		
		/**********************TreeSet*******************/
		System.out.println("********************TreeSet*************************");
		
		//Syntax to Initialize: Set<DataType> variable = new TreeSet<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values: Ascending Order
		// Null Values: Not Allowed
		
		Set<String> treeSetData = new TreeSet<String>();
		treeSetData.add("Bharath");
		treeSetData.add("Dhilip");
		treeSetData.add("Alekya");
		treeSetData.add("KK");
		treeSetData.add("Vinayak");
		treeSetData.add("Balaji");
		treeSetData.add("Aarika");
		treeSetData.add("Bharath");
	//	treeSetData.add(null);
		treeSetData.remove("Alekya");
//		treeSetData.add(1,"Swapnil");		
		System.out.println("TreeSet Size is : "+treeSetData.size());
		System.out.println(treeSetData);
		
		
		/**********************HashMap*******************/
		System.out.println("********************HashMap*************************");
		
		//Syntax to Initialize: Set<DataType> variable = new HashMap<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values: Random Order
		// Null Keys:  Allowed
		// Null Values: Allowed
		
		Map<String,Integer> HashMapData = new HashMap<String,Integer>();
		
		HashMapData.put("Dhilip", 1);
		HashMapData.put("Alekya",2);
		HashMapData.put("KK",3);
		HashMapData.put("Vinayak",4);
		HashMapData.put("Balaji",5);
		HashMapData.put("Aarika",6);
		HashMapData.put("Bharath",7);
		HashMapData.put(null,9);
		HashMapData.put("Niraj",null);
		HashMapData.remove("Alekya",8);
//	HashMapData.put(1,"Swapnil");		
		System.out.println("HashMap Size is : "+HashMapData.size());
		System.out.println(HashMapData);
		
		/**********************LinkedHashMap*******************/
		System.out.println("********************LinkedHashMap*************************");
		
		//Syntax to Initialize: Set<DataType> variable = new LinkedHashMap<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values: Insertion Order
		// Null Keys:  Allowed
		// Null Values: Allowed
		
		Map<String,Integer> LinkedHashMapData = new LinkedHashMap<String,Integer>();
		
		LinkedHashMapData.put("Dhilip", 1);
		LinkedHashMapData.put("Alekya",2);
		LinkedHashMapData.put("KK",3);
		LinkedHashMapData.put("Vinayak",4);
		LinkedHashMapData.put("Balaji",5);
		LinkedHashMapData.put("Aarika",6);
		LinkedHashMapData.put("Bharath",7);
		LinkedHashMapData.put(null,9);
		LinkedHashMapData.put("Niraj",null);
		LinkedHashMapData.remove("Alekya",8);
//	LinkedHashMapData.put(1,"Swapnil");		
		System.out.println("LinkedHashMap Size is : "+LinkedHashMapData.size());
		System.out.println(LinkedHashMapData);
		
		/**********************TreeMap*******************/
		System.out.println("********************TreeMap*************************");
		
		//Syntax to Initialize: Set<DataType> variable = new TreeMap<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values: Insertion Order
		// Null Keys:  Not Allowed
		// Null Values:  Allowed
		
		Map<String,Integer> TreeMapData = new TreeMap<String,Integer>();
		
		TreeMapData.put("Dhilip", 1);
		TreeMapData.put("Alekya",2);
		TreeMapData.put("KK",3);
		TreeMapData.put("Vinayak",4);
		TreeMapData.put("Balaji",5);
		TreeMapData.put("Aarika",6);
		TreeMapData.put("Bharath",7);
		//TreeMapData.put(null,9);
		TreeMapData.put("Niraj",null);
		TreeMapData.remove("Alekya",8);
//	TreeMapData.put(1,"Swapnil");		
		System.out.println("TreeMap Size is : "+TreeMapData.size());
		System.out.println(TreeMapData);
		
		/**********************Hashtable*******************/
		System.out.println("********************Hashtable*************************");
		
		//Syntax to Initialize: Set<DataType> variable = new Hashtable<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values: Insertion Order
		// Null Keys:  Not Allowed
		// Null Values: Not Allowed
		
		Map<String,Integer> HashtableData = new Hashtable<String,Integer>();
		
		HashtableData.put("Dhilip", 1);
		HashtableData.put("Alekya",2);
		HashtableData.put("KK",3);
		HashtableData.put("Vinayak",4);
		HashtableData.put("Balaji",5);
		HashtableData.put("Aarika",6);
		HashtableData.put("Bharath",7);
		//HashtableData.put(null,9);
		//HashtableData.put("Niraj",null);
		HashtableData.remove("Alekya",8);
//	HashtableData.put(1,"Swapnil");		
		System.out.println("Hashtable Size is : "+HashtableData.size());
		System.out.println(HashtableData);
	}

}
