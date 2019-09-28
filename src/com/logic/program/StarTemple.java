package com.logic.program;

public class StarTemple {

	public static void main(String[] args) {
		int spaceCounter = 4, starCounter = 1;

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= spaceCounter; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= starCounter; k++) {
				System.out.print("*");
			}
			System.out.println();

			spaceCounter--;
			starCounter = starCounter + 2;
		}

	}

}
