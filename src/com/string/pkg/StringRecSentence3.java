package com.string.pkg;

public class StringRecSentence3 {
	//input= I AM NIHAR
	//output = I MA RAHIN
	
	public static void main(String[] args) {
		String s ="I AM NIHAR";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
			rev=rev+s.charAt(i);
		System.out.println(rev);
		
		String[] s1=rev.split(" ");
		int b=s1.length-1;
		
		System.out.println(b);
		
		String temp=" ";
		while(b>=0){
			temp=temp+s1[b];
			temp=temp+" ";
			b--;
		}
		System.out.println(temp);
	}

}
