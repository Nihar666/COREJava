package com.arrays.operation;

public class DuplicateElemTwoA {
	
	public static void main(String[] args) {
		
		int arr1[] ={5,6,8,5,8,9};
		int arr2[] ={78,8,6,7,9};
		
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]);
				}
			}
		}
		
	}

}
