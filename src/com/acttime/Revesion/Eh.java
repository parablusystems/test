package com.acttime.Revesion;

public class Eh {

	public static void main(String[] args) {
		try {
			int a,b,c;
			a=11;
			b=0;
			c=a/b;
			System.out.println(c);
			
		}
catch(ArithmeticException e) {
	
	System.out.println("this is not possible");
	
}
		catch(Exception a) {
		
			System.out.println("this is not possible");
		}
		finally{
			System.out.println("close all documents");
		}
	}

}
