package com.Assignment2;

import java.util.Scanner;

public class DiamondPattern {

	void printLoop(int m, char charFirst, char charSecond) { 				// inner loop
		if (m % 2 == 0) {
			System.out.print(charSecond + " ");
		} else {
			System.out.print(charFirst + " ");
		}
	}

	void printSpace(int rows, int i) { 										// printing space
		int j;
		for (j = 1; j <= rows - i; j++) {
			System.out.print("  ");
		}
	}

	void printPattern(int i, char charFirst, char charSecond) { 			// printing pattern
		int k, l;

		for (k = i; k >= 1; k--) {
			printLoop(k, charFirst, charSecond);
		}
		for (l = 2; l <= i; l++) {
			printLoop(l, charFirst, charSecond);
		}
		System.out.println();

	}

	public static void main(String[] args) {

		DiamondPattern patternObject = new DiamondPattern();

		int i, rows;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Enter Number Of Rows: ");
			rows = scanner.nextInt();
			if (rows % 2 != 0) {

				rows = rows / 2 + 1;

				System.out.println("Enter first char");
				char charFirst = scanner.next().charAt(0);

				System.out.println("Enter second char");
				char charSecond = scanner.next().charAt(0);

				for (i = 1; i <= rows; i++) {
					patternObject.printSpace(rows, i);
					patternObject.printPattern(i, charFirst, charSecond);
				}

				for (i = rows - 1; i >= 1; i--) {
					patternObject.printSpace(rows, i);
					patternObject.printPattern(i, charFirst, charSecond);
				}
				break;

			} else {
				System.out.println("Try again:");
			}
		}

		scanner.close();
	}
}
