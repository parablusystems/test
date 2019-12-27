package com.acttime.Revesion;

public class Clsns {

	public static void main(String[] args) {
		Clsns cn=new Clsns();
		cn.add();
		cn.sub();
		Clsns1 cn1=new Clsns1();
		cn1.add();
		cn1.sub();

	}
	
	void add() {
	System.out.println("this is addition block of Clsns");	
		
	}
	void sub() {
		System.out.println("this is sub block of Clsns");
		
	}

}

class Clsns1{
	void add() {
		System.out.println("this add block of Clsns1");
	}
	void sub() {
		
		System.out.println("this is sub block of Clsns1");
	}
	
}
