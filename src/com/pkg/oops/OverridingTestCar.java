package com.pkg.oops;

public class OverridingTestCar {
	
	public static void main(String[] args) {
		
		//When same method name is present in parent class as well as in child class with same argument is called
		//method overriding.
		
		
		//static polymerphism or compile time polymerphism
		BMW obj1 = new BMW();
		obj1.start();
		obj1.refuel();
		obj1.start();
		obj1.threatSafety();
		
		
		System.out.println("================*******================");
		
		//Dynamic polymerphism or runtime polymerphism
		Car c1 = new BMW();// when child class object can be referred by parent class reference variable then it called dynamic polymerphism
		c1.refuel();
		//c1.threatSafety();
		c1.start();
		c1.stop();
		
	}

}
