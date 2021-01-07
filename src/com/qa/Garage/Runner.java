package com.qa.Garage;

public class Runner {

	public static void main(String[] args) {
		
		Garage g = new Garage();
		g.addVehicle(new Car(true, 20, 4));
		g.addVehicle(new Train(12, 150, 1000));
		g.addVehicle(new Bike(true, 10, 1));
		
		g.output();
		g.calculateBill();
		
		g.emptyGarage();
		g.output();
	}

}
