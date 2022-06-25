package com.Assignment2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	int guessCount = 1;

	void printGuess(String message, boolean isFound) {
		System.out.println("The number is " + message);
		
		if (isFound == true) {
			System.out.println("You took " + guessCount + " guess.");
		} else {
			guessCount++;
			System.out.println("Please Try again.");
		}
	}

	public static void main(String args[]) {

		NumberGuess numberGuess = new NumberGuess();
		int randomNumber = new Random().nextInt(51);
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Enter the number:");
			int inputNumber = scanner.nextInt();

			if (inputNumber < randomNumber) {
				numberGuess.printGuess("Smaller", false);
			} else if (inputNumber > randomNumber) {
				numberGuess.printGuess("Greater", false);
			} else {
				numberGuess.printGuess("Equal", true);
				break;
			}
		}

		scanner.close();
	}
}
