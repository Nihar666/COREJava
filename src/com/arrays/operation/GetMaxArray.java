package com.arrays.operation;

public class GetMaxArray {
	public static void main(String[] args) {
		int[] values={2,4,56,65,65,45,78};
		int maxValue=Integer.MIN_VALUE;
		for (int i = 0; i < values.length; i++) {
			if(values[i]>maxValue){
				maxValue = values[i];
			}
		}
		System.out.println(maxValue);
	}

}
