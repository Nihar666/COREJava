package com.java.practice;

public class Testtt {
	public static void main(String[] args) {
		
		Testtt t= new Testtt();
		t.m1('a');
		t.m1(10l);
		//t.m1(10.5);//compile time error::can not find symbol f
		
	}
	
	public void  m1(int i){
		System.out.println("int argument::");
	}
	public void m1(float f){
		System.out.println("float argument");
	}

}
