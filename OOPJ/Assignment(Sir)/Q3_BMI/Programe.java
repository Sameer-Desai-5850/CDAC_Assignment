package org.Q3_BMI;

import java.util.Scanner;

class BMITracker {
	
	float weight;
	float height;
	
	float BMI;
	
	void acceptRecord() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Weight  : ");
		this.weight =sc.nextFloat();
		
		System.out.print("height  : ");
		this.height =sc.nextFloat();

	}
	void calculateBMI() {
		 BMI = weight / (height * height);
		System.out.print("BMI  : "+BMI);

	}
	void classifyBMI() {
		if(BMI<18.5) {
			//return "	Underweight";
			System.out.println("	Underweight");
		}
		else if(BMI >= 18.5 && BMI< 24.9) {
			//return "	o	Normal weight: ";
			System.out.println("	o	Normal weight: ");
		}
		else if(BMI >= 25 && BMI< 29.9) {
			//return "	verweight";
			System.out.println("	overweight");

		}
		else if(BMI>=30) {
			//return "	o	Obese";
			System.out.println("	o	Obese");

		}
		
		
		
		
	}
	void printRecord() {
		System.out.println("Weight  : "+weight+" height :"+height);

	}
}
public class Programe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMITracker bmi=new BMITracker();
		
		bmi.acceptRecord();
		bmi.calculateBMI();
		bmi.classifyBMI() ;
		bmi.printRecord();
		
		

	}

}
