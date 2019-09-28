package com.string.pkg;

public class StringRevSent1 {
	public static void main(String[] args) {
		
		
		
		
		String str ="I AM NIHAR";//op- NIHAR AM I
		String temp =" ";
	
		//splitting the String::
		String[] s = str.split(" ");
		int len = s.length-1;//2
		
		while(len>=0){
			
			temp =temp+s[len];
			temp = temp+" ";
			len--;
		}
		
		System.out.println(temp);
		
		
		
		
		
		
		
	}

}
