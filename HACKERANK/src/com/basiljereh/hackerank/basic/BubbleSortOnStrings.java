package com.basiljereh.hackerank.basic;

public class BubbleSortOnStrings {
/*
 * To perform BUBBLE SORT on Strings we need to compare adjacent Strings and if 
 * they are not in the order then we need to swap those strings, 
 * this process needs to be done until we reach at the end. 
 * This way all the strings will be sorted in an ascending order, 
 * this process of sorting is known as bubble sorting.
 */
	public static void main(String[] args) {
		String str[] = {"Ajeet","Steve","Rick","Becky","Mohany","Aura"};
		String temp;
		System.out.println("Strings Sorted In Order !!!");
		for(int j=0; j<str.length; j++) {
			for(int i=j+1; i<str.length; i++) {
				//compare adjacent strings
				if(str[i].compareTo(str[j])<0 ) {
					temp   = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
			System.out.println(str[j]);
		}
	}
}
