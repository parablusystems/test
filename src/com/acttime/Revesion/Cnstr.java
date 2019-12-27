package com.acttime.Revesion;

public class Cnstr {
	Cnstr(){
		System.out.println("the even numbers are: ");
		for (int a = 0; a < 10; a++) {
			if (a%2==0) {
				System.out.println(a);
			}
			
		}
	}
	public static void main(String[] args) {
		Cnstr c=new Cnstr();
	}

}
