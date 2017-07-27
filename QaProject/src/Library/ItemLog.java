package Library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class ItemLog {

	private HashMap<Integer, Item> itemList = new HashMap<Integer, Item>();

	int i = 0;

	/*-------------START------------*/

	public void checkOutItem(int id) {

		Iterator<Entry<Integer, Item>> checkSearch = itemList.entrySet().iterator();

		while (checkSearch.hasNext()) {

			Entry<Integer, Item> entry = checkSearch.next();

			if (id == entry.getKey() && entry.getValue().getItemAvailable()) {

				entry.getValue().setItemAvailable(false);
				System.out.println("Thank you.\nPlease return " + entry.getValue().getTitle() + " in "
						+ entry.getValue().getMaxRentTime() + " week(s).");
			}

			else if (id == entry.getKey() && !entry.getValue().getItemAvailable()) {

				System.out.println("Sorry, this item is already checked out.");

			}
		}
	}

	public void checkInItem(int id) {

		Iterator<Entry<Integer, Item>> checkSearch = itemList.entrySet().iterator();

		while (checkSearch.hasNext()) {

			Entry<Integer, Item> entry = checkSearch.next();

			if (id == entry.getKey() && !entry.getValue().getItemAvailable()) {

				entry.getValue().setItemAvailable(true);
				System.out.println("Thank you for returning " + entry.getValue().getTitle() + ".");
			}

			else if (id == entry.getKey() && entry.getValue().getItemAvailable()) {

				System.out.println("Sorry.\nThis item is not ours maybe try another library?");
				break;
			}
		}
	}

	public void addItem(Item item) {

		IDGen id = new IDGen();
		int i = id.getItemID();
		itemList.put(i, item);
	}

	public Item getItem(int id) {

		return itemList.get(id);
	}

	public void writeItems() {

		Iterator<Entry<Integer, Item>> itemSearch = itemList.entrySet().iterator();

		// create PrintStream writer and new file Person.txt
		PrintStream writer;
		try {
			writer = new PrintStream(new File("Item.txt"));

			while (itemSearch.hasNext()) {

				Entry<Integer, Item> entry = itemSearch.next();

				writer.println(entry.getValue().serialise());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readItems() {

		Library l = new Library();
		Scanner reader;
		
		try {
			reader = new Scanner(new File("Item.txt"));

			// while the scanner has another thing to read, execute..
			while (reader.hasNext()) {

				String[] parts = reader.nextLine().split(",");

				String type = parts[0];
				String title = parts[1];
				int maxRentTime = Integer.parseInt(parts[2]);
				int area = Integer.parseInt(parts[3]);
				boolean itemAvailable = Boolean.parseBoolean(parts[4]);
				String extra = parts[5];

				System.out.println(type + title + maxRentTime + area + itemAvailable + extra);
				l.AddItem(type, title, maxRentTime, area, itemAvailable, extra);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delItem(int id) {

		itemList.remove(id);
	}// end of delItem(int)

	public void delItem(String type) {

		Iterator<Entry<Integer, Item>> itemSearch = itemList.entrySet().iterator();

		while (itemSearch.hasNext()) {

			Entry<Integer, Item> entry = itemSearch.next();

			if (type.equals("Book") && entry.getValue() instanceof Book) {

				itemList.remove(entry.getKey());
			}

			else if (type.equals("Map") && entry.getValue() instanceof Map) {
				itemList.remove(entry.getKey());
			}

			else if (type.equals("Newspaper") && entry.getValue() instanceof Newspaper) {
				itemList.remove(entry.getKey());
			}
		}
	}// end of delItem(String)

	public void updateItem(int id, Item it) {

		itemList.put(id, it);
	}
}
