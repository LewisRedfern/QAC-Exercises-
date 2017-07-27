package Library;

import java.util.Scanner;

public class Library {

	boolean isMember;
	boolean newEmployee;
	Scanner sc = new Scanner(System.in);
	PersonHandler ph = new PersonHandler();
	ItemLog il = new ItemLog();
	String s = "Staff";
	String m = "Member";

	public void Run() {

		AddPerson("lewis", s, "Receptionist");
		AddPerson("kim", m, "np182dp");
		DelPerson(m);
		GetPerson(0);
	}

	public void AddPerson(String name, String type, String extra) {

		if (type.equals(s)) {

			ph.AddPerson(new Staff(name, type, extra));
		}

		else if (type.equals(m)) {

			ph.AddPerson(new Member(name, type, extra));
		}
	}

	public void GetPerson(int id) {

		ph.getPerson(id);
	}

	public void DelPerson(int id) {

		ph.delPerson(id);
	}

	public void DelPerson(String type) {

		ph.delPerson(type);
	}

	public void UpdatePerson(int id, String name, String type, String extra) {

		if (type.equals(s)) {

			ph.updatePerson(id, new Staff(name, type, extra));
		}

		else if (type.equals(m)) {

			ph.updatePerson(id, new Member(name, type, extra));
		}
	}
}
