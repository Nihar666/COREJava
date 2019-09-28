package com.practice.delete;

public class LargestSmallest {
	
	public static void main(String[] args) {
		
		int[] arr ={23,45,56,67,78,89,56,34,24};
		
		int smallest =arr[0];
		int largest =arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest){
				largest = arr[i];
			}else if(arr[i]<smallest){
				smallest = arr[i];
			}
		}
		
		System.out.println(smallest);
		System.out.println(largest);
	}

}
