package com.actitime.javapackage;

public class This {
	int rollno;
	String name;
	float fee;
	This(){
	
		
		
	}
	void display() {
		System.out.println("The output of method: ");
	
	}
	

	public static void main(String[] args) {
	
	This c1=new This();
	c1.test();
	

	}
	
	public void test() {
		int a=1;
		String b="kumar";
		float c=7500;
		this.rollno=a;
		this.name=b;
		this.fee=c;
		this.display();
		System.out.println(rollno+" "+name+" "+fee);
		
		
		
	}
	
	

}
