package com.logic.program;

import java.util.Scanner;

public class FloydTriangle {
	public static void main(String[] args) {
		int k=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows::");
		int num = sc.nextInt();
		
		
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=i; j++,k++) {
				System.out.print(k+"  ");
			}
			System.out.println();
		}
		
	}

}
