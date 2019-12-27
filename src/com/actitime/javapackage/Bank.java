package com.actitime.javapackage;


public class Bank {
	static Bank b;
	
	public static void main(String[] args) {
		
	b=new Hdfc();
	b.loans();
	
		
		
	}
	public void savings() {
		
		System.out.println("This is savings");
	}
	public void withdrawl() {
		
		System.out.println("This is withdrawl");
	}
	public void loans() {
		
		System.out.println("This is loans as per Bank ");
	}

}
class Hdfc extends Bank{
	
	public void loans(){
		System.out.println("Loans section as per hdfc rules ");
	}
}

class Kvb extends Bank{
	
	public void loans() {
		System.out.println("loans as per kvb rules ");
		
	}
}
class Hsbc extends Bank{
	public void loans() {
		System.out.println("loans as per Hsbc rules ");
	}
	
}