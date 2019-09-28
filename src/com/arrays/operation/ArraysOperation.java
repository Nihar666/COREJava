package com.arrays.operation;

public class ArraysOperation {
	
	public static void main(String[] args) {
		
		int[] arr = {4,5,6,7,6,8,8};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
				}
			}
		}
		
	}

}
