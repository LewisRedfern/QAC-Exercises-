package Library;

public class Map extends Item {

	private String location;

	public Map(String type, String title, int maxRentTime, int area, boolean itemAvailable, String location) {
		super(type, title, maxRentTime, area, itemAvailable);

		this.location = location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return this.location;
	}

	@Override
	public String toString() {

		return super.getType() + " " + super.getTitle() + " " + super.getMaxRentTime() + " " + super.getArea() + " "
				+ super.getItemAvailable() + " " + this.getLocation();
	}

	@Override
	public String serialise() {

		return super.getType() + "," + super.getTitle() + "," + super.getMaxRentTime() + "," + super.getArea() + ","
				+ super.getItemAvailable() + "," + this.getLocation();
	}
}
