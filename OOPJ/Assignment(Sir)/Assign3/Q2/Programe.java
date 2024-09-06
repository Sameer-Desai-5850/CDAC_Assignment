package org.Q2;

import java.util.Scanner;

class CompoundInterestCalculator{
	
	float principal;
	float annualInterestRate;
	float numberOfCompounds;
	float years;
	
	void acceptRecord(){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Principal           :  ");
		this.principal=sc.nextFloat();
		
		System.out.print("annualInterestRate           :  ");
		this.annualInterestRate=sc.nextFloat()/100;
		
		System.out.print("numberOfCompounds           :  ");
		this.numberOfCompounds=sc.nextFloat();
		
		System.out.print("years           :  ");
		this.years=sc.nextFloat();
		
	}
	
	void calculateFutureValue() {
		float futureValue = (float) (principal * Math.pow(1 + (annualInterestRate / numberOfCompounds),(numberOfCompounds * years)));
		System.out.println("futureValue   :  "+futureValue);
		
		float totalInterest = futureValue - principal;
		System.out.println("totalInterest   :  "+totalInterest);

	}
	void printRecord() {
		//System.out.println("Principal :  "+principal+" annualInterestRate "+annualInterestRate+"numberOfCompounds "+numberOfCompounds+" years "+years);

	}
	
}


public class Programe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompoundInterestCalculator cal =new CompoundInterestCalculator();
		
		cal.acceptRecord();
		cal.calculateFutureValue();
		cal.printRecord();

	}

}
