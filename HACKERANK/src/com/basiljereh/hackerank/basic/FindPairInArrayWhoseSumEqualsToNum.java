package com.basiljereh.hackerank.basic;

public class FindPairInArrayWhoseSumEqualsToNum {

	public static void main(String args[]) {
		findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
	}
	
	static void findThePairs(int inputArray[], int inputNum) {
		System.out.println("Pairs of elements whose sum is "+inputNum+" are : ");
		
		for(int i=0; i< inputArray.length; i++) {
			
			for(int j= i+1; j< inputArray.length; j++) {
				if(inputArray[i]+inputArray[j] == inputNum) {
					System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNum);
				}
			}
			
		}
	}
}
