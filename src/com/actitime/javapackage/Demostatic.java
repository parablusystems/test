package com.actitime.javapackage;

public class Demostatic {

	public static void main(String[] args) {
	int a=10,b=20;
	int c=a+b;
	System.out.println("The c value is: "+c);
	
	Demostatic c1=new Demostatic();
	c1.even();
	c1.odd();
	Demononstatic c2=new Demononstatic();
	c2.add();
	Demononstatic.sub(12, 11);
	System.out.println(c2.mul(12, 21));
	
	}

	public void even() {
	for (int i = 0; i < 50; i++) {
		if (i%2==0) {
			System.out.println("The even numbers are: "+i);
		}
	}
	}
	public void odd() {
		for (int i = 0; i < 50; i++) {
		
			if (i%2==1) {
				
				System.out.println("The odd numbers are: "+i);
			}
		}
		
		
	}
	 static class Demononstatic{
		public void add() {
			int a=11,b=21;
			int c=a+b;
			System.out.println("The output is: "+c);
			
		}
		
		public static void sub(int a,int b) {
			int c=a-b;
			System.out.println("The output is: "+c);
			
		}
		public int mul(int a,int b) {
			int c=a*b;
			
			return c;			
		}
		
		
		
	}
		
		

		
	}
	
