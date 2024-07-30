package com.obsqura.training.interfaces;

public class Contractor extends Employee{
	void calculateSalary()
	{
		int pphr=100;
		int wh=4;
		int sal=pphr*wh;
		System.out.println("Salary of contract worker is: "+sal);
	}
	
}
