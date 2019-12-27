package com.acttime.Revesion;

public class Mlplinh {

	public static void main(String[] args) {
	Jntu j=new Jntu();
	Ou o=new Ou();
	Ku k=new Ku();
	
	j.admission();
	j.study();
	j.fee();

	}
	void college() {
	System.out.println("college ");	
		
	}
	void admission() {
		System.out.println("admissons ");
		
	}
	void study() {
		
		System.out.println("study ");
	}

	

}
class Jntu extends Mlplinh{
	void fee() {
		System.out.println("the JNTU fee is Limited reiumbesment ");
	this.college();	
	}
	

}
class Ou extends Mlplinh{
	
	void fee() {
		System.out.println("the OU fee is reiumbesment ");
	}
}
class Ku extends Mlplinh{
	
	void fee() {
		
		System.out.println("the KU fee is reiumbesment ");
	}
}



