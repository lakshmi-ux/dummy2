package com.obsqura.training.string;
public class PalindromeString {
	public static void main(String[] args) {
		String a= "java";
		String rev="";
		for(int i=a.length()-1; i>=0; i--) {
			char c= a.charAt(i);
			rev=rev+c;
		}
		if(a.equals(rev)) {
			System.out.println("Java is a palindrome");
		}
		else {
			System.out.println("Java is not a palindrome");
			}
		String a1= "malayalam";
		String reverse="";
		for(int i=a1.length()-1; i>=0; i--) {
			char c1= a1.charAt(i);
			reverse=reverse+c1;
		}
		if(a1.equals(reverse)) {
			System.out.println("malayalam is a palindrome");
		}
		else {
			System.out.println("malayalam is not a palindrome");
 }}}

