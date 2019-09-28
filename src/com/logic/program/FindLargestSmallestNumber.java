package com.logic.program;

public class FindLargestSmallestNumber {
	public static void main(String[] args) {
		int numbers[] = {55,32,56,78,88,90};
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]> largest)
				largest = numbers[i];
			else if(numbers[i]<smallest)
				smallest = numbers[i];
			}
			
			System.out.println("Largest number is: "+largest);
			System.out.println("smallest number is:"+smallest);
		}
	}


