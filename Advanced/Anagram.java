package Advanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

	private ArrayList<String> anagramList = new ArrayList<String>();
	private ArrayList<String> listOfWords = new ArrayList<String>();

	private HashMap<String, ArrayList<String>> solvedList = new HashMap<String, ArrayList<String>>();
	Scanner sc;

	public void play() {

		// System.out.println(SortStr("dog"));
	}// end of play

	public void storeAnagramHash() {

		readFromFile();

	}

	public void readFromFile() {

		try {
			sc = new Scanner(new File("anagram.txt"));

			while (sc.hasNext()) {

				String line = sc.nextLine();

				String sort = SortStr(line);
				anagramList.add(sort);

			}
			for (String word : anagramList) {

				checkWord(word);
				// solvedList.put(SortStr(word), value)
				// System.out.println(str);
			}
			sc.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// end of readfromfile

	public void checkWord(String s) {

		String unsorted = s;
		String exists = SortStr(s);

		if (solvedList.containsKey(exists) == true) {
			solvedList.get(exists).add(unsorted);
		}
		
		else if (solvedList.containsKey(exists) == false) {
			listOfWords.add(unsorted);
			solvedList.put(exists, listOfWords);
		}
		

	}

	public String SortStr(String str) {

		char[] strSort = str.toCharArray();

		Arrays.sort(strSort);

		String sorted = new String(strSort);
		return sorted;
	}
}