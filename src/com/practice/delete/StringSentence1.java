package com.practice.delete;

public class StringSentence1 {

	public static void main(String[] args) {
		String n = "I AM NIHAR";
		String temp =" ";
		
		String[] spl = n.split(" ");
		int len = spl.length-1;
		
		System.out.println(len);
		
		while(len>=0){
			temp=temp+spl[len];
			temp=temp+" ";
			len--;
		}
		
		System.out.println(temp);
		
		String str = temp.trim();
		System.out.println(str);
	}
}
