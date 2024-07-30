package com.obsqura.training.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ColoursArray {

	public static void main(String[] args) {
		//========ArrayList========
		ArrayList<String> list=new ArrayList<String>();
		list.add("Pink");
		list.add("Black");
		list.add("Blue");
		System.out.println(list);
		Iterator <String>it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		list.remove(1);
		System.out.println(list);
		System.out.println(list.get(0));
		
		//========LinkedList==========
		LinkedList<String> lin=new LinkedList<String>();
		lin.add("Tiger");
		lin.add("Lion");
		lin.add("Cat");
		System.out.println(lin);
		ListIterator <String>iti= lin.listIterator();
		while(iti.hasPrevious()) {
			System.out.println(iti.previous());
		}
		while(iti.hasNext()) {
			System.out.println(iti.next());
		}
	}
	
	

}
