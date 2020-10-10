package com.basiljereh.hackerank.basic;

import java.util.*;

public class ArrayElementRemoval {

	public static void main(String args[]) {
		//Define an array with elements
        
        String[] arrayBeforeRemoval = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six"};
         
        System.out.println("Array Before Removal");
         
        System.out.println("=========================");
         
        System.out.println(Arrays.toString(arrayBeforeRemoval));
         
        System.out.println("========================");
         
        //Removing an element at index 2
        String[] arrayAfterRemoval = null;
        //String[] arrayAfterRemoval = ArrayUtils.remove(arrayBeforeRemoval, 2);
        //Removing an element "Two" from arrayBeforeRemoval      
        ///////String[] arrayAfterRemoval = ArrayUtils.removeElement(arrayBeforeRemoval, "Two");
        //Removing elements at index 1, 3, 5
        ///////String[] arrayAfterRemoval = ArrayUtils.removeAll(arrayBeforeRemoval, 1, 3, 5);
        //Removing the elements "Two", "Four" and "Six"
        ///////String[] arrayAfterRemoval = ArrayUtils.removeElements(arrayBeforeRemoval, "Two", "Four", "Six");
        //Removing all occurrences of an element "Two"
        ///////String[] arrayAfterRemoval = ArrayUtils.removeAllOccurences(arrayBeforeRemoval, "Two");
         
        System.out.println("Array After Removal");
         
        System.out.println("========================");
         
        System.out.println(Arrays.toString(arrayAfterRemoval));
	}
}
