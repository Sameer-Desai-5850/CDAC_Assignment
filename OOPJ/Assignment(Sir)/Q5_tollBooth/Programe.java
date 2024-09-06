package org.Q5_tollBooth;

import java.util.Scanner;

class TollBoothRevenueManager {
	
	float carRate;
	float truckRate;
	float motorcRate;
	
	int tCar;
	int tTruck;
	int tMotorc;
	
	float tRevenue;
	int tVehicles;
	
	void printRecord() {
		System.out.println("tVehicles= "+tVehicles);
		System.out.println("tRevenue= "+tRevenue);
	}
	
	void calculateRevenue () {
		tRevenue=((carRate*tCar)+(truckRate*tTruck)+(motorcRate*tMotorc));
		tVehicles=tCar+tTruck+tMotorc;
	}
	
	void setTollRates() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("caar rate= ");
		this.carRate=sc.nextFloat();
		
		System.out.println("truckRate= ");
		this.truckRate=sc.nextFloat();
		
		System.out.println("motorcRate= ");
		this.motorcRate=sc.nextFloat();
				
	}
	
	void motorcRate() {
      Scanner sc = new Scanner(System.in);
		
		System.out.println("tCar= ");
		this.tCar=sc.nextInt();
		
		System.out.println("tTruck= ");
		this.tTruck=sc.nextInt();
		
		System.out.println("tMotorc= ");
		this.tMotorc=sc.nextInt();
	}
	
	
}
public class Programe {
	public static void main(String[] args) {
		TollBoothRevenueManager tbm=new TollBoothRevenueManager();
		
		tbm.setTollRates();
		
		tbm.motorcRate();
		
		tbm.calculateRevenue();
		
		tbm.printRecord();
	}
}
