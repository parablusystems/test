package com.actitime.javapackage;

import java.util.ArrayList;
import java.util.List;

public class Arraydemo { 
	public static void main(String[] args) {
		 
		List<String> lst = new ArrayList<String>();
		lst.add("yaaltech");
		lst.add("solutions");
		lst.add("yaaltech");
		lst.add("1");
		
		System.out.println(lst.size());
		System.out.println(lst.remove(3));
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		
		}
		
		
	/*	for (Object a : lst) {
			System.out.println(a);
			
		}*/
		
	}
}
