package assenment;

import java.util.Random;
import java.util.Scanner;

public class NumberGusses {

	public static void main(String[] args) {

		int randomNumber, guess;

		final int MAX = 50;
		int count = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 50: ");
		Random r = new Random();

		boolean correct = false;

		randomNumber = r.nextInt(MAX) + 1;

		while (! correct) {

		

			guess = scanner.nextInt();

			if (guess > randomNumber) {
				System.out.println(" Number too high, try again");
				count++;
			}

			else if (guess < randomNumber) {
				System.out.println("Number too low, try again");
				count++;
			}

			else {

				System.out.println("Yes, you guessed the number.");
                count++;
				correct = true;
				System.out.println("Total number of attempts guess the right answer: "+count);
			}
		}
		scanner.close();
		
	}

}
