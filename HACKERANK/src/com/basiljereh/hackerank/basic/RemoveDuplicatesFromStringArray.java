package com.basiljereh.hackerank.basic;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

//SOLUTION FOR THIS IS USING A TREE SET
public class RemoveDuplicatesFromStringArray {

	public static void main(String a[]){
        String[] strArr = {"one","two","three","four","four","five"};
        //convert string array to list
        List<String> tmpList = Arrays.asList(strArr);
        //create a treeset with the list, which eliminates duplicates//CAST
        TreeSet<String> unique = new TreeSet<String>(tmpList);
        System.out.println(unique);
    }
}
