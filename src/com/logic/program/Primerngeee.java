package com.logic.program;

public class Primerngeee {
	public static void main(String[] args) {
		for (int i = 30; i <=100; i++) {
			boolean flag =true;
			for (int j = 2; j <=i-1; j++) {
				
				if(i%2==0){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println(i);
				System.out.println();
			}
		}
	}

}
