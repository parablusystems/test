package com.actitime.javapackage;

public interface Intdemo {
	
	void start();
	void run();
	void mailage();
	void stop();
	

}
interface Intdemo1 extends Intdemo{
	
	
}
class Car implements Intdemo1{

	@Override
	public void start() {
	System.out.println("The car started");	
		
	}

	@Override
	public void run() {
		this.start();
		System.out.println("The car is ruuning");
		
	}

	@Override
	public void mailage() {
		this.run();
		System.out.println("The car mailege is low");
		
	}

	@Override
	public void stop() {
		this.mailage();
		System.out.println("The car stopped");
		
	}
	
	
}
class Bike implements Intdemo1{

	@Override
	public void start() {
		System.out.println("The bike is started");
		
	}

	@Override
	public void run() {
		System.out.println("The bike is running");
		
	}

	@Override
	public void mailage() {
		System.out.println("The bike mailege is high");
		
	}

	@Override
	public void stop() {
		System.out.println("The bike stopped");
		
	}
	
	
}
class Jeep implements Intdemo1{

	@Override
	public void start() {
		System.out.println("The jeep started");
		
	}

	@Override
	public void run() {
		System.out.println("The jeep running");
		
	}

	@Override
	public void mailage() {
		System.out.println("The jeep mailege is low");
		
	}

	@Override
	public void stop() {
		System.out.println("The jeep stopped");
		
	}
	
	
}