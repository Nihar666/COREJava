package com.interfacedemo.demo;

public class AdvanceCalculater implements Calculater {

	public static void main(String[] args) {
		AdvanceCalculater obj1 = new AdvanceCalculater();
		obj1.add();
		obj1.sub();
		obj1.calculateCos();
		obj1.calculateSin();
		System.out.println("=================");
		
		Calculater obj = new AdvanceCalculater();
		obj.add();
		obj.sub();
		
	}
	
	public void calculateSin(){
		System.out.println("I am in advance calc-sin method");
	}
	public void calculateCos(){
		System.out.println("I am in advance calc-cos method");
	}

	public void add() {
		System.out.println(" I am in advance calc add method");
		
	}

	
	public void sub() {
		System.out.println("I am in advance calc sub method");
		
	}
	

}
