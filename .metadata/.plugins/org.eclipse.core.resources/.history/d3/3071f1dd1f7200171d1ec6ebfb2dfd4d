package Library;

public class Book extends Item {

	private String author;

	public Book(String type, String title, int maxRentTime, int area, boolean itemAvailable, String author) {
		super(type, title, maxRentTime, area, itemAvailable);

		this.author = author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}

	@Override
	public String toString() {
		
		return super.getType() + " " + super.getTitle() + " " + super.getMaxRentTime() + " " + super.getArea() + " " + super.getItemAvailable() + " " + this.getAuthor();
	}
}
