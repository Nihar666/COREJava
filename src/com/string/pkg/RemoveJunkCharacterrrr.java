package com.string.pkg;

public class RemoveJunkCharacterrrr {
	public static void main(String[] args) {
		
		String n ="jlfjsdlfdjslf789@#$$$@@@$$$54654";
		
		n=n.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(n);
		
	}

}
