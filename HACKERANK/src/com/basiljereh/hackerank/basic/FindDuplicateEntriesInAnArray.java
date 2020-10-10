package com.basiljereh.hackerank.basic;

import java.util.TreeSet;

public class FindDuplicateEntriesInAnArray {
    
	public static void main(String[] args) {
		String[] strArr = {"one","two","three","four","four","five"};
        TreeSet<String> unique = new TreeSet<String>();
        for(String str:strArr){
            if(!unique.add(str)){
                System.out.println("Duplicate Entry is: "+str);
            }
        }
	}
}
