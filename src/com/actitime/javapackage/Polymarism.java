package com.actitime.javapackage;

public class Polymarism {
	
	public static void main(String[] args) {
		Polymarism p =new cat();
		p.eat();
		p.sleep();
		Polymarism p1 =new Lion();
		p1.sound();
	}
	void eat() {
		System.out.println("");
		
	}
	void sleep() {
		System.out.println("");
		
	}
	void sound() {
		System.out.println("");
		
	}
}
class cat extends Polymarism{
	
	void eat() {
		
		System.out.println("the cat is eating");
	}
	void sleep() {
		
	System.out.println("the cat is sleeping");	
	}
	
}
class Lion extends Polymarism{
	void sound() {
		System.out.println("the lion is sounding");
		
	}	
	
}