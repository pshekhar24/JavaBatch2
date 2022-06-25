import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputFromUser;
		do {
			System.out.println("Enter the size of the diamond");
			inputFromUser = scanner.nextInt();
			System.out.println("Enter the first character");
			String inputFromUserFirstChar = scanner.next();
			System.out.println("Enter the Second character");
			String inputFromUserSecondChar = scanner.next();
			int count = 0;
			for (int i = inputFromUser; i >= 1; i--) {
				if (i % 2 != 0) {
					for (int k = 1; k <= i; k++) {
						System.out.print(" ");
					}
					for (int j = i; j <= inputFromUser; j++) {
						count = count + 1;

						if (count % 2 != 0) {
							System.out.print(" " + inputFromUserSecondChar);
						} else {
							System.out.print(" " + inputFromUserFirstChar);
						}

					}
					System.out.println();
				}
			}
			for (int l = 2; l <= inputFromUser; l++) {
				if (l % 2 != 0) {
					for (int j = 1; j <= l; j++) {
						System.out.print(" ");
					}
					for (int k = l; k <= inputFromUser; k++) {
						count++;
						if (count % 2 != 0) {
							System.out.print(" " + inputFromUserSecondChar);
						} else {
							System.out.print(" " + inputFromUserFirstChar);
						}
					}
					System.out.println();
				}
			}

		} while (inputFromUser != 0);
		scanner.close();
	}

}
 
