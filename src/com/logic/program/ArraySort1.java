package com.logic.program;

public class ArraySort1 {
	public static void main(String[] args) {
		
		int arr[] ={23,45,56,34,67,88,88,45};
		int tempvar;
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<=arr[j]){
					tempvar=arr[i];
					arr[i]=arr[j];
					arr[j]=tempvar;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
