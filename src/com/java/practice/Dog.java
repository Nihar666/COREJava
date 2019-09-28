package com.java.practice;

public class Dog extends Animal {
	    String color = "black";
        void printColor(){
        	System.out.println(color);
        	System.out.println(super.color);//To call parent class instance variable.
        }
	public static void main(String[] args) {
		Dog d = new Dog();
		d.printColor();
		
	}

}
