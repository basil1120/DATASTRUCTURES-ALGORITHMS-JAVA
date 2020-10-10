package com.basiljereh.hackerank.basic;

public class SwapTwoNumbersWOusing3rdVariable {

	public static void main(String args[]) {
		System.out.println("Before Swapping ==========================");
		int x = 10;
		int y = 20;
		System.out.println("Before value of x:" + x);
		System.out.println("Before value of y:" + y);
		System.out.println("After Swapping ==========================");
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("After value of x:" + x);
		System.out.println("After value of y:" + y);
	}
}
