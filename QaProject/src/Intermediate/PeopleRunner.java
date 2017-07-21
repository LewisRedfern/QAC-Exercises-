package Intermediate;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class PeopleRunner {

	ArrayList<String> addToFile = new ArrayList<String>();
	ArrayList<String> getFromFile = new ArrayList<String>();

	People p1 = new People("Lewis", "Consultant", 21);
	People p2 = new People("Ash", "Pokemon Trainer", 10);
	People p3 = new People("Jon Snow", "King of the North", 22);
	People p4 = new People("Martine", "Mum", 39);
	People p5 = new People("Kris", "Rugby Player", 23);

	public void run() throws Exception {

		addHuman();
		addHumanToFile();
		readHumanToArray();
	}

	public void addHuman() {

		addToFile.add(p1.strMaker());
		addToFile.add(p2.strMaker());
		addToFile.add(p3.strMaker());
		addToFile.add(p4.strMaker());
		addToFile.add(p5.strMaker());

		System.out.println("people added...\n");
	}

	public void addHumanToFile() throws Exception {

		try {
			// create PrintStream writer and new file Person.txt
			PrintStream writer = new PrintStream(new File("Person.txt"));

			// for every string in addToFile use writer to write string to file
			for (String str : addToFile) {
				writer.println(str);
			}

			writer.close();

			System.out.println("people written to file.....\n");
		}

		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void readHumanToArray() throws IOException {

		System.out.println("Reading....\n");
		System.out.println("---------HUMANS---------\n");
		
		try {
			
			// defining the scanner
			Scanner reader = new Scanner(new File("Person.txt"));
			// while the scanner has another thing to read, execute..
			while (reader.hasNext()) {

				// add every line of txt file and store in arraylist.
				getFromFile.add(reader.nextLine());
			}
			reader.close();

			// for every string in getFromFile print onto new line
			for (String output : getFromFile) {

				System.out.println(output);
			}
		} catch (IOException ex) {
			
			System.out.println(ex.getMessage());
		}
	}
}
