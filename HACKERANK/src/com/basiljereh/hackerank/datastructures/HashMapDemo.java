package com.basiljereh.hackerank.datastructures;

import java.util.HashMap;

public class HashMapDemo {
	//This is used to store key value pairs.
	//HashMap uses the hashing technique to store key value pairs. The key value pair is called a bucket. 
	//Each bucket is stored in an array in the HashMap class
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("KENYA", "Nairobi");
		hm.put("UGANDA", "Kampala");
		hm.put("TANZANIA", "Dare-salaam");
		hm.put("RWANDA", "Kigali");
		hm.put("ETHIOPIA", "AdisAbaba");
		hm.put("SOMALIA", "Mogadishu");
		
		System.out.println("KENYA CAPITAL : "+ hm.get("KENYA"));
		System.out.println("UGANDA CAPITAL : "+ hm.get("UGANDA"));
		System.out.println("TANZANIA CAPITAL : "+ hm.get("TANZANIA"));
		System.out.println("RWANDA CAPITAL : "+ hm.get("RWANDA"));
		System.out.println("ETHIOPIA CAPITAL : "+ hm.get("ETHIOPIA"));
		System.out.println("SOMALIA CAPITAL : "+ hm.get("SOMALIA"));
		
	}

}
