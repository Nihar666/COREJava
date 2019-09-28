package com.string.pkg;

public class CommonElementInArray {
	
	public static void main(String[] args) {
		int[] arr1 ={2,4,5,6,8};
		int[] arr2 ={3,4,7,9,8,40,30};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]){
					System.out.print(arr1[i]+",");
				}
			}
			
		}
	}

}
