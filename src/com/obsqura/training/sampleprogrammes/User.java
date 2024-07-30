package com.obsqura.training.sampleprogrammes;

public class User {

	public static void main(String[] args) {
		Bank ur= new Bank();
		ur.setPin(1234);
		int pin= ur.getPin();
		System.out.println(pin);

	}

}
