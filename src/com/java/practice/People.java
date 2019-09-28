package com.java.practice;

public class People extends Village {
	People(){
		super();
		System.out.println("people are living in the village");
	}
	
   public static void main(String[] args) {
	People p = new People();
}
}
