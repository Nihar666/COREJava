package com.practice.delete;

import java.util.Scanner;

public class StarTemple1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows::");
		int n = sc.nextInt();
		
		int spaceCounter = n-1;
		int starCounter = 1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < spaceCounter; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < starCounter; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			spaceCounter--;
			starCounter = starCounter+2;
			
		}
		
	}

}
