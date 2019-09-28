package com.arrays.operation;

import java.util.Arrays;

public class ArraySorttt {
	public static void main(String[] args) {
		
		int[] number = {34,45,6,67,89,89,88};
		int tempvar;
		
		/*Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		for (int i = 0; i < number.length; i++) {
			for (int j = i+1; j < number.length; j++) {
				if(number[i]>number[j]){
					tempvar = number[i];
					number[i]=number[j];
					number[j]=tempvar;	
				}
			}
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		
		
		
		
	}

}
