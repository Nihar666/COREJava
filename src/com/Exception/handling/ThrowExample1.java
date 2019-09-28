package com.Exception.handling;

public class ThrowExample1 {
	/*public static void main(String[] args) throws Exception {
		ThrowExample1 te = new ThrowExample1();
		te.method();
	}
	*/
	public void method() throws Exception
	{
		Exception e = new Exception();
		throw e;
	}

}
