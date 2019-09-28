package com.logic.program;

public class Pattern12 {
	public static void main(String[] args) {
		
	  /*1
		2 2
		3 3 3
		4 4 4 4
		5 5 5 5 5*/
		
		/*for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}*/
		
		int spaceCounter = 4;
		int starCounter =1;
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=spaceCounter; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= starCounter; k++) {
				System.out.print("*");
			}
			System.out.println();
			
			starCounter=starCounter+2;
			spaceCounter--;
			
		}
		
	}

}
