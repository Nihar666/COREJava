package com.logicNumber.practice;

public class AdditionOf2Marices {
	public static void main(String[] args) {
		
		int[][] a ={{1,3,4},{4,5,6},{7,8,6}};
		int[][] b ={{1,5,3},{8,5,2},{9,3,5}};
		int[][] c =new int[3][3];
		
		System.out.println("First matrix");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Second matrix");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Addition of 2 matrixes");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = (a[i][j])+(b[i][j]);
				
				System.out.print(c[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
