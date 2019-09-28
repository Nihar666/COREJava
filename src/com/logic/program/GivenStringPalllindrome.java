package com.logic.program;

public class GivenStringPalllindrome {
	public static void main(String[] args) {
		
		String n = "MALAYALAM";
		String rev="";
		
		
		for(int i=n.length()-1;i>=0;i--){
			
			rev = rev+n.charAt(i);
				
		}
		
		if(n.equals(rev)){
			System.out.println("The given String is pallindrome.");
		}else{
			System.out.println("The given String is not pallindrome.");
		}
		
	}

}
