package com.logic.program;

import java.util.Arrays;

public class ArraySortDemo {
     public static void main(String[] args) {
		/*String str[] = {"one","two","three","four"};
		
		System.out.println("before sorting::");
		for (String string : str) {
			System.out.println(string);
		}
		Arrays.sort(str);
		
		System.out.println("After sorting:::");
		for (String string1 : str) {
			System.out.println(string1);
		}*/
    	 
    	/* int arr[]={3,4,6,8,12,1,2,89};
    	 
    	 System.out.println("before sorting::");
    	 for (int i : arr) {
			System.out.println(i);
		}
    	 Arrays.sort(arr);
    	 
    	 System.out.println("After sorting::");
    	 for (int i1 : arr) {
			System.out.println(i1);
		}*/
    	 
    	 int arr[] = {4,2,6,77,8,89,5,1};
    	 int tempvar;
    	 
    	 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<=arr[j]){
					tempvar = arr[i];
					arr[i]=arr[j];
					arr[j]=tempvar;
				}
			}
		}
    	 
    	 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
