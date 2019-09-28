package com.arrays.operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Arr2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ask how many subjects
		System.out.println("How many Subjects::");
		int n = Integer.parseInt(br.readLine());
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter range::");
	    int n = sc.nextInt();*/
	    
		//create 1D array with size n
		int[] marks = new int[n];
		
		//store elements into the array
		for (int i = 0; i < n; i++) {
			System.out.println("enter marks::");
			marks[i]= Integer.parseInt(br.readLine());
		}
		
		//find total marks
		int tot=0;
		for (int j = 0; j < n; j++) {
			tot +=marks[j];
			
			//display total marks
			System.out.println("Total marks ="+tot);
			
			//find percentages
			float percent = (float)tot/n;
			System.out.println("Percentage of marks are::"+percent);
		}
	}

}
