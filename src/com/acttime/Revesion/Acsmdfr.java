package com.acttime.Revesion;

public class Acsmdfr {

	public static void main(String[] args) {
		acsmfr();	
		Acsmdfr a=new Acsmdfr();
		a.acs();
	}
	
	public static void acsmfr() {
		
		System.out.println("this is static method ");
	}

	void acs() {
		
		System.out.println("this is non static method ");
	}
}
