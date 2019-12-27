package com.acttime.Revesion;

public class Methodprmtr {

	public static void main(String[] args) {
	mtd(11,12);	

	}
	
	public static void mtd() {
		
	System.out.println("empty");	
	}
public static void mtd(int a) {
		System.out.println("the a is "+a);
		
	}
public static void mtd(int a ,int b) {
	int c=a+b;
	System.out.println("the c is "+c);
	
}

}
