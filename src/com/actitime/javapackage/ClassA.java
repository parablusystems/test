package com.actitime.javapackage;

public class ClassA {
   static int a=25;
   int b=55;
	public static void main(String[] args) {
		ClassB b1=new ClassB();
		ClassA.test();
		ClassB.test();
		System.out.println(b1.addition());
		System.out.println(ClassA.a);
		System.out.println(ClassB.a);
		System.out.println(b1.b);
		ClassA a1=new ClassA();
		System.out.println(a1.b);
		
	}
	 public static void test() {
		 System.out.println("1st static");
	
	

}
     static class ClassB { 
    	 static long a=15;
	       long b=20;
	 public static void test() {
		 System.out.println("static method");
	 }	 
	public int addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("the c is="+c);
		return c;
	}
     }
}
	
     
