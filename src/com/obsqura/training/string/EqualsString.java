package com.obsqura.training.string;

public class EqualsString {

	public static void main(String[] args) {
		String a="Sachin";
		String b="sachin";
	 System.out.println(a.equals(b));
	 
	    String a1="Sachin";
		String b1="sachin";
	 System.out.println(a1.equalsIgnoreCase(b1));
	 
	    String a2="Sachin";
		String b2="sachin";
		String c= new String("Sachin");
	 System.out.println(a2==c);

	}

}
