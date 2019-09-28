package com.arrays.operation;

public class BubbleSortAsc {
	public static void main(String[] args) {
		
		int arr[]={45,56,67,34,78};
		
		int limit=arr.length-1;
		boolean flag = false;
		int temp;
		
		for (int i = 0; i < limit; i++){ 
			for (int j = 0; j < limit-i; j++) {
				//if first element is bigger then second one, then swap
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
					flag=true;//true-> swapping done
				}
			}
			if(flag=false) break;//no swapping, so come out
			else flag = false;//assign initial value
		}
		//display the sorted array
		System.out.println("The sorted array is: ");
		for (int i = 0; i <=limit; i++) {
			System.out.println(arr[i]);
		}
	}

}
