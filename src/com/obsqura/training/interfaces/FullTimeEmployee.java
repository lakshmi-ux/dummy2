package com.obsqura.training.interfaces;

public class FullTimeEmployee extends Employee{
	void calculateSalary()
	{
		int pphr=100;
		int wh=6;
		int sal=pphr*wh;
		System.out.println("Salary of contract worker is: "+sal);
	}

	public static void main(String[] args) {
		Employee em=new Contractor();
		em.calculateSalary();
		Employee e=new FullTimeEmployee();
		e.calculateSalary();
	

	}

}
