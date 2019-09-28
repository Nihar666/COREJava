package com.string.pkg;

import java.util.Scanner;

public class OddEvenIndexLEtter {
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String::");
		String even_odd = sc.nextLine();
		
		System.out.println("Odd Characters::");
		for(int i=0; i<even_odd.length();i++){
			if(i%2==0){
				System.out.println(even_odd.charAt(i));
			}
		}
		
		System.out.println();
		System.out.println("Even Characters::");
		for(int i=0;i<even_odd.length();i++){
			if(i%2==1){
			System.out.println(even_odd.charAt(i));	
			}
		}
	}

}
