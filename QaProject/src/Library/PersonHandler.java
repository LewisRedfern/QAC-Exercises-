package Library;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class PersonHandler {

	private HashMap<Integer, Person> peopleList = new HashMap<Integer, Person>();

	int i = 0;

	public void AddPerson(Person p) {

		IDGen id = new IDGen();
		int i = id.getPersonID();
		peopleList.put(i, p);
	}

	public Person getPerson(int id) {

		return peopleList.get(id);
	}

	public void delPerson(int id) {

		peopleList.remove(id);
	}

	public void delPerson(String type) {

		// iterator creates "entry" called peopleSearch which searches through
		// peopleList and allows the key and the value to be accessed
		// specifically.
		Iterator<Entry<Integer, Person>> peopleSearch = peopleList.entrySet().iterator();

		// while the Iterator has entries to read do condition....
		while (peopleSearch.hasNext()) {

			// creates an access point to allow access to specific keys and
			// values from HashMap
			Entry<Integer, Person> entry = peopleSearch.next();

			// if parameter equals either class types e.g Staff or Member and
			// the hashmap value is equal to that class name then.......
			if (type.equals("Staff") && entry.getValue() instanceof Staff) {

				// remove entry in peopleList by the key the value is assigned
				// to.
				peopleList.remove(entry.getKey());
			}

			else if (type.equals("Member") && entry.getValue() instanceof Member) {
				peopleList.remove(entry.getKey());
			}
		}
	}

	public void updatePerson(int id, Person p) {

		peopleList.put(id, p);
	}
}
