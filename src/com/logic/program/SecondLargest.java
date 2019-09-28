package com.logic.program;

public class SecondLargest {
	public static void main(String[] args) {
		
		int[] arr={12,24,45,56,67,34,99,99};
		
		int fH = -1,sH = -1;
		
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			
			if(num>=fH){
				sH= fH;
				fH= num;
			}else if(num>=sH){
				sH=num;
			}
			
			System.out.println(fH +" "+sH);
			
				
		}
		
		System.out.println("The 2nd highest number is ::"+sH);
		System.out.println("The largest number is::"+fH);
		
	}

}
