package com.practice.delete;

public class StringSentence2 {
	public static void main(String[] args) {
		
		String n ="I AM Nihar";
		String temp =" ";
		String rev="";
		
		for (int i =n.length()-1; i >=0; i--) 
			rev=rev+n.charAt(i);//rahiN MA I
		 String[] spl = rev.split(" ");
		int len = spl.length-1;//2
		
		while(len>=0){
			temp = temp+spl[len];
			temp=temp+" ";
			len--;
		}
		System.out.println(temp);
		
	}

}
