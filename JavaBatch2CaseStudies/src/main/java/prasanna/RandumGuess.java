package prasanna;

import java.util.Random;
import java.util.Scanner;

public class RandumGuess {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		int randomNo = new Random().nextInt(50);
//		System.out.println(randomNo);
		System.out.println("guess the number");		
		int attempts = 1;
		while (true) {
			int userInput= scanner.nextInt();
			if ( userInput> randomNo) {
				System.out.println(" Your guess number is too high try again!!");
				attempts++;
			} else if (userInput < randomNo) {
				System.out.println("Your guess number is too low try again");
				attempts++;
			} else if (userInput == randomNo) {
				System.out.println("---------------------------------------------");
				System.out.println("congratulations! You guessed right");
				System.out.println("Total number of time attempted: " +attempts);
				System.out.println("---------------------------------------------");
				break;
			}

		}
		scanner.close();
	}

}
