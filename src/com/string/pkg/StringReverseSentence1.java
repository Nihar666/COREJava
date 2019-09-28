package com.string.pkg;

public class StringReverseSentence1 {
	//input = I am Nihar
	//output = Nihar am I
	
	public static void main(String[] args) {
		String n ="I am Nihar";
		String temp = " ";
		
		String[] s =n.split(" ");
		int a = s.length-1;
		System.out.println(a);
		
		while(a>=0){
			temp=temp+s[a];
			temp=temp+" ";
			a--;
		}
		System.out.println(temp);
	}

}
