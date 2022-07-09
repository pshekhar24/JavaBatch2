package babul;

import java.util.Scanner;

public class DiomandPattern {

	public void printChar(int rowIndex, char char1, char char2) {
		if (rowIndex % 2 == 0) { // print char value
			System.out.print(char1);
		} else {
			System.out.print(char2);
		}
	}

	public void pattern(int rowSize, int row, char char1, char char2) {
		int space, leftIndex, rightIndex;
		DiomandPattern diomandPattern = new DiomandPattern();
		for (space = 1; space <= (rowSize / 2 + 1) - row; space++) { // space
			System.out.print(" ");
		}
		for (leftIndex = row; leftIndex >= 1; leftIndex--) { // left side
			diomandPattern.printChar(leftIndex, char1, char2);
		}

		for (rightIndex = 2; rightIndex <= row; rightIndex++) { // right side
			diomandPattern.printChar(rightIndex, char1, char2);
		}
	}

	public static void main(String[] args) {
		int row, rowSize;
		char char1, char2;
		Scanner scanner = new Scanner(System.in);
		DiomandPattern diomandPattern = new DiomandPattern();
		System.out.println("Enter Row Size: ");
		rowSize = scanner.nextInt();
		System.out.println("Enter First Character: ");
		char1 = scanner.next().charAt(0);
		System.out.println("Enter Second Character: ");
		char2 = scanner.next().charAt(0);
		scanner.close();
		System.out.println("Result: ");
		for (row = 1; row <= rowSize / 2 + 1; row++) { // Upper part
			diomandPattern.pattern(rowSize, row, char1, char2);
			System.out.println();
		}
		for (row = (rowSize / 2 - 1) + 1; row >= 1; row--) { // Lower part
			diomandPattern.pattern(rowSize, row, char1, char2);
			System.out.println();
		}
	}
}
