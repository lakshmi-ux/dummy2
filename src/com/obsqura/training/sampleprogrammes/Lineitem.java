package com.obsqura.training.sampleprogrammes;

public class Lineitem {
	 int qty;
	String prod;
	Product pr;
	

	public Lineitem(int qty, String prod, Product pr) {
	
		this.qty = qty;
		this.prod = prod;
		this.pr = pr;
	}
	void display(){
		System.out.println("Quantity: "+qty+" ;"+"Product name: "+prod);
		System.out.println("Product Id: "+pr.id+" ;"+"Product name: "+pr.name+" ;"+"Product description: "+pr.des);
	}


	public static void main(String[] args) {
		Product add= new Product( 2,"Brick","1st class quality");
		
		Lineitem lin= new Lineitem(20,"Cement", add);
		lin.display();
	}

}
