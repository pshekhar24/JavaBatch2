package rashmi;

import java.util.Random;
import java.util.Scanner;

public class RandomDigit {
	public static void main(String[] args) {

		int answer, guess, attempt = 1;
		final int MAX = 50;
		boolean correct = true;

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		answer = rand.nextInt(MAX) + 1;    
		//include the last value

		while (correct) {

			System.out.print("Guess random number between 1 and 50: ");
			guess = sc.nextInt();

			if (guess == answer) {
				correct = false;
				System.out.println("You are right!");
				System.out.println("Total number of attempt:" + attempt);
			} else if (guess < answer) {
				System.out.println("The number too lower Try Again!");
				attempt++;
			} else if (guess > answer) {
				System.out.println("The number too high Try Again!");
				attempt++;
			}
		}

	}
}
