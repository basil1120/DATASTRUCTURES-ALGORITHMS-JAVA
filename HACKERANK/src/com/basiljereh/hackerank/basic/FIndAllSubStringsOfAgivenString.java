package com.basiljereh.hackerank.basic;

public class FIndAllSubStringsOfAgivenString {

	public static void main(String[] args) {
		char str[] = {'a', 'b', 'c'}; 
        subString(str, str.length); 
	}
	
	static void subString(char str[], int n) {
		 // Pick starting point 
        for (int len = 1; len <= n; len++) { 
            // Pick ending point 
            for (int i = 0; i <= n - len; i++) { 
                //  Print characters from current 
                // starting point to current ending 
                // point.   
                int j = i + len - 1; 
                for (int k = i; k <= j; k++) { 
                    System.out.print(str[k]); 
                } 
                System.out.println(); 
            } 
	    }
	}
}
