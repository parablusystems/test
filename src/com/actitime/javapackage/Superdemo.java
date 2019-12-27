package com.actitime.javapackage;

public class Superdemo {
	Superdemo(){
		System.out.println("superdemo");
		
	}
	Superdemo(int a){
		this();
	System.out.println("superdemo int");	
		
	}
	
	
	public static void main(String[] args) {
	Superlaunch sl=new Superlaunch(11);
		
	}

}
class Superlaunch extends Superdemo{
	Superlaunch(){
	super(11);
		System.out.println("superlaunch");
	}
	Superlaunch(int a){
		this();
		System.out.println("superlaunch int");
	}
	
}
