package com.dev.sridhyan;

public class Nestedif {

	public static void main(String[] args) {
		   int age = 10 ;
		   int weight = 60 ;
		   if (age>=20) {
			   if (weight>=70){
				   System.out.println("eligible to donate");
			   }
			   else {
				   System.out.println("not eligible due to low weight");
			   } 
		   }
		   else {
				   System.out.println("not eligible due to age limit");
			   }
}
}
