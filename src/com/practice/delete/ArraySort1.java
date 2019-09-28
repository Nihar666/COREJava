package com.practice.delete;

public class ArraySort1 {
	public static void main(String[] args) {
		int[] arr ={34,45,54,56,45,67,67,88,88,234};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("================");
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
