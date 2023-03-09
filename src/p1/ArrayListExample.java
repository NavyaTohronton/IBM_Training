package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayListExample {

	public static void main(String[] args) {
		// ArrayList - it is a class which implements list interface -- Duplicate value can be added

		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Navya");
		myList.add("Danilo");
		myList.add("Tony");
		myList.add("Mary");
		System.out.println(myList);
		myList.add("Blessy");
		myList.add("Reena");
		System.out.println(myList);
		myList.remove("Navya");
		myList.remove("Danilo");
		System.out.println(myList);
		System.out.println(myList.get(1));
		myList.add(0, "Rohan");
		System.out.println(myList);
		

	//Set Class -- Duplicate values cannot be added
	Set<String> mySet = new HashSet<String>();
	mySet.add("Navya");
	mySet.add("Danilo");
	System.out.println(mySet);
	mySet.add("Navya");
	
	
	//Map-HashMap
	HashMap<Integer, String> myMap=new HashMap<Integer, String>();
	myMap.put(1, "One");
	myMap.put(2, "Two");
	System.out.println(myMap);
	System.out.println(myMap.get(1));
	System.out.println(myMap.get(2));
	
	}
}
