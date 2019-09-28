package com.logic.program;

public class LargestSmallest {
	public static void main(String[] args) {
		
		int[] arr={234,345,23,45,99,567,1000};
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>largest){
				largest =arr[i];
			}else if(arr[i]<smallest){
				smallest =arr[i];
			}
			
			
			
		}
		
		System.out.println("The largest number = "+largest);
		System.out.println("The smallest number = "+smallest);
		
	}

}
