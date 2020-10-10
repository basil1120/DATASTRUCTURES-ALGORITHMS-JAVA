package com.basiljereh.hackerank.basic;

import java.util.Scanner;

public class FibonacciSeries {

	 //The Fibonacci series is a series where the next term is the sum of the previous two terms. 
	 //The first two terms of the Fibonacci sequence are 0 followed by 1.
	
	//************************
	//The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
	//************************
	public static void main(String[] args) {
		
		displayFibbonaciWithUsersInput();

	}
	
	//Example 1: Display Fibonacci series using for loop
    public static void ForLoop() {
    	int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
	
	//Example 2: Display Fibonacci series using while loop
	public void WhileLoop() {
		int i = 1, n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        while (i <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
	}
	
	//Example 3: Display Fibonacci series up to a given number (instead of terms)
	public static void conditionalFibbo() {
        int n = 100, t1 = 0, t2 = 1;
        System.out.print("Upto " + n + ": ");
        while (t1 <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
	}
	/*
	 Instead of displaying the series up to a specific number, this program displays it until a given number (100).
	 For this, we just need to compare the sum of the last two numbers (t1) with n.
	 If t1 is less than or equals to n, print t1. Else, we're finished displaying all terms.
	 */

	//Example 33: Program to display the fibonacci series based on the user input
	public static void displayFibbonaciWithUsersInput() {
		int count, num1 = 0, num2 = 1;
        System.out.println("How may numbers you want in the sequence:");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
	}
}
