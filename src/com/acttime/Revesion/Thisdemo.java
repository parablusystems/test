package com.acttime.Revesion;

public class Thisdemo {

	public static void main(String[] args) {
		Thisdemo td=new Thisdemo();
		td.odd();

	}
	
	void even() {
		
		System.out.println("the even numbers are :");
		for (int a = 0; a < 10; a++) {
			if (a%2==0) {
				System.out.println(a);
			}
			
		}	
	}
	void odd() {
		this.even();
		System.out.println("the odd numbers are :");
		for (int a = 0; a < 10; a++) {
			if (a%2==1) {
				System.out.println(a);
			}
			
		}	
	}

}
