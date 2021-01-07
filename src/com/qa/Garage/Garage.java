package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;


public class Garage {
	
List<Vehicle> garagelist = new ArrayList<>();
	
	public void addVehicle(Vehicle v) {
		v.setID(garagelist.size()+100);
		garagelist.add(v);
	}
	
	public void removeVehicle(Vehicle v) {
		garagelist.remove(v);
	}

	public void emptyGarage() {
		garagelist.clear();
	}

	public void calculateBill() {
		for (Vehicle v : garagelist) {
			
			int total = 0;
			
			if (v instanceof Car) {
				total = v.getPassengers()*100;
				System.out.println("Total cost: £"+total);
			}
			
			if (v instanceof Bike) {
				total = v.getPassengers()*100;
				System.out.println("Total cost: £"+total);
			}
			
			if (v instanceof Train) {
				total = v.getPassengers()*100;
				System.out.println("Total cost: £"+total);
			} 
			
		}
	}

	public void output() {
		for (Vehicle v:garagelist) {
			System.out.println(v);
		}
	}

}
