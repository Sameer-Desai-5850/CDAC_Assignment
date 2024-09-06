package org.Q1;

import java.util.Scanner;

class LoanAmortizationCalculator{
	
	float principal;
	float annualInterestRate;
	float loanTerm;	
	float monthlyPayment;
	
	void acceptRecord(){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Principal           :  ");
		this.principal=sc.nextFloat();
		
		System.out.print("annualInterestRate  :  ");
		this.annualInterestRate=sc.nextFloat();
		
		System.out.print("loanTerm            :  ");
		this.loanTerm=sc.nextFloat();
		
	}
	
	void calculateMonthlyPayment(){
		float numberOfMonths = loanTerm * 12;
		System.out.println("numberOfMonths           :  "+numberOfMonths);
		
		float monthlyInterestRate = annualInterestRate/12/100 ;
		System.out.println("monthlyInterestRate       :  "+monthlyInterestRate);
		
		 monthlyPayment = (int) (principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,numberOfMonths)) / (Math.pow(1 + monthlyInterestRate,numberOfMonths) - 1));
			System.out.println("monthlyPayment           :  "+monthlyPayment);
	}
	
	void printRecord(){
		//System.out.print("Principal:  "+principal+" rate: "+annualInterestRate+" term "+loanTerm);
		
		System.out.println("monthly payment :" +monthlyPayment);
		
		float totalAmtPaid=monthlyPayment*loanTerm*12;
		
		System.out.println("totalAmtPaid :" +totalAmtPaid);


	}
}

public class Programe {

	public static void main(String[] args) {
		System.out.print("hello");
		LoanAmortizationCalculator l=new LoanAmortizationCalculator();
		
		l.acceptRecord();
		l.calculateMonthlyPayment();
		l.printRecord();
		
		
		

	}

}
