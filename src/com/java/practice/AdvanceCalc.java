package com.java.practice;

public class AdvanceCalc implements Calc{
public static void main(String[] args) {
	AdvanceCalc obj1 = new AdvanceCalc();
	obj1.add();
	obj1.calculateCos();
	obj1.calculateSin();
	obj1.sub();
}

public void calculateSin(){
	System.out.println("I am in advance cal sin method");
}

public void calculateCos(){
	System.out.println("I am in advance cal cos method");
}

public void add() {
	System.out.println("I am in add method");
	
}


public void sub() {
	System.out.println(" I am in sub method");
	
}
	
}
