package com.interfacedemo.demo;

public class Test implements Left,Right {
   public static void main(String[] args) {
	System.out.println(Left.x);
	System.out.println(Right.x);
	//System.out.println(x);//CE ambiguous
}
}
