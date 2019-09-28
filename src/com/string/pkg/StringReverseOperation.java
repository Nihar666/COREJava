package com.string.pkg;

public class StringReverseOperation {
	public static void main(String[] args) {
		String str = "I am Nihar";//rahin I ma
		
		String rev="";
		String temp=" ";
		
		for (int i = str.length()-1; i >=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		String[] splitt = rev.split(" ");
		int len = splitt.length-1;
		
		System.out.println(len);
		
		while(len>=0){
			temp=temp+splitt[len];
			temp= temp+" ";
			len--;
		}
		
		System.out.println(temp);
		
		
	}

}
