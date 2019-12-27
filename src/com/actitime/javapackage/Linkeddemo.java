package com.actitime.javapackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linkeddemo {
	
	public static void main(String[] args) {
		List lst1=new LinkedList<>();
		lst1.add("lavan");
		lst1.add("kumar");
		lst1.add("software");
		lst1.add("engineer");
		System.out.println(lst1);
		Collections.reverse(lst1);
		System.out.println(lst1);
		
	}

}
