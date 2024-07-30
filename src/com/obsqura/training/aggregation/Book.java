package com.obsqura.training.aggregation;

public class Book {
	String bkName;
	int price;
	Author athr;
	

	public Book(String bkName, int price, Author athr) {
		
		this.bkName = bkName;
		this.price = price;
		this.athr = athr;
	}
	void display() {
		System.out.println("Book name: "+bkName+", "+"Price: "+price);
		System.out.println("Author name: "+athr.name+", "+"Age: "+athr.age+", "+
		"Place: "+athr.place);
	}


	public static void main(String[] args) {
		Author at= new Author("Aswathi",32,"Palakkad");
		Book bk= new Book("Kaali", 240,at);
		bk.display();
		}
}
