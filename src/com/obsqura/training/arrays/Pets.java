package com.obsqura.training.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Pets {

	public static void main(String[] args) {
		//ARRAYLIST
		ArrayList <String> pt= new ArrayList<String>();
		pt.add("Dog");//0
		pt.add("Cat");//1
		pt.add("Lion");//2
		pt.add("Tiger");//3
		Iterator <String> it= pt.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//LINKEDLIST
				LinkedList <String> abc= new LinkedList<String>();
				abc.add("fish");//0
				abc.add("bird");//1
				
				ListIterator <String> xy= abc.listIterator();
				while(xy.hasNext()) {
					System.out.println(xy.next());
				}
				while(xy.hasPrevious()) {
					System.out.println(xy.previous());
				}
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println(pt); //just array print cheyan
		System.out.println(pt.get(1));//to get 1st index value
		
		//System.out.println(pt.set(0, "coco"));
		pt.set(2, "Rabbit");//1st change the value then print at next line
		System.out.println(pt);
		pt.remove(3);
		System.out.println(pt);
		pt.add("peacock");
		System.out.println(pt);
		pt.add(2, "monkey");
		System.out.println(pt);*/
		
		
		
	}

}
