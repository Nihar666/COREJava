package com.practice.delete;

public class StringStncts {
	
	public static void main(String[] args) {
		String n="I AM Nihar";
		String rev="";
		String temp="";
		
		for (int i = n.length()-1; i >=0; i--) {
			rev=rev+n.charAt(i);
			
			
		}
		System.out.println(rev);
		
		String[] splt = rev.split(" ");
		int len=splt.length-1;
		System.out.println(len);
		
		while(len>=0){
			temp=temp+splt[len];
			temp=temp+" ";
			len--;
		}
		
		System.out.println(temp);
		
		
	}

}
