package com.pkg.oops;

public class Renolds implements CarInterface{

	@Override
	public void start() {
		System.out.println("Renolds---start()");
		
	}

	@Override
	public void stop() {
		System.out.println("Renolds---stop()");
	}

	@Override
	public void refuel() {
		System.out.println("Renolds---refuel()");
	}

}
