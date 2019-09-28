package com.logic.program;

import java.util.Scanner;

public class StarTemple1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows number::");
		int n = sc.nextInt();
		
		int spaceCounter = n-1;
		int starCounter = 1;
		System.out.println(spaceCounter);
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=spaceCounter; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <=starCounter; k++) {
				System.out.print("*");
			}
			System.out.println();
			spaceCounter--;
			starCounter = starCounter+2;
			
			
		}
	}

}
