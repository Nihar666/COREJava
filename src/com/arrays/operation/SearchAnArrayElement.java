package com.arrays.operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SearchAnArrayElement {
	public static void main(String[] args) throws IOException {
		boolean isPresent=false;
		Integer index=null;
		int [] array = {23,4,5,6,7,8};
		System.out.println("Enter the number to be searched::");
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Integer number = Integer.valueOf(input);*/
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Integer number = sc.nextInt();
		
		for(int i=0;i<array.length;i++){
			if(array[i]==number){
				isPresent = true;
				index = i;
			}
		}
		if(isPresent==true){
			System.out.println("Element is present at index= "+index);
		}else{
			System.out.println("Element is not present in the array");
		}
	}

}
