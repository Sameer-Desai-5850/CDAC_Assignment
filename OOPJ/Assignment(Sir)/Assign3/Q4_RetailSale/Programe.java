package org.Q4_RetailSale;

import java.util.Scanner;

class DiscountCalculator {
	float originalPrice;
	float discountRate;
	
	float discountAmount;
	float finalPrice;
	
	void acceptRecord() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("originalPrice  : ");
		this.originalPrice =sc.nextFloat();
		
		System.out.print("discountRate  : ");
		this.discountRate =sc.nextFloat();
		
		
		
	}
	void calculateDiscount() {
		 discountAmount = originalPrice * (discountRate / 100);
		 finalPrice = originalPrice - discountAmount;
		
	}
	
	void printRecord() {
		//System.out.print("originalPrice  : "+originalPrice);
		//System.out.print("discountRate  : "+discountRate);
		
		System.out.println("discountAmount  : "+discountAmount);
		System.out.println("finalPrice  : "+finalPrice);
		
	}
	
	
}
public class Programe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscountCalculator dc=new DiscountCalculator();
		dc.acceptRecord();
		
		dc.calculateDiscount();
		
		dc.printRecord();
	}

}
