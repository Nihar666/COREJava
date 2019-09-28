package com.logic.program;

public class StartPattern1 {
	
	public static void main(String[] args) {
		int starCounter =1;
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=starCounter; j++) {
				System.out.print("* ");
			}
			starCounter=starCounter+2;
			System.out.println();
		}
	}

}
