package com.string.pkg;

public class TrimBlanksExample {
	public static void main(String[] args) {
		System.out.println("#"+trimTrailinglBlanks("How are you?? ")+"@");
		System.out.println("#"+trimTrailinglBlanks("I am fine.  ")+"@");
	}
	
	public static String trimTrailinglBlanks(String str){
		if(str == null)
		return null;
		int len = str.length();
		for( ;len>0;len--){
			if(!Character.isWhitespace(str.charAt(len-1)))
				break;
			
		}
		return str.substring(0,len);
		
	}

}
