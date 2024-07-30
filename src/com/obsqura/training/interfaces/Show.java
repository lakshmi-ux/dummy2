package com.obsqura.training.interfaces;

public class Show implements Print, Display {

	public static void main(String[] args) {
	Print pr= new Show();
	pr.display();
	Print.value();
	Display dy= new Show();
	dy.dis();
	Display.val();

	}

	@Override
	public void display() {
		//System.out.println("Hi");
	}
		
	@Override
	public void dis() {
		// TODO Auto-generated method stub
		
	}

}
