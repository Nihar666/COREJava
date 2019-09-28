package com.arrays.operation;

public class SecondLargest {
	public static void main(String[] args) {
		
		int arr[]={7,8,4,6,8,9,10};
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("2nd largest number is::"+arr[2]);
		
	}

}
