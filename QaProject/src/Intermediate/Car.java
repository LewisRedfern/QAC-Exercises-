package Intermediate;

public class Car extends Vehicle {

	private int doors;
	private boolean hasAirCon;
	
	public Car(int size, int seats, String make, double topSpeed, int doors, boolean hasAirCon) {
		super(size, seats, make, topSpeed);
		
		this.doors = doors;
		this.hasAirCon = hasAirCon;
	}
	
	@Override
	public String strMaker() {
		
		return("Size: " + super.size + " | Seats: " + super.seats + " | Make: " + super.make + " | Top Speed: " + super.topSpeed + " | Doors: " + this.doors + " | Air Con?: " + this.hasAirCon);
	}
	
}
