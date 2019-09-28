package com.logic.program;

public class PatternReverseTriangle {
	public static void main(String[] args) {
		int starCount=5;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=starCount; j++) {
				System.out.print("* ");
			}
			starCount--;
			System.out.println();
		}
		
	}

}
