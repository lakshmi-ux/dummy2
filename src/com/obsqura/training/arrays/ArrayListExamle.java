package com.obsqura.training.arrays;

import java.util.ArrayList;

public class ArrayListExamle {
	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("hello");
	list.add("lakshmi");
	System.out.println(list);//print as list
	list.add(0,"hi");
	System.out.println(list);
	list.remove(1);
	System.out.println(list);
	System.out.println(list.get(0));
	list.set(1, "Sachin");
	System.out.println(list);
	if(list.contains("Sachin")) {
		System.out.println("Sachin is present");
	}
	if(list.contains("laks")) {
		System.out.println("laks is present");
	}
	else {
		System.out.println("laks is not present");
	}
	//Using forloop
	int length= list.size();
	System.out.println(length);
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	for(String a:list) {
		System.out.println(a);
	}
	
	}
}
