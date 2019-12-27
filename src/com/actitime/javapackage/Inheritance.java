package com.actitime.javapackage;

public class Inheritance extends Inheritance1 {
	public static void main(String[] args) {
		
		Inheritance i1=new Inheritance();
		i1.test1();
		i1.display();

		}

	
	public static void test() {
		System.out.println("this is test method");
		
	}
	public void test1() {
		System.out.println("this is test1 method");
		int a;
		for ( a = 0; a < 100; a++) {
		if (a%2==0) {
			System.out.println("this is even number:"+a);
			
		}	
		}
		this.test();
	}		
}

class Inheritance1 {
	
	

public void display () {
	for (int i = 0; i < 100; i++) {
		if (i%2==1) {
			System.out.println("The odd number: "+i);
			
		}
		
	}
	this.abcd();
	
}	
	
public void abcd() {
	int a=10,b=12;
	int c=a+b;
	System.out.println(c);
	
	
}
	
	
} 
