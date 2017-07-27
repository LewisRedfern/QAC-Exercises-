package Library;

public class Newspaper extends Item{

	private String headline;
	public Newspaper(String type, String title, int maxRentTime, int area, boolean itemAvailable, String headline) {
		super(type, title, maxRentTime, area, itemAvailable);
		
		this.headline = headline;
	}

	public void setHeadline (String headline) {
		this.headline = headline;
	}
	
	public String getHeadline () {
		return this.headline;
	}
	
	@Override
	public String toString() {
		
		return super.getType() + " " + super.getTitle() + " " + super.getMaxRentTime() + " " + super.getArea() + " " + super.getItemAvailable() + " " + this.getHeadline();
	}
	
	@Override
	public String serialise() {

		return super.getType() + "," + super.getTitle() + "," + super.getMaxRentTime() + "," + super.getArea() + ","
				+ super.getItemAvailable() + "," + this.getHeadline();
	}
}
