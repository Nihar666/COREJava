package com.arrays.operation;

import java.util.Arrays;

public class ArraysSort1 {
	public static void main(String[] args) {
		int[] arr={3,4,6,67,45};
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
