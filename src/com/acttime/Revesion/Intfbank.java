package com.acttime.Revesion;

public interface Intfbank {
 void savings();
 void withdrawl();
 void loans();
 
}

interface Intfbank1 extends Intfbank{
	
	
}
class Sbi implements Intfbank1{

	@Override
	public void savings() {
		System.out.println("the savings for sbi bank");
		
	}

	@Override
	public void withdrawl() {
		System.out.println(" the withdrawl for sbi bank");
		
	}

	@Override
	public void loans() {
		System.out.println("the loans for sbi bank");
		
	}
	
	
} 
class Axis implements Intfbank1{

	@Override
	public void savings() {
		System.out.println("savings for axis bank");
		
	}

	@Override
	public void withdrawl() {
		System.out.println("withdrawl from axis bank");
		
	}

	@Override
	public void loans() {
		System.out.println("loans for axis bank");
		
	}
	
	
}
