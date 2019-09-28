package com.constructor.program;

public class Clerk {
	int roll=201;
	String grade = "Manager";
	
	void display(){
		System.out.println(roll+" "+grade);
	}
	
	public static void main(String[] args) {
		Clerk c1= new Clerk();
		Clerk c2= new Clerk();
		
		c1.display();
		c2.display();
	}

}
