package Library;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class ItemLog {

	private HashMap<Integer, Item> itemList = new HashMap<Integer, Item>();

	int i = 0;

	/*-------------START------------*/

	public void checkOutItem(int id) {

		Iterator<Entry<Integer, Item>> checkSearch = itemList.entrySet().iterator();

		while (checkSearch.hasNext()) {

			Entry<Integer, Item> entry = checkSearch.next();

			if (id == entry.getKey() && entry.getValue().getItemAvailable() == true) {

				entry.getValue().setItemAvailable(false);
				System.out.println("Thank you.\nPlease return " + entry.getValue().getTitle() + " in "
						+ entry.getValue().getMaxRentTime() + " week(s).");
			}

			else if (id == entry.getKey() && entry.getValue().getItemAvailable() == false) {

				System.out.println("Sorry, this item is already checked out.");
				break;
			}
		}
	}
	
	public void checkInItem(int id) {
		
		Iterator<Entry<Integer, Item>> checkSearch = itemList.entrySet().iterator();

		while (checkSearch.hasNext()) {

			Entry<Integer, Item> entry = checkSearch.next();
			
			if (id == entry.getKey() && entry.getValue().getItemAvailable() == false) {
				
				entry.getValue().setItemAvailable(true);
				System.out.println("Thank you for returning " + entry.getValue().getTitle() + ".");
			}
			
			else if (id == entry.getKey() && entry.getValue().getItemAvailable() == true) {
				
				System.out.println("Sorry.\nThis item is not ours maybe try another library?");
				break;
			}
		}
	}

	public void addItem(Item item) {

		itemList.put(i++, item);
	}

	public Item getItem(int id) {

		return itemList.get(id);
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
