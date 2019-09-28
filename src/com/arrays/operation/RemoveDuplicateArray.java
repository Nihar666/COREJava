package com.arrays.operation;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArray {
	public static void main(String[] args) {
		int[] intArray ={23,4,1,4,5,3,3,2,2};
		sort(intArray);
	}
	
	public static void sort(int [] arr){
		List<Integer> list = new ArrayList<Integer>();
		for (int i : arr) {
			list.add(i);
			System.out.println(list);
		}
		Set<Integer> set = new LinkedHashSet<Integer>(list);
	    for (Integer integer : set) {
			System.out.println(integer+" ");
		}
	}

}
