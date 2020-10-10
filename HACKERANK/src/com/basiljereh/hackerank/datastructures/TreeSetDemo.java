package com.basiljereh.hackerank.datastructures;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {

	/*
	 * This provides an implementation of the Set interface that uses a tree for storage. 
	 * Objects are stored in sorted, ascending order. Access and retrieval times are quite fast,
	 * which makes TreeSet an excellent choice when storing large amounts of sorted information
	 * that must be found quickly. It contains unique elements only.
	 */
	public static void main(String[] args) {
		
		TreeSet ts= new TreeSet();
		
		ts.add("basil 1");
		ts.add("basil 2");
		ts.add("basil 3");
		ts.add("basil 4");
		ts.add("basil 5");
		
		Iterator iterator = ts.iterator(); 
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + " loop-number ");
		}
		/*
		System.out.println("===================================== ");
		for(int i=0; i<  ts.size(); i++) {
			System.out.println("record "+ i + ts.toString());
		}
		*/
	}
}
