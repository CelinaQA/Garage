package com.qa.Garage;

public class Car extends Vehicle{
	
	private boolean boot = true;
	

	public Car(boolean boot, int speed, int passengers) {
		super.setSpeed(speed);
		super.setPassengers(passengers);
		this.boot = boot;
	}

	public boolean isBoot() {
		return boot;
	}

	public void setBoot(boolean boot) {
		this.boot = boot;
	}

	@Override
	public String toString() {
		return "Car [boot=" + boot + ", Passengers=" + getPassengers() + ", Speed=" + getSpeed() + "]";
	}
	
	

}
