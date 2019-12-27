package com.actitime.javapackage;

public class Chain {
	
	Chain(){
		System.out.println("This is constructor");
		
	}
	Chain(int a){
		this();
		System.out.println("This is constructor1");
	}
	
	Chain(int a,int b){
		this(11);
		System.out.println("This is constructor2");
	}
	
	
	public static void main(String[] args) {
		Chain c1=new Chain(11,12);

	}

}
