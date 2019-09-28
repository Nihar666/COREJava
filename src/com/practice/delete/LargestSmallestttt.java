package com.practice.delete;

public class LargestSmallestttt {
	
	public static void main(String[] args) {
		
		
		int[] arr = {12,56,56,34,78,8999,9000};
		
		int largest=arr[0];
		int smallest=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>largest){
				largest = arr[i];
			}else if(arr[i]<smallest){
				smallest = arr[i];
			}
		}
		
		System.out.println("largest="+largest);
		System.out.println("smallest="+smallest);
		
	}

}
