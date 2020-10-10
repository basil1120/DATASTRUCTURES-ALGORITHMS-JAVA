package com.basiljereh.hackerank.datastructures;

import java.util.Iterator;
import java.util.LinkedList;

//arrays are sequentially(orderly) arranged in the memory
public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		ll.add("5");
		ll.add("6");
		
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
