package rashmi;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter rowSize: ");
		int rowSize = scanner.nextInt();
		System.out.println("Enter the character 1:");
		int FirstCharacter = scanner.nextInt();
		System.out.println("enter the character 2:");
		int SecondCharacter = scanner.nextInt();
		int Character = FirstCharacter;
		int numOfColum = 1;
		int start = 0;
		int noOfSpaces = rowSize / 2;

		for (int i = 1; i <= rowSize; i++) {

			for (int j = 1; j <= noOfSpaces; j++) {
				System.out.print(" ");
			}

			if (i < rowSize / 2 + 1) {
				start = i;
				noOfSpaces = noOfSpaces - 1;
			} else {
				start = (rowSize + 1) - i;
				noOfSpaces = noOfSpaces + 1;
			}

			for (int j = 1; j <= numOfColum; j++) {

				if (Character == FirstCharacter) {
					System.out.print(FirstCharacter);
					Character = SecondCharacter;
				} else if (Character == SecondCharacter) {
					System.out.print(SecondCharacter);
					Character = FirstCharacter;
				}
			}

			System.out.println();
			if (i < rowSize / 2 + 1) {
				numOfColum = numOfColum + 2;
			} else {
				numOfColum = numOfColum - 2;
			}
		}
		scanner.close();
	}
}
