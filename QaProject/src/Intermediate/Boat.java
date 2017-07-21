package Intermediate;

public class Boat extends Vehicle{
	
	private int propellars;
	private boolean hasEngine;
	
	public Boat(int size, int seats, String make, double topSpeed,int propellars, boolean hasEngine) {
		super(size, seats, make, topSpeed);

		this.propellars = propellars;
		this.hasEngine = hasEngine;
	}
	
	@Override
	public String strMaker() {
		
		return("Size: " + super.size + " | Seats: " + super.seats + " | Make: " + super.make + " | Top Speed: " + super.topSpeed + " | Propellars: " + this.propellars + " | Does it have an Engine?: " + this.hasEngine);
	}
}
