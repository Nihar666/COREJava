package com.arrays.operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SearchDemo {
	public static void main(String[] args) {
		/*boolean isPresent=false;
		Integer index = null;
		int arr[]={1,3,56,6,7,87};
		System.out.println("Enter the number to be searched");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Integer number = Integer.valueOf(input);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==number){
				isPresent = true;
				index = i;
			}
				
		}
		if(isPresent == true){
			System.out.println("Element is present at index::"+index);
		}
	}*/
		
		int arr[] ={1,3,56,6,7,87};
		System.out.println("etner a number to be searched::");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==n){
				System.out.println("The no. is present ::");
			}else{
				System.out.println("The number is present::");
			}
		}

}
}
