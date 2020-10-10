package com.basiljereh.hackerank.datastructures;

import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

public class TreeMapDemo {

	//The TreeMap class implements the Map interface by using a tree. 
	/* A TreeMap provides an efficient means of storing key/value pairs in sorted order, 
	   and allows rapid retrieval. You should note that, unlike a HashMap, 
	   a TreeMap guarantees that its elements will be sorted in ascending key order
	*/
	
   //You can specify the sorting order while creating TreeMap by providing an explicit
	//(a)comparator (b)to TreeMap. Basically, you can create TreeMap in Java in different ways
	//(c)a TreeMap with a natural sorting order, and TreeMap with custom sorting order by providing the comparator, 
	//by copying the sorting order from the other SortedMap, etc
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tmp = new TreeMap<Integer, String>(); 
		
		//add elements to TreeSet
		tmp.put(1,  "Data 1");
		tmp.put(23, "Data 2");
		tmp.put(70, "Data 3");
		tmp.put(4,  "Data 4");
		tmp.put(2,  "Data 5");
		
		//Display contents using Iterator
		Set set = tmp.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("key is : "+ mentry.getKey() +" && "+ " value is: "+ mentry.getValue());
		}
		
		
	}
}
