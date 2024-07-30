package com.obsqura.training.interfaces;

public class HDFC implements RBI {

	public static void main(String[] args) {
		RBI r= new HDFC();
        double amount = 10000; 
        int duration = 5;
        double maturityAmount = r.recurringDeposit(amount, duration);
        System.out.printf("Maturity amount after %d years: %.2f\n", duration, maturityAmount);
		}

	@Override
	public double recurringDeposit(double amount, int duration) {
		double maturityAmount = amount * Math.pow((1 + interestRate / 12), 12 * duration);
		return maturityAmount;
	}

}
