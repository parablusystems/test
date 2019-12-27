package com.acttime.Revesion;

public class Cnstrol {
	Cnstrol(){
		System.out.println("the even numbers are :");
		for (int a = 0; a < 10; a++) {
			if (a%2==0) {
				System.out.println(a);
			}
			
		}	
		
	}
	Cnstrol(int a){
		System.out.println("the odd numbers are :");
		for (a = 0; a < 10; a++) {
			if (a%2==1) {
				System.out.println(a);
			}
			
		}		
		
	}
	

	public static void main(String[] args) {
		Cnstrol co=new Cnstrol();
		Cnstrol co1=new Cnstrol(0);

	}

}
