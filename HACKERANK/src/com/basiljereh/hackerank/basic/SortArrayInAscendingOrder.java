package com.basiljereh.hackerank.basic;

import java.util.*;
public class SortArrayInAscendingOrder {

	public static void main(String args[]) {
		
		 int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
		 
		 System.out.println("Original arr[] : %s "+ arr);
		 
		 Arrays.sort(arr);
		 
		 System.out.println("Modified arr[] : %s " + Arrays.toString(arr));
		 
		 
	}
}
