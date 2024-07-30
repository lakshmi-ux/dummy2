package com.obsqura.training.sampleprogrammes;

public class Totalsalary extends Calculatehra{
	public void findTotSalary() {
		System.out.println("Basic pay: "+super.basicPay);
		System.out.println("Deduction: "+super.dedtn);
		System.out.println("HRA: "+super.calculateHr());
		System.out.println("PF: "+super.calculatePf());
		System.out.println("Bonus: "+super.bonus);
		double totSalary=basicPay+super.calculateHr()-super.calculatePf()-super.dedtn+super.bonus;
		System.out.println("Total Salary: "+totSalary);
		
	}

	public static void main(String[] args) {
		Totalsalary ts= new Totalsalary();
		ts.findTotSalary();
		}
}
