package com.basiljereh.hackerank.basic;

import java.util.Scanner;

public class solveMeFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int a;
	        System.out.println("Enter Value A");
	        a = in.nextInt();
	        int b;
	        System.out.println("Enter Value B");
	        b = in.nextInt();
	        int sum;
	        sum = solveMeFirst(a, b);
	        System.out.println("SUM :"+sum);
	}
	
	static int solveMeFirst(int a,int b) {
		int x= a+b;
		return x;
	}

}
/*
 Function prototype:
int solveMeFirst(int a, int b);
where,
a is the first integer input.
b is the second integer input
Return values
sum of the above two integers
 */