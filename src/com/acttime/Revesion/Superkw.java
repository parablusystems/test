package com.acttime.Revesion;

public class Superkw {
	Superkw(){
		this(11);
		
		System.out.println("superkw class");
	}
	Superkw(int a){
		this(11,12);
		
		System.out.println("superkw int a class");
	}
	
Superkw(int a,int b){
		
		System.out.println("Superkw int a,b class");
	}

	public static void main(String[] args) {
		Superkw1 sk=new Superkw1();	

	}
	 

}
class Superkw1 extends Superkw{
	Superkw1(){
		
		System.out.println("Superkw1 class");
	}
	Superkw1(int a){
		super(11);
		System.out.println("Superkw1 int a class");
		
	}
	Superkw1(int a,int b){
		this(11);
		
		System.out.println("Superkw1 int a,b class");
	}
}
