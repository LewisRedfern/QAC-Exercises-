package Intermediate;

public class Motorcycle extends Vehicle {

	private int CC;
	private boolean isOffRoader;
	
	public Motorcycle(int size, int seats, String make, double topSpeed, int CC, boolean isOffRoader) {
		super(size, seats, make, topSpeed);
		
		this.CC = CC;
		this.isOffRoader = isOffRoader;
	}
	
	@Override
	public String strMaker() {
		
		return("Size: " + super.size + " | Seats: " + super.seats + " | Make: " + super.make + " | Top Speed: " + super.topSpeed + " | CC: " + this.CC + " | Off Roader?: " + this.isOffRoader);
	}
}
