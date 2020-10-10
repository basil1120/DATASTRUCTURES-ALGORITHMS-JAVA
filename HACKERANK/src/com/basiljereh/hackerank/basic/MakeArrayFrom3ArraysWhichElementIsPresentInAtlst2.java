package com.basiljereh.hackerank.basic;

import java.util.*;
import java.util.stream.Collectors;
public class MakeArrayFrom3ArraysWhichElementIsPresentInAtlst2 {

	public static void main(String args[]) {
		
		int a[] = {9,9,9,9,8,8,8,7,7,6,5,4};
		int b[] = {9,9,9,8,8,7,7,6,4,4,4,3,2};
		int c[] = {9,9,9,8,8,7,7,6,5};
		Integer[] A = removeDuplicates(a, "a");
		Integer[] B = removeDuplicates(b, "b");
		Integer[] C = removeDuplicates(c, "c");
		System.out.println("===================================================================");
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

		// for array a
		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println("########## array a ########## ===================================================================");
		System.out.println(list);
		for(Integer i: A){	
			ArrayList<Integer> tSet = new ArrayList<>();
			tSet.add(Collections.frequency(list, i));
			map.put(i,tSet );

		}
		System.out.println(map);
		list.clear();

		// for array b
		list = (ArrayList<Integer>) Arrays.stream(b).boxed().collect(Collectors.toList());
		System.out.println("########## array b ########## ===================================================================");
		System.out.println(list);
		for(Integer i: B){
			if(map.containsKey(i)){
				map.get(i).add(Collections.frequency(list, i));
			}
			else{

				ArrayList<Integer> tSet = new ArrayList<>();
				tSet.add(Collections.frequency(list, i));
				map.put(i,tSet );
			}
		}
		System.out.println(map);
		list.clear();

		// for array c
		list = (ArrayList<Integer>) Arrays.stream(c).boxed().collect(Collectors.toList());
		System.out.println("########## array c ########## ===================================================================");
		System.out.println(list);	
		for(Integer i: C){
			if(map.containsKey(i)){
				map.get(i).add(Collections.frequency(list, i));
			}
			else{

				ArrayList<Integer> tSet = new ArrayList<>();
				tSet.add(Collections.frequency(list, i));
				map.put(i,tSet );
			}
		}
		System.out.println(map);

		for(int key: map.keySet()){
			if(map.get(key).size()>1){
				
				Collections.sort(map.get(key));
				int count= map.get(key).get(0);
				for(int i=0; i<count; i++){
					System.out.print(key+", ");
				}
			}			
		}
//end of main function
	}
	
	static Integer[] removeDuplicates(int a[], String aName){
		HashSet<Integer> set = new HashSet<>();
		for (int i:a)
			set.add(i);
		System.out.println("Removed Duplicates Array Name :"+ aName +" " +set);
		return set.toArray(new Integer[set.size()]);
	}
}
