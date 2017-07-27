package Library;

public class IDGen {

	private static int personID = 0;
	private static int itemID = 0;
	
	public int getPersonID () {
		
		return personID++;
	}
	
public int getItemID () {
		
		return itemID++;
	}
}
