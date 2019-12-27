package com.actitime.javapackage;

public class Branches {
	
	public static void main(String[] args) {
	BranchB b=new BranchB();
	b.testing();
	
		
		
	}
	

	public static void test() {
		
		System.out.println("this is methods of test ");
	}
	public void test1() {
		
		System.out.println("this is methods of test1 ");
	
	}
	
}
class BranchA extends Branches{
	
public static void tested() {
		
		System.out.println("this is methods of tested ");
	}
	public void testing() {
		
		System.out.println("this is methods of test");
		this.test1();
	}
	
	
}
class BranchB extends BranchA{
	
public static void tested1() {
		
		System.out.println("this is methods of tested ");
	}
	public void testing1() {
		
		System.out.println("this is methods of test");
	}
	
	
}
