package Intermediate;

public abstract class Vehicle {

	protected int size;
	protected int seats;
	protected String make;
	protected double topSpeed;
	
	public Vehicle(int size, int seats, String make, double topSpeed) {
		
		this.size = size;
		this.seats = seats;
		this.make = make;
		this.topSpeed = topSpeed;
	}
	
	public String strMaker() {
		
		return("Size: " + this.size + " | Seats: " + this.seats + " | Make: " + this.make + " | Top Speed: " + this.topSpeed);
	}
}//end of Vehicle class


