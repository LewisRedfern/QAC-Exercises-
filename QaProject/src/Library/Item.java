package Library;

public abstract class Item {

	private String type;
	private String title;
	private int maxRentTime;
	private int area;
	private boolean itemAvailable;

	public Item(String type, String title, int maxRentTime, int area, boolean itemAvailable) {

		this.type = type;
		this.title = title;
		this.maxRentTime = maxRentTime;
		this.area = area;
		this.itemAvailable = itemAvailable;
	}

	public void setType(String type) {

		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setMaxRentTime(int maxRentTime) {

		this.maxRentTime = maxRentTime;
	}

	public int getMaxRentTime() {
		return this.maxRentTime;
	}

	public void setArea(int area) {

		this.area = area;
	}

	public int getArea() {
		return this.area;
	}

	public void setItemAvailable(boolean itemAvailable) {

		this.itemAvailable = itemAvailable;
	}

	public boolean getItemAvailable() {

		return this.itemAvailable;
	}
	
	@Override
	public String toString() {
		
		return this.type + " " + this.title + " " + this.maxRentTime + " " + this.area + " " + this.itemAvailable;
	}
	
	
	public String serialise() {
		
		return this.type + "," + this.title + "," + this.maxRentTime + "," + this.area + "," + this.itemAvailable;
	}
}
