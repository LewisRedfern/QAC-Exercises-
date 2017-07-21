package Intermediate;

import java.util.ArrayList;

public class PersonRunner {

	private ArrayList<String> personArray = new ArrayList<String>();
	
	public void run () {
		
		Person p1 = new Person("Lewis", 21, "Consultant");
		Person p2 = new Person("Martine", 39, "Teacher");
		Person p3 = new Person("Em", 20, "Nurse");
		Person p4 = new Person("George", 21, "Salesman");
		
		arraySet(p1);
		arraySet(p2);
		arraySet(p3);
		arraySet(p4);
		
		//Enhanced For Loop: For every p in personArray... do condition
		for (String p : personArray) {
			
			System.out.println(p);
		}
	}	
	
	public void arraySet(Person p) {
		
		personArray.add(p.strMaker());
	}
}