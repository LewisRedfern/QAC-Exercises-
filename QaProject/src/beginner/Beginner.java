package beginner;

import java.util.Random;

public class Beginner {

	public void run() {
		
		System.out.println("Hello World");

		String HW = "Hello World!";

		System.out.println(HW);

		helloWorld("Hello World3");

		System.out.println(returnHello());

		sumOf(4, 6, false);
		checkForZero(3, 0, false);
		tenaryExample(4, 6, false);
		numLoop(4, 7, false);

		int[] numberArray = new int[] { 3, 6, 8, 10, 0, 7, 2, 19, 80, 600 };
		arrayTask(numberArray[0], numberArray[9], false);

		arrayIterate(numberArray);

		int[] arraySet = new int[10];
		setTheArray(arraySet);

		blackJack(21, 20);
		System.out.println("---END OF BLACKJACK---");
	}
	
	public static void helloWorld(String helloParameter) {

		System.out.println(helloParameter);
	}// end of helloWorld

	public static String returnHello() {

		return "Hello World!";
	}// end of returnHello

	public static int sumOf(int i1, int i2, boolean iIsSmall) {

		int i3 = 0;

		if (iIsSmall == true) {

			i3 = i1 + i2;
			System.out.println(i3);

		} else if (iIsSmall == false) {

			i3 = i1 * i2;
			System.out.println(i3);

		}
		return i3;
	}// end of sumOf

	public static int checkForZero(int i1, int i2, boolean iIsSmall) {

		if (i1 == 0) {

			System.out.println(i2);
			return i2;
		}

		else if (i2 == 0) {

			System.out.println(i1);
			return i1;
		}

		else {
			int i3 = 0;

			if (iIsSmall == true) {

				i3 = i1 + i2;
				System.out.println(i3);

			} else if (iIsSmall == false) {

				i3 = i1 * i2;
				System.out.println(i3);

			}
			return i3;
		} // end of else
	}// end of sumOf

	public static int tenaryExample(int i1, int i2, boolean iIsSmall) {

		// (condition) ? (Do this) : (Otherwise do this)
		int total = (iIsSmall) ? (i1 + i2) : (i1 * i2);

		System.out.println(total);
		return total;
	}// end of tenaryExample

	public static int numLoop(int i1, int i2, boolean iIsSmall) {

		// (condition) ? (Do this) : (Otherwise do this)
		int total = (iIsSmall) ? (i1 + i2) : (i1 * i2);

		for (int i = 0; i < 10; i++) {
			System.out.println(total);
		}

		return total;
	}// end of numLoop

	public static int arrayTask(int i1, int i2, boolean iIsSmall) {

		if (i1 == 0) {

			System.out.println(i2);
			return i2;
		}

		else if (i2 == 0) {

			System.out.println(i1);
			return i1;
		}

		else {
			int i3 = 0;

			if (iIsSmall == true) {

				i3 = i1 + i2;
				System.out.println(i3);

			} else if (iIsSmall == false) {

				i3 = i1 * i2;
				System.out.println(i3);
			}
			return i3;
		}
	}// end of arrayTask

	public static void arrayIterate(int[] ArrayNum) {

		for (int i = 0; i < ArrayNum.length; i++) {

			System.out.println(ArrayNum[i] + "\n");
		}
	}// end of arrayIterate#

	public static void setTheArray(int[] theArray) {

		Random randomGenerator = new Random();
		for (int i = 0; i < theArray.length; i++) {

			theArray[i] = randomGenerator.nextInt(100);
			System.out.println(theArray[i]);
		} // end for loop

		System.out.println("\n");

		for (int i = 0; i < theArray.length; i++) {

			theArray[i] = theArray[i] * 10;
			System.out.println(theArray[i]);

		}
		System.out.println("---END OF BASIC TASKS---");
	}// end of setTheArray

	public static int blackJack(int player1, int player2) {
		int win = 0;

		if (player1 > 21 && player2 > 21) {

			win = 0;
			System.out.println(win);
		}

		else if (player1 > player2 && player1 <= 21) {

			win = player1;
			System.out.println("player 1 wins!: " + win);
		}

		else if (player2 > player1 && player2 <= 21) {

			win = player2;
			System.out.println("player 2 wins!: " + win);
		}

		else if (player1 == player2) {

			System.out.println("It's a tie!");
		}

		else {
			System.out.println("Not Possible");
		}
		return win;
	}// END OF BLACKjACK
}
