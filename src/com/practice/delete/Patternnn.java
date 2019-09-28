package com.practice.delete;

import java.util.Scanner;

public class Patternnn {
	
	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n = sc.nextInt();
		
		int starCounter=1; 
		int spaceCounter= n-1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=spaceCounter; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <=starCounter; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			spaceCounter--;
			starCounter = starCounter+2;
		}*/
		
		int k=1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <=i; j++,k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
