package com.obsqura.training.sampleprogrammes;

public class Addition {
    
	public int getSum(int a, int b) {
		int sum=a+b;
		return sum;
		}
	
	  public static void main(String[] args) {
			Addition ad= new Addition();
			int sum=ad.getSum(2,7);
			System.out.println("Sum is: "+ sum);
			}	
	  }
