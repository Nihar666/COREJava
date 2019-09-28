package com.practice.delete;

public class ArraysSortttt {
	
	public static void main(String[] args) {
		
		int arr[]={4,5,6,7,23,1,33,44};
		
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<=arr[j]){
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
	  for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
		
		
	}

}
