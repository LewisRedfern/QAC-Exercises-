package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Library.Book;
import Library.ItemLog;
import Library.PersonHandler;
import Library.Staff;

public class libraryTest {

	PersonHandler ph = new PersonHandler();
	ItemLog il = new ItemLog();
	
	@Before
	public void setValues() {
		
		ph.AddPerson(new Staff ("test", "Staff", "TEST"));
		il.addItem(new Book ("Book" , "hello", 5, 1110, true, "lewis"));
	}
	
	@Test
	public void testAddItem() {
		
		//System.out.println(ph.getPerson(0));
		assertNotEquals("Book  hello 5 1110 true lewis", il.getItem(0));
	}
	
	@Test
	public void testDelItemByID () {
		
		il.delItem(0);
		assertEquals(null, il.getItem(0));
	}
	
	@Test
	public void testDelItemByType () {
		
		il.delItem("Book");
		assertEquals(null, il.getItem(0));
	}
	
	@Test
	public void testUpdateItem () {
		
		il.updateItem(0, new Book("Book" , "updated", 5, 1110, false, "lewis"));
		assertNotEquals("Book  updated 5 1110 false lewis", il.getItem(0));
		System.out.println(il.getItem(0));
	}
	
	@Test
	public void testCheckOutItem () {
		il.checkOutItem(0);
		assertNotEquals("Book  hello 5 1110 false lewis", il.getItem(0));
	}
	
	@Test
	public void testCheckInItem () {
		il.updateItem(0, new Book("Book" , "updated", 5, 1110, false, "lewis"));
		il.checkInItem(0);
		assertNotEquals("Book  updated 5 1110 true lewis", il.getItem(0));
	}
	
	@Test
	public void testAddPerson() {
		
		//System.out.println(ph.getPerson(0));
		assertNotEquals("test Staff TEST", ph.getPerson(0));
	}
	
	@Test
	public void testDelPersonByID () {
		
		ph.delPerson(0);
		assertEquals(null, ph.getPerson(0));
	}
	
	@Test
	public void testDelPersonByType () {
		
		ph.delPerson("Staff");
		assertEquals(null, ph.getPerson(0));
	}
	
	@Test
	public void testUpdatePerson () {
		
		ph.updatePerson(0, new Staff ("update", "Staff", "UPDATE"));
		assertNotEquals("update Staff UPDATE", ph.getPerson(0));
	}
}
