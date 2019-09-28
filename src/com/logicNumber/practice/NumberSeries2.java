package com.logicNumber.practice;

import java.util.Scanner;

public class NumberSeries2 {
	//1,4,9,16 up to 10th
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range::");
		int n = sc.nextInt();
		
		if(n>0){
			for (int i = 1; i <=n; i++) {
				System.out.println(Math.pow(i, 2));
			}
		}else{
			System.out.println("enter wrong numberrr....");
		}
		
		
	}

}
