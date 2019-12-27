package com.acttime.Revesion;

public class Conthis {
	
	Conthis(){
		this(11,12);
		
		System.out.println(" this is 1st construction ");
	}
Conthis(int a){
	this();
		
		System.out.println(" this is int construction "+a);
	}
Conthis(int a,int b){
	
	System.out.println(" this is int construction "+a+b);
}
public static void main(String[] args) {
	
	Conthis cn=new Conthis(11);	
}
	

}
