import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(50);
		int inputFromUser;
		int count = 0;
		do {
			count++;
			System.out.println("Guess the number between 1 to 50");
			inputFromUser = scanner.nextInt();
			if (inputFromUser < randomNumber) {
				System.out.println("Number too low try again");

			} else if (inputFromUser > randomNumber) {
				System.out.println("Number too hiegh try again");

			} else if (inputFromUser == randomNumber) {
				System.out.println("you won");
				System.out.println("You guessed " + count + " times");
				break;
			}
		} while (inputFromUser != 0);
		scanner.close();
	}

}
