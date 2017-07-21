package Intermediate;

import java.util.ArrayList;

public class PaintCalculator {

	ArrayList<Paint> paintList = new ArrayList<Paint>();

	Paint p1 = new Paint("CheapoMax", 19.99, 20, 10);
	Paint p2 = new Paint("AverageJoes", 17.99, 15, 11);
	Paint p3 = new Paint("DuluxourousPaints", 25.00, 10, 20);

	public void run() {

		paintList.add(p1);
		paintList.add(p2);
		paintList.add(p3);

		System.out.println("The best paint is: " + wasteCheck(30).getpaintName());

		Paint p = cheapPaint();
		System.out.println("The cheapest paint available is: " + p.getpaintName() + " at: " + p.getpaintPrice());
	}// end of run

	public ArrayList<Paint> retrieveArray () {
		return paintList;
	}
	
	public Paint wasteCheck(int roomSize) {

		double leastWaste = -1;
		Paint bestPaint = null;

		System.out.println("---PAINT WASTE CHECKER---\n");

		for (Paint p : paintList) {

			double totalCoverage = p.getpaintCoverage() * p.getpaintLitre();
			double coveredSize = totalCoverage - roomSize;
			double totalWaste = coveredSize / p.getpaintCoverage();

			if (totalWaste < 0) {

				System.out.println("Sorry " + p.getpaintName() + " cannot fully cover the size of the room.");
				continue;
			}

			else if (leastWaste == -1) {

				leastWaste = totalWaste;
				bestPaint = p;
				// System.out.println("The best paint is: " +
				// bestPaint.getpaintName().toString());
			}

			else if (totalWaste < leastWaste) {

				leastWaste = totalWaste;
				bestPaint = p;
				// System.out.println("\nThe best paint is: " +
				// bestPaint.getpaintName().toString());
			}
		} // end of enhanced for

		return bestPaint;
	}// end of wasteCheck

	public Paint cheapPaint() {

		double cheapestPaint = -1;
		Paint cheapPaint = null;

		System.out.println("\n---PAINT PRICE CHECKER---\n");

		for (Paint p : paintList) {

			if (p.getpaintPrice() < 0) {

				System.out.println("No paint");
			}

			else if (cheapestPaint == -1) {

				cheapestPaint = p.getpaintPrice();
				cheapPaint = p;
			}

			else if (p.getpaintPrice() < cheapestPaint) {

				cheapestPaint = p.getpaintPrice();
				cheapPaint = p;
			}
		}
		return cheapPaint;
	}
}
