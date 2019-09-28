package com.pkg.oops;

public abstract class Bank {
	
	//partial abstraction
	//hiding the implementation logic ---is called abstractions.
	//abtract class can have both abtract method and non-abstract method.
	public abstract void loan();//abstract method - no method body.
	
	public void credit(){
		System.out.println("Bank--credit");
	}
	
	public void debit(){
		System.out.println("Bank--debit");
	}

}
