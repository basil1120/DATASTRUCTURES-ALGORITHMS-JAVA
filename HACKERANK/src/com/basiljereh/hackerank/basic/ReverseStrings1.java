package com.basiljereh.hackerank.basic;

import java.util.Scanner;

public class ReverseStrings1 {

	public static void main(String[] args) {
		
		System.out.println("ENTER TEXT REVERSE !!");
		
		Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
        
	}
	
	void sbuilder1() {
        System.out.println("ENTER TEXT REVERSE :");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        
        StringBuilder sb = new StringBuilder(str);
        
        System.out.println("Reversed string is:");
        System.out.println(sb.reverse().toString());
	}
	
	void sbuilder2() {
        System.out.println("ENTER TEXT REVERSE:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
        }
        
        System.out.println("Reversed string is:");
        System.out.println(sb.toString());
	}
}
