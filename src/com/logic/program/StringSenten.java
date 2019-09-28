package com.logic.program;

public class StringSenten {
	//input = I am Nihar
		//output = Nihar am I
	public static void main(String[] args) {
		 String n ="I am Nihar";
		 String temp =" ";
		 String[] spl = n.split(" ");
		 int l=spl.length-1;
		 System.out.println(l);//2
		 while(l>=0){
			 temp=temp+spl[l];
			 temp=temp+" ";
			 l--;
		 }
		 System.out.println(temp);
		 
			 
		 }
		 
		 
	}

