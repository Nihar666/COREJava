package com.constructor.program;

public class ParamC {
	ParamC(int a,int b){
		System.out.println("Parameterized Constructor");
		System.out.println("Having Two parameters");
	}
	
	ParamC(int a,int b,int c){
		System.out.println("parameterized constructor");
		System.out.println("Having Three parameters");
	}
	
	public static void main(String[] args) {
		ParamC pc1 = new ParamC(12,34);
	    ParamC pc2= new ParamC(23,3,56);
	}

}
