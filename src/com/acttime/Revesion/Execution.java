package com.acttime.Revesion;

public class Execution {

	public static void main(String[] args) {
		Intfbank1 if1=new Sbi();
		if1.savings();
		if1.withdrawl();
		if1.loans();
		Intfbank1 if11=new Axis();
		if11.savings();
		if11.withdrawl();
		if11.loans();
	}

}
