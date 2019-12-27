package com.actitime.javapackage;

public class Thisclsdemo {
	

	public static void main(String[] args) {
		Superdemo2 sd=new Superdemo2();	
	
		
	
	}

	public static void test() {
		System.out.println("This is superdemo test");
		
	}
	public void test1() {
		System.out.println("this is super demo test1");
		
	}
	
	
}
class Superdemo1 extends Thisclsdemo{
	public static void test2() {
		System.out.println("This is superdemo test2");
		
	}
	public void test3() {
		System.out.println("this is super demo test3");
		this.test1();
	}	
}
class Superdemo2 extends Superdemo1{
	public static void test4() {
	
		System.out.println("This is superdemo test4");
		
	}
	public void test5() {
		this.test3();
		System.out.println("this is super demo test5");
	}	
}





