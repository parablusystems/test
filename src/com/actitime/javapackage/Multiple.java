package com.actitime.javapackage;

public interface Multiple {
	
	void start();
	void stop();
}

interface Multiple1{
	
	void run();
	void mailage();
}
class Bus implements Multiple,Multiple1 {
	public void start() {
	System.out.println("The bus is started");	
		
	}
	
	public void run() {
		System.out.println("The bus is running");
		
	}


	public void mailage() {
		System.out.println("The bus mailage low");
		
	}

	
	public void stop() {
		System.out.println("The bus stopped");	
		
	}
	
	
}