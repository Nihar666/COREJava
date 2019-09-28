package com.arrays.operation;

public class ArraySort {
	public static void main(String[] args) {
		int [] number ={5,7,9,8,68,67,45,99};
		int tempvar;
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length; j++) {
				if(number[i]<=number[j]){
					tempvar =number[i];
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
