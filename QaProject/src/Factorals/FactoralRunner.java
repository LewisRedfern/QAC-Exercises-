package Factorals;

import java.util.Random;
import java.util.Scanner;

public class FactoralRunner {

	
//	3628800 = 10!
//	479001600 =12!
//	6 = 3!
//	18 = NONE​
	public FactoralRunner() {
		
		start();
		
		
	}

	public void start() {
		
		System.out.println("Hello World!");
		
		
		System.out.println(Factorial(18) == -1 ? "NONE" : Factorial(18) + "!");
		
		//rngGame();
		guessGame();
	}
	
	public int Factorial(int n){
		
		int result = n; 
		int i = 2;
		
		do {
			result = result / i;
			
			
			if (result == 1) {
								
				//System.out.println(i + "!");
				return i;
			}
			i++;
		}while (result > 1); 
		return (-1);
	}


	public void rngGame() {
		
		Random randomGenerator = new Random();
		Scanner sc = new Scanner(System.in);
		
		int random = randomGenerator.nextInt(10);
		int tries = 6;
		int guess = 0;
		
		while (tries > 0) {
		
			System.out.println("Guess my number: \n");
			
			guess = sc.nextInt();
			
			if (guess == random) {
				
				System.out.println("Well Done");
				System.out.println("you had " + tries + " left.");
				break;
			}
			else if (guess > random) {
				
				System.out.println(("lower"));
			}
			else if (guess < random) {
				
				System.out.println(("Higher"));

			}
			tries--;
			System.out.println(random);
			
		}
		System.out.println("FAIL!!!!!");
		
	}
	
	public void guessGame() {
		
		Random randomGenerator = new Random();
		Scanner sc = new Scanner(System.in);
		//Scanner resp = new Scanner(System.in);
		
		int tries = 10;
		int guess = 0;
		int previousGuess = 5;
		String clue = "null";
		
		System.out.println("Enter your number: \n");
		
		int num = Integer.parseInt(sc.nextLine());
		int random = 0;
		
		
		/// AI needs to try to guess
		while(tries > 0){
			
			if(clue != "null") {
				int range = clue.equals("Higher!") || clue.equals("higher!") ? 1 : 0 ;
				if( range == 1){
					// This is the higher expectation.
					random = previousGuess += 1;
				}else{
					// This is the lower expectation.
					random = previousGuess -= 1;
				}
			}
			else{
				random = randomGenerator.nextInt(10);
			}
			
			System.out.println("i guess: " + random);
			
			if (random == num) {
				
				System.out.println("Congrats the number was: " + num);
				break;
			}
			else{
				System.out.println("AI is awaiting clue:\n");
				clue = sc.nextLine();
				
			}
			
			
			
			// Our loop will attempt to allow AI 2nd chance.
			previousGuess = random;
			tries--;
		}		
		
		// fail condition
			// msg here or something.
		
	}
}
