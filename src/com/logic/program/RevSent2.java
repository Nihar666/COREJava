package com.logic.program;

public class RevSent2 {
	//input= I AM NIHAR
		//output = I MA RAHIN
	
	public static void main(String[] args) {
		String n ="I AM NIHAR";
		String rev = "";
		
		for (int i = n.length()-1; i >= 0; i--) {
			
			rev=rev+n.charAt(i);
			System.out.println(rev);
		}
			String[] spl=rev.split(" ");
			int l=spl.length-1;
			System.out.println(l);
			
			String temp=" ";
			
			while(l>=0){
				temp = temp+spl[l];
				temp= temp+" ";
				l--;
			}
			
			System.out.println(temp);
		
	}

}
