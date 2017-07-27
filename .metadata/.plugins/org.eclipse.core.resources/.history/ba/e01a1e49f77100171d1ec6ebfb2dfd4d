package Library;

public class Library {

	boolean isMember;
	boolean newEmployee;

	private PersonHandler ph = new PersonHandler();

	private ItemLog il = new ItemLog();

	private String s = "Staff";
	private String m = "Member";

	private String b = "Book";
	private String n = "Newspaper";
	private String map = "Map";

	public void Run() {

		AddPerson("lewis", s, "Receptionist");
		AddPerson("kim", m, "np182dp");
		DelPerson(m);
		GetPerson(0);
		
		AddItem(b, "The Outsiders", 5, 1001, true, "S. E. Hinton");
		AddItem(n, "The Sun", 1, 2001, true, "Dragon Slayer");
		AddItem(map, "Map of the world on Mercator's projection Tissue Paper", 10, 3001, true, "Planet Earth");
		DelItem(map);
		GetItem(0);
	}// end of run

	public void AddItem(String type, String title, int maxRentTime, int area, boolean itemAvailable, String extra) {

		if (type.equals(b)) {

			il.addItem(new Book(type, title, maxRentTime, area, itemAvailable, extra));
		} else if (type.equals(n)) {

			il.addItem(new Newspaper(type, title, maxRentTime, area, itemAvailable, extra));
		} else if (type.equals(map)) {

			il.addItem(new Map(type, title, maxRentTime, area, itemAvailable, extra));
		}
	}// end of add item

	public void GetItem(int id) {

		il.getItem(id);
	}// end of getItem

	public void DelItem(int id) {

		il.delItem(id);
	}// end of delItem

	public void DelItem(String type) {

		il.delItem(type);
	}// end of delItem

	public void UpdateItem(int id, String type, String title, int maxRentTime, int area, boolean itemAvailable,
			String extra) {

		if (type.equals(b)) {

			il.updateItem(id, new Book(type, title, maxRentTime, area, itemAvailable, extra));
		}

		else if (type.equals(n)) {

			il.updateItem(id, new Newspaper(type, title, maxRentTime, area, itemAvailable, extra));
		}

		else if (type.equals(map)) {

			il.updateItem(id, new Map(type, title, maxRentTime, area, itemAvailable, extra));
		}
	}// end of updateitem

	public void AddPerson(String name, String type, String extra) {

		if (type.equals(s)) {

			ph.AddPerson(new Staff(name, type, extra));
		}

		else if (type.equals(m)) {

			ph.AddPerson(new Member(name, type, extra));
		}
	}// end of addPerson

	public void GetPerson(int id) {

		ph.getPerson(id);
	}// end of getPerson

	public void DelPerson(int id) {

		ph.delPerson(id);
	}// end of delperson

	public void DelPerson(String type) {

		ph.delPerson(type);
	}// end of del person

	public void UpdatePerson(int id, String name, String type, String extra) {

		if (type.equals(s)) {

			ph.updatePerson(id, new Staff(name, type, extra));
		} // end of update person

		else if (type.equals(m)) {

			ph.updatePerson(id, new Member(name, type, extra));
		}
	}// end of update person
}
