package assignmentPrograms;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int min = 0;
		int max = 0;
		min = getInterval("Min"); // Get minimum for guessing interval
		max = getInterval("Max"); // Get Maximum for guessing interval
		int randomNumber = getRandom(min, max); // generate random number
		// between Min and Max
		playRandom(min, max, randomNumber); // play the game
	}

	public static int getInterval(String text) {
		System.out.println("Please Input " + text + " number for guessing: ");
		return Integer.parseInt(scanner.nextLine());
	}

	public static int getRandom(int min, int max) {
		Random rand = new Random();// Random instance is used to generate a
		// stream of pseudorandom numbers
		return rand.nextInt((max - min) + 1) + min;
	}

	public static void playRandom(int min, int max, int randomNumber) {
		boolean guess = false;
		int numGuesses = 1;
		while (!guess) {
			// System.out.println(randomNumber);
			System.out.println("Enter your guess: ");
			Scanner inputGuess = new Scanner(System.in);
			int userGuess = Integer.parseInt(inputGuess.nextLine());

			if (userGuess < randomNumber) {
				System.out.println("Too low!");
				numGuesses++;
			} else if (userGuess > randomNumber) {
				System.out.println("Too high!");
				numGuesses++;
			} else {
				System.out.println("You win! You tried total " + numGuesses + " times");
				guess = true;
				inputGuess.close();
			}

		}
	}
}
