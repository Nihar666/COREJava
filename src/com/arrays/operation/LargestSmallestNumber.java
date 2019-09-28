package com.arrays.operation;

public class LargestSmallestNumber {
     public static void main(String[] args) {
	     int intArray[] = new int[]{2,100,20,30,40};
	     
	     int largest = Integer.MIN_VALUE;
	     int smallest = Integer.MAX_VALUE;
	     
	     for (int number : intArray) {
			if(number>largest){
				largest=number;
			}
		}
	     System.out.println(largest);
	     for (int number : intArray) {
			if(number<smallest){
				smallest=number;
			}
		}
	     System.out.println("smallest value is::"+smallest);
 }
}
