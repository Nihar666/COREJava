package com.practice.delete;

public class Arraysss {
	public static void main(String[] args) {
		
		int arr[]={34,5,6,7,9,77};
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>=arr[j]){
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println(arr[1]);
		
	} 
	

}
