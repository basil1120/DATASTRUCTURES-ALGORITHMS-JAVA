package com.basiljereh.hackerank.basic;

public class RunLengthEncoding {

	public static void main(String args[]) {
		String str = "wwwwaaadexxxxxxywww";
		RunLengthEnc(str);
	}
	
	static void RunLengthEnc(String input) {
		int n = input.length();
		for(int i = 0; i<n; i++ ) {
			// Count occurrences of current character 
            int count = 1; 
			while(i < n - 1 && input.charAt(i) == input.charAt(i + 1)) {
				count++; 
                i++; 
		    }
			// Print character and its count 
            System.out.print(input.charAt(i)); 
            System.out.print(count);
		}
	}
}
