package Intermediate;

public class Paint {

	private String paintName;
	private double paintPrice;
	private int paintLitre;
	private int paintCoverage;

	public Paint(String paintName, double paintPrice, int paintLitre, int paintCoverage) {

		this.paintName = paintName;
		this.paintPrice = paintPrice;
		this.paintLitre = paintLitre;
		this.paintCoverage = paintCoverage;

	}

	public String getpaintName() {

		return paintName;
	}

	public double getpaintPrice() {

		return paintPrice;
	}

	public int getpaintLitre() {

		return paintLitre;
	}

	public int getpaintCoverage() {

		return paintCoverage;
	}
}
