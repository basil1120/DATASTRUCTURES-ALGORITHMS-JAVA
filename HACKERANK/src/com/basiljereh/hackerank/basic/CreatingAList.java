package com.basiljereh.hackerank.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatingAList {
/*
 * Create Array List of Type Integer and Add Integer Values from 0-10
 */
	public static void main(String[] args) {
		
		List<Integer> myListA = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER STOP VALUE : ");
		int stopValue;
		stopValue = scanner.nextInt();
		myListA = arrListAddValues(stopValue);
		System.out.println("MY LIST ARRAY : "+ myListA.toString());
	}
	
	//CREATES ARRAY LIST OF TYPE INTEGER
	static List<Integer> arrListAddValues(int stop){
		List<Integer> myList = new ArrayList<>();
		for(int start=0 ; start<=stop; start++) {
			myList.add(start);
		}
		return myList;
	}
}
