package com.acttime.Revesion;

public class Inhrtnc {

	public static void main(String[] args) {
		 Inhrtnc1 in1=new Inhrtnc1();	
		 in1.even();

	}
	void even() {
		System.out.println("the even numbers of first class: ");
		
		for (int a = 0; a < 10; a++) {
			if (a%2==0) {
				System.out.println(a);
			}
			
		}
	
	}
	void odd() {
		
		System.out.println("the odd numbers of first class: ");
	
		for (int a = 0; a < 10; a++) {
			if (a%2==1) {
				System.out.println(a);
			}
			
		}
	
	}

	
}

class Inhrtnc1 extends Inhrtnc{
	
	void even1() {
		System.out.println("the even numbers of second class: ");
		
		for (int a = 0; a < 10; a++) {
			if (a%2==0) {
				System.out.println(a);
			}
			
		}
	
	}
	void odd1() {
		
		System.out.println("the odd numbers of second class: ");
	
		for (int a = 0; a < 10; a++) {
			if (a%2==1) {
				System.out.println(a);
			}
			
		}
	
	}	
	
}
