package com.actitime.javapackage;

public class Constructor {
	static int a=11;
	int b=15;
	
	
	Constructor(){
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 5 - i; j++) {
			System.out.print(" "); } 
		for (int k = 0; k <= i; k++) {
			System.out.print("* "); } 
		System.out.println(); } }

	public static void main(String[] args) {
		/*for (int i = 0; i < 50; i++) {
			if (i%2==0) {
				System.out.println("The even numbers are: "+i);
			}
		}*/
		
		Constructor c1=new Constructor();
		System.out.println(Constructor.a);
		
		 Constructor b1=new Constructor(11);
		 System.out.println(b1.b);
	}
	       Constructor(int a) {
		float c=a;
		System.out.println(c);
	}

	
		
	}


