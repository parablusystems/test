package com.acttime.Revesion;

public class Mtdor {
	

	public static void main(String[] args) {
	Tiger tgr=new Tiger();
	Lion ln=new Lion();
	tgr.makesound();
	ln.eat();

	}
	 void eat() {
		System.out.println("the animal is eating"); 
	 }
	void sleep() {
		System.out.println("the animal is sleeping");
	}
	void makesound() {
		
		
	}

}
class Tiger extends Mtdor{
	
	void makesound() {
		
		System.out.println("the tiger make sounds kroo");
	}
}
class Lion extends Mtdor{

	void eat () {
		
		System.out.println("the lion eats animals ");
	}
	
}
