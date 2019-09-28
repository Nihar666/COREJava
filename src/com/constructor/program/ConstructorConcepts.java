package com.constructor.program;

public class ConstructorConcepts {
	
	String name;
	int age;
	
	public ConstructorConcepts() {// 0 param constructor
		System.out.println("Default Constructor::::");
	}
	
	public ConstructorConcepts(int i){//1 param constructor
		System.out.println("1 param constructor::");
		System.out.println(i);
	}
	
	public ConstructorConcepts(int i, int j){
		System.out.println("2 param constructor::");
		System.out.println(i+" "+j);
	}
	
	public ConstructorConcepts(String name, int age){
		this.name = name;//this.classvar = local variable
		this.age = age;
		
	}
	
	
	
	
	public static void main(String[] args) {
		ConstructorConcepts obj = new ConstructorConcepts();
		ConstructorConcepts obj1 = new ConstructorConcepts(10);
		ConstructorConcepts obj2 = new ConstructorConcepts(30,20);
		ConstructorConcepts obj3 = new ConstructorConcepts("nihar",29);
		System.out.println(obj3.name +" "+obj3.age);
		
		
	}

}
