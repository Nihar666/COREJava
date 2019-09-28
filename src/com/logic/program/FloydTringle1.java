package com.logic.program;

import java.util.Scanner;

public class FloydTringle1 {
	public static void main(String[] args) {
		int k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows::");
		int n = sc.nextInt();
		
		for (int i = 0; i <=n; i++) {
			for (int j = 0; j<=i;j++,k++) {
				System.out.print(k+" ");
			}
			System.out.println();
			
		}
		
		
		
	}

}
