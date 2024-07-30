package com.obsqura.training.arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class IfElse {

	public static void main(String[] args) {
		//try {
			ArrayList <Integer> pt= new ArrayList<Integer>();
		pt.add(10);//0
		pt.add(11);//1
		pt.add(12);//2
		
		Iterator <Integer> it= pt.iterator();
		for(int i=0; i<pt.size(); i++) {
			if(pt.get(i)%2==0) {//evida change aaki command maatikode
				System.out.println(it.next() +" :"+ "Divisible by 2");
			}
			else {
				System.out.println(it.next()+" : "+ "Not divisible by 2");
			}
		}
//		}
//		catch(Exception e) {
//			System.out.println("There is an exception");
//		}
	}

}
