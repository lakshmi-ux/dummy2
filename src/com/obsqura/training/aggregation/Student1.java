package com.obsqura.training.aggregation;

public class Student1 {
	String address;
	StudentDetails1 std;
	

	public Student1(String address, StudentDetails1 std) {
		
		this.address = address;
		this.std = std;
	}
	void display() {
		System.out.println("Student name: "+ std.name+ "; " +"Roll number: "+std.roll);
		System.out.println("Address: "+address);
	}


	public static void main(String[] args) {
		StudentDetails1 st= new StudentDetails1("Diya", 23);
		Student1 s=new Student1("Palace Nagar", st);
		s.display();
		}
}
