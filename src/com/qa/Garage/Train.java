package com.qa.Garage;

public class Train extends Vehicle{
	
	private int carriages;

	
	public Train(int carriages, int speed, int passengers) {
		super.setSpeed(speed);
		super.setPassengers(passengers);
		this.carriages = carriages;
	}

	public int getCarriages() {
		return carriages;
	}

	public void setCarriages(int carriages) {
		this.carriages = carriages;
	}

	@Override
	public String toString() {
		return "Train [carriages=" + carriages + ", Passengers=" + getPassengers() + ", Speed=" + getSpeed()
				+ "]";
	}
	
	

}
