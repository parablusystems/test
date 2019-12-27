package com.actitime.javapackage;

public class elseif {
public static void main(String[] args) {
	
	int a=10,b=15,c=20;
	if (a<b) {
		System.out.println("if condition");
		
		if (a==b) {
			System.out.println("1st if condition");}
		else {
			System.out.println("1st else condition");
		}
			if (a!=c) {
				System.out.println("2nd if condition");
			}
			else {
				System.out.println("2nd else condition");
			}
		
	}
	else {
		System.out.println("else condition");
	}
	}
}
