package com.basiljereh.hackerank.basic;

public class ReverseStringInRangeLR {

	public static void main(String args[]) {
		String str = "geeksforgeeks"; 
        int len = str.length(); 
        int L = 5;
        int R = 7; 
  
        System.out.println(reverse(str.toCharArray(),  len, L, R)); 
	}
	
	static String reverse(char[] str, int len, int l, int r) {  
	    // Function to return the string after 
	    // reversing characters in the range [L, R]
		 // Invalid range 
        if (l < 0 || r >= len || l > r) 
            return "Invalid range!"; 
  
        //While there are characters to swap 
        while (l < r) 
        { 
  
            //Swap(str[l], str[r]) 
            char c = str[l]; 
            str[l] = str[r]; 
            str[r] = c; 
  
            l++; 
            r--; 
        } 
        String string = new String(str); 
        return string; 
	}
}
