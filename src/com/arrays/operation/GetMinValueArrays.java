package com.arrays.operation;

public class GetMinValueArrays {
	public static void main(String[] args) {
		int[] values={3,45,56,78,89};
		int minValue=Integer.MAX_VALUE;
		for (int i = 0; i < values.length; i++) {
			if(values[i]<minValue){
				minValue=values[i];
			}
		}
		System.out.println(minValue);
	}

}
