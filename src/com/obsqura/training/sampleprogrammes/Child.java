package com.obsqura.training.sampleprogrammes;

public class Child extends Parent {
	public void print() {
		
		System.out.println("This is a child class");
		super.print();
		}

	public static void main(String[] args) {
		Child c= new Child(); //object creation
		c.print(); //object calling
	}

	}


