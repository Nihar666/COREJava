package com.practice.delete;

public class Arrayss {
   public static void main(String[] args) {
	
	   int[] arr={23,45,10,67,67,78};
	   int tempvar;
	   
	   for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(arr[i]<=arr[j]){
				tempvar=arr[i];
				arr[i]=arr[j];
				arr[j]=tempvar;
			}
		}
	}
	   
	   for (int j = 0; j < arr.length; j++) {
		System.out.println(arr[j]);
	}
	   
}

}
