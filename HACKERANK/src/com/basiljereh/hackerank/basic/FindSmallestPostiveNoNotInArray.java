package com.basiljereh.hackerank.basic;

import java.util.*;
public class FindSmallestPostiveNoNotInArray {
	
    public static void main(String args[]){
    	FindSmallestPostiveNoNotInArray sol = new FindSmallestPostiveNoNotInArray();
        int retvalue;
        int[] inputs = {6, 5, 3, 1, 8, 7, 2, 4,-2}; 
        retvalue = sol.solution(inputs);
        System.out.println(retvalue);
    }
    
	 public int solution(int[] A) {
	        // write your code in Java SE 8
	        int ret =0;
	        int arr_size = A.length;
	        ret = findMissing(A, arr_size);
	        return ret;
	    }
	    static int segregate(int arr[], int size) 
	    { 
	        int j = 0, i; 
	        for (i = 0; i < size; i++) { 
	            if (arr[i] <= 0) { 
	                int temp; 
	                temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	                // increment count of non-positive 
	                // integers 
	                j++; 
	            } 
	        } 
	  
	        return j; 
	    } 
	    
	    static int findMissingPositive(int arr[], int size) 
	    { 
	        int i; 
	  
	        // Mark arr[i] as visited by making 
	        // arr[arr[i] - 1] negative. Note that 
	        // 1 is subtracted because index start 
	        // from 0 and positive numbers start from 1 
	        for (i = 0; i < size; i++) { 
	            int x = Math.abs(arr[i]); 
	            if (x - 1 < size && arr[x - 1] > 0) 
	                arr[x - 1] = -arr[x - 1]; 
	        } 
	  
	        // Return the first index value at which 
	        // is positive 
	        for (i = 0; i < size; i++) 
	            if (arr[i] > 0) 
	                return i + 1; // 1 is added becuase indexes 
	        // start from 0 
	  
	        return size + 1; 
	    } 
	    static int findMissing(int arr[], int size) 
	    { 
	        // First separate positive and 
	        // negative numbers 
	        int shift = segregate(arr, size); 
	        int arr2[] = new int[size - shift]; 
	        int j = 0; 
	        for (int i = shift; i < size; i++) { 
	            arr2[j] = arr[i]; 
	            j++; 
	        } 
	        // Shift the array and call 
	        // findMissingPositive for 
	        // positive part 
	        return findMissingPositive(arr2, j); 
	    } 

}
