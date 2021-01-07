package com.qa.Garage;

public class Bike extends Vehicle{
	
	private boolean pedals;
	

	public Bike(boolean pedals, int speed, int passengers) {
		super.setSpeed(speed);
		super.setPassengers(passengers);
		this.pedals = pedals;
	}

	public boolean isPedals() {
		return pedals;
	}

	public void setPedals(boolean pedals) {
		this.pedals = pedals;
	}

	@Override
	public String toString() {
		return "Bike [pedals=" + pedals + ", Passengers=" + getPassengers() + ", Speed=" + getSpeed() + "]";
	}
	
	

}
