package com.acttime.Revesion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraylistdemo {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("lavan");
		lst.add("kumar");
		lst.add("software");
		lst.add("engineer");
		lst.add(2,"yaaltech");
		 
			
		for (Object show : lst) {
			
			System.out.println(show);
		}
		Collections.sort(lst);
		System.out.println(lst);
	
		String s="Yaltech";
		System.out.println(s);
		 s="solutions";
		System.out.println(s);
	}
	

}
