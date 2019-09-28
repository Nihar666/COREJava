package com.arrays.operation;

import java.util.Scanner;

public class FindArr {
	public static void main(String[] args) {
		boolean isPresent = false;
		Integer index=null;
		
		int arr[] = {10,20,30,40,50};
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no. which u want to search::");
		int number = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==number){
				isPresent = true;
				index = i;
			}
		}if(isPresent=true){
			System.out.println("The number is present in::"+index+"index");
		}else{
			System.out.println("The number is not present.");
		}
	}

}
