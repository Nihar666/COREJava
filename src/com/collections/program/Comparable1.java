package com.collections.program;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Comparable1 {
	public static void main(String[] args) {
		
		int[] arr = {11,44,22,0,78};
		Arrays.sort(arr);
		System.out.println("Sorted Int array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Sorted String Array: ");
		String[] names ={"Steve","Bugar","Nihar"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		System.out.println("Sorted List: ");
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		
		Collections.sort(fruits);
		
		for (String string : fruits) {
			System.out.println(string+",");
		}
	}

}
