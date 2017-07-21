package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Intermediate.PaintCalculator;

public class TestPaintCalculator {

	PaintCalculator pc = new PaintCalculator();
	@Test
	public void testRun() {

		pc.run();
		
		System.out.println(pc.retrieveArray().size());
		assertEquals("array should have 3 results.", 3, pc.retrieveArray().size());
		
		//pc.wasteCheck(120);
		
		
		assertEquals("best paint should be DuluxourousPaints.", "DuluxourousPaints", pc.wasteCheck(120).getpaintName());
		
		assertEquals("best paint should be AverageJoes.", "AverageJoes", pc.wasteCheck(160).getpaintName());
		
		assertEquals("Average Joes should be the cheapest paint", "AverageJoes", pc.cheapPaint().getpaintName());

	}

}
