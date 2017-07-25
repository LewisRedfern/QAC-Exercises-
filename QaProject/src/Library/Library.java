package Library;

import java.util.Scanner;

public class Library {

	boolean isMember;
	boolean newEmployee;
	Scanner sc = new Scanner(System.in);
	PersonHandler ph = new PersonHandler();
	ItemLog il = new ItemLog();

	public void Administrator() {

		System.out.println("Welcome.\n Would you like to do?\n");
		System.out.println("\nPlease enter:\n 1 - to Access Items\t2 - Access Reception: \n");

		int option = Integer.parseInt(sc.nextLine());

		switch (option) {

		case 1:
			// refer to new method to access what you want make new method with
			// another switch.
			itemOption();
			break;
		case 2:
			Reception();
			break;
		}
	}

	public void itemOption() {

		System.out.println("What would you like to do to the items?");
		System.out.println("Please enter: \n 1 - Add Item\t 2 - Delete Item\t 3 - Update Item: \n");

		int option = Integer.parseInt(sc.nextLine());

		switch (option) {

		case 1:
			// add item method
			addNewItem();
			break;
		case 2:
			// delete item method
			break;
		case 3:
			// update item method
			break;
		}
	}

	public boolean addNewItem() {

		System.out.println("What type of item are you adding?: \n");
		System.out.println("Please enter: \n 1 - Book\t 2 - Map\t 3 - Newspaper: \n");

		int option = Integer.parseInt(sc.nextLine());

		switch (option) {

		case 1:
			// add book
			System.out.println("Please enter the title of the book: \n");

			String title = sc.nextLine();

			System.out.println("\nPlease enter the max rent time of the item: \n");

			int maxRentTime = Integer.parseInt(sc.nextLine());

			System.out.println("\nPlease enter the area it will be kept in the Library: \n");

			int area = Integer.parseInt(sc.nextLine());

			System.out.println("Please enter the Authors name: \n");

			String author = sc.nextLine();

			il.addItem(new Book("Book", title, maxRentTime, area, true, author));
			//break;
			return true;
		
		case 2:
			// add map
			System.out.println("Please enter the title of the map: \n");

			String mTitle = sc.nextLine();

			System.out.println("\nPlease enter the max rent time of the item: \n");

			int mMaxRentTime = Integer.parseInt(sc.nextLine());

			System.out.println("\nPlease enter the area it will be kept in the Library: \n");

			int mArea = Integer.parseInt(sc.nextLine());

			System.out.println("Please enter location the map is showing: \n");

			String location = sc.nextLine();

			il.addItem(new Map("Map", mTitle, mMaxRentTime, mArea, true, location));
			//break;
			return true;

		
		case 3:
			// add newspaper
			System.out.println("Please enter the title of the newspaper: \n");

			String nTitle = sc.nextLine();

			System.out.println("\nPlease enter the max rent time of the item: \n");

			int nMaxRentTime = Integer.parseInt(sc.nextLine());

			System.out.println("\nPlease enter the area it will be kept in the Library: \n");

			int nArea = Integer.parseInt(sc.nextLine());

			System.out.println("Please enter the headline: \n");

			String headline = sc.nextLine();

			il.addItem(new Newspaper("Newspaper", nTitle, nMaxRentTime, nArea, true, headline));
			//break;
			return true;
		}
		return true;
	}

	public void Reception() {

		System.out.println("Welcome to Reception. ");
		System.out.println("Are you a member?: ");

		// if answer is yes then we do not call addnewperson.
		String input = sc.nextLine();
		switch (input) {

		case "yes":
		case "Yes":
		case "y":
		case "Y":
			isMember = true;
			// call different method
			break;
		case "No":
		case "no":
		case "N":
		case "n":
			isMember = false;
			AddNewPerson();
			break;
		}
	}

	public void AddNewPerson() {

		System.out.println("Are you a new member of staff?: ");
		String input = sc.nextLine();
		switch (input) {

		case "yes":
		case "Yes":
		case "y":
		case "Y":
			newEmployee = true;
			// make new method to input people into person handler class
			employeeCheck();
			break;
		case "No":
		case "no":
		case "N":
		case "n":
			newEmployee = false;
			employeeCheck();
			break;

		}
	}

	public void employeeCheck() {

		if (newEmployee == true) {
			System.out.println("Okay, welcome to the team.");
			System.out.println("Firstly enter your name: \n");

			String name = sc.nextLine();

			System.out.println("Next, please enter your new job title: \n");

			String jobTitle = sc.nextLine();

			System.out.println("Thanks " + name + ".\n");

			ph.addPerson(new Staff(name, "Staff", jobTitle));

			System.out.println("You have been added to our system.\n");
		}

		else if (newEmployee == false) {
			System.out.println("I need some details from you before we begin.");
			System.out.println("Firstly, please enter your name: \n");

			String name = sc.nextLine();

			System.out.println("Please enter your home postcode: \n");

			String postcode = sc.nextLine();

			System.out.println("Thanks " + name + ".\n");

			ph.addPerson(new Member(name, "Member", postcode));

			System.out.println("You have been added to our system.\n");
		}

		System.out.println(ph.getHash().get(0).getName());
	}// end of employee check
}
