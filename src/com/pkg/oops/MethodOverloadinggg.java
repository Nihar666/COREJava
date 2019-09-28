package com.pkg.oops;

public class MethodOverloadinggg {
	
	public static void main(String[] args) {
	    MethodOverloadinggg obj = new MethodOverloadinggg();
	    obj.sum();
	    obj.sum(10);
	    obj.sum(34.56);
	    obj.sum(10, 20);
	    main(10, 30);
	}
	
	
	// when the method name is same with different arguments list with in a class is called method overloading.
	//we cannot create method inside a method.
	//main method can also overloaded.
	//same method name with same argument list also allowd but the datatype should be different.
	
	public static void main(int c,int b) {
		System.out.println("main method overloaded");
	}
	
	public void sum(){//0-parameter
		System.out.println("0- input paramater");
	}
	
	public void sum(int i){//1-parameter
		System.out.println("1- input paramater");
		System.out.println(i);
	}
	
	public void sum(double j){
		System.out.println("1- paramater with datatype");
		System.out.println(j);
	}
	
	public void sum(int i,int j){//2-parameter
		System.out.println("2- input paramter");
		int k=i+j;
		System.out.println(k);
	}

}
