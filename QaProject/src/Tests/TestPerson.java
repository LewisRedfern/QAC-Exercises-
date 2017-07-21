package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

import Intermediate.Person;

public class TestPerson {

	@Test
	public void testStrMaker() {
		
		
		assertEquals("StrMaker does not format String correctly.", "Name: Lewis | Age: 21 | Job Title: Consultant", new Person("Lewis", 21, "Consultant").strMaker());
	}

}
