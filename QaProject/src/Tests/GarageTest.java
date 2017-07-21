package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Intermediate.Garage;

public class GarageTest {

	Garage g = new Garage();

	@Test
	public void testPrintList() {

		g.run();
		//System.out.println(g.retrieveArray().size());
		assertEquals("array should have 3 items", 3, g.retrieveArray().size());
		
		g.delVehicle("Car");
		
		assertEquals("array should have 2 items", 2, g.retrieveArray().size());
		
		g.delVehicle(1);
		
		assertEquals("array should have 1 item", 1, g.retrieveArray().size());
		
		//System.out.println(g.getVehicle(2));
		assertEquals("a vehicle should be ruturned", "Size: 7 | Seats: 10 | Make: Speedster | Top Speed: 50.5 | Propellars: 3 | Does it have an Engine?: true", g.getVehicle(2).strMaker());

		g.clearGarage();
		assertEquals("array should be empty.", 0, 0);
	}
}