package com.basiljereh.hackerank.basic;

public class CircleWithoutFloatingPointArithmetic {

	public static void main(String args[]) {
		drawCircle(8);
	}
	
	static void drawCircle(int radius) {
		// Consider a rectangle of size N*N 
	    int N = 2*radius+1; 
	    int x, y; // Coordinates inside the rectangle 
	    
	 // Draw a square of size N*N. 
	    for (int i = 0; i < N; i++) 
	    { 
	    	for (int j = 0; j < N; j++) 
	        { 
	            // Start from the left most corner point 
	            x = i-radius; 
	            y = j-radius; 
	  
	            // If this point is inside the circle, print it 
	            if (x*x + y*y <= radius*radius+1 ) 
	                System.out.print("."); 
	            else 
	                // If outside the circle, print space 
	                System.out.print(" "); 
	  
	            System.out.print(" "); 
	        } 
	    }
	}
}
