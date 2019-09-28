package com.logic.program;

public class ABC {
	
	public static void main(String[] args) {
		String str = "welcome";
		int str1=str.length();
		for(int i =0; i<str.length()-1;i++){
			//Sys.out.println(str1);
			char ch = str.charAt(i);
			if(str.indexOf(ch)%2==0){
				System.out.print(ch);
			}
			
		}
	}

}
