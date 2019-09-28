package com.string.pkg;

public class VowelConsonantCount {
	
	public static void main(String[] args) {
		
		String str ="BSachinniharrou";
		int vcount=0;
		int ccount=0;
		
		
		//converting all the characters in to lowercase
		str=str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				vcount++;
			}else if(ch>='a'&& ch<='z'){
				ccount++;
			}
		}
		
		System.out.println("number of vowel is::"+vcount);
		System.out.println("number of consonant is::"+ccount);
	
	}
}
