package com.logic.program;

public class SecondLargesttt {
	public static void main(String[] args) {
		
		int arr[] ={34,45,66,78,88,99,88};
		
		int firstLargest, secondLargest;
		
		if(arr[0]>arr[1]){
			//if first element is greater than second element
			firstLargest = arr[0];
			secondLargest = arr[1];
		}else{
			//if second element is greater than fist element
			
			firstLargest = arr[1];
			secondLargest = arr[0];
		}
		
		//Checking remaining elements of input array
		for (int i = 2; i < arr.length; i++) {
			if(arr[i]>firstLargest){
				//if element at 'i' is greater than 'firstLargest'
				
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}else if(arr[i]<firstLargest && arr[i] > secondLargest){
				
				//if element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'
				secondLargest = arr[i];
			}
		}
		System.out.println("The second largest number is::"+secondLargest);
		
		
		
	}

}
