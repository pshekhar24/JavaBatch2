package arun;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {

		int isChar = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");

		int rows = scanner.nextInt(); // reads rows from user
		for (int i = 1; i <= rows / 2; i++) { // print upper part
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" "); // print space
			}
			for (int k = i; k >= 1; k--) {
				isChar = isPrint(isChar);
			}
			for (int l = 2; l <= i; l++) {
				isChar = isPrint(isChar);
			}
			System.out.println();// move to next line
		}

		for (int i = rows / 2 + 1; i >= 1; i--) { // print lower part
			for (int j = 0; j <= rows - 1 - i; j++) {
				System.out.print(" ");// print space
			}
			for (int k = i; k >= 1; k--) {
				isChar = isPrint(isChar);
			}
			for (int l = 2; l <= i; l++) {
				isChar = isPrint(isChar);
			}
			System.out.println();// move to next line
		}
		scanner.close();
	}

	private static int isPrint(int a) {
		if (a == 0) {
			System.out.print(a);
			a = 2;
		} else {
			System.out.print(a);
			a = 0;
		}
		return a;
	}
}
