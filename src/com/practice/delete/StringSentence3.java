package com.practice.delete;

public class StringSentence3 {
	
	//save water save tree
	//eert evas retaw evas
	//evas retaw evas eert
	
	public static void main(String[] args) {
		
		String str ="save water save tree";
		String rev="";
		String temp="";
		
		for (int i = str.length()-1; i >=0; i--) 
			rev=rev+str.charAt(i);
		
		System.out.println(rev);
		
		String[] spl = rev.split(" ");
		int len = spl.length-1;
		System.out.println(len);
		
		while(len>=0){
			temp=temp+spl[len];
			temp=temp+" ";
			len--;	
		}
		
		System.out.println(temp);
		
		
		
	}

}
