package com.basiljereh.hackerank.datastructures;

import java.util.ArrayList;

import java.util.Iterator;;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Yahoo");
		al.add("Google");
		al.add("Microsoft");
		al.add("Facebook");
		al.add("Twitter");
		al.add("Linkedin");
		al.add("Instagram");
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
