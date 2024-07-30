package com.obsqura.training.sampleprogrammes;

public class Divisibility extends Addition {
   public boolean divide(){
	   
	   int res = getSum(10,25);
	if(res%10==0) {
		   return true;
	   }
	   else {
		   return false;
	   }
	  }
   public static void main(String[] args) {
	   Divisibility obj= new Divisibility();
	   
	   boolean status = obj.divide();
	if(status==true) {
		System.out.println("Divisible by 10");
		}
	else {
		System.out.println("Not Divisible by 10");
	}

	}
}
